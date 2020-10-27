/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

/**
 *
 * @author sunda
 */
public class removeDuplicatesNoExtraMemory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        
    }
    
    public static int removeDuplicates(int[] nums) {
        
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            sum++;
            for(int j=i+1; j<nums.length; j++){
                if(temp != nums[j]){
                    i = j;
                    break;
                }
            }
            
        }
        return sum+1;
        
    }
}
