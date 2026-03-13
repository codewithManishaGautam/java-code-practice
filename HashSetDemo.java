import java.util.*;
public class HashSetDemo
{
  public static void main(String[] args)
  {
    HashSet hs=new HashSet();
    Hashset.add("B");
    Hashset.add("A");
    Hashset.add("F");
    System.out.println("The content of hash set : " + hs);
    Hashset.add("E");
    Hashset.remove("A");
    System.out.println("The contents of hash set : " + hs);
    hs.add("E");
    hs.remove("A");
    System.out.println("The contents of hash set : " + hs);
    // Creating a TreeSet from HashSet
    TreeSet ts = new TreeSet(hs);
    System.out.println("The tree set contents : " + ts);
  }
}