import com.sun.jdi.PathSearchingVirtualMachine;
import org.w3c.dom.ls.LSOutput;

public class Shadowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        x=30;
        System.out.println(x);
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
