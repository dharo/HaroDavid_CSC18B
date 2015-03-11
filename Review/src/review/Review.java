/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package review;

/**
 *
 * @author rcc
 */
public class Review {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean pnt = false;    //false is sorted, true is unsorted
        sortSearch a = new sortSearch(100);
        //number ot search 
        int key = 34;
        boolean found;
        
        a.print(pnt);
        System.out.println("\n");
        found = a.binSearch(key);

    }
    
}
