public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
//        Account bobsAccount = new Account("12345", 1000, "Bob Brown", "bob.gmail.com",
//                "0123456789");

     /*   bobsAccount.setNumber("12345");
        bobsAccount.setBalance(1000);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("bob@gmail.com");
        bobsAccount.setCustomerPhone("0123456789"); */

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50.0);
    }
}