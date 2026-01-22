public class Scop {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
             a=78;
            int c= 99;
            //System.out.println(c);
            //value  initialised in this block, will remain in this  block

        }
        System.out.println(a);

        //System.out.println(c);//cant use outside the block
    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
