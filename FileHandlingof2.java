import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingof2 {
     public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("sample.txt");
            int x = fr.read();
           
            String s = "";
            while(x != -1){
                s = s + (char)x;
                x = fr.read();
            } 
            fr.close();
           
            System.out.println("\nAfter Appending on the file");
            FileWriter fw1 = new FileWriter("sample2.txt",true);
            fw1.write(s);
            fw1.close();
        }
        catch(IOException e){
                System.out.print(e);
        }
    }
}