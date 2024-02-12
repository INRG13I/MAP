package Utils;

import java.util.ArrayList;

import static Utils.Utils.*;

public class Functions {

    public static ArrayList<Integer> primeNumbers(ArrayList<Integer> array) {
        ArrayList<Integer> results = new ArrayList<>();
        for (int num : array)
            if (is_it_prime(num))
                results.add(num);
        return results;
    }

    public static int maxNumber(ArrayList<Integer> array) {
        int max = Integer.MIN_VALUE;
        for (int num : array)
            if (num > max)
                max = num;
        return max;
    }

    public static int minNumbers(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        for (int num : array)
            if (num < min)
                min = num;
        return min;
    }

    public static long greatestDiv(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); ++i)
            if (array.get(i) <= 0)
                array.remove(i);

        long result = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            result = gcd(result, array.get(i));
        }
        return result;
    }

    public static long smolestMult(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); ++i)
            if (array.get(i) <= 0)
                array.remove(i);

        long result = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            result = lcm(result, array.get(i));
        }
        return result;
    }
}
