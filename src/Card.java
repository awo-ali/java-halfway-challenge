

public class Card {


    private String symbol;
    private int value;
    private String suit;

    public Card(String symbol, int value, String suit) {
        this.symbol = symbol;
        this.value = value;
        this.suit = suit;
    }


    public String toString(){
        return "This card is the " + symbol + " of " + suit + " it has a value of " + value;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}