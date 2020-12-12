public class Tester{
  public static void main(String[] args){
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    NoNullArrayList<Integer> b = new NoNullArrayList<Integer>(5);
    OrderedArrayList<String> c = new OrderedArrayList<String>(5);
    OrderedArrayList<Integer> d = new OrderedArrayList<Integer>();

    try{
      a.add("nerd");
      // a.add(null);
      a.add(0,"genius");
      System.out.println(a);

      b.add(2);
      b.set(0,1);
      System.out.println(b);

      c.add("b");
      c.add("ab");
      c.add("aa");
      c.add("hippo");
      c.add(1,"b");
      c.set(1,"c");
      c.add(null);
      System.out.println(c);

      d.add(1);
      d.add(100);
      d.add(-1);
      d.add(1,100);
      d.set(1,2);
      System.out.println(d);
    } catch(IllegalArgumentException e){
        System.out.println("Cannot add null");
    }
  }
}
