import java.util.*;
class Main {

  static Stack<nevera> cola = new Stack<nevera>();

  public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    System.out.println("¿Cuantas neveras quiere meter?");
    int op = t.nextInt();
    
    for(int i = 0; i<op; i++){
      insertarNevera("IBM",i);
    }
      posicion_n();
      pedido();
  }

  public static void insertarNevera(String d, int j){

    nevera nev = new nevera(d,j);
    cola.push(nev);

  }

  public static void posicion_n(){
       System.out.println(cola);
  }

  public static void pedido(){
      Scanner t = new Scanner(System.in);
      System.out.println("Cuantas neveras necesitas: ");
      int nn = t.nextInt();

      if(cola.isEmpty()){
         System.out.println("No se pueden hacer más pedidos, no hay neveras");
         
      }else if(cola.size()<nn){
        System.out.println("No se puede hacer el pedido, no hay neveras suficientes");
      
      }else{
        for(int i = 1; i<=nn;i++){
        System.out.println("Al pedido le corresponde: "+cola.pop());
      }
      System.out.println("¿Quiere pedir mas neveras? 1 para si o 2 para no");
    t.nextLine();
    int op = t.nextInt();
    if(op == 1){
      pedido();
    }
    }
    
  }


}
