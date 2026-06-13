import java.util.Vector;
public class concatenatearr {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("InitialVector: " + fruits);
        //get an element by index(0 is the first item)
        String firstFruit = fruits.get(0);
        System.out.println("FirstFruit: " + firstFruit);
        //update an element in-place (change "Banana" to "Mango")
        fruits.set(1,"Mango");
        System.out.println("After replacement: " + fruits);
        //remove an element by index (remove "Orange")
        fruits.remove(2);
        System.out.println("FinalVector: " + fruits);
    }
}