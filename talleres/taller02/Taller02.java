/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller02;

/**
 *
 * @author jramirezg
 */
public class Taller02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] nums = new int[3];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 8;
        sumar_Grupos(nums, 0, 10);
    }
    
    
    public static boolean sumar_Grupos(int[] nums, int start, int target){
        if(start>=nums.length){
        return target == 0;
        }else{
        return sumar_Grupos(nums, start+1,target-nums[start]) || sumar_Grupos(nums,start+1,target);
        }
       
    }
}
