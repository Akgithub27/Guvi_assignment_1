public class patternPrinting {
    public static void main(String[] args) {

        int i, j, k;
        int n = 5;
        for (i = 1; i <= n; i++) {
            k = n;
            for (j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print(k + " ");
                    k--;
                } else {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }
}
