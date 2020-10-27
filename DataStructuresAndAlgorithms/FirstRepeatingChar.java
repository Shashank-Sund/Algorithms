/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

import java.util.HashMap;


public class FirstRepeatingChar {

    
    public static void main(String[] args) {
        
        String word =  "aaabbcdd";
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0;i<word.length();i++){
            //if the map doesnt conatin the key then add it with count 1
            if (map.containsKey(word.charAt(i)) == false){
                map.put(word.charAt(i), 1);
            }
            else{
                //increments the count by 1
                map.replace(word.charAt(i), map.get(word.charAt(i)), map.get(word.charAt(i))+1);
            }
        }

        
    }
    
}
