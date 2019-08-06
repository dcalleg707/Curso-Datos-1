/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author jramirezg
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args){
        for(int i = 25; i < 45; i++){
         long startTime = System.currentTimeMillis();
         fibonacci(i);
         long tiempo = System.currentTimeMillis() - startTime;
         System.out.println("Para: "+i+" el tiempo es: "+tiempo);
        }
    }
    
    public static int fibonacci(int n){
    
        if(n<=1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
        
    }    
}
