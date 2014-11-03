package Main;

import Game.Board;
import Game.Tile;
import Game.Dice;
import Game.DiceBox;
import Game.Player;
import Game.Account;
import boundaryToMatador.GUI;

public class Game {

	public static void main(String[] args) {
		
		// Creation of all Strings
		String name1 = "Tower";
		String name2 = "Crater";
		String name3 = "Palace Gates";
		String name4 = "Cold Desert";
		String name5 = "Walled City";
		String name6 = "Monastary";
		String name7 = "Black Cave";
		String name8 = "Huts In The Mountain";
		String name9 = "The Werewall";
		String name10 = "The Pit";
		String name11 = "Goldmine";
		
		String message1 = "You have climbed up the tower and found a large chest filled with 250 gold coins!";
		String message2 = "You have fallen down a crater and dropped 200 gold coins!";
		String message3 = "You have reached the palace gates, you have to pay 100 gold coins!";
		String message4 = "You reached the cold desert and paid 20 gold coins for a jacket!";
		String message5 = "You have reached the walled city and recieved 180 gold coins for your courage!";
		String message6 = "You reached the monastery and found inner peace.";
		String message7 = "You spent a night in the black cave and woke up missing 70 gold coins!";
		String message8 = "You have been kidnapped by Jabba The Hut!" + "\n" + "You must pay 60 gold coins to be released from the mountains.";
		String message9 = "You have reached the werewolf wall, you paid 80 gold coins for a safe passage and an extra turn!";
		String message10 = "You were taken captive by an old wizard! Give him 80 gold coins or he will swing his stick in the pit!";
		String message11 = "You accidently fell down a mine shaft which turned out to be a gold mine! You mined gold for 650 gold coins.";
		
		String message_insertplayer1 = "Insert name of player 1";
		String message_insertplayer2 = "Insert name of player 2";
		
		String namearray[] = new String[11];
		namearray[0] = name1;
		namearray[1] = name2;
		namearray[2] = name3;
		namearray[3] = name4;
		namearray[4] = name5;
		namearray[5] = name6;
		namearray[6] = name7;
		namearray[7] = name8;
		namearray[8] = name9;
		namearray[9] = name10;
		namearray[10] = name11;
		
		String messagearray[] = new String[11];
		messagearray[0] = message1;
		messagearray[1] = message2;
		messagearray[2] = message3;
		messagearray[3] = message4;
		messagearray[4] = message5;
		messagearray[5] = message6;
		messagearray[6] = message7;
		messagearray[7] = message8;
		messagearray[8] = message9;
		messagearray[9] = message10;
		messagearray[10] = message11;
		
		// Creation of all objects
		Tile tile1 = new Tile(namearray[0], messagearray[0], 250);
		Tile tile2 = new Tile(namearray[1], messagearray[1], -200);
		Tile tile3 = new Tile (namearray[2], messagearray[2], -100);
		Tile tile4 = new Tile(namearray[3], messagearray[3], -20);
		Tile tile5 = new Tile(namearray[4], messagearray[4], 180);
		Tile tile6 = new Tile(namearray[5], messagearray[5], 0);
		Tile tile7 = new Tile(namearray[6], messagearray[6], -70);
		Tile tile8 = new Tile(namearray[7], messagearray[7], -60);
		Tile tile9 = new Tile(namearray[8], messagearray[8], -80);
		Tile tile10 = new Tile(namearray[9], messagearray[9], -90);
		Tile tile11 = new Tile(namearray[10], messagearray[10], 650);
		
		Board board = new Board(tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10, tile11);
		
		Account account1 = new Account(1000);
		Account account2 = new Account(1000);
		
		DiceBox dicebox = new DiceBox();
		
		Player player1 = new Player(GUI.getUserString(message_insertplayer1), account1);
		Player player2 = new Player(GUI.getUserString(message_insertplayer2), account2);
		
		
		GUI.addPlayer(player1.getName(), player1.getBalance());
		GUI.addPlayer(player2.getName(), player2.getBalance());
		
		
	}

}
