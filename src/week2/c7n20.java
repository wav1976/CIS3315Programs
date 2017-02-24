/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author 55vanzilwa27
 */
public class c7n20 {
public static void sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void sort2(int[] list) {
        for (int lastIndex = list.length - 1; lastIndex > 0; lastIndex--) {
            int currentMax = list[lastIndex];
            int currentMaxIndex = lastIndex;
            for (int currentIndex = 0; currentIndex <= lastIndex; currentIndex++) {
                if (list[currentIndex] > currentMax) {
                    currentMax = list[currentIndex];
                    currentMaxIndex = currentIndex;
                }
            }
            if (currentMaxIndex != lastIndex) {
                list[currentMaxIndex] = list[lastIndex];
                list[lastIndex] = currentMax;
            }
        }
    }

    public static void display(int[] list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] nums = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        display(nums);
        sort2(nums);
        display(nums);
    }
}