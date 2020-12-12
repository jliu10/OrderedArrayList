public class Tester{
  public static void main(String[] args){
    NoNullArrayList<String> a = new NoNullArrayList<String>();
    NoNullArrayList<Integer> b = new NoNullArrayList<Integer>(5);

    try{
      a.add("nerd");
      // a.add(null);
      a.add(0,"genius");
      System.out.println(a);

      b.add(2);
      b.set(0,1);
      System.out.println(b);
    } catch(IllegalArgumentException e){
        System.out.println("Cannot add null");
    }
  }
}
