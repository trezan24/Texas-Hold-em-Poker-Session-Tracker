package app;

import model.CashSession;

public class Test {
    public static void main(String[] args) {
        CashSession ses1 = new CashSession(1, "05-06-2026 20:00", "06-06-2026 01:20", "Admiral Zadar", "Nista", 100, 420);
        ses1.setCashOut(550);
        System.out.println(ses1);
        System.out.println(ses1.getDuration());
        System.out.println(ses1.getProfit());
        System.out.println(ses1.getProfitPerHours());
    }
}