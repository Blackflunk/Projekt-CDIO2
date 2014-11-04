package Test;
import Game.Account;

public class Test_Account {

	public static void main(String[] args) {
		//Preconditions
			//Opretter account.
			Account acc = new Account();
			//S�tter 2000 penge til pengebeholdningen.
			acc.setBalance(2000);
			//Fremviser at pengebeholdningen nu er p� 2000.
			System.out.println("Nuv�rende pengebeholdning: " + acc.getBalance());
		
		//Test
			//Fjerner 1000 fra pengebeholdning.
			acc.addBalance(-1000);
			//Fremviser resultatet.
			System.out.println("Fjern 1000 penge: " +  acc.getBalance());
			//Fjerner 2000 s�ledes at pengebeholdning skulle g� under 0.
			acc.addBalance(-2000);
			//Fremviser igen:
			System.out.println("Fjern 2000 penge: " + acc.getBalance());
		
		//Post conditions
			if (acc.getBalance()<0){
				System.out.println("Fejl: Pengebeholdningen kan blive under 0.");
			}else{
				System.out.println("OK");
		}
	}
}
