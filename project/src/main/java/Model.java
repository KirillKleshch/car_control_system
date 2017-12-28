/**
 * The class serves to calculate the cost of petrol.
 * This value is written in <b>totalCost</b>.
 * @author Kirill Kleshch
 * @version 1.0
 * Created by Kirill on 13.11.2017.
*/
public class Model {
    private static final double fuel_consumption_per_kilometer = 0.07;
    private static final double price_of_1_litter = 23.78;
    
    /** The amount of gasoline spent */
    private double petrol;
    
    /**Distance that the car passed */
    private double distance;
    
    /** The price of petrol that was spent */
    private double totalCost;

    /** Function to get the value of a field {@link Model#totalCost}
     * @return return total price
     */
    public double getTotalCost() {
        return totalCost;
    }

    /** Function to get the value of a field {@link Model#petrol}
     * @return return amount of petrol spent
     */
    public double getPetrol() {
        return petrol;
    }


    public void setPetrol(double petrol) {
        this.petrol = petrol;
    }

    /** Function to get the value of a field {@link Model#distance}
     * @return return distance that the car passed
     */
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    /** Function of calculating value
     * @param distance distance that the car passed
     */
    public void calculated_price(double distance){
        totalCost =  distance*fuel_consumption_per_kilometer*price_of_1_litter;
    }

}

