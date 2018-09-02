package part_2;

import java.util.List;

/**
 * مربی
 *
 */
public class Coach extends Person{


    private Contract currentrContract;
    private List<Contract> contractList;

    public Coach() {
    }

    public Coach(String firstName, String lastName, String nationality, int vacationDays, Contract currentrContract, List<Contract> contractList) {
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
        return "Coach{" +
                "currentrContract=" + currentrContract +
                ", contractList=" + contractList +
                '}';
    }

    @Override
    public void calculate() {
        int countPlayers = contractList.size();
        int baseSalary = 5000000;
        long salary = baseSalary +(30 -  getVacationDays()) * countPlayers;
        System.out.println(salary);
    }
}
