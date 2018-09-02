package part_2;

import java.util.List;

public class Team {

    private String name;
    private String currentLig;
    private Coach coach;
    private List<Player> playerList;

    public Team() {
    }

    public Team(String name, String currentLig, Coach coach, List<Player> playerList) {
        this.name = name;
        this.currentLig = currentLig;
        this.coach = coach;
        this.playerList = playerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentLig() {
        return currentLig;
    }

    public void setCurrentLig(String currentLig) {
        this.currentLig = currentLig;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", currentLig='" + currentLig + '\'' +
                ", coach=" + coach +
                ", playerList=" + playerList +
                '}';
    }
}
