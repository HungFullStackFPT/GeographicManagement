
package utils;

import java.util.Scanner;


public class Inputter {

    Scanner sc = new Scanner(System.in);

    public String getString(String msg) {
        System.out.print(msg + ": ");
        return sc.nextLine();
    }

    public float getInputFloat(String msg) {
        while (true) {
            try {
                System.out.print(msg + ": ");
                float result = Float.parseFloat(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input number");
            }

        }
    }
}
