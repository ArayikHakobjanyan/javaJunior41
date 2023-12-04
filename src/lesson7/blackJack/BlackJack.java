package lesson7.blackJack;

import java.util.ArrayList;

public class BlackJack {
    private Kaloda kaloda = new Kaloda();
    private ArrayList<Player> players = new ArrayList<>();

    public BlackJack() {
        kaloda.prepeare();
    }

    public void addPlayerToGame(Player player){
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(){
        for (Player player:players) { // ancanq sax xaxacoxneri u dileri vrov
           player.addCardToHand(kaloda.randomCard()); // araji kart@ tvi
           player.addCardToHand(kaloda.randomCard()); // erkrord kart@ tvi
        }
    }

    public void dealRestCardsToAllPlayers(){
        for(Player player : players){ // sax xaxacoxnerov ancanq
            while (player.doYouNeedMoreCards()){
                player.addCardToHand(kaloda.randomCard());
            }

        }
    }

    public void printWinner(){

        /**

        * */
        for (Player player:players) {
            if (player.countValueInHand() > 21){
                player.setCanWin(false);
            }
        }

        if (countPlayersWhoCanWin() == 0){
            for (Player player:players) {
                if (player instanceof Dealer){
                    System.out.println(" krec" + player.getName());
                    player.openHand();
                    return; // metodic helnum enq el petq chi stugum
                }
            }
        }



        int winnerValue = 1;
        for (Player player : players){ // 21in maqsimum motikn enq man gali u xaxacox@ petqa xaxi mej lini
            if (player.isCanWin() && player.countValueInHand() > winnerValue){
                winnerValue = player.countValueInHand();
            }
        }

        for (Player player : players){
            if (player.countValueInHand() == winnerValue){
                System.out.println(" krec" + player.getName());
                player.openHand();
            }
        }


    }




    public int countPlayersWhoCanWin(){
        int count = 0;
        for (Player player:players) {
            if (player.isCanWin()){
                count++;
            }
        }
        return count;
    }
}
