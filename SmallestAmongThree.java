import java.util.Scanner;

public class SmallestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a =sc.nextInt();
        System.out.println("Enter second number: ");
        int b =sc.nextInt();
        System.out.println("Enter third number: ");
        int c =sc.nextInt();
        System.out.println(Math.min(a,(Math.min(b,c)))); //Approach 1

        //Approach 2
        if(a<b && a<c){
            System.out.println(a);
        }else if(b<c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
