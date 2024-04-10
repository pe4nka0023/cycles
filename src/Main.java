import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        double[] payments = {35000, 150000, 20000, 37000, 74000};
        //task 1
        double sum = 0;
        for (double payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task 2
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (double payment : payments) {
            if (payment < min) {
                min = payment;
            }
            if (max < payment) {
                max = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей." +
                "Максимальная сумма трат за неделю составила " + max + " рублей");

        //task 3
        double average = sum / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
        }

    }