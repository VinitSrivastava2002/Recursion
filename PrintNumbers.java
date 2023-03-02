public class PrintNumbers {
    public static void main(String[] args) {
        //problem is print next five  number
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.print(n);
            return;
        }

        System.out.print(n);
        //every call takes seperate memory

        //this is called tail recursion
        //this is last function call
        print(n+1);
    }

}
