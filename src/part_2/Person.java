package part_2;

public abstract class Person implements Salary {

    private String firstName;
    private String lastName;
    private String nationality;
    private int vacationDays;

    public Person() {
    }

    public Person(String firstName, String lastName, String nationality, int vacationDays) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.vacationDays = vacationDays;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", vacationDays=" + vacationDays +
                '}';
    }
}
