import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import problems.Anagrams;

public class AnagramsTest {

    @DataProvider(name = "data_provider")
    public Object[][] inputData() {
        return new Object[][]{
                {"desperation", "A Rope Ends It", true},
                {"passed", "failed", false},
                {"passed", "failed", true}};
    }

    @Test(dataProvider = "data_provider")
    public void testAnagrams(String str1, String str2, boolean expect) {
        Anagrams anagrams = new Anagrams();
        Assert.assertEquals(anagrams.checkIfWordsAreAnagrams(str1, str2), expect);
    }
}
