package ru.netology.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSalesPerMonth() {
        StatsService service = new StatsService();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.getMinSalesPerMonth(sum);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMaxSalesPerMonth() {
        StatsService service = new StatsService();

        int[] sum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 7;
        int actual = service.getMaxSalesPerMonth(sum);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();

        int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.getSumAllSales(myArray);

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMidSumSalesPerMonth() {
        StatsService service = new StatsService();

        int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.getMidSumSalesPerMonth(myArray);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindBadMonthSales() {
        StatsService service = new StatsService();

        int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getBadMonthSales(myArray);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindGoodMonthSales() {
        StatsService service = new StatsService();

        int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getGoodMonthSales(myArray);

        Assertions.assertEquals(expected, actual);
    }
}
