package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.util.ArrayList;

public class AdminUIController {
    public ListView userList;
    private  DataController dataController = new DataController();
    private AppState state =  dataController.loadState();
    private FXMLApp app;
    public void setMaincontroller(FXMLApp fxmlApp) {
        this.app=fxmlApp;
    }

    public void adminD(ActionEvent actionEvent)throws IOException {
        app.deleteUser();

    }
    public void logOut(){
        app.back();
    }

    public void shiftEditor(ActionEvent actionEvent) throws IOException{
        app.shiftEdit();
    }

    public void showUserList(){
        ArrayList<User> myUserList = (ArrayList<User>) state.getUsers();
        ObservableList<String> shList= FXCollections.observableArrayList();
        for (User user: myUserList) {
            shList.add(user.userName);
        }
        userList.setItems(shList);

    }
}
