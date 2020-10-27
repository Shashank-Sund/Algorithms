/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

import java.util.ArrayList;

public class MaxConsecSequenceMicrosoft {

    public static void main(String[] args) {
        
        int[] ille = {5,2,99,3,4,1,100};
        //System.out.print(maxConSeq(ille));
        
        int[] rr = {1,3,5,4,7};
        System.out.print(findLengthOfLCIS(rr));
    }
    
    public static int findLengthOfLCIS(int[] nums) {
        
        
        
    }
    
    public static int maxConSeq(int[] array){
        
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        int count = 0;
        for(int i=0; i<array.length-1; i++){
            if(array[i+1] - array[i] == 1){
                count++;
            }
            else{
                lengths.add(count+1);
                count = 0;
            }
        }
        
        int max = lengths.get(0);
        for(int i=1; i<lengths.size(); i++){
            if(lengths.get(i) > max)
                max = lengths.get(i);
        }

        return max;
    }
    
}
