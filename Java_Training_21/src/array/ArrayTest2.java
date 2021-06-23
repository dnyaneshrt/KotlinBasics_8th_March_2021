package array;

import java.util.Scanner;

public class ArrayTest2 {

    int[] sort(int[] numbers) {
        //logic to sort using bubble sort
        System.out.println("array before sorting:\n\n");
        for (int num : numbers) {
            System.out.println(num);
        }
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                }

            }
        }

        return numbers;
    }


    public static void main(String[] args) {
        int[] numbers = new int[5];
        int len = numbers.length;//5

        System.out.println("enter numbers in array:");
        for (int i = 0; i < len; i++) {
            numbers[i] = new Scanner(System.in).nextInt();//0  ,1
        }
//        System.out.println("arrays values are :\n");
//        for (Integer num : numbers) {
//            System.out.println(num);
//        }
//        System.out.println("array values in reverse order:\n");
//        for (int i = len - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }
//        int sum = 0;
//        for (int i = 0; i < len; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println("addition of all elements :" + sum);
//
//        double[] percentages = {56.32, 98.15, 78.24};//initialization of array
//        for (double marks : percentages) {
//            System.out.println(marks);
//        }

        ArrayTest2 a2 = new ArrayTest2();
        int[] sortedArray = a2.sort(numbers); //passing array to function
        System.out.println("array after sorting \n");
        for (int num : sortedArray) {
            System.out.println(num);
        }

    }
}
