
package DataStructuresAndAlgorithms;

public class ArrayTests {

    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        int[] b = new int[4];
        
        //removes skips over desired value at specified index when copying into another array
        //i is used to keep track of the current position for the orginial array (a)
        //j is used to keep track of the current position for the new array (b)
        for(int i=0, j=0; i<a.length; i++, j++){
            //excludes whatver value is at a[2]
            if(i == 2){
                j--; //keeps j in the same position for one iteration
            }
            else{
                b[j] = a[i];
            }
        }
        
        //does the same thing above except declars j outside of loop
        int j = 0;
        for(int i=0; i<a.length; i++){
            if(i == 2){
                continue;
            }
            else{
                b[j] = a[i];
                j++;
            }
        }
        
        for(int x : b){
            System.out.println(x);
        }
    }
    
}
