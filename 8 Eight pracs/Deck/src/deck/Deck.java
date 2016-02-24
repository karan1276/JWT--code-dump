/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Deck {

    List<Card> mainDeck;

    public Deck(){
        mainDeck = new ArrayList();
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                Card c = new Card(j,i);
                mainDeck.add(c);
            }
        }
    }
    
    public void printDeck(){
        for(int i=0;i<52;i++){
            mainDeck.get(i).printCard();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deck d = new Deck();
        d.printDeck();
    }
    
}
