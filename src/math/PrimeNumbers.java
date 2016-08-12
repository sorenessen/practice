package math;

/**
 * Created by soren on 8/12/2016.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 15, counter =0;
        for(int i=2; i<limit; i++){
            if(isPrime(i)){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers: " + counter);
    }
    public static boolean isPrime(int num){
        for(int j=2; j<num; j++){
            if(num % j ==0){
                return false;
            }
        }
        return true;
    }
}
