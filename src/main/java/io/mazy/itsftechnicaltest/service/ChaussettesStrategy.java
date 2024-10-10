package io.mazy.itsftechnicaltest.service;

public class ChaussettesStrategy implements MultipleStrategy{

    @Override
    public String getResult(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "ChaussettesSales";
        } else if (i % 3 == 0) {
            return "Chaussettes";
        } else if (i % 5 == 0) {
            return "Sales";
        }
        return String.valueOf(i);
    }
}
