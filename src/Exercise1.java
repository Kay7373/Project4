import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
//      Проверить, начинается ли ваша строка подстрокой “I like”. Используем методString.startsWith()

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(str.startsWith("I like") );
    }
}
