public class Main {
    public static void main(String[] args) {
        int count = 100;
        int refill = 299;

        int total;
        int bonus;

        if (refill >= 1000){
            bonus = refill / 100;
        }
        else {
            bonus = 0;
        }

        total = count + bonus + refill;

        System.out.println("Конечная сумма счета " + total + ", бонус равен " + bonus);
    }
}
