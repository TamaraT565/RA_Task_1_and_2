public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Начальные значения:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Для смены значений a и b был применен логический оператор XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Измененные значения:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
