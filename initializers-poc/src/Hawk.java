
class Bird {
    static {
        System.out.println("Top parent static initializer 1\n");
    }
    static {
        System.out.println("Top parent static initializer 2\n");
    }
    {
        System.out.println("Top parent initializer 1\n");
    }
    {
        System.out.println("Top parent initializer 2\n");
    }

    public Bird() {
        System.out.print("Top parent constructor\n");
    }
}

class Raptor extends Bird {
    static {
        System.out.print("Parent static initializer 1\n");
    }
    {
        System.out.print("Parent initializer 1\n");
    }
    public Raptor() {
        System.out.print("Parent constructor\n");
    }
    {
        System.out.print("Parent initializer 2\n");
    }
    static {
        System.out.print("Parent static initializer 2\n");
    }
}


/**
 * Static initializers are called before anything else - before any code is executed.
 * After that, code starts executing.
 * When an object is instantiated, the initializers are called first, then the constructors.
 * In every case: called from the top down (from the top most parent down).
 * In both static initializers and "plain" initializers: if a class has several, they are called in that order.
 */
public class Hawk extends Raptor  {
    public static void main(String[] args) {
        System.out.print("First line of code! in Main (class extends parent)\n");
        new Hawk();
        System.out.println("Last line in main\n");
    }
}
