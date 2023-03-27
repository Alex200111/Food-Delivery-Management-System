package businessLogic;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Order {
    int orderID;
    String clientUser;
    LocalDate date;
    LocalTime time;

    public Order(int orderID, String clientUser, LocalDate date,LocalTime time) {
        this.orderID = orderID;
        this.clientUser = clientUser;
        this.date=date;
        this.time=time;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getClientUser() {
        return clientUser;
    }
}
