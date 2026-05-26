/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Binary_Search;

public class BinarySearch {

    public static void main(String[] args) {
        int number[] = {1, 5, 7, 11 , 14, 85};
        BinarySearchMethod(number, 100);
    }

    public static void BinarySearchMethod(int[] arr, int target) {
        boolean isfound=false;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Target :" + " " + target + " is Found");
                isfound=true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;

            }

        }
        if (isfound) {
             System.out.println("Target :" + " " + target + " is Found");

        }else{
                         System.out.println("Target :" + " " + target + " is Not Found");

        }

    }
}
