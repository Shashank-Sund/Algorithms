/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

import java.util.HashSet;

/**
 *
 * @author sunda
 */
public class PalindromeEfficient {

    public static void main(String[] args) {
        
        //System.out.println(isPalindrome("racecar"));
        System.out.println(longestNonRepeatingSubstring("abcabcbb"));
        
        System.out.println(Integer.toString(-1));
    }
    
    public static int longestNonRepeatingSubstring(String str){
        
        HashSet<Character> set=new HashSet<Character>();
        int start = 0;
        int end = 0;
        int max = 0;
        
        while(end < str.length()){
            if(!set.contains(str.charAt(end))){
                set.add(str.charAt(end++));
                max = Math.max(set.size(), max);
            }
            else{
                set.remove(str.charAt(start++));
            }
        }
        
        return max;
    }
    
    public static boolean isPalindrome(String str){
        
        //check to see if a string is a palindrome with no space complexity and O(n
        int i = 0;
        int j = str.length()-1;
        boolean answer = true;
        
        while(i!=j){
            if(str.charAt(i) != str.charAt(j)){
                answer = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }
        
        return answer;
    }
    
}
