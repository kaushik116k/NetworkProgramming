package IO_Streams;
import java.io.*;
public class Copy {
    // copy the data from one file to another file
    public static void main(String[] args) throws FileNotFoundException, IOException{
        //read the file
        FileInputStream fis = new FileInputStream("D:\\javaprograms\\Input.txt");
        FileOutputStream fos = new FileOutputStream("D:\\javaprograms\\Output.txt");
        int data;
        while((data = fis.read()) != -1){
            fos.write((char)data);
        }
        fis.close();
        fos.close();
    }
}
