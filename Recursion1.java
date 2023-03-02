public class Recursion1 {
    public static void main(String[] args) {
        //recursion: Function calling it self
        //it helps us in solving complex problems in a simple way
        //you can convert the recursion sol into iteration(loops) and vice-versa
        //calling method with the single function
        Message1();
    }
    static void Message1(){
        System.out.println("hello world1");
        Message2();
    }

    static void Message2(){
        System.out.println("hello world2");
        Message3();
    }

    static void Message3(){
        System.out.println("hello world3");
        Message4();
    }

    static void Message4(){
        System.out.println("hello world4");
        Message5();
    }

    static void Message5(){
        System.out.println("hello world5");
    }
}

