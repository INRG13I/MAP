package Utils.Exceptions;

public class RepositoryExceptions {
        public static class IdDuplicate extends Exception{
            public IdDuplicate(){
                super("There is another entity iwth the same Id. Try again!");
            }
        }
}
