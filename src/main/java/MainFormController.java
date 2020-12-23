import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MainFormController {

    @FXML
    TextField textField;

    @FXML
    Button button;

    @FXML
    Label label;

    @FXML
    public void initialize() {
/*        textField.setPromptText("Hello");
        button.setOnAction(e->{
            label.setText(textField.getText());
            String s = textField.getText();
            System.out.println(s);
        });*/
    }

    @FXML
    public void onAnyButtonClick(ActionEvent e) {
        String source = ((Button)e.getSource()).getText();
        label.setText(source + ": Default button clicked");
    }

    @FXML
    public void goAnotherScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResourceAsStream("addForm.fxml"));
        App.primaryStage.setScene(new Scene(root));
        App.primaryStage.show();
    }

}