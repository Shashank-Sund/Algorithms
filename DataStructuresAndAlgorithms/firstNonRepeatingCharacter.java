
package DataStructuresAndAlgorithms;

public class firstNonRepeatingCharacter {

    public static void main(String[] args) {
        
        String ille = "aaabccc";
        System.out.println(firstNonRepeat(ille));
        
    }
    
    public static char firstNonRepeat(String phrase){
        
        int[] count = new int[26];
        
        char[] array = phrase.toCharArray();
        for(char i: array){
            count[i - 'a']++;
        }
        
        for(int i=0; i<array.length; i++){
            if(count[array[i] - 'a'] == 1){
                return array[i];
            }
            else{
                continue;
            }
        }
        return '_';
        
    }
}
