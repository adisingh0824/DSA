import java.util.Scanner;
public class arraybasic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day no. :");
        //String fruit=sc.next();
        //switch (fruit) {
           // case "Mango" -> System.out.println("KING OF FRUITS");
           // case "Apple" -> System.out.println("A sweet red fruits");
           // case "Orange" -> System.out.println("Round fruits");
            //case "Grapes" -> System.out.println("Smalle fruit");
           // default -> System.out.println("please enter a valid fruits"):
        int day=sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("in valid");
        }
    }
}
