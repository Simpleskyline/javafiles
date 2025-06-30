// File: Method.java

public class Method {

    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        add(x, y);
    }

    static int add(int x, int y) {
        int sum = x + y;
        System.out.println("The sum is: " + sum);
        return sum;
    }
}
