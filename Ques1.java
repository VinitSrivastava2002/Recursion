public class Ques1 {
    public static void main(String[] args) {
        print(5);
    }
    //print number 1 to n
    static void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
