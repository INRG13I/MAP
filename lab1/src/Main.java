
import java.util.Scanner;
import java.util.ArrayList;

import Utils.*;

import static Utils.Functions.*;
import static Utils.Utils.getInput;

import Utils.Exceptions.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (true){
            try {
                getInput(args, array);
                System.out.println("Prime numbers are: " + primeNumbers(array));//prime numbers
                System.out.println("Biggest number is: " + maxNumber(array)); //max number
                System.out.println("Smollest number is: " + minNumbers(array)); //min number
                System.out.println("Greatest common divisor is: " + greatestDiv(array)); //gcd
                System.out.println("Smollest multiply is: " + smolestMult(array)); //lcm
                System.exit(0);
            }catch(NoNumbersException ignored){}
        }

    }

}