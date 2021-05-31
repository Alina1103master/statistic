package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void allSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.allSales(sales);

        assertEquals(expected, actual);

    }





    @org.junit.jupiter.api.Test
    void averageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        int actual = service.maxSales(sales);
        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);

  }


   @org.junit.jupiter.api.Test
    void belowAverage() {
        StatsService service = new StatsService();
      int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
       int expected = 5;

       int actual = service.belowAverage(sales);

        assertEquals(expected, actual);

    }


   @Test
    void aboveAverage() {
     StatsService service = new StatsService();
       int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveAverage(sales);

       assertEquals(expected, actual);
    }

}

