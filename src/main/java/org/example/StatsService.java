package org.example;

public class StatsService {
    public int sum(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int average(int[] sales) {
        int result = sum(sales);
        return result / sales.length;
    }

    public int maxMonthSales(int[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int minMonthSales(int[] sales) {

        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return  monthMin + 1;
    }

    public int monthBelowAverage(int[] sales) {
        
        int counter = 0;

        for (int sale : sales) {
            if(sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(int[] sales) {

        int counter = 0;

        for (int sale : sales) {
            if(sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}