/*import java.util.Scanner;
import java.util.ArrayList;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int c = 0;
        ArrayList<String> array = new ArrayList<String>();
        int maxLength1 = 0;
        for (int i = 0;; i++) {
            array.add(scan.nextLine());
            c++;
            if (array.get(i).equals("стоп"))
                        break;
        }
        for (int z1 = 0; z1 < array.size(); z1++) {
            if(array.get(z1).length() > maxLength1)
                maxLength1 = array.get(z1).length();
        }
        int maxLength2 = maxLength1 + 4;
        //  metod (-, |);
        //   System.out.println (b);
        //String (b);
       // System.out.print ("|");
        //for (int z3=0;z3<maxLength2;z3++)
       // {
       //     System.out.print("-");
       // }
       // System.out.println ("|");
       // System.out.print ("|");
        //for (int z3=0;z3<maxLength2;z3++)
        //{
        //    System.out.print(" ");
       // }
       // System.out.print ("|");
       // for (int z3=0;z3<maxLength2;z3++)
       // {
        //    System.out.print(" ");
        //}
        int space = 0;
       // System.out.println();
        for (int z = 0; z < array.size(); z++)
        {
            space =( maxLength2 - array.get(z).length() )/2;

            System.out.print("|");

            for (int z3=0;z3<space;z3++)
            {
                System.out.print (" ");
            }
            System.out.print(array.get(z));

            for (int z3=0;z3<maxLength2-space-array.get(z).length();z3++)
            {
                System.out.print (" ");
            }
            System.out.println("|");
        }
        /*System.out.print ("|");
        for (int z3=0;z3<maxLength2;z3++)
        {
            System.out.print(" ");
        }
        System.out.println ("|");
        System.out.print ("|");
        for (int z3=0;z3<maxLength2;z3++)
        {
            System.out.print("-");
        }
        System.out.print ("|"); */
      /*  public static void metod(String n1, String n2) {
            char[maxLength2] p;
            p [0] = n2;
            p [maxLength2-1] = n2;
            for (int z=0;z<maxLength2-1;z++) {
                p [z] = n1;
            }
            String b = new String(p);*/
//        }
//    }

//}