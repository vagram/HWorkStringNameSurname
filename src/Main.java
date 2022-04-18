import java.util.Scanner;

public class Main {
    private final static String regEx = "([А-я]+-?[А-я]+)(\\s)([А-я]+-?[А-я]+)(\\s)([А-я]+-?[А-я]+$)";

    public static void main(String[] args) {
        System.out.println("Введите ФИО ");
        String name = new Scanner(System.in).nextLine();
        validString(name);
    }

    public static void validString(String name) {

        if (name.matches(regEx)) {
            name = name.replaceAll(regEx, "Имя: $1$2\nОтчество: $3 $4\nФамилия: $5");
            System.out.print(name);
        } else {
            System.out.println("Неправильный ввод ФИО");
        }
    }

}











