import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
       // fun(12,23,32,46,57,62,75,87,90);
           fun();
    }
    static void fun (int...v){
        System.out.println(Arrays.toString(v));

    }
}
