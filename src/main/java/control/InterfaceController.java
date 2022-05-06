package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.ArrayList;

import static control.FXMLApp.currentUser;

public class InterfaceController {


    public Label LabelUser;
    private FXMLApp app;



    public void setMaincontroller(FXMLApp fxmlApp) {
        this.app = fxmlApp;
    }

    private DataController dataController = new DataController();
    private AppState state = dataController.loadState();
    public ListView<ArrayList<String>> shiftView;

    public void Logout() {
        app.back();

    }

    public void setShiftView() {



        ArrayList<User> myUserList = (ArrayList<User>) state.getUsers();
        for (User user : myUserList) {

            if (user.userName.equals(currentUser)) {
                ObservableList<ArrayList<String>> shList = FXCollections.observableArrayList(user.shift1, user.shift2, user.shift3);
                shiftView.setItems(shList);

            }

        }

    }

}



