import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream("mainForm.fxml"));
        primaryStage.setTitle("Use JavaFX");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        runStage(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void runStage(Stage stage )
    {
        primaryStage = stage;
        primaryStage.show();
    }
}
