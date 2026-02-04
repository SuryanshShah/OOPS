class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B extends A {
    B() {
        super();  
        super();  
    }
}

public class Chaining{
    public static void main(String[] args) {
        B obj = new B();
    }
}
