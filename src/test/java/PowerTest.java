import org.junit.Test;
import powerpackage.Power;

public class PowerTest {

    @Test
    public void shouldBe1When1IsRaisedTo1()
    {
        assert Power.calculatePower(1,1) == 1;
    }

    @Test
    public void shouldBe2WhenTwo2IsRaisedTo1()
    {
        assert Power.calculatePower(2,1) == 2;
    }

    @Test
    public void shouldBe4When2IsRaisedTo2()
    {
        assert Power.calculatePower(2, 2) == 4;
    }

    @Test
    public void shouldBe9When3IsRaisedTo2()
    {
        assert Power.calculatePower(3, 2) == 3*3;
    }


}
