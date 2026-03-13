import java.util.*;
class ArrayListSort
{
    public static void main(String args[])
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("M"); a.add("p"); a.add("E"); a.add("D");
System.out.println("Arraylist before sorting: " + a);
Collections.sort(a);
System.out.println("Arraylist after sorting: " + a);
ArrayList b = new ArrayList();
b.add(5); b.add(20); b.add(15); b.add(7);
System.out.println("Arraylist before sorting: " + b);
Collections.sort(b,Collections.reverseOrder());
System.out.println("Arraylist after sorting in reverse order:" + b);
    }
}