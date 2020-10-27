/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructuresAndAlgorithms;

public class DynamicArray2Test {

    public static void main(String[] args) {
        
        DynamicArray2 ille = new DynamicArray2(5);
        ille.addItem(0);
        ille.addItem(1);
        ille.addItem(2);
        ille.addItem(3);
        ille.addItem(4);
        //System.out.println(ille.size());
        //ille.printContent();
        ille.addItem(5);
        //System.out.println(ille.size());
        //ille.printContent();
        ille.removeItem(3);
        ille.printContent();
    }
    
}
