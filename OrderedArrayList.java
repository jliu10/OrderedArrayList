public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    if (element==null) throw new IllegalArgumentException("Element cannot be null");
    int index=0;
    for(int i=0;i<size();i++){
      if(element.compareTo(get(i)) > 0) {
        index++;
      } else i=size();
    }
    super.add(index, element);
    return true;
  }

  public void add(int index, T element){
    add(element);
  }

  public T set(int index, T element){
    if (element==null) throw new IllegalArgumentException("Element cannot be null");
    T old=get(index);
    remove(index);
    add(element);
    return old;
  }

}

// {1, 2, 3, 4} <-2
