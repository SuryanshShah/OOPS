import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int [] a= new int [10];
        int i=0,c=0;
        for(i=0;i<10;i++){
            System.out.println("Enter the elements for the Array");
            a[i]=scr.nextInt();
        }
        for(i=0;i<10;i++){
            c=0;
            for(int j=0;j<10;j++){
                if(i!=j){
                    if(a[i] == a[j])
                        c++;
                }        
        }

    }    
    if(c>0)
        System.out.println("The array contains "+c+" duplicate elements");
    else
          System.out.println("The array does not contains duplicate elements");       
    scr.close();
    }
}
