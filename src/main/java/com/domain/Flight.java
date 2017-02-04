package com.domain;

import java.util.List;
import java.util.Map;

/**
 * Created by vedmant on 2/4/17.
 */
public class Flight {

    private Plane plane;
    private Map<String, Ticket> tickets;
    private List<Staff> staff;
    private Integer distance;

    public Integer getProfit() {
        Integer total = 0;

        for (Ticket t : tickets.values()) {
            total += t.getPrice();
        }

        for (Staff s: staff) {
            total -= s.getSalary();
        }

        total -= plane.getFuelConsumption() * distance * 1;

        return total;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setTickets(Map<String, Ticket> tickets) {
        this.tickets = tickets;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
