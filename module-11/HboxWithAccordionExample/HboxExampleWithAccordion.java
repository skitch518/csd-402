import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.stage.Stage;


/*
 * Created based of the example code from tutorials point
 * https://www.tutorialspoint.com/javafx/javafx_hbox_layout.htm
 */


public class HboxExampleWithAccordion extends Application {
   @Override
   public void start(Stage stage) {
      
    // Creating the buttons for the Hbox
    Button playButton = new Button("Play");
    Button stopButton = new Button("Stop");

    // Creating Titled Panes for the Accordion
    TitledPane name = new TitledPane();
    name.setText("Author's Name");
    name.setContent(new Label("My name is Jason"));

    TitledPane address = new TitledPane();
    address.setText("Author's Address");
    address.setContent(new Label("My address is 1234 Main St."));

    TitledPane job = new TitledPane();
    job.setText("Author's Job");
    job.setContent(new Label("My job is student"));

    // Creating Accordion and adding Titled Panes
    Accordion accordion = new Accordion();
    accordion.getPanes().addAll(name, address, job);
    
    // Initialize the HBox class
    HBox hbox = new HBox(10);  // 10 is the spacing between nodes

    // Adding all the nodes to the HBox
    hbox.getChildren().addAll(playButton, stopButton, accordion);

    // Setting padding and scene
    hbox.setPadding(new Insets(10));
    Scene scene = new Scene(hbox, 400, 300);
    stage.setTitle("JavaFX Example");
    stage.setScene(scene);
    stage.show();
   }

   public static void main(String args[]) {
      launch(args);
   }
}
