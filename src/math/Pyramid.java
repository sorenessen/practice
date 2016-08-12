package math;

/**
 * Created by soren on 8/12/2016.
 *///nested loop
public class Pyramid {
    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            for(int j=0; j<20-i; j++) {
                System.out.print(" ");
            }
            for(int n=0; n<=i; n++){
               if(n==10){
                   System.out.print("Soren");
               }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
