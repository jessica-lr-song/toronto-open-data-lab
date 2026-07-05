/**
 * Entry point for the JavaFX application that visualizes Dangerous Dog Orders
 * in Toronto.
 *
 * <p>This class is responsible for:
 * <ul>
 *   <li>Launching the JavaFX runtime</li>
 *   <li>Loading the FXML layout</li>
 *   <li>Creating and displaying the primary application window</li>
 * </ul>
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    /**
     * Starts the JavaFX application and displays the primary stage.
     *
     * <p>This method loads the FXML layout, sets the scene dimensions and title,
     * and renders the GUI on screen.
     *
     * @param stage the primary stage provided by the JavaFX runtime
     * @throws Exception if the FXML layout cannot be loaded
     */
    public void start(Stage stage) throws Exception {
        stage.setTitle("Dangerous Dog Orders in Toronto");
        stage.setWidth(2000);
        stage.setHeight(1000);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
    }

    /**
     * Launches the JavaFX application.
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args)  {
       launch(args);
    }
}
