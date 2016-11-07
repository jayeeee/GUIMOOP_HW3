package jj;

class Card {
	public Suit suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	public int rank; //1~13
	public enum Suit {Club, Diamond, Heart, Spade};
	public Card(Suit s,int r){
		suit=s;
		rank=r;
	}	
	//TODO: 1. Please implement the printCard method
	public void printCard(){
		System.out.print(suit.toString()+","+rank);
	}
	
	public Suit getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}
