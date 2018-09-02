package part_2;

import java.util.List;

public class Player extends Person {

    private Contract currentrContract;
    private List<Contract> contractList;


    public Player() {
    }


    public Player(String firstName, String lastName, String nationality, int vacationDays, Contract currentrContract, List<Contract> contractList) {
        super(firstName, lastName, nationality, vacationDays);
        this.currentrContract = currentrContract;
        this.contractList = contractList;
    }

    public Contract getCurrentrContract() {
        return currentrContract;
    }

    public void setCurrentrContract(Contract currentrContract) {
        this.currentrContract = currentrContract;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    @Override
    public String toString() {
        return "Player{" +
                "currentrContract=" + currentrContract +
                ", contractList=" + contractList +
                '}';
    }


    @Override
    public void calculate() {
        int countPlayers = contractList.size();
        int baseSalary = 5000000;
        long salary = baseSalary +(countPlayers * currentrContract.getPrice());
        System.out.println(salary);
    }
}
