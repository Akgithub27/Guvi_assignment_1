import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int purchaseAmount = sc.nextInt();
        double finalAmount=0;
        if(purchaseAmount<500){
            finalAmount=purchaseAmount;
        } else if (purchaseAmount>=500 && purchaseAmount<=1000) {
            finalAmount =  (purchaseAmount - (purchaseAmount*0.10));
        } else if (purchaseAmount>1000) {
            finalAmount =  (purchaseAmount - (purchaseAmount*0.20));
        }
        System.out.println(finalAmount);
    }
}
