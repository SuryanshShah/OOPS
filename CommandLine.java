public class CommandLine {
    public static void main(String[] args) {
        if ( args.length == 0)
            System.out.println("Please Enter values into the array");
        String [] arr = new String [args.length];
        for(int i =0;i<arr.length;i++){
            arr [i] = args [i];
        }
        System.out.println("The entered elements are");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}