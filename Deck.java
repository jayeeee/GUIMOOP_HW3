package jj;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
		private ArrayList<Card> cards;
		public ArrayList<Card> usedCard;
		public int nUsed;

		//TODO: Please implement the constructor
		public Deck(int nDeck){
			cards=new ArrayList<Card>();
			usedCard= new ArrayList<Card>();
			for(int deck =1;deck<=nDeck;deck++)
				{
					for(Card.Suit suit: Card.Suit.values())
						{
							for(int rank=1;rank<=13;rank++)
								{
									Card card= new Card(suit,rank);
									card.getSuit();		
									card.getRank();
									cards.add(card);
								}
						}
				}
			shuffle();
		}	
		//TODO: Please implement the method to print all cards on screen
		public void printDeck(){
			//Hint: print all items in ArrayList<Card> cards, 
			//please implement and reuse printCard method in Card class
			for(Card card:cards){
				card.printCard();
			}
		}
		public ArrayList<Card> getAllCards(){
			return cards;
		}
		public void shuffle() {

			//cards = new ArrayList<Card>();
			
			for (int k = 0; k < usedCard.size(); k++) {
				cards.add(usedCard.get(k));
			}
		
			for (int i = 0; i < cards.size(); i++) {

				Random rnd = new Random();
				int j = rnd.nextInt(cards.size());

				Card temp = cards.get(i);
				cards.set(i, cards.get(j));
				cards.set(j, temp);
			}
			
			usedCard.clear();
			nUsed = 0;
		}


		public Card getOneCard() {
			
			
			if (cards.size() == 0) {
				shuffle();
			}
			Card card;
			card = cards.get(0);

			nUsed += 1;
			usedCard.add(card);
			cards.remove(0);

			return card;
		}
	}
	

