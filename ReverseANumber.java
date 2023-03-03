public class ReverseANumber {
    public static void main(String[] args) {
        int ans=rev(1824);
        System.out.println(ans);
    }
     static int rev(int n){

        return rev(n/10);
     }
}
