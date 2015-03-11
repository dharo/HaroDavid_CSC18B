/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author davidharo
 */
public class sortSearch extends baseSort{

    //protected int[] b;
    
    public sortSearch(int n) {
        super(n);
    }
    
    public boolean binSearch(int key){
        int low = 0;
        int high = 100-1;
        
        while (high >= low){
            int middle = (low + high)/2;
            if(array[middle]==key){
                System.out.println("FOUND IT");
                return true;
            }
            if(array[middle]<key){
                low = middle+1;
            }
            if(array[middle]>key){
                high = middle-1;
            }
        }
        System.out.println("NOT FOUND");
        return false;
    }
    
}
