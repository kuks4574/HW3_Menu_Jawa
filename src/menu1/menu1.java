package menu1;

import java.io.IOException;
import java.util.Scanner;

public class menu1 {

    public static void main(String[] args) throws IOException {

        //TODO Опрделение сезона по номеру месяца

        String season;
        int month;

        System.out.print("Введите номер месяца: ");
        Scanner num = new Scanner(System.in);
        month = num.nextInt();
        System.out.println("Ваш месяц: " + month);


        if (month <= 2 && month > 0 || month == 12) {
            season = "winter";
            System.out.println("It's a " + season + " month");
        } else if (month < 6 && month > 2) {
            season = "spring";
            System.out.println("It's a " + season + " month");
        } else if (month < 10 && month > 8) {
            season = "autumn";
            System.out.println("It's a " + season + " month");
        } else {
            System.out.println("Incorrect data!");
        }

        System.out.println("\n");

        //TODO Меню выбора блюд

        char choice;
        do {
            System.out.println("Выберите одно из блюд: ");
            System.out.println(" 1. Суп");
            System.out.println(" 2. Макароны");
            System.out.println(" 3. Пюре");
            System.out.println(" 4. Салат");
            System.out.println(" 5. Компот");
            System.out.println("Выберете пункт меню: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n ---------------");

        switch (choice) {
            case '1':
                System.out.println("Вы выбрали: \n ");
                System.out.print("Блюдо №1");
                System.out.print(" - Это суп");
                break;
            case '2':
                System.out.println("Вы выбрали: \n ");
                System.out.print("Блюдо №2");
                System.out.print(" - Это Макароны");
                break;
            case '3':
                System.out.println("Вы выбрали: \n ");
                System.out.print("Блюдо №3");
                System.out.print(" - Это Пюре");
                break;
            case '4':
                System.out.println("Вы выбрали: ");
                System.out.print("Блюдо №4");
                System.out.print(" - Это Салат");
                break;
            case '5':
                System.out.println("Вы выбрали: \n ");
                System.out.print("Блюдо №5");
                System.out.print(" - Это Компот");
                break;

        }
    }
}