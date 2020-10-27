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
public class rotateImageEfficiently {
    
    public static void main(String[] args) {
        
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        
        rotateImageEff(array);
        
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void rotateImageEff(int[][] array){
        
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
}
