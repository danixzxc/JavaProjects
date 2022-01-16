import java.util.ArrayList;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = 0;
        ArrayList<String> array = new ArrayList<String>();
        int maxLength1 = 0;
        for (int i = 0; ; i++) {
            array.add(scan.nextLine());
            c++;
            if (array.get(i).equals("стоп"))
                break;
        }
        for (int z1 = 0; z1 < array.size(); z1++) {
            if (array.get(z1).length() > maxLength1)
                maxLength1 = array.get(z1).length();
        }
        int maxLength2 = maxLength1 + 4;
        greeting1("-", " ", maxLength2);
        int space = 0;
        for (int z = 0; z < array.size(); z++) {
            space = (maxLength2 - array.get(z).length()) / 2;

            System.out.print("|");

            for (int z3 = 0; z3 < space; z3++) {
                System.out.print(" ");
            }
            System.out.print(array.get(z));

            for (int z3 = 0; z3 < maxLength2 - space - array.get(z).length(); z3++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        greeting1(" ", "-", maxLength2);
    }

    static void greeting1(String s1, String s2, int o) {

        System.out.print("|");
        for (int a = 0; a < o; a++) {
            System.out.print(s1);
        }
        System.out.println("|");
        System.out.print("|");
        for (int a = 0; a < o; a++) {
            System.out.print(s2);
        }
        System.out.println("|");
    }
}