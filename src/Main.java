import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task 1
        double sum = 0;
        int mounth = 1;
        while (sum < 2459000) {
            sum += 15000;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + sum + " рублей");
            mounth++;
        }
        //task 2
        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
        System.out.println();
        for (; n >= 1; n--) {
            System.out.print(n + " ");
        }


        //task 3
        double population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            double birth = population / 1800 * birthRate;
            double death = population / 1800 * deathRate;
            population = population + birth - death;
            System.out.println("Год " + year + " , численность населения составляет " + (long) population);
            }

        //task 4
        sum = 15000;
        mounth = 1;
        while (sum < 12000000) {
            sum = sum + sum * 7 / 100;
            mounth++;
            System.out.println("месяц = " + mounth + " сумма = " + (int) sum);
            }

        //task 5
        sum = 15000;
        mounth = 1;
        while (sum < 12000000) {
            sum = sum + sum * 7 / 100;
            mounth++;
            if (mounth % 6 == 0) {
                System.out.println("месяц = " + mounth + " сумма = " + (int) sum);
                }
            }
        //task 6
        sum = 15000;
        mounth = 1;
        while (mounth < 9 * 12) {
            sum = sum + sum * 7 / 100;
            mounth++;
            if (mounth % 6 == 0) {
                System.out.println("месяц = " + mounth + " сумма = " + (int) sum);
                }
            }
        //task 7
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday +"-е число. Необходимо подготовить отчет");
            friday += 7;
        }

        //task 8
        int currentYear = LocalDate.now().getYear();
        for (int year = currentYear - 200; year < currentYear + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        }
    }
