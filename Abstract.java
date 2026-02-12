abstract class Sample {
    int a = 10;

    void f() {
        System.out.println(a);
    }

    abstract void f2();
}

class Childs extends Sample {
    void show() {
        super.f();
    }

    @Override
    void f2() {
        System.out.println("done");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Childs s = new Childs();
        s.show();
        s.f2();
    }
}