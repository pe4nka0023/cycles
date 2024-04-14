import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //task 1
        var firstName = "Ivan";
        var lastName = "Ivanov";
        var middleName = "Ivanovich";
        var fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //task 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());


        //task 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
        }

    }