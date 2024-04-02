import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 17;
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного " +
                    "подождать");
        } else {
            System.out.println("Если возраст человека равен" + age + ", то он совершеннолетний");
        }

        //task 2
        int temp = 13;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице" + temp + " градусов, нужно надеть шапку");
        }

        //task 3
        int speed = 67;
        if (speed > 67) {
            System.out.println("Если скорость" + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        //task 4
        age = 19;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в универ");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //task 5
        age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в " +
                    "сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без " +
                    "сопровождения взрослого");
        }

        //task 6
        int passengers = 74;
        if (passengers < 60) {
            System.out.println("есть сидячие места");
        } else if (passengers <102) {
            System.out.println("есть стоячие места");
        } else {
            System.out.println("мест нет");
        }

        //task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("one максимум");
        } else if (two > three) {
            System.out.println("two максимум");
        } else {
            System.out.println("three максимум");

        }
    }
}