/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author sunda
 */
public class sumOfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        int[] b = {3,4,5,6,7};

        //System.out.println(sumOf2(a,b,6));
        
        //System.out.println(isPalindrome(121));
        
        System.out.println(romanToInt("MCMXCIV"));
        
    }
    
    public static boolean sumOf2(int[] a, int[] b, int v){
        
        HashSet<Integer> differences = new HashSet();
        for(int i=0; i<a.length; i++){
            int difference = v - a[i];
            differences.add(difference);
        }
        
        for(int i=0; i<b.length; i++){
            if(differences.contains(b[i]))
                return true;
        }
        
        return false;
    }
    
    public static boolean isPalindrome(int x) {
        
        boolean out = true;
        
        if(x<0){
            out = false;
            return out;
        }
        
        
        String xx = Integer.toString(x);
        
        int i = 0;
        int j = xx.length()-1;
        while(i!=j){
            if(xx.charAt(i) != xx.charAt(j)){
                out = false;
                return out;
            }
            i++;
            j--;
        }
        
        return out;
        
    }
    
    public static int romanToInt(String s) {
        
        HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C', 100);
        maps.put('D', 500);
        maps.put('M', 1000);
        
        int sum = 0;
        
        Stack<Character> ops = new Stack<Character>();
        Stack<Integer> ints = new Stack<Integer>();
        
        char[] arr = s.toCharArray();
        ints.push(maps.get(arr[0]));
        for(int i=1; i<arr.length; i++){
            
            if(ints.peek() > maps.get(arr[i])){
                ops.push('+');
            }
            else{
                ops.push('-');
            }
            ints.push(maps.get(arr[i]));
        }
        
        
        sum += ints.pop();
        while(ints.isEmpty() == false){

            if(ops.peek() == '-'){
                sum += ints.peek();
            }
            else{
                sum -= ints.peek();
            }
            ops.pop();
            ints.pop();
            
        }
        
        return sum;
        
        
    }
    
}
