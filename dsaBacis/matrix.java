import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int col=sc.nextInt();
        int row =sc.nextInt();
        int sum=0;
        int[][] arr=new int[col][row];
        for(int i =0;i<col;i++){
            for(int j=0;j<row;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(i==j){
                    sum+=arr[i][j];
                }else if(i==0 && j==col-1){
                    sum+=arr[i][j];
                } else if(j==0 && i==row-1){
                    sum+=arr[i][j];
                }
            }
        }
    }
}
