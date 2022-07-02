package account;

public class AccountService {

    private ApplicationLogger applicationLogger;

    public AccountService() {
        applicationLogger = ApplicationLogger.getInstance();
    }

    public void withdraw(String accountNumber, double amount) {
        if (amount > 0 && AccountNumberValidator.validate(accountNumber)) {
            applicationLogger.log(amount + " has been withdraw from " + accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (amount > 0 && AccountNumberValidator.validate(accountNumber)) {
            applicationLogger.log(amount + " has been deposit into " + accountNumber);
        }
    }
}