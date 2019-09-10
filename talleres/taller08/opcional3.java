import java.util.*;
class Main {
 
  
  public static void main(String[] args) {
     Stack<Integer> stack = new Stack<Integer>();
      for(int i = 3; i>=0;i--){
          stack.push(i);
      }    
      System.out.println("Sin ordenar: "+stack);
      ordenar(stack);
  }
  public static void ordenar(Stack<Integer> stack){
    Stack<Integer> aux = new Stack<Integer>();

    for(int i = 0; i<=3;i++){
        aux.push(stack.pop());
    }
    
    System.out.println("Ordenado: "+aux);
    

  }
}
