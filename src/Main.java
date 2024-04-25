import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
            //task 1
            int year = 2012;
            if (isLeapYear(year)) {
                System.out.println(year + " год — високосный год");
            } else {
                System.out.println(year + " год — невисокосный год");

            }
            //task 2
        printVersion(0,2024);
            printVersion(1, 2020);

            //task 3
        int distance = 50;
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays >= 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

        }
    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    static void printVersion(int os, int releaseYear){
            int currentYear = LocalDate.now().getYear();
            if (os == 0) {
                if (releaseYear < currentYear) {
                    System.out.println("Скачайте облегченную версию для ios");
                } else {
                    System.out.println("Скачайте версию для ios");
                }
            } else if (os == 1) {
                if (releaseYear < currentYear) {
                    System.out.println("Скачайте облегченную версию для android");
                } else {
                    System.out.println("Скачайте версию для android");
                }
            } else {
                System.out.println("Устройство не поддерживается");

            }
        }

        static int  calculateDeliveryDays(int distance) {
            if (distance <= 20) {
                return 1;
            }else if (distance <= 60) {
                return 2;
            } else if (distance <= 100) {
                return 3;
            } else {
                return -1;
            }
        }

        }

    
