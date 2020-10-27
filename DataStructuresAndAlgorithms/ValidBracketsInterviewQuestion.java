/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

import java.util.Hashtable;
import java.util.Stack;

/**
 *
 * @author sunda
 */
public class ValidBracketsInterviewQuestion {

    //determine whether a string of brackets is valid
    
    public static void main(String[] args) {
        
        String valid = "{[()]}";
        String notValid = "[{[[){";

        System.out.println(isValid(valid));
        System.out.println(isValid(notValid));
    }
    
    public static boolean isValid(String str){
        
        Hashtable<Character, Character> table = new Hashtable<Character, Character>();
        Stack<Character> stak = new Stack<Character>();
        
        table.put(')', '(');
        table.put(']', '[');
        table.put('}', '{');
        
        char[] array = str.toCharArray();
        for(int i=0; i<array.length; i++){
            if(array[i] == '(' || array[i] == '[' || array[i] == '{')
                stak.push(array[i]);
            else if(stak.peek() == table.get(array[i])){
                stak.pop();
            }
        }
        
        if(stak.size() == 0)
            return true;
        else
            return false;
        
    }
    
    
}
