/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglorecursivo;

/**
 *
 * @author jramirezg
 */
public class ArregloRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int arr[]  = new int [1000000];
      for(int i = 0; i<arr.length;i++){
          arr[i] = i;
      }
      
      
      long startTime = System.currentTimeMillis();
        int n = recorrermatriz(arr,0);
      long estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("Tiempo para: "+arr.length+" es: "+estimatedTime+"         --      RESULTADO "+n);
        
        
        
        
    }
    
    
    public static int recorrermatriz(int arr[], int a){
        if(a >= arr.length){
            return 0; // C1
        }else{
            return arr[a]+recorrermatriz(arr,a+1); // T(n) = T(n-1) + C2 
        }   
    }
    
    
}
