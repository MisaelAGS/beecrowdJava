import java.util.Scanner;
public class Bee1001{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A, B, X;
        A = sc.nextInt();
        B = sc.nextInt();
        X = A + B;
        System.out.printf("X = %d", X);
        sc.close();
    }
}