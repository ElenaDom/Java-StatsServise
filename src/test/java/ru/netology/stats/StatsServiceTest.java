package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSum() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sum(purchases);
        assertEquals(expected, actual);

    }

    @Test
    void shouldAvarage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.avarage(purchases);
        assertEquals(expected, actual);
    }

        @Test
    void shouldSaleMax() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.SaleMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSaleMin() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.SaleMin(purchases);
        assertEquals(expected, actual);
    }
//    @Test
//    void shouldAvaragetPerMax() {
//        StatsService service = new StatsService();
//        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        int expected = 5;
//        int actual = service.AvaragePerMax(purchases);
//        assertEquals(expected, actual);
//    }
//    @Test
//    void shouldAvaregePerMin() {
//        StatsService service = new StatsService();
//        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        int expected = 5;
//        int actual = service.AvaragePerMin(purchases);
//        assertEquals(expected, actual);
//    }
}
