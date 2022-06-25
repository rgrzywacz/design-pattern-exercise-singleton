package account;

public class AccountNumberValidator {
    public static boolean validate(String accountNumber){
        if (accountNumber!=null && accountNumber.isEmpty() == false) {
            return true;
        }
        return false;
    }
}