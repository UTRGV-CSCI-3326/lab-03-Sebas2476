public class BankAccount {
    public static void main(String[] args) {
        float Checking_Account = 2175.37f;
        Checking_Account -= 302.50f;
        Checking_Account += 50.03f;
        Checking_Account = Checking_Account / 2 + 20.00f;
        Checking_Account -= 1;
        Checking_Account = Checking_Account * 2;
        Checking_Account += 1;
        System.out.printf("Bob's Updated Balance: %.2f\n", Checking_Account);
    }
}