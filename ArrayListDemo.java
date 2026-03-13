import java.itill.*;
class ArrayListDemo
{
    public static void main(String args[])
    {
        ArrayList a = new ArrayList ();  // create an array list
        System.out.println("Initial size : " + a.size());
        // add elements to the array list
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add(20);
        a.add(2, 35.6);
        System.out.println("Size after addition: " +a.size());
        // display the array list
        System.out.println("Arraylist contents: " + a);
        // Remove elements from the array list
        a.remove("C");
        a.remove(1);
        System.out.println("Arraylist contents after removing elements: " + a);
        // Accessing elements
        System.out.println("Element at index 3 is : " +a.get(3));
        System.out.println("Position of 'D' is : " +a.indexOf("D"));
        // Modify element
        a.set(2,"X");
        System.out.println("Arraylist contents after modification: " + a);
    }
}