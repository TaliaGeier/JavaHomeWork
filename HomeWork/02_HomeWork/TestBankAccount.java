public class TestBankAccount {
	public static void main(String[] argv) {
		
		BankAccount Nil = new BankAccount("Nil", "1234", 1000, true, 300);
		System.out.println(Nil.toString());
		Nil.Withdrawal(1100);		
		System.out.println(Nil.toString());
		Nil.Withdrawal(300);
		System.out.println(Nil.toString());
		
		BankAccount Rom = new BankAccount("Rom", "1234", 0 , false, 200);
		System.out.println(Rom.toString());
		Rom.Deposit(200);
		System.out.println(Rom.toString());
		Rom.Withdrawal(400);
		System.out.println(Rom.toString());

	}
}