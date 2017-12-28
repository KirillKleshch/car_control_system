import static org.junit.Assert.*;

/**
 * Created by Kirill on 16.11.2017.
 */
public class ModelTest {
    @org.junit.Test
    public void getDistanceTest() throws Exception {
        Model model = new Model();
        model.setDistance(17.7);
        double calc_value = model.getDistance();
        double exp_value = 17.7;
        assertEquals(exp_value, calc_value, 0.000001);
    }

    @org.junit.Test
    public void calculated_price() throws Exception {
        Model model = new Model();
        model.setDistance(35.8);
        model.calculated_price(model.getDistance());
        double calc_value = model.getTotalCost();
        double exp_value = 59.59268;
        assertEquals(exp_value, calc_value, 0.00001);

    }

}