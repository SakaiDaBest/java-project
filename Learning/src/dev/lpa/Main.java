
package dev.lpa;
import java.util.Arrays;
import java.util.ArrayList;
record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 2);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];//not resizable
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "Produce", 6);
        groceryArray[2] = new GroceryItem("cheese");
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> objectList= new ArrayList();
        objectList.add(new GroceryItem("Butter"));
//        objectList.add("Yogurt"); wont work has to be GroceryItem

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
    }
}
