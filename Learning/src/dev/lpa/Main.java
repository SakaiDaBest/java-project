
package dev.lpa;
import java.util.Arrays;
record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 2);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];//not resizable
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "Produce", 6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));
    }
}
