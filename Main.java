 import java.util.*;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    ArrayList <String> regular = new ArrayList <String> ();
    regular.add("hearts");
    regular.add("muscle man");
    regular.add("smirk");
    System.out.println(regular);

    regular.add(0, "modercai");
    System.out.println(regular);

    System.out.println("Size of regular is " + regular.size());

    System.out.println("String removed is " + regular.remove(2));

    System.out.println("Size of regular is " + regular.size());

    
    System.out.println("Removed String using set() is " + regular.set(0, "pops")+ regular);
    
    System.out.println(regular);

    System.out.println("Size of regular is " + regular.size());

    Integer one = new Integer(1);
    Double two = new Double(2.0);
    String three = "3";
    
    ArrayList demo= new ArrayList();

    demo.add(three);
    demo.add(two);
    demo.add(one);

    System.out.println(demo);

    //lesson 2 traversals

    for(int i =0; i< regular.size(); i++)
    {
      System.out.println("Item " + (i+1) + ": " + regular.get(i));
    }
    
      for(int i = regular.size()-1; i< 0; i--)
    {
      System.out.println("Item " + (i+1) + ": " + regular.get(i));
    }

    regular.add("me");
    regular.add("hotdog");
    regular.add("you");

    for(String x : regular)
    {
      System.out.println(x);
    }


    ArrayList <String> letters = new ArrayList <String>();

    letters.add("A");
    letters.add("p");
    letters.add("C");
    letters.add("m");
    letters.add("E");
    letters.add("F");

    for(int i = 0; i <letters.size(); i ++)
    {
      for (int j = 0; j<regular.size(); j ++)
      {
        if( letters.get(i).equals(regular.get(j).substring(0,1)))
        {
          System.out.println(regular.get(j)+ " starts with " + letters.get(i));
        }
      }
    }









  }
}