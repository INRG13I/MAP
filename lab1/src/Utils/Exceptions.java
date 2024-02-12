package Utils;


public class Exceptions {

    public static class NoNumbersException extends Exception {
        public NoNumbersException() {
            super();
            System.out.println("Send nums!");
        }
    }
}