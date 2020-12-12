import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    if (element==null) throw new IllegalArgumentException("Element cannot be null");
    return super.add(element);
  }

  public void add(int index, T element){
    if (element==null) throw new IllegalArgumentException("Element cannot be null");
    super.add(index, element);
  }

  public T set(int index, T element){
    if (element==null) throw new IllegalArgumentException("Element cannot be null");
    return super.set(index, element);
  }

}
