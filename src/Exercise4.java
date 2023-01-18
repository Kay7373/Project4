import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
  //     Преобразуйте строку к верхнему регистру.
  //     Преобразуйте строку к нижнему регистру.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
