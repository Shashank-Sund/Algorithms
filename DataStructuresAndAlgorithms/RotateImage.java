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
public class RotateImage {

    
    public static void main(String[] args) {
        
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        
        rotateImage(array);
                
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
    public static void rotateImage(int[][] array){
        
        int[][] temp = new int[array.length][array.length];
        
        int col = array.length-1;
        int row = 0;
        
        //fills temp array using 
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                temp[row][col] = array[i][j];
                row++;
            }
            row = 0;
            col--;
        }
        
        //puts temp contents back into original array
        //O(n2)
        //can be created as a seperate method
        for(int x=0; x<array.length; x++){
            for(int y=0; y<array.length; y++){
                array[x][y] = temp[x][y];
            }
        }
        
    }
    
}
