public interface BankAccountInterface {

    String fetchBalance(String password);
    String addMoney(int amount);
    String withdrawal(String password, int amount);
    String changePassword(String newPassword, String oldPassword);
    double calculateInterest(int year);
}
