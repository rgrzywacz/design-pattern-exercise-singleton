package account;

public class TransferService {

    private ApplicationLogger applicationLogger;

    public TransferService() {
        applicationLogger = ApplicationLogger.getInstance();
    }

    public void transfer(final String accountNumberSource, final String accountNumberDestination, double amount) {
        if (amount > 0 && AccountNumberValidator.validate(accountNumberSource) && AccountNumberValidator.validate(accountNumberDestination)) {
            applicationLogger.log("money from " + accountNumberSource + " to " + accountNumberDestination + " has been transferred ...");
        }
    }
}