/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres;

import java.util.Arrays;
/**
 *
 * @author jramirezg
 */
public class Torres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
      torresHanoi(3,1,2,3);
    }
    
    public static void torresHanoi(int n, int origen, int aux, int destino){
            if(n==1){
                System.out.println("Se mueve el disco "+n+" desde "+origen+" hacia "+destino);
            }else{
                torresHanoi(n-1,origen,destino,aux);
                System.out.println("Se mueve el disco "+n+" desde "+origen+" hacia "+destino);
                torresHanoi(n-1,aux,origen,destino);
            }
    }
    
    
    
}
