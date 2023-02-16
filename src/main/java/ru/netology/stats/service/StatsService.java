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

    public int getSumAllSales(int[] myArray) {
        int sumAllSales = 0;
        for (int i = 0; i < myArray.length; i++) {
            sumAllSales = sumAllSales + myArray[i];
        }

        return sumAllSales;
    }

    public int getMidSumSalesPerMonth(int[] mid) {
        int[] myArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int midSumSales = 0;

            int sum = 0;
            for (int i = 0; i < myArray.length; i++) {
                sum += myArray[i];
            }
            midSumSales = sum / myArray.length;

        return midSumSales;

    }

    int midSales = 15;

    public int getMonthSalesUnderMid(int[] sales) {
        //int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int underMid = 0;
        for (int sale : sales) {
            if (sale < midSales) {
                underMid += 1;
            }
        }

        return underMid;
    }

    public int getMonthSalesOverMid(int[] good) {
        //int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int overMid = 0;
        for (int sale : good) {
            if (sale > midSales) {
                overMid += 1;
            }
        }

        return overMid;
    }
}










