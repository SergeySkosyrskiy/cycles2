
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int savings = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month++;
            total = total + total / 100;
            total = total + savings;


            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }


        System.out.println("Задача 2");
        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(" " + j);
        }
        System.out.println(" ");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("Задача 3");
        int peopleWereBorn = 17;//Рождаемость
        int peoleDied = 8; // Смертность
        int population = 12_000_000; //Население
        int populationYear; //Население за год
        int result = 0;
        for (int year = 2024; year <= 2034; year++) {
            peopleWereBorn = population / 1000 * 17;
            peoleDied = population / 1000 * 8;
            populationYear = peopleWereBorn - peoleDied;
            population = population + populationYear;
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек");

        }
        System.out.println("Задача 4");
        int month1 = 0;
        int contribution = 15000; // Первоначальный вклад
        int purposeOfAccumulation = 12000000; //Цель накоплений
        for (; contribution <= purposeOfAccumulation; ) {
            int percent = contribution * 7 / 100;
            contribution = contribution + percent;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " Василий накопит " + contribution + " рублей");
            }

            // System.out.println("Месяц " + month1 + " Василий накопит " + contribution + " рублей");

        }
        System.out.println("Через " + month1 + " месяцев Василий накопит " + contribution + " рублей");


        System.out.println("Задача 6");
        int contribution1 = 15000;
        int saveMoneyYears = 9;
        int monts2 = saveMoneyYears * 12;
        int percent1 = contribution1 * 7 / 100;
        for (int counter = 1; counter <= monts2; counter++) {
            contribution1 = contribution1 + percent1;

            if (counter % 6 == 0) {

                System.out.println("Месяц " + counter + ", сумма накопления равна " + contribution1);
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 5;
        int daysInMonth = 31;
        for (; firstFriday <= daysInMonth; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчёт");
        }
        System.out.println("Задача 8");

        int year = 2024; //текущий год
        int after = year + 100; // следующие 100 лет
        int before = year - 200; // предыдущие 200 лет
        int vector = 0; // начало отсчёта пролетающей кометы
        int comet = 79; //  Каждый год когда пролетает комета
        while (vector < after) {
            if (vector > before) {
                System.out.println(vector);
            }
            vector = vector + comet;
        }
    }
}