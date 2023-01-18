import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

//      Заменить все символы “а” на “о”

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
         int n = str.length();
         String s = "";

         for (int i = 0; i < n; i++) {
             if ( str.charAt(i) == 'а') {
                 s = s + 'о';
             }
             else {
                 s = s + str.charAt(i);
             }

         }
         System.out.println("Начальная строка = " + str + " " + "ИТОГ = " + s);
    }
}
