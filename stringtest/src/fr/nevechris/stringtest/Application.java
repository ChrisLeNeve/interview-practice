package fr.nevechris.stringtest;

public class Application {

    public static void main(String[] args) {
        // String literal is automatically interned. A new instance of String class is not. As such: false.
        String a = "str";
        String b = new String("str");
        System.out.println("a == b: " + (a == b));

        // Invoking the intern method doesn't change the value of b
        b.intern();
        System.out.println("a == b after intern method is called on b: " + (a == b));

        //Now we're talking! b takes the value of its interned value, which is a, which is already in the pool.
        b = b.intern();
        System.out.println("a == b after b takes the value returned by the call to intern method: " + (a == b));
    }
}
