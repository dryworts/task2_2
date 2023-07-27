public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus = 0;
        int refill = 1100;
        if (refill > 1000) {
            bonus += refill / 100;
        }

        balance += bonus + refill;
        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Состояние счета: " + balance);
    }
}