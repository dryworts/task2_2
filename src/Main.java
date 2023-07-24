public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        double balance = 100.0;
        double bonus = 0.0;
        double refill = 1100.0;
        if (refill >= 1000.0) {
            bonus += refill / 100.0;
        }

        balance += bonus + refill;
        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Состояние счета: " + balance);
    }
}