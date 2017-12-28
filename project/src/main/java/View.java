/**
 * Created by Kirill on 13.11.2017.
 */


public class View {
	
    // Text's constants
    public static String ENTER_DISTANCE = "Enter distance, which you passed";
    public static String OUTPUT_WORD = "Your spent =  : ";
    public static String SPACE = " ";

    
    public void printMessage(String message1, double message2) {
        StringBuilder builder = new StringBuilder();
        builder.append(message1).append(message2);
        System.out.println(builder.toString());
    }

    public void printMessage(String message1) {
        StringBuilder builder = new StringBuilder();
        builder.append(message1);
        System.out.println(builder.toString());
    }
}
