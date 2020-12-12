import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    return true;
  }

  public void add(int index, T element){

  }

  public T set(int index, T element){
    return element;
  }

}