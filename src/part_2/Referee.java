package part_2;

/**
 * داور
 *
 */
public class Referee {

    private String firstName;
    private String lastName;
    private String nationality;
    private Long price;
    private LeveReferee leveReferee;

    public Referee() {
    }

    public Referee(String firstName, String lastName, String nationality, Long price, LeveReferee leveReferee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.price = price;
        this.leveReferee = leveReferee;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public LeveReferee getLeveReferee() {
        return leveReferee;
    }

    public void setLeveReferee(LeveReferee leveReferee) {
        this.leveReferee = leveReferee;
    }

    public enum LeveReferee {
        Professional(1),
        Medium(2),
        Beginner(3);

        private final int levelCode;

        private LeveReferee(int levelCode) {
            this.levelCode = levelCode;
        }

    }
}
