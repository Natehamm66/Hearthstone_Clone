package net.nate.cs102.hsclone;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Player {
	public Player(Hero hero,Deque deck){
		this.hero = hero;
		this.deck = deck;
		this.hand = new ArrayList<Card>();
	}
private Hero hero;
private Deque<Card> deck;
private List<Card> hand;
}
