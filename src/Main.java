import java.util.Scanner;

public class Main {
    static String temp;

    public static void main(String[] args) {
        System.out.println("Введите ФИО ");
        String name = new Scanner(System.in).nextLine();
        validString(name);
    }

    public static void validString(String name) {

        temp = String.valueOf(name.matches("[А-Я][а-я]*-?[а-я]*?\\s[А-Я]?[а-я]*-?[а-я]*?\\s[А-Я]?[а-я]*-?[а-я]*"));
        if (temp == String.valueOf(true)) {
            name = name.replaceAll("\"[А-Я][а-я]*-?[а-я]*?\\\\s[А-Я]?[а-я]*-?[а-я]*?\\\\s[А-Я]?[а-я]*-?[а-я]*\"",
                    "\"[А-Я][а-я]*-?[а-я]*?\\\\s[А-Я]?[а-я]*-?[а-я]*?\\\\s[А-Я]?[а-я]*-?[а-я]*\"");
            System.out.println(name);
        } else {
            System.out.println("Неправильный ввод ФИО");
        }

    }
}










