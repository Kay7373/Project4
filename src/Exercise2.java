import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

//         Найти позицию подстроки “Java” в строке “I like Java!!!”

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
 //       System.out.println(str);
          int n = str.length();
        System.out.println("Введите подстроку поиска: ");
        String strdown = sc.nextLine();
          int m = strdown.length();
        int value = str.indexOf(strdown) + 1;
        System.out.println("Позицию подстроки: " + strdown + " в строке " + str + " = " + value);
//        String newString = str.substring(str.indexOf(strdown));
//        System.out.println(newString.substring(0, newString.indexOf(" ")));

//        Шестая задача - Вырезать строку Java c помощью метода String.substring()
        System.out.println(str.substring(0, value - 1) + str.substring(value+m - 1, n));
  //        }
    }
}
