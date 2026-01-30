import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    int size, i, sum=0;
    System.out.println("Enter the size of the array");
    size = scr.nextInt();
    int [] arr = new int[size];
    System.out.println("Enter the elements of the array");
    for(i=0;i<size;i++){
        arr[i] = scr.nextInt();
        sum+=arr[i];
    }
    System.out.println("Sum of the array is "+sum);
    }
}