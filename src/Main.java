public class Main {
    public static void main(String[] args) {

        int accountBalance = 200;
        int payment = 2700;

        int bonusRubles;
        if (payment >= 1000) {
            bonusRubles = payment / 100;
        }   else {
            bonusRubles = 0;
        }

        // int bonusRubles = payment>=1000 ? payment / 100 : 0;

        int finalBalance = accountBalance + payment + bonusRubles;

        System.out.println("Итоговый счёт: " + finalBalance);
        System.out.println("Количество бонусных рублей: " + bonusRubles);


    }
}