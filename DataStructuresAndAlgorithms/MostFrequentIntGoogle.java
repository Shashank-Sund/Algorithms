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
public class MostFrequentIntGoogle {

    public static void main(String[] args) {
        
        int[] array1 = {4,12,9,5,6};
        int[] array2 = {4,9,12,6};

        System.out.println(findMissing(array2, array1));
    }
    
    public static void pairInt(int[] array, int n){
        int count = 0;
        while(count<array.length){
        for(int i=1; i<array.length; i++){
            if(array[count] + array[i] == n){
                System.out.print(array[count] + " , " + array[i]+ "- ");
            }
        }
        count++;
        }
    }
    
    public static void reverseString(String x){
        
        char[] array = x.toCharArray();
        for(int i=0, j=array.length-1; i==j; i++, j--){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        
    }
    
    public static int findMissing(int[] array1, int[] array2){
       
        int[] count = new int[30];
        
        for(int i=0; i<array1.length; i++){
            count[array1[i]]++;
        }
        
        for(int i=0; i<array2.length; i++){
            if(count[array2[i]] != 1){
                return array2[i];
            }
        }
        
        return -1;
       
    }
    
}
