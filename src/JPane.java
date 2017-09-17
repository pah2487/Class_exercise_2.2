import javax.swing.*;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Takes in each primitive data type and then displays them in the order they were entered in a J Panel
 * @author Patrick H.
 * @since 2017-9-17
 *@version 1.0
 */

public class JPane {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        // starts scanner sc

        System.out.println("Please enter any whole number between -127 and 128");
        byte byt = sc.nextByte();
        //takes a byte and stores it in byt

        System.out.println("Please enter any whole number between  -32,768 and 32,767");
        short shrt = sc.nextShort();
        String b = NumberFormat.getIntegerInstance().format(shrt);
        //Takes a short then formats it to include commas in proper places. The formatted string is stored as b

        System.out.println("Please enter any whole number between -2,147,483,648 and 2,147,483,647");
        int intgr = sc.nextInt();
        String c = NumberFormat.getIntegerInstance().format(intgr);
        //Takes an integer then formats it to include commas in proper places. The formatted string is stored as c

        System.out.println("Please enter any whole number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807");
        long lng = sc.nextLong();
        String d = NumberFormat.getIntegerInstance().format(lng);
        //Takes a long then formats it to include commas in proper places. The formatted string is stored as d

        System.out.println("Please enter any number between 1.4 E-45 and 3.402,823,5 E+38");
        float flt = sc.nextFloat();
        //Takes a double then stores it as dbl

        System.out.println("Please enter any number between 4.9 E-324 and 1.797,693,134,862,315,7 E+308");
        double dbl = sc.nextDouble();
        //Takes a double then stores it as dbl

        System.out.println("Please enter a single character");
        char cha = sc.next().charAt(0);
        //Takes a character then stores it as cha

        System.out.println("Please enter a boolean");
        Boolean bool = sc.nextBoolean();
        //Takes a boolean then stores it as bool

        JOptionPane.showMessageDialog(null, "you entered the byte: " + byt + "\n you entered the short: " + b + "\n you entered the integer: " + c + "\n you entered the long: " + d + "\n you entered the float: " + flt + "\n you entered the double: " + dbl+ "\n you entered the character: " + cha + "\n you entered the boolean: " + bool);
        //opens a J Panel and outputs all given variables
    }



}
