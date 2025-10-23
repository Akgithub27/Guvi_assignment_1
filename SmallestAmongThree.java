public class SmallestAmongThree {
    public static void main(String[] args) {
        int a=10,b=5,c=2;
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
