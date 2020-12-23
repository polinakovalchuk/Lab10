import edu.labs.LAB12.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class AddFormController {

    @FXML
    Button goBackButton;

    @FXML
    public void backMainScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream("mainForm.fxml"));
        App.primaryStage.setScene(new Scene(root));
        App.primaryStage.show();
    }

}
