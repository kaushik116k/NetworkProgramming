package IO_Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Write {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // writing in a file
        FileOutputStream fos = new FileOutputStream("D:\\javaprograms\\Output.txt");
        String text = "Hello this kaushik and I am studying for my graduation in vit,AP";
        byte a[] = text.getBytes();
        fos.write(a);
        fos.flush();
        fos.close();

        // reading from file
        FileInputStream fis = new FileInputStream("D:\\javaprograms\\Output.txt");
        int data;
        while((data = fis.read()) != -1)
            System.out.print((char)data);
        fis.close();
    }
}
