package Game;

public class DiceBox {

		Dice t1;
		Dice t2;
		int sum;
		Dice box[];
		
		public DiceBox(Dice t1, Dice t2){
			Dice box[] = new Dice[2];
			box[0] = this.t1;
			box[1] = this.t2;
			this.t1 = t1; 
			this.t2 = t2; 
		}
		
		public int getDice(int dicenumber) {
			return box[dicenumber].getDice();
		}
		
		public void setDice(int dicenumber, int new_dicevalue) {
			box[dicenumber].setDice(new_dicevalue);
		}
		
		public int getDiceside(int dicenumber) {
			return box[dicenumber].getDiceside();
		}
		
		public void setDiceside(int dicenumber, int new_diceside){
			box[dicenumber].setDiceside(new_diceside);
		}
		
		public int getSum(){
			sum = t1.rollDice()+t2.rollDice();
			return sum;
		}
		
		public String toString() {
			return ("The dicebox has the values " + t1.rollDice() + " and " + t2.rollDice());
		}
}