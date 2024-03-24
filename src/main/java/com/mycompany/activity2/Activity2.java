/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2;

/**
 *
 * @author pc
 */
public class Activity2 {

   public static void main(String[] args) {
        
        int[] ken = {10, 666, 2, 6, 69};
        
        System.out.println("Array Elements: " + ken[0] + ", " + ken[1] +
                ", " + ken[2] + ", " + ken[3] + ", " + ken[4]);
        
        int ken_sum = ken[0] + ken[1] + ken[2] + ken[3] + ken[4];
        
        System.out.println("Sum of all arrays: "+ken_sum);
        
        int max = Math.max(ken[4], Math.max(ken[2], Math.max(ken[1], Math.max(ken[3], ken[0]))));
        
        System.out.println("Maximum Value: " + max);
    }
}
