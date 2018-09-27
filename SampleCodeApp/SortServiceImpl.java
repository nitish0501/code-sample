/* 
This is used for sorting a list of items according to their prices from high to low
created by Nitish @ 27/09/2018
All Rights Reserved.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** Using Comparator to compare the items accoring to their price */
class MyItemCompServiceImpl implements Comparator<ItemDTO>{
    
    // This method compares the items based on their prices.
    public int compare(ItemDTO e1, ItemDTO e2) {
        if(e1.getPrice() < e2.getPrice()){
            return 1;
            
        } else {
            return -1;
            
        }
        
    }
}


/** This DTO class should be in different file named ItemDTO under DTO folder
    Keeping here for simplicity.
 */
class ItemDTO{

    private String name;
    private int price;
    
    public ItemDTO(String name, int price){
        this.name = name;
        this.price = price;
        
    }
    
    public String getName() {
        return name;
        
    }
    public void setName(String name) {
        this.name = name;
        
    }
    public int getPrice() {
        return price;
        
    }
    public void setPrice(int price) {
        this.price = price;
        
    }
    public String toString(){
       return "Name: "+this.name+" - Price: "+this.price;
   }
}

public class SortServiceImpl {

    public static void main(String a[]){
        
        List<ItemDTO> itemList = new ArrayList<ItemDTO>();
        //these data comes from webservices in enterprise applications from DAOImpl layer.
        // using sample data for test.
        itemList.add(new ItemDTO("T-shirt",300));
        itemList.add(new ItemDTO("Formal-shirt",600));
        itemList.add(new ItemDTO("Trouser",700));
        itemList.add(new ItemDTO("Jeans",800));
        Collections.sort(itemList,new MyItemCompServiceImpl());
        System.out.println("Sorted list entries: ");
        for(ItemDTO e:itemList){
            System.out.println(e);
        // SysOut statements should not be used in production applications.
        // results in Sonar blocker.but have used just to test the code.
        }
        
    }
}
