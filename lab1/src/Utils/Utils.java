package Utils;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.sqrt;

import Utils.Exceptions.NoNumbersException;

public class Utils {

    public static void getInput(String[] args, ArrayList<Integer> array) throws NoNumbersException {
        if (args.length != 0) {
            for (String arg : args) {
                try {
                    int x = Integer.parseInt(arg);
                    array.add(x);
                } catch (NumberFormatException ignored) {
                }
            }
        } else {
            Scanner scn = new Scanner(System.in);
            System.out.print("Give arguments: ");
            String str = scn.nextLine();

            scn = new Scanner(str);
            scn.useDelimiter(" ");

            while (scn.hasNext()) {
                try {
                    int x = Integer.parseInt(scn.next());
                    array.add(x);
                } catch (NumberFormatException ignored) {
                }
            }
        }
        if(array.isEmpty())
            throw new NoNumbersException();
    }

    public static boolean is_it_prime(int arg) {
        int num = (int) sqrt(arg);
        if (arg < 2) {
            return false;
        }
        if (arg == 2) {
            return true;
        }
        if (arg % 2 == 0) {
            return false;
        }
        for (int i = 3; i < num; i = i + 2) {
            if (arg % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }
}