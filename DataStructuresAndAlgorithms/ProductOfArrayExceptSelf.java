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
public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        
        int[] array = {1,2,3,4};
        int[] ille =  productOfArrayExceptSelf2(array);
        
        for(int x=0; x<ille.length; x++){
            System.out.print(ille[x]+",");
        }
        
    }
    
    //BETTER SOLUTION
    public static int[] productOfArrayExceptSelf2(int[] array){
        
        int count = 0;
        int[] fin = new int[array.length];
        
        int product = 1;
        for(int i=0; i<array.length; i++){
            product *= array[i];
        }
        
        for(int j=0; j<array.length; j++){
            fin[count++] = product/array[j];
        }
        
        return fin;
    }
    
    //my solution
    public static int[] productOfArrayExceptSelf(int[] array){
        
        int count = 0;
        int[] fin = new int[array.length];
        
        for(int i=0; i<array.length; i++){
            
            int product = 1;
            
            for(int j=0; j<array.length; j++){
                if(i==j){
                    continue;
                }
                else{
                    product *= array[j];
                }
            }
            
            fin[count++] = product;
            
        }
        
        return fin;
    }
    
}
