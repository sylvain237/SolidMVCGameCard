package model;

public class PlayingCard {
    private  Rank rank;
    private  Suit suit;
    private boolean faceup ;


    public  PlayingCard(Rank rank, Suit suit){
        super();
        this.rank = rank;
        this.suit = suit;
    }
    public Rank getRank() {
        return rank;
    }

    public  Suit getSuit(){
        return  suit;
    }

    public  boolean isFaceup(){
        return faceup;
    }
    public  boolean flip(){
        faceup = !faceup;
                return faceup;
    }
}
