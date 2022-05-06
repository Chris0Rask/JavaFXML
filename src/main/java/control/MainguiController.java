package control;

import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class MainguiController {
    private  DataController dataController = new DataController();
    private AppState state =dataController.loadState();//new AppState();

    public TextField uNameField;
    public PasswordField pWordField;
    public TextField fNameField;
    public TextField addressField;

    private FXMLApp app;


    public void setMaincontroller(FXMLApp fxmlApp) {
    this.app=fxmlApp;
    }

    public void back(ActionEvent actionEvent) {
        app.back();
    }


    public void signup(ActionEvent actionEvent){
        Boolean myFlag = false;


        ArrayList<User> myUser = (ArrayList<User>) state.getUsers();
        for (User user: myUser){
            if (user.userName.equals(this.uNameField.getText())){
                myFlag = true;
            }
        }
        if (!myFlag) {


            User user = new User();
            user.userName = uNameField.getText();
            user.passWord = pWordField.getText();
            user.name = fNameField.getText();
            user.address = addressField.getText();

            state.getUsers().add(user);
            dataController.saveAppState(state);
            System.out.println(uNameField.getText());
            System.out.println(user.userName);
            System.out.println(this.state.getUsers().size());
            app.back();

        }
    }


}
