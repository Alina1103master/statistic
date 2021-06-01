package ru.netology.statistic;

public class StatsService {

    public static int allSales(int[] sales) {
        // общая сумма продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public static int averageSales(int[] sales) {
        // средняя сумма продаж в месяц
        int averageSales = allSales(sales) / 12;
        return averageSales;
    }

    public static int maxSales(int[] sales) {
        //месяц с максимальными продажами(последний)
        int salesMax = sales[0];
        int month = 0;
        int maxMonth = 1;
        for (int sale : sales) {
            month++;
            if (salesMax <= sale) {
                salesMax= sale;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public static int minSales(int[] sales) {
        //месяц с минимальными продажами(последний)
        int salesMin = sales[0];
        int month = 0;
        int minMonth = 1;
        for (int sale : sales) {
            month++;
            if (salesMin >= sale) {
                salesMin = sale;
                minMonth = month;
            }
        }
        return minMonth;
    }

    public static int getAboveAverage(int[] sales) {
        //количество месяцев выше среднего
        int amountOfMonthAboveAverage = 0;
        int averageSales = 15;
        for (int sale : sales) {
            if (sale < averageSales) {
                amountOfMonthAboveAverage +=1;
            }
        }
        return amountOfMonthAboveAverage;
    }

    public static int getBelowAverage(int[] sales) {
        //количество месяцев ниже среднего
       int amountOfMonthBelowAverage = 0;
       int averageSales = 15;
        for (int sale : sales) {
            if (sale < averageSales) {
                amountOfMonthBelowAverage++;
            }
        }
        return amountOfMonthBelowAverage;
    }


}
