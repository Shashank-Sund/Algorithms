
package DataStructuresAndAlgorithms;

public class DynamicArray2 {

    public int[] array;
    public int actualSize = 0;
    public int dynamicSize = 0;
    
    //constructor
    public DynamicArray2(int len){
        this.actualSize = len;
        array = new int[actualSize];
    }
    
    //returns size of the arraylist
    public int size(){
        return this.dynamicSize;
    }
    
    //add item to the arraylist
    public void addItem(int x){
        if(this.dynamicSize >= this.actualSize){
            resizeArray();
            this.array[this.dynamicSize] = x;
            this.dynamicSize++;
        }
        else{
            this.array[this.dynamicSize] = x;
            this.dynamicSize++;
        }
    }
    
    //remove item at a specified index
    public void removeItem(int index){
        int[] temp = new int[actualSize-1];
        int tempIndex = 0;
        for(int i=0; i<this.array.length; i++){
            if(i == index){
                continue;
            }
            else{
                temp[tempIndex] = this.array[i];
                tempIndex++;
            }
        }
        this.dynamicSize--;
        this.array = temp;
        this.actualSize = this.array.length;
        temp = null;
    }
    
    //prints whatever is in the arraylist
    public void printContent(){
        for(int i=0; i<this.dynamicSize; i++){
            System.out.print("[" + this.array[i] + "]"); 
        }
    }
    
    //re-usable code for increasing the size of the array by 1
    public void resizeArray(){
        int[] arr2 = new int[this.actualSize+1];
        for(int i=0; i<this.actualSize; i++){
            arr2[i] = this.array[i];
        }
        this.array = arr2;
        this.actualSize = this.array.length;
        arr2 = null;
    }
}
