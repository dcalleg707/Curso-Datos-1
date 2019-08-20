import java.util.Arrays;
public class MiArrayList{
  private int size;
  private static final int DEFAULT_CAPACITY = 10;
  private int elements[];


  public MiArrayList(){
    size = 0;
    elements = new int[DEFAULT_CAPACITY];
  }

  public int size(){
    return this.size;
  }

/*
* ADD PARA AGREGAR AL FINAL DEL ARREGLO
* Y DUPLICAR DE SER NECESARIO
*/
  public void add(int e){

    if(size==elements.length){
      elements = Arrays.copyOf(elements, elements.length*2);
    }
    elements[size]=e;
    size++;
  }

  public int get(int i){
    return elements[i];
  }


/*
* ADD PARA AGREGAR EN UNA POSICIÓN ESPECIFICA
*/
  public void add(int index, int e){
    
  int[] q = new int[elements.length+1];
  q[index]=e;
  int count = 0;
    for(int i = index+1; i<q.length;i++){
      q[i]=elements[count];
      count++;
    }

  
  }

  public void del(int index){

    p[index]=0;
    int[] q = new int[elements.length-1];
    int cont = 0;
    for(int i = 0; i<elements.length;i++){
        if(elements[i]!=0){
            q[cont]=p[i];
            cont++;
        }
    }
  
  }
}


