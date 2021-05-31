package ru.netology.statistic;

public class StatsService {

    public int allSales(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }


    public int averageSales(int[] sales) {

        int sum = 180;
        int monthAmount = 12;
        int averageSales = sum / monthAmount;

        return averageSales;

    }

    public int maxSales(int[] sales) {

        int maxMonth = 0;
        int month = 0;
        int monthAmout = 7;

        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;


            }
        }
        return monthAmout;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int belowAverage(int[] sales) {
        int middleSum = 5;
        int thanMiddleSum = 0;

        for (int sale : sales) {
            if (sale <= sales[middleSum]) {
                thanMiddleSum = middleSum;
            }
            return thanMiddleSum;
        }
        return middleSum;
    }


    public int aboveAverage(int[] sales) {
        int middleSum = 5;
        int thanMiddleSum = 0;

        for (int sale : sales) {
            if (sale < sales[middleSum]) {
                thanMiddleSum = middleSum;
            }
            return thanMiddleSum;
        }
        return middleSum;
    }
}
