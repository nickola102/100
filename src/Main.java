public class Main {
    public static void main(String[] args) {
        int current = 555; // начальный счёт
        int add = 2200; // сумма пополнения

        int bonus; // количество бонусных рублей
        if (add >= 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        int total = current + add + bonus;

        System.out.println("Начислено бонусных рублей");
        System.out.println(bonus);
        System.out.println("Итого на счету:");
        System.out.println((total) + "  рублей");


    }
}




