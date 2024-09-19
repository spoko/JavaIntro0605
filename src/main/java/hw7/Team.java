package hw7;

import java.util.LinkedList;

public class Team {
    private String name;
    private byte rating;
    private LinkedList<Player> playerList = new LinkedList<>();

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (!name.isEmpty()){
            this.name = name;
        }else {
            //todo throw exception
        }
    }

    public byte getRating(){
        return rating;
    }

    public Team(String name){
        setName(name);
    }

    public void addPlayerToTheTeam(Player playerTobeAdded){
        playerList.add(playerTobeAdded);
        calculateRating();
    }

    public void removePlayerFromTheTeam(Player playerToBeRemoved){
        if (playerList.contains(playerToBeRemoved)){
            playerList.remove(playerToBeRemoved);
            calculateRating();
        }else {
            //todo exception of some kind
        }
    }

    private void calculateRating(){
        int tmp = 0;

        for (Player player : playerList){
            tmp += player.getOverallSkill();
        }
        rating = (byte) (tmp / playerList.size());
    }
}
