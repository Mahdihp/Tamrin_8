package part_2;

import java.util.Date;
import java.util.List;

public class Players {


    private List<Player> playerListPrimary;
    private List<Player> playerListSave;
    private List<Player> playerListPrimaryGuest;
    private List<Player> playerListSaveGuest;
    private List<Referee> refereeList;
    private Date gol;
    private Player playerGol;

    public Players() {
    }

    public Players(List<Player> playerListPrimary, List<Player> playerListSave, List<Player> playerListPrimaryGuest, List<Player> playerListSaveGuest, List<Referee> refereeList, Date gol, Player playerGol) {
        this.playerListPrimary = playerListPrimary;
        this.playerListSave = playerListSave;
        this.playerListPrimaryGuest = playerListPrimaryGuest;
        this.playerListSaveGuest = playerListSaveGuest;
        this.refereeList = refereeList;
        this.gol = gol;
        this.playerGol = playerGol;
    }

    public List<Player> getPlayerListPrimary() {
        return playerListPrimary;
    }

    public void setPlayerListPrimary(List<Player> playerListPrimary) {
        this.playerListPrimary = playerListPrimary;
    }

    public List<Player> getPlayerListSave() {
        return playerListSave;
    }

    public void setPlayerListSave(List<Player> playerListSave) {
        this.playerListSave = playerListSave;
    }

    public List<Player> getPlayerListPrimaryGuest() {
        return playerListPrimaryGuest;
    }

    public void setPlayerListPrimaryGuest(List<Player> playerListPrimaryGuest) {
        this.playerListPrimaryGuest = playerListPrimaryGuest;
    }

    public List<Player> getPlayerListSaveGuest() {
        return playerListSaveGuest;
    }

    public void setPlayerListSaveGuest(List<Player> playerListSaveGuest) {
        this.playerListSaveGuest = playerListSaveGuest;
    }

    public List<Referee> getRefereeList() {
        return refereeList;
    }

    public void setRefereeList(List<Referee> refereeList) {
        this.refereeList = refereeList;
    }

    public Date getGol() {
        return gol;
    }

    public void setGol(Date gol) {
        this.gol = gol;
    }

    public Player getPlayerGol() {
        return playerGol;
    }

    public void setPlayerGol(Player playerGol) {
        this.playerGol = playerGol;
    }

    @Override
    public String toString() {
        return "Players{" +
                "playerListPrimary=" + playerListPrimary +
                ", playerListSave=" + playerListSave +
                ", playerListPrimaryGuest=" + playerListPrimaryGuest +
                ", playerListSaveGuest=" + playerListSaveGuest +
                ", refereeList=" + refereeList +
                ", gol=" + gol +
                ", playerGol=" + playerGol +
                '}';
    }
}
