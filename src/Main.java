public class Main {
    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
    }

    public static void homework1() {
        System.out.println("Домашнее задание 1");
        task1();
        task2();
        task3();

    }

    public static void task1() {
        //Задание 1
        System.out.println("Задание 1");
        int monthlyAccumulation = 15000;
        int totalAccumulation = 0;
        int i = 0;
        while (totalAccumulation <= 2_459_000) {
            totalAccumulation = totalAccumulation + totalAccumulation / 100;
            totalAccumulation = totalAccumulation + monthlyAccumulation;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalAccumulation + " рублей");
        }
    }

    public static void task2() {

        //Задание 2
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        //Задание 3
        System.out.println("Задание 3");

        int birthRatePerYear = 17;
        int mortalityPerYear = 8;
        int totalPopulation = 0;
        for (int i = 1; i <= 10; i++) {
            while (totalPopulation < 12_000_000)
                totalPopulation += 12_000_000;
            totalPopulation += totalPopulation * (birthRatePerYear - mortalityPerYear) / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation);
        }
    }
    public static void homework2 () {
        System.out.println("Домашнее задание 2");
        task4();
        task5();
        task6();
        task7();
    }
    public static void task4 () {

        //Задание 1
        System.out.println("Задание 1");
        int depositAmount = 15000;
        int totalSavings = 0;
        int month = 1;
        for (;totalSavings <= 12_000_000;month++) {
            totalSavings = totalSavings + (totalSavings / 100 * 7);
            totalSavings = totalSavings + depositAmount;
            System.out.println(month + "месяц, сумма накоплений " + totalSavings);
        }
    }
    public static void task5 () {

        //Задание 2
        System.out.println("Задание 2");
        int depositAmount = 15000;
        int totalSavings = 0;
        int month = 0;
        while (totalSavings <= 12_000_000) {
            totalSavings = totalSavings + (totalSavings / 100 * 7);
            totalSavings = totalSavings + depositAmount;
            month++;
            if (month % 6 == 0) {
                System.out.println(month + "месяц, сумма накоплений " + totalSavings);
            }
        }

    }
    public static void task6 () {
        //Задание 3
        System.out.println("Задание 3");
        int depositAmount = 15000;
        int totalSavings = 0;
        int month = 1;
        int monthsInNineYears = 9 * 12;
        for (;monthsInNineYears >= month; month++) {
            totalSavings = totalSavings + (totalSavings / 100 * 7);
            totalSavings = totalSavings + depositAmount;
            if (month % 6 == 0 || month < 2) {
                System.out.println(month + "месяц, сумма накоплений " + totalSavings);
            }
        }
    }
    public static void task7 () {
        //Задание 4
        System.out.println("Задание 4");
        int firstFriday = 7;
        if(firstFriday > 0 && firstFriday <= 7) {
            for (int day = firstFriday; day <=31; day += 7) {
                System.out.println("сегодня пятница " + day + " готовь отчёт");
            }
        }
    }

    public static void homework3 () {
        System.out.println("Домашнее задание 3");
        task8();
        task9();

    }
    public static void task8 () {

        //Задание 1
        System.out.println("Задание 1");
        int year = 0;
        int nowYear = 2022;
        int start = nowYear - 200;
        int finish = nowYear + 100;
        int period = 79;
        while (year <= finish) {
            if (year >= start) {
                System.out.println(year);
            }
            year += period;
        }
    }
    public static void task9 () {
        //Задание 2
        System.out.println("Задание 2");
        int theFirstMultiplier = 2;
        int theSecondMultiplier = 1;
            for (;theSecondMultiplier <= 10; theSecondMultiplier++) {
                int productOfNumbers = theFirstMultiplier * theSecondMultiplier;
                System.out.println(theFirstMultiplier + " * " + theSecondMultiplier + " = " + productOfNumbers);
            }
        }
    }