public class OverloadExample {
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public void display(int a, double b) {
        System.out.println("Integer: " + a + ", Double: " + b);
    }

    public void display(double a, int b) {
        System.out.println("Double: " + a + ", Integer: " + b);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display(5);
        obj.display(5.5);
        obj.display(5, 5.5);
        obj.display(5.5, 5);
    }
}
