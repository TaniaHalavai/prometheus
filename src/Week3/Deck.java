package Week3;

import java.util.*;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>(36);


    public Deck() {

        for (int suitIndex = 0; suitIndex < Suit.values.length; suitIndex++) {
            for (int rankIndex = 0; rankIndex < Rank.values.length; rankIndex++) {
                cards.add(new Card(Rank.values[rankIndex], Suit.values[suitIndex]));
            }
            Collections.sort();

        }
    }

    public Card getA(int i) {
        return cards.get(i);
    }
    @Override
    public String toString()
    {
        String deck = "";
        for (Card card : cards) {
            deck = deck  + String.format("Card [Rank = %s] [Suit = %s]", card.getRank().getName(), card.getSuit().getName()) + "\n";
        }
        return deck;
    }


    public void shuffle() {
        Collections.shuffle(cards);
    }
    public void order(){
        for (int suitIndex=0; suitIndex<Suit.values.length; suitIndex++){
            for( int rankIndex=0; rankIndex<Rank.values.length; rankIndex++){

            }
        }

    }
}


class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        Rank o1Rank = o1.getRank();
        Rank o2Rank = o1.getRank();

        List<Rank> allRanks = Arrays.asList(Rank.values);

        int o1RankIndex = allRanks.indexOf(o1Rank);
        int o2RankIndex = allRanks.indexOf(o2Rank);

        if (o1RankIndex == o2RankIndex) {
            return compareBySuit(o1, o2);
        }
        if (o1RankIndex < o2RankIndex) return 1;
        else return -1;
    }

    private int compareBySuit(Card o1, Card o2) {
        
    }
}
