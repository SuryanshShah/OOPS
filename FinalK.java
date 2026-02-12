//FINAL VARIABLE
//     class A{
//     final int a=10;//final variable
// }
// class B extends A{
//     int a=20;//this is not final variable ,here it is a local variable and it will not work if we do not use int or any datatpe with it 
// }
// public class Finkey{
// public static void main(String []args){
//     A var=new A();
//      B var2=new B();
//     System.out.println(var.a);
//     System.out.println(var2.a);
// }}


// FINAL CLASS
final class ABC{
    final int a=10;
}//when class is fiasnlized then we cannot inherit it and we cannot create a subclass of it
class BCD{
    int a=20;//without int it is not possible
}
public class FinalK {
    public static void main(String []args){
        ABC var=new ABC();
        BCD var2=new BCD();
        System.out.println(var.a);
        System.out.println(var2.a);
    }
}