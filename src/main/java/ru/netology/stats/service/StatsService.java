package ru.netology.stats.service;

public class StatsService {

    public int getMinSalesPerMonth(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }

        return minSales;
    }

    public int getMaxSalesPerMonth(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSales]) {
                maxSales = i;
            }
        }

        return maxSales;

    }

    public int getSumAllSales(int[] sum) {
        int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sumAllSales = 0;
        for (int i = 0; i < myArray.length; i++) {
            sumAllSales = sumAllSales + myArray[i];
        }

        return sumAllSales;
    }

    public int getMidSumSalesPerMonth(int[] mid) {
        int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int midSumSales = 0;
        if (myArray.length > 0) {
            ;
        }
        {
            int sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                sum += myArray[i];
            }
            midSumSales = sum / myArray.length;

        }

        return midSumSales;

    }

    public int getBadMonthSales(int[] bad) {
        //int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int badMonthSales = 0;
        for (int b : bad) {
            if (b < getMidSumSalesPerMonth(bad)) {
                badMonthSales += 1;
            }
        }

        return badMonthSales;
    }

    public int getGoodMonthSales(int[] good) {
        //int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int goodMonthSales = 0;
        for (int g : good) {
            if (g > getMidSumSalesPerMonth(good)) {
                goodMonthSales += 1;
            }
        }

        return goodMonthSales;
    }
}










