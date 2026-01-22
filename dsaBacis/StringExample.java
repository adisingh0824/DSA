import java.util.Scanner;
public class StringExample {
    public static void main(String[] args) {
        //String message=greet();
        //System.out.println(message);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.next();
        String presonalised= myGreet(name);
        System.out.println(presonalised);
    }
    static String myGreet(String name){
        String message="hello "+name;
        return message;
    }
    static String Greet(){
        String greeting ="how are you";
        return greeting;
    }
    //arguments

}
