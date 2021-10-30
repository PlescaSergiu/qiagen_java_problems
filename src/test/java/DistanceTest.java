import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import problems.Distance;

public class DistanceTest {

    @DataProvider(name = "data_provider")
    public Object[][] inputData() {
        return new Object[][]{
                {new int[]{4, 8, 6, 1, 2, 9, 4}, 3},
                {new int[]{}, 3},
                {new int[]{4, 8, 6, 1, 9, 4}, 3}};
    }

    @Test(dataProvider = "data_provider")
    public void minimumDistance(int[] input, int index) {
        Distance distance = new Distance();
        Assert.assertEquals(distance.minimumDistanceBetweenTwoNumbers(input), index);
    }
}
