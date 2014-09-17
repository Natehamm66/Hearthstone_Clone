package net.nate.cs102.hsclone;

public class Board {
	Minion[] player1BoardSpace = new Minion[6];
	Minion[] player2BoardSpace = new Minion[6];

	public Minion[] getMinionsForPlayer(int playerid) {
		return (playerid == 1) ? player1BoardSpace : player2BoardSpace;
	}
}
