/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author jramirezg
 */
public class Punto1 {

    ArrayList<Integer> key;
    ArrayList<String> value;
    
    public static void main(String[] args) {
        
    }
    
    public void get(int k){
        for(int i = 0; i<key.size();i++){
            if(key.get(i)==k){
                System.out.println(value.get(i));
            }
        }
    }
    
    public void set(int t, String k){
        value.add(k);
        key.add(t);
    }
    
}

