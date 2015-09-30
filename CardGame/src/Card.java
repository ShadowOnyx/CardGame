import java.util.*;
public class Card
	{
		private String rank;
		private int value;
		private String suit;
		
		public Card(String r,int v, String s)
			{
			rank=r;
			value=v;
			suit=s;
			}
		public static void addCards()
			{
			GoFish.cardDeck.add(new Card ("Two", 2, "Hearts"));
			GoFish.cardDeck.add(new Card ("Three",3 , "Hearts"));
			GoFish.cardDeck.add(new Card ("Four", 4, "Hearts"));
			GoFish.cardDeck.add(new Card ("Five", 5, "Hearts"));
			GoFish.cardDeck.add(new Card ("Six", 6, "Hearts"));
			GoFish.cardDeck.add(new Card ("Seven", 7, "Hearts"));
			GoFish.cardDeck.add(new Card ("Eight", 8, "Hearts"));
			GoFish.cardDeck.add(new Card ("Nine", 9, "Hearts"));
			GoFish.cardDeck.add(new Card ("Ten", 10, "Hearts"));
			GoFish.cardDeck.add(new Card ("Jack", 11, "Hearts"));
			GoFish.cardDeck.add(new Card ("Queen", 12, "Hearts"));
			GoFish.cardDeck.add(new Card ("King", 13, "Hearts"));
			GoFish.cardDeck.add(new Card ("Ace", 14, "Hearts"));
			GoFish.cardDeck.add(new Card ("Two", 2, "Spades"));
			GoFish.cardDeck.add(new Card ("Three",3 , "Spades"));
			GoFish.cardDeck.add(new Card ("Four", 4, "Spades"));
			GoFish.cardDeck.add(new Card ("Five", 5, "Spades"));
			GoFish.cardDeck.add(new Card ("Six", 6, "Spades"));
			GoFish.cardDeck.add(new Card ("Seven", 7, "Spades"));
			GoFish.cardDeck.add(new Card ("Eight", 8, "Spades"));
			GoFish.cardDeck.add(new Card ("Nine", 9, "Spades"));
			GoFish.cardDeck.add(new Card ("Ten", 10, "Spades"));
			GoFish.cardDeck.add(new Card ("Jack", 11, "Spades"));
			GoFish.cardDeck.add(new Card ("Queen", 12, "Spades"));
			GoFish.cardDeck.add(new Card ("King", 13, "Spades"));
			GoFish.cardDeck.add(new Card ("Ace", 14, "Spades"));
			GoFish.cardDeck.add(new Card ("Two", 2, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Three",3 , "Diamonds"));
			GoFish.cardDeck.add(new Card ("Four", 4, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Five", 5, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Six", 6, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Seven", 7, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Eight", 8, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Nine", 9, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Ten", 10, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Jack", 11, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Queen", 12, "Diamonds"));
			GoFish.cardDeck.add(new Card ("King", 13, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Ace", 14, "Diamonds"));
			GoFish.cardDeck.add(new Card ("Two", 2, "Clubs"));
			GoFish.cardDeck.add(new Card ("Three",3 , "Clubs"));
			GoFish.cardDeck.add(new Card ("Four", 4, "Clubs"));
			GoFish.cardDeck.add(new Card ("Five", 5, "Clubs"));
			GoFish.cardDeck.add(new Card ("Six", 6, "Clubs"));
			GoFish.cardDeck.add(new Card ("Seven", 7, "Clubs"));
			GoFish.cardDeck.add(new Card ("Eight", 8, "Clubs"));
			GoFish.cardDeck.add(new Card ("Nine", 9, "Clubs"));
			GoFish.cardDeck.add(new Card ("Ten", 10, "Clubs"));
			GoFish.cardDeck.add(new Card ("Jack", 11, "Clubs"));
			GoFish.cardDeck.add(new Card ("Queen", 12, "Clubs"));
			GoFish.cardDeck.add(new Card ("King", 13, "Clubs"));
			GoFish.cardDeck.add(new Card ("Ace", 14, "Clubs"));
			Collections.shuffle(GoFish.cardDeck);
			}
		

		
		public String getRank()
			{
				return rank;
			}
		public void setRank(String rank)
			{
				this.rank = rank;
			}
		public int getValue()
			{
				return value;
			}
		public void setValue(int value)
			{
				this.value = value;
			}
		public String getSuit()
			{
				return suit;
			}
		public void setSuit(String suit)
			{
				this.suit = suit;
			}

	}
