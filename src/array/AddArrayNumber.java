package array;
import java.util.Scanner;
/**
 * Created by soren on 8/8/2016.
 */
public class AddArrayNumber {
    public static void main(String[] args) {
        int [] array = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        for(int j=0; j<array.length; j++){
            array[j] = sc.nextInt();
        }
        int total = 0;
        for(int i=0; i<array.length; i++){
            total = array[i]+array[i+1];
        }
    }
}
