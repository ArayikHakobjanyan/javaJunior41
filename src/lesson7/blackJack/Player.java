package lesson7.blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean canWin = true;

    public boolean isCanWin() {
        return canWin;
    }


    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public boolean doYouNeedMoreCards() {
        System.out.println(name + ", dzer kart@: ----");
        openHand();
        System.out.println("------");
        System.out.println("eli kart kuzes");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("ha")){
            return true;
        }
        return false;
    }

    public void openHand(){
        for (Card card:hand) {
            System.out.println(card);
        }
    }

    public int countValueInHand(){
        int count = 0;
        for (Card card:hand) {
        count = count + card.getValue();
        }
        return count;
    }
}
