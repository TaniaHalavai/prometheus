package Week3;

import java.util.Arrays;

public class DeckTest {
    public static void main(String[] args){
        Deck deck1=new Deck();
        System.out.println(deck1.toString());
        deck1.shuffle();
        System.out.println(deck1.toString());
    }
}
