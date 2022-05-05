package control;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeleteController {
    private  DataController dataController = new DataController();
    private AppState state = dataController.loadState();
    public TextField userNamed;
    public PasswordField passWordd;

    private FXMLApp app;
    public void setMaincontroller(FXMLApp fxmlApp) {
        this.app=fxmlApp;
    }

    public void delU(){
        ArrayList<User> myUser = (ArrayList<User>) state.getUsers();
        myUser.removeIf(user -> user.userName.equals(this.userNamed.getText()) && user.passWord.equals(this.passWordd.getText()));
        this.state.setUser((List<User>) myUser);
        dataController.saveAppState(this.state);
    }

    public void back() throws IOException {
        app.adminUI();
    }
    public void show(){
        ArrayList<User> myUser = (ArrayList<User>) state.getUsers();
        for (User user: myUser){
            System.out.println(user);
        }
    }


}
