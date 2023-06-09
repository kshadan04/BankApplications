public class Main {
    public static void main(String[] args) {
        SBIAccount SBIAccount1 = new SBIAccount("Shadan Khan","Shad123",0);
        System.out.println("congrates " + SBIAccount1.getName()+" your account is created with accountNo "
                + SBIAccount1.getAccountNo());
        SBIAccount1.addMoney(150000);
//        System.out.println(SBIAccount1.fetchBalance("Shad123"));
//        SBIAccount1.withdrawal("Shad123",700);
//        System.out.println(SBIAccount1.fetchBalance("Shad123"));

//        System.out.println(SBIAccount1.changePassword("123","Shad123"));
        System.out.println(SBIAccount1.calculateInterest(5));

    }
}
