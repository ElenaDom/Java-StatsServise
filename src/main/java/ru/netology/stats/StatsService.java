package ru.netology.stats;

public class StatsService {

    public int sum(int[] purchases) {
        int result = 0;
        for (int purchase : purchases) {
            result += purchase;
        }
        return result;
    }

    public int avarage(int[] purchases) {

        return sum(purchases) / purchases.length;
    }

    public int SaleMax(int[] purchases) {
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

    public int SaleMin(int[] purchases) {
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

//    public int AvaragePerMax(int[] purchases) {
//        int avarage = avarage(purchases);
//        int count = 0;
//        for (int purchase : purchases) {
//            if (purchase > avarage) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public int AvaragePerMin(int[] purchases) {
//        int avarage = avarage(purchases);
//        int count = 0;
//        for (int purchase : purchases) {
//            if (purchase < avarage) {
//                count++;
//            }
//        }
//        return count;
//    }
}