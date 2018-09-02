package part_2;

import java.util.Date;

/**
 * قرارداد
 *
 */
public class Contract {

    private int id;
    private Date startDate;
    private Date endDate;
    private Long price;

    public Contract() {
    }

    public Contract(int id, Date startDate, Date endDate, Long price) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", price=" + price +
                '}';
    }
}
