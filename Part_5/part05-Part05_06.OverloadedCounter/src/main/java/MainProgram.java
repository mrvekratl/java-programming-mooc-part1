
public class MainProgram {

    public static void main(String[] args) {
        int number = 5;
        increment(number);
        System.out.println(number);  // 5 (değişmedi!)
    }

    public static void increment(int num) {
        num = num + 1;  // sadece kopya değişir
    }
}
