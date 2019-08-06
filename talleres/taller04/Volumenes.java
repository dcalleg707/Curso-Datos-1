/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumenes;

/**
 *
 * @author jramirezg
 */
public class Volumenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [] nums = new int[40];
 
         for(int i = 0; i<nums.length;i++){
          nums[i] = i;
         }

          long startTime = System.currentTimeMillis();
          boolean n = sumar_Grupos(nums, 0, 10);
          long estimatedTime = System.currentTimeMillis()-startTime;
            System.out.println("Tiempo para: "+nums.length+" es: "+estimatedTime+"         --      RESULTADO "+n);
        
    }
    
     public static boolean sumar_Grupos(int[] nums, int start, int target){

        if(start>=nums.length){

        return target == 0;

        }else{

        return sumar_Grupos(nums, start+1,target-nums[start]) || sumar_Grupos(nums,start+1,target);

        }
    
    }
}
