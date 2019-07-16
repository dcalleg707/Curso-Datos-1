/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

/**
 *
 * @author jramirezg
 */
public class Contador {
    
    private int cuenta;
    private String id;
  

    public Contador(int cuenta, String id) {
        this.cuenta = cuenta;
        this.id = id;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getId() {
        return id;
    }
    
    
    public void incrementar(){
        cuenta++;
      
    }
    
    public int incrementos(){
       return cuenta;
    }
    
   
    @Override
    public String toString(){
        return "Cuenta: "+cuenta+" ID:"+id;
    }
}
