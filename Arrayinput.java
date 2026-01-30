import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int [] a= new int [10];
        int i;
        for(i=0;i<10;i++){
            System.out.println("Enter the elements for the Array");
            a[i]=scr.nextInt();
        }
        System.out.println("The elements of Array are");
        for(i=0;i<10;i++){
            System.out.println(a[i]);
        }
        scr.close();
    }
}