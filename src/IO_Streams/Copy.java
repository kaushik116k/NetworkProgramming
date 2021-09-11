package IO_Streams;
import java.io.*;
import java.util.Scanner;

public class Copy {
    // copy the data from one file to another file
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source file : ");
        String srcFile = sc.nextLine();
        System.out.println("Enter the destination file : ");
        String desFile = sc.nextLine();
        //read the file
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(desFile);
        int data;
        while((data = fis.read()) != -1){
            fos.write((char)data);
        }
        fis.close();
        fos.close();
    }
}
