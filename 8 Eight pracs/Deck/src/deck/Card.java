/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck;

/**
 *
 * @author student
 */
public class Card {

    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card() {
        this.rank = 0;
        this.suit = 0;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public void printCard() {

        //printin the rank
        if (rank == 0) {
            System.out.print("A ");
        } else if (rank == 11) {
            System.out.print("J ");
        } else if (rank == 12) {
            System.out.print("Q ");
        } else if (rank == 13) {
            System.out.print("K ");
        } else {
            System.out.print(rank + " ");
        }

        //printing the suit
        String ch;
        switch (suit) {
            case 0:
                System.out.println("\u2660");
                break;
            case 1:
                System.out.println("\u2665");
                break;
            case 2:
                System.out.println("\u2663");
                break;
            case 3:
                System.out.println("\u2666");
                break;
        }
        //System.out.print(" Suit: "+suit);
        System.out.println();
    }
}
