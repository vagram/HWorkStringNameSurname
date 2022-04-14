import java.util.Scanner;

public class Main {
    static int space = 0;
    static String test = "АБВГДЕЁЖЗКЛМНОИЙ-ПРС-ТЬЫШЩУФЭЮЯ-йцуке нгшщ зх-ъёфы вапролджэюбьтимсчя";
    static boolean passValid = true;
    public static void main(String[] args) {

        System.out.println("Введите ФИО ");
        String name = new Scanner(System.in).nextLine();

            validString(name);
        if (passValid == true) {
            printFIO(name);
        }
    }

    public static void printFIO(String name) {
        if (space == 2) {
            String firstName = name.substring(0, name.indexOf(' '));
            System.out.println("Имя: " + firstName);

            String fatherName = name.substring(name.indexOf(' ') + 1, name.lastIndexOf(' '));
            System.out.println("Отчество: " + fatherName);

            String secondName = name.substring(name.lastIndexOf(' ') + 1);
            System.out.println("Фамилия: " + secondName);
        } else {
            System.out.println("Превышено количество пробелов!");
        }

    }


    public static void validString(String name) {
        for (int b = 0; b < name.length(); b++) {
            if (!test.contains(String.valueOf(name.charAt(b)))) {
                System.out.println("Недопустимые символы!");
                passValid = false;
                return;
            }
            if (name.charAt(b) == ' ') {
                space++;
            }

        }

    }
}










