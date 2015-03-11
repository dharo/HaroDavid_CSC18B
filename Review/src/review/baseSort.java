/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package review;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author rcc
 */
public class baseSort extends absSort{

    private int SIZE;
    protected int[] array;
    public baseSort(int n) {
        SIZE = n;
        array = fillArray(SIZE);
    }
    
    //fills array with 2 digit number from 10-99
    @Override
    int []fillArray(int n){
        int array[]=new int[n];
        Random rand = new Random();
        for(int i=0;i<array.length;i++){
            array[i]=rand.nextInt(99-10-1)+10;
        }
        return array;
    }
    
    void sort(){
        Arrays.sort(array);
    }
    
    void print(boolean n){ 
        
        if(n == true){
            for(int i=0;i<100;i++){
                if(i%10==0){
                    System.out.println();
                }
                System.out.print(array[i]+" ");
            }
            System.out.println();
        } 
        else {
            sort();
            for(int i=0;i<100;i++){
                if(i%10==0){
                    System.out.println();
                }
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
    
}
