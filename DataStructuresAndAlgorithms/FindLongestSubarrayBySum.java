/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

public class FindLongestSubarrayBySum {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //SLIDING WINDOW PROBLEM 
    public static int[] findLongestSubArrayBySum(int[] array, int s){
        
        int[] result = {-1};
        
        int sum = 0;
        int left = 0;
        int right = 0;
        
        //while the right pointer is not at the end of the array
        while(right < array.length){
            
            //add the element at the right pointer to the sum
            sum += array[right];
            
            //if the left pointer is less than the right and the current sum is over the target sum,
            //move the left pointer to the right and subract the current element at the left pointer from the sum 
            //until the current sum is less than the target sum
            while(left < right && sum > s){
                sum -= array[left++];
            }
            
            //if the current sum equlas the target sum and output array length hasnt been updated
            //or current difference between the pointers is more than whats already in the ouput array,
            //then update the output array
            if(sum == s & (result.length == 1 || (result[1] - result[0]) < (right - left) ))
                result = new int[] {left+1, right+1};
            
            //always move the right pointer over after every iteration
            right++;
        }
        return result;
        
    }
}
