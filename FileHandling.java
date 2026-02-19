import java.io.*;
public class FileHandling {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("sample.txt");
            int x = fr.read();
            while(x != -1){
                System.out.print((char)x);
                x = fr.read();
            } 
            fr.close();
            FileWriter fw = new FileWriter("sample.txt",true);
            String s = "\nHello, This is the appended part of the file";
            fw.write(s);
            fw.close();
            System.out.println("After Appending on the file");
            FileReader fr1 = new FileReader("sample.txt");
            x = fr1.read();
            while(x != -1){
                System.out.print((char)x);
                x = fr1.read();
            }
            fr1.close();
        }
        catch(IOException e){
                System.out.print(e);
        }
    }
}

