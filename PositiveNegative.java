import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number =sc.nextInt();
        if(number>0){
            System.out.println("it is Positive");
        }else {
            System.out.println("It is negative");
        }
    }
}
