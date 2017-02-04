package com.domain;

import java.util.List;

/**
 * Created by vedmant on 2/4/17.
 */
public class Company {

    List<Flight> flights;

    public Integer totalProfit() {
        Integer total = 0;

        for (Flight f: flights) {
            total += f.getProfit();
        }

        return total;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
