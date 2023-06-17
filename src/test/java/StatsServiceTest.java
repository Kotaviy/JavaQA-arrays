import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void sumTest() {
        StatsServiceTest service = new StatsServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sum(sales);
        int expected = 180;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void averageTest() {
        StatsServiceTest service = new StatsServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.average(sales);
        int expected = 180/12;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void maxMonthTest() {
        StatsServiceTest service = new StatsServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxMonthSales(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void minMonthTest() {
        StatsServiceTest service = new StatsServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minMonthSales(sales);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void monthBelowAverage() {
        StatsServiceTest service = new StatsServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthAboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test

    public void monthAboveAverage() {
        StatsServiceTest service = new StatsServiceTest();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthAboveAverage(sales);
        int expected = 6;

        Assertions.assertEquals(actual, expected);
    }
}
