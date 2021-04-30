package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private static List<Card> cards = new ArrayList<Card>();
    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }
    void getCards(){
        for(Card card:cards){
            System.out.println(card);
        }
    }

}