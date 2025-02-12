import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    static boolean useFiles = true;
    static Scanner scn;
    public static void main(String[] args) throws Exception {
       handleInputOutput(); // To manage I/O form files

       int n = scn.nextInt();
       int space=n-1,star=1;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=space;j++){
               System.out.print("\t");
           }
           for(int j=1;j<=star;j++){
               System.out.print("*\t");
           }
           System.out.println();
           space--;
           star++;
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
