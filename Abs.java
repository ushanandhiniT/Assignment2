package Assignment3;

abstract class Abs{
    void message() { }
}
class Subclass1 extends Abs{
    void message() {
        System.out.println("This is First subclass.");
    }
}
class Subclass2 extends Abs{
    void message() {
        System.out.println("This is Second subclass.");
    }
    public static void main(String [] args) {
        Subclass1 sb1 = new Subclass1();
        Subclass2 sb2 = new Subclass2();
        sb1.message();
        sb2.message();
    }
}

