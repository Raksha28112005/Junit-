package org.bnm.demo;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

# ---------------- PROGRAM 2: LENGTH OF STRING ----------------
package org.bnm.demo;

public class App {
    public static void main(String[] args) {
        String s = "DevOps";
        System.out.println("Length of string: " + s.length());
    }
}

# ---------------- PROGRAM 3: AREA OF SQUARE ----------------
package org.bnm.demo;

public class App {
    public static void main(String[] args) {
        int side = 5;
        int area = side * side;
        System.out.println("Area of square: " + area);
    }
}

# ---------------- PROGRAM 4: EVEN OR ODD ----------------
package org.bnm.demo;

public class App {
    public static void main(String[] args) {
        int n = 10;
        if (n % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}

# ---------------- PROGRAM 5: SIMPLE INTEREST ----------------
package org.bnm.demo;

public class App {
    public static void main(String[] args) {
        int p = 1000, t = 2, r = 5;
        int si = (p * t * r) / 100;
        System.out.println("Simple Interest: " + si);
    }
}
