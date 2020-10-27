
package DataStructuresAndAlgorithms;

public class StaticArray {

    //A static array is a FIXED LENGTH container containing n elements indexable from the range [0, n-1]
    //each slot in the array can be referenced with a number (indexable)
    
    //USES
    //stores sequential data
    //temporary store objects
    //used as buffers for an output stream
    
    //ACCESS TIME COMPLEXITY
    //O(1) - constant
    //SEARCH TIME COMPLEXITY
    //O(n) - linear
    
    public static void main(String[] args) {
        
        int[] staticArray = {1,2,3,4,5};
        
        //prints out value at index i
        //O(1)
        for(int i=0; i<staticArray.length; i++){
            System.out.println(staticArray[i]);
        }
        
        
        
    }
    
}
