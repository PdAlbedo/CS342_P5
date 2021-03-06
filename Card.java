
public class Card {
	private Suit suit;
	private Value value;
	
	//getter for value
	public Value getValue() {
		return this.value;
	}
	
	//getter for suit
	public Suit getSuit(){
		return this.suit;
	}
	//constructor
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString() {
		return this.suit + " " +this.value;
	}
	
	public int toInt() {
		switch(this.value)
		{
		case ACE:
			return 1;
		case TWO:
			return 2;
		case THREE:
			return 3;
		case FOUR:
			return 4;
		case FIVE:
			return 5;
		case SIX:
			return 6;
		case SEVEN:
			return 7;
		case EIGHT:
			return 8;
		case NINE:
			return 9;
		case TEN:
			return 10;
		case JACK:
			return 10;
		case QUEEN:
			return 10;
		case KING:
			return 10;
		default:
			return 0;
		}

	}
}
	

