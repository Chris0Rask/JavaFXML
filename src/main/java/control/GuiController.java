package control;

import javafx.event.ActionEvent;
import java.util.ArrayList;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class GuiController {
    public TextField userName;
    public PasswordField passWord;
    private  DataController dataController = new DataController();
    private AppState state = dataController.loadState();


    private FXMLApp mainctrontroller;


    public void ButtonClick(ActionEvent actionEvent) throws IOException {
        mainctrontroller.handleLogin() ;


    }
    public void logIn(ActionEvent actionEvent) throws IOException {
        ArrayList<User> myUser = (ArrayList<User>) state.getUsers();
        for (User user: myUser){
            if (user.userName.equals(this.userName.getText()) && user.passWord.equals(this.passWord.getText())){
                mainctrontroller.Log();
            }
        }

    }
    public void adminD(ActionEvent actionEvent)throws IOException{
        mainctrontroller.adminLogin();

    }





    public void setMaincontroller(FXMLApp fxmlApp) {
        this.mainctrontroller=fxmlApp;
    }
}
