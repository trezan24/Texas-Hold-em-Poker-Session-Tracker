package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CashSession extends Session implements Serializable {
    private double buyIn;
    private double cashOut;

    public CashSession(int id, String startTime, String endTime, String location, String note, double buyIn, double cashOut) {
        super(id, startTime, endTime, location, note);
        this.buyIn = buyIn;
        this.cashOut = cashOut;
    }

    public double getBuyIn() {
        return buyIn;
    }

    public double getCashOut() {
        return cashOut;
    }

    public void setBuyIn(double buyIn) {
        this.buyIn = buyIn;
    }

    public void setCashOut(double cashOut) {
        this.cashOut = cashOut;
    }

    public double getProfit() {
        return cashOut - buyIn;
    }


    @Override
    public String toString() {
        return super.toString() +
                "buyIn=" + buyIn +
                ", cashOut=" + cashOut +
                '}';
    }

    @Override
    public double getProfitPerHours() {
        return getProfit() / (getDuration()/60);
    }
}
