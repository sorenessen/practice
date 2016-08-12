package array;

import java.util.Scanner;

/**
 * Created by soren on 8/5/2016.
 */
public class UseArray {
    public static void main(String[] args) {
        int limit = 10;
        int[] array = new int[limit];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some Integer value: ");
        for(int j=0; j<array.length; j++){
            array[j] = sc.nextInt();
        }
        System.out.println("Retrieve the data from the array: ");
        array[0] = 12;
        array[1] = 18;
        array[3] = 9;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);


        }
    }
}