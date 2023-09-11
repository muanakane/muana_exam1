/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Student
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int []FirstExam = null;
        
        System.out.println("Press 1 for exam 1");
        System.out.println("Press 1 for exam 2");
        System.out.println("Press 1 for exam 3");
        System.out.println("Press 1 for exam 4");
        System.out.println("Press 1 for exam 5");
        
        int input = scn.nextInt();
        
        switch (input) {
            case 1:
                Numberone(FirstExam);
                break;
            case 2:
                Numbertwo(FirstExam);
                break;
            case 3:
                Numberthree(FirstExam);
                break;
            case 4:
                Numberfour(FirstExam);
                break;
            case 5:
                Numberfive(FirstExam);
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
        
            
        
       public static void Numberone(int[] Numberone){
          int [] array = {1,-2,3,-4,5};  
            System.out.println("Element to Array:"+ Arrays.toString(array));
            scanner in = new scanner (System.in);
            int size;
            for(int i = 0; i < array.length; i++) {
                for (int j = i; j <array.length; j++){
                if(array[i]> array[j]){
                    size = array[i];
                    array[i] = array[j];
                    array[j] = size;
                }
            }
            }
            
        } 
}        