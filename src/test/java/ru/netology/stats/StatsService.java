package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public int calculateAmountPerMonth(int[] purchases) {
        int amount = 0;
        int month = 12;
        for (int purchase : purchases) {
            amount += purchase;
        }
        return amount / month;
    }

    public int calculateSaleMax(int[] purchases) {
        int maxSale = 0;
        int monthNumber = 0;
        int currentMonthNumber = 1;
        for (int purchase : purchases) {
            if (purchase >= maxSale) {
                maxSale = purchase;
                monthNumber = currentMonthNumber;
            }
            currentMonthNumber++;
        }
        return monthNumber;
    }

    public int calculateSaleMin(int[] purchases) {
        int minSale = purchases[0];
        int monthNumber = 0;
        int currentMonthNumber = 1;
        for (int purchase : purchases) {
            if (purchase <= minSale) {
                minSale = purchase;
                monthNumber = currentMonthNumber;
            }
            currentMonthNumber++;
        }
        return monthNumber;
    }

    public int calculateAmountPerMax(int[] purchases) {
        int amount = 15;
        int count = 0;
        for (int purchase : purchases) {
            if (purchase < amount) {
                count++;
            }

        }
        return count;
    }

    public int calculateAmountPerMin(int[] purchases) {
        int amount = 15;
        int count = 0;
        for (int purchase : purchases) {
            if (purchase > amount) {
                count++;

            }

        }
        return count;
    }
}