package _my_test;

public class BankAccountTest {

        public static void main(String[] args) {

            BankAccount myAccount = new BankAccount();
            myAccount.deposit(10000);
            System.out.println(myAccount);
            myAccount.withdraw(8000);
            System.out.println(myAccount);

        }
}
