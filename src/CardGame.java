

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;


public class CardGame {


        List<Card> deckOfCards;



        String [] symbolArr = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        int [] valueArr = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        String[] suitArr = {"\u2660","\u2661","\u2662","\u2663"};

        public CardGame() {
            this.deckOfCards = new ArrayList<>();

        }


        public void populateDeck() {
            for (int i = 0; i < suitArr.length; i++) {
                for (int j = 0; j < symbolArr.length; j++) {
                    Card newCard = new Card(symbolArr[j], valueArr[j], suitArr[i]);
                    System.out.println(newCard.toString());
                    deckOfCards.add(newCard);

                }

            }

        }

        public void getFirstCard(){
            Card firstCard = deckOfCards.get(0);
            deckOfCards.remove(0);
            System.out.println("You have drawn the " + firstCard.getSymbol() + " of "+ firstCard.getSuit());
        }


        public void shuffleDeck(){
            Collections.shuffle(deckOfCards);
            System.out.println(deckOfCards);

        }


 public void sortDeckInNumberOrder(){

     deckOfCards = deckOfCards.stream().sorted().collect(Collectors.toList());

     System.out.println(deckOfCards);


 }

 public void sortDeckIntoSuits(){

            deckOfCards  = deckOfCards.stream().sorted().sorted(Comparator.comparing(Card::getSuit)).collect(Collectors.toList());
     System.out.println(deckOfCards);

 }


    }







