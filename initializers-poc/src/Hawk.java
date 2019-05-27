
class Bird {

    private static int testStaticInt = setStaticInt();
    private int testInt = setInt();
    private static int STATIC_CONST = 4;
    private int CONST = 3;

    private int setInt() {
        System.out.println("Set top parent non-static variables");
        return 3;
    }

    private static int setStaticInt() {
        System.out.println("Set top parent static variables");
        return 2;
    }

    static {
        System.out.println("Top parent static initializer 1");
    }
    static {
        System.out.println("Top parent static initializer 2");
    }
    {
        System.out.println("Top parent initializer 1");
    }
    {
        System.out.println("Top parent initializer 2");
    }

    public Bird() {
        System.out.println("Top parent constructor");
    }
}

class Raptor extends Bird {
    private static int testStaticInt = setStaticInt();
    private int testInt = setInt();

    private int setInt() {
        System.out.println("Set parent non-static variables");
        return 4;
    }

    private static int setStaticInt() {
        System.out.println("Set parent static variables");
        return 4;
    }

    static {
        System.out.println("Parent static initializer 1");
    }
    {
        System.out.println("Parent initializer 1");
    }
    public Raptor() {
        System.out.println("Parent constructor");
    }
    {
        System.out.println("Parent initializer 2");
    }
    static {
        System.out.println("Parent static initializer 2");
    }
}

/**
 * The order is as follows:
 * 1. For every parent from the top-level down:
 *  a. Static variables are set. At this point, non-static variables are not even available. (Variables assigned via a method and constants are treated exactly the same, in every case).
 *  b. All its static initializers are called, in their declaration order.
 * 2. Code starts executing.
 * 3. For every parent from the top-level down:
 *  a. Non-static variables are set.
 *  b. All its non-static initializers are invoked, in their declaration order.
 *  c. Constructors are invoked.
 */
public class Hawk extends Raptor  {
    public static void main(String[] args) {
        System.out.println("\nFirst line of code! Now, we're going to initialize the child class.\n");
        new Hawk();
    }
}
