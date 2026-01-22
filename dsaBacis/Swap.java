import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        /*int temp=a;
        a=b;
        b=temp;*/
        Swap(a,b);
        System.out.println(a+" "+b);
        String name="Aadi";
        changeName(name);
        System.out.println(name);

    }
    static void changeName(String name){
        name="aditya";
    }
    static void Swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
