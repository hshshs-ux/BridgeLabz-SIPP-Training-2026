public class OverloadingExample {

    static void print(Integer value) {
        System.out.println(value);
    }

    static void print(String value) {
        System.out.println(value);
    }

    static void print(Double value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        print(10);
        print("Hello");
        print(5.5);
    }
}