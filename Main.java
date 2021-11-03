import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files

       int rowSize = scn.nextInt();
       int colSize = scn.nextInt();
       int arr[][] = new int[rowSize][colSize];
       for(int i=0;i<rowSize;i++){
           for(int j=0;j<colSize;j++){
               arr[i][j] = scn.nextInt();
           }
       }

       //   Transpose of matrix
       for(int i=0;i<rowSize;i++){
           for(int j=i;j<colSize;j++){
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
           }
       }
       
       //   Reverse all rows of matrix
       for(int i=0;i<rowSize;i++){
           for(int j=0;j<colSize/2;j++){
               int temp = arr[i][j];
               arr[i][j] = arr[i][colSize-j-1];
               arr[i][colSize-j-1] = temp;
           }
       }
       //    Printing output
       for(int i=0;i<rowSize;i++){
           for(int j=0;j<colSize;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
       
        
        scn.close(); // closing scanner resource
    }



    public static void handleInputOutput() throws Exception{
        if(useFiles){
            scn = new Scanner(new File("input.txt"));
            System.setOut(new PrintStream(new File("output.txt")));
        } else {
            scn = new Scanner(System.in);
        }
    }
}
