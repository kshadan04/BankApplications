import java.util.UUID;

public class SBIAccount implements BankAccountInterface{

    private String name;
    private String accountNo;  // randomly unique generated number by UUID

    private String password;
    private double balance;

    final double rateOfInterest = 7.5;

    // for good developer always create two constructor
    // 1) without arguments
    // 2) with all arguments

    // generate constructor

    // no args // default constructor
    public SBIAccount() {
    }

    // constructor with all argument
    public SBIAccount(String name, String password, double balance) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.balance = balance;
    }


    // generate getter and setter ( code --> generate--> found)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }


    // implement all the method by clicking on red bulb(which show error)
    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return getName()+"! your account balance is " + getBalance();
        }
        else return "password is incorrect ! Please enter valid password";
    }

    @Override
    public String addMoney(int amount) {
        this.balance += amount;
        return "your account balance is "+getBalance();
    }

    @Override
    public String withdrawal(String password, int amount) {
        if(this.balance >=amount){
            if(this.password.equals(password)){
                this.balance -= amount;
                return "your remaining balance is " + getBalance();
            }
            return "please enter valid password";
        }
        return "your account have insufficient balance which is" + getBalance();
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            return "Congratulations! Successfully your password is updated";
        }
        return "please enter correct old password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance * this.rateOfInterest * year)/100;
    }
}
