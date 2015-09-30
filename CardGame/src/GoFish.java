import java.util.*;
public class GoFish
	{
		public static ArrayList<Card>cardDeck = new ArrayList<Card>();
		public static ArrayList<Card>playerDeck = new ArrayList<Card>();
		public static ArrayList<Card>compDeck = new ArrayList<Card>();
		public static ArrayList<Card>playerWinDeck = new ArrayList<Card>();
		public static ArrayList<Card>compWinDeck = new ArrayList<Card>();
		public static int random;
		public static int choice;
		public static int compChoice;
		public static int setPlayer;
		public static int setComp;
		public static void main(String[] args)
			{
			Card.addCards();
			dealCards();	
			if(random==0)
				{
				while(cardDeck.size()>0||playerDeck.size()>0||compDeck.size()>0)	
					{
					playerTurn();
					comparePlaysPlayer();
					compTurn();
					comparePlaysComp();
					}
				}
			else if(random==1)
				{
				while(cardDeck.size()>0||playerDeck.size()>0||compDeck.size()>0)
					{
					compTurn();
					comparePlaysComp();
					playerTurn();
					comparePlaysPlayer();
					}	
				}
			determineWinner();
			}
		public static void dealCards()
			{
			for(int i=0;i<7;i++)
				{
				playerDeck.add(new Card(cardDeck.get(0).getRank(),cardDeck.get(0).getValue(),cardDeck.get(0).getSuit()));
				cardDeck.remove(0);
				compDeck.add(new Card(cardDeck.get(0).getRank(),cardDeck.get(0).getValue(),cardDeck.get(0).getSuit()));
				cardDeck.remove(0);
				}
			random = (int)(Math.random()*2);
			}
		public static void playerTurn()
			{
			int counter=1;
			for(int i=0;i<playerDeck.size();i++)
				{
				System.out.println("You have "+counter+") "+playerDeck.get(i).getRank());
				counter++;
				}
			System.out.println("Pick a card you'd like to take from the AI, enter the number before the card");
			Scanner pls = new Scanner(System.in);
			choice = pls.nextInt()-1;
			}
		public static void compTurn()
			{
			System.out.println("The computer has chosen a card");
			compChoice = (int)(Math.random()*compDeck.size());	
			}
		public static void comparePlaysPlayer()
			{
			int counterMatching=0;
			for(int i=0;i<compDeck.size();i++)
				{
				if(playerDeck.get(choice).getValue()==compDeck.get(i).getValue())
					{
					playerDeck.add(new Card(compDeck.get(i).getRank(),compDeck.get(i).getValue(),compDeck.get(i).getSuit()));	
					compDeck.remove(i);
					counterMatching++;   
					}
				}
			if(counterMatching==0)
				{
				System.out.println("Go fish");	
				drawCardPlayer();
				}
			else
				{
				System.out.println("They had "+counterMatching+" of those cards");	
				}
			}
		public static void comparePlaysComp()
			{
			int counterMatching=0;
			System.out.println("The computer wants a "+compDeck.get(compChoice).getRank());
			for(int i=0;i<playerDeck.size();i++)
				{
				if(compDeck.get(compChoice).getValue()==playerDeck.get(i).getValue())
					{
					compDeck.add(new Card(playerDeck.get(i).getRank(),playerDeck.get(i).getValue(),playerDeck.get(i).getSuit()));	
					playerDeck.remove(i);
					counterMatching++;   
					}
				}
			if(counterMatching==0)
				{
				System.out.println("The computer goes fishing");	
				drawCardComputer();
				}
			else
				{
				System.out.println("You had "+counterMatching+" of those cards");	
				}
			}
		public static void drawCardPlayer()
			{
			int counter=cardDeck.size()-1;
			System.out.println("Select a random integer to draw a card from the deck");
			System.out.println("Range is 0-"+counter);
			Scanner pls = new Scanner(System.in);
			int cardDrawChoice = pls.nextInt();
			playerDeck.add(new Card(cardDeck.get(cardDrawChoice).getRank(),cardDeck.get(cardDrawChoice).getValue(),cardDeck.get(cardDrawChoice).getSuit()));
			if(cardDeck.get(cardDrawChoice).getValue()==playerDeck.get(choice).getValue())
				{
				System.out.println("Your drawn card matched the card you sought!");
				playerTurn();	
				}
			else
				{
				System.out.println("The card you drew does not match");	
				}
			cardDeck.remove(cardDrawChoice);
			}
		public static void drawCardComputer()
			{
			
			System.out.println("The computer selects a random card from the deck");
			int cardDrawChoice = (int)(Math.random()*cardDeck.size());
			compDeck.add(new Card(cardDeck.get(cardDrawChoice).getRank(),cardDeck.get(cardDrawChoice).getValue(),cardDeck.get(cardDrawChoice).getSuit()));
			if(cardDeck.get(cardDrawChoice).getValue()==compDeck.get(compChoice).getValue())
				{
				System.out.println("The computer drew the card it was asking for!");
				compTurn();	
				}
			else
				{
				System.out.println("The card the computer drew does not match");	
				}
			cardDeck.remove(cardDrawChoice);
			}
		public static void checkForStack()
			{
			for(int i=0;i<playerDeck.size();i++)
				{
				int counter=1;
				int checker = playerDeck.get(i).getValue();
				for(int ii=1;ii<playerDeck.size();ii++)
					{
					if(checker==playerDeck.get(ii).getValue())
						{
						counter++;	
						}
					if(counter==4)
						{
						System.out.println("You have a set!");
						setPlayer++;
						for(int x=0;x<playerDeck.size();x++)
							{
							if(checker==playerDeck.get(x).getValue())
								{
								playerDeck.remove(x);
								}
							}
						}
					}				
				}
			for(int y=0;y<compDeck.size();y++)
				{
				int counter=1;
				int checker = compDeck.get(0).getValue();
				for(int yy=1;yy<compDeck.size();yy++)
					{
					if(checker==compDeck.get(yy).getValue())
						{
						counter++;	
						}
					if(counter==4)
						{
						System.out.println("The computer has a set!");
						setComp++;
						for(int x=0;x<compDeck.size();x++)
							{
							if(checker==compDeck.get(x).getValue())
								{
								compDeck.remove(x);
								}
							}
						}		
					}
				}
			}
		public static void determineWinner()
			{
			if(setPlayer>setComp)
				{
				System.out.println("You win!");	
				}
			else if(setPlayer==setComp)
				{
				System.out.println("Tie!");	
				}
			else
				{
				System.out.println("The computer wins, sorry!");	
				}
			}
	
	}
