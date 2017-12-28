/**
 * Created by Kirill on 13.11.2017.
 */

import java.util.Scanner;

public class Controller {

    // Constructor
    Model model;
    View view;

    String stringOfUser = new String();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setDistance(inputDIstanceWithScanner(sc));
        model.calculated_price(model.getDistance());
        view.printMessage(View.OUTPUT_WORD, model.getTotalCost());
    }

    public double inputDIstanceWithScanner(Scanner sc) {
        view.printMessage(View.ENTER_DISTANCE);
        double bufMessage;
        bufMessage = sc.nextDouble();
        return bufMessage;
    }

}
