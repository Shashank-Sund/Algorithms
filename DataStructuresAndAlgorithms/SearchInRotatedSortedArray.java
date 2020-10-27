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
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        
        int[] array = {9,10,11,0,1,2,3,4,5,6};
        
        System.out.println(searchInRotatedSortedArray(array, 12));
        System.out.println(searchInRotatedSortedArray(array, 11));
        
    }
    
    public static int searchInRotatedSortedArray(int[] array, int target){
        
        int pivot = 0;
        for(int i=0; i<array.length-1; i++){
            if(array[i+1]<array[i]){
                pivot = i+1;
                break;
            }
        }
        
        int answer = -1;
        int yo = binarySearch(0,pivot,array,target);
        int yo2 = binarySearch(pivot,(array.length),array,target);
        
        if(yo != -1){
            return yo;            
        }
        else if(yo2 != -1){
            return yo2;
        }
        else{
            return answer;
        }
        
    }
    
    public static int binarySearch(int start, int end, int[] array, int target) {
        
        int temp = -1;
        while(start <= (end-1)){
            //System.out.println(start +" "+ end);
            int mid = start + (end-1)/2;
            
            if(array[mid] == target){
                temp = mid;
                break;
            }
            if(array[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
        }
        
        return temp;
    }
}
