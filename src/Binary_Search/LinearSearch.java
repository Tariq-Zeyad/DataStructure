/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Binary_Search;

/**
 *
 * @author LTC2023
 */
public class LinearSearch {

    public static void main(String[] args) {
        int number[] = new int[10];
        number[0] = 4;
        number[1] = 7;
        number[2] = 12;
        number[3] = 15;
        number[4] = 25;
        number[5] = 30;
        number[6] = 35;
        number[7] = 45;
        number[8] = 50;
        number[9] = 56;
       LinearSearchMethod(number,80);
    }
    public static void LinearSearchMethod(int[] arr, int target) {
        boolean isfound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target :" + " "+ target + " is Found");
                isfound=true;
                break;
            }
             
        }
        if(isfound){
            System.out.println("Target :" + " "+ target + " is Found");
        }else{
                        System.out.println("Target :" + " "+ target + " is Not Found");

        }
        
    }
    
}
