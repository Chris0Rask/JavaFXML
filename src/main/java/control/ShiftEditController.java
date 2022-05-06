package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ShiftEditController {
    public TextField UName;
    public TextField Stand;
    public TextField Function;
    public TextField Time;
    private  DataController dataController = new DataController();
    private AppState state =  dataController.loadState();
    public ListView<ArrayList<String>> ListofShifts;
    private FXMLApp app;
    public void setMaincontroller(FXMLApp fxmlApp) {
        this.app=fxmlApp;
    }



    public void back() throws IOException {
        app.adminUI();
    }




    public void shiftList(){
        ArrayList<User> myUserList = (ArrayList<User>) state.getUsers();
        for (User user: myUserList){

            if (user.userName.equals(this.UName.getText())){
                ObservableList<ArrayList<String>> shList = FXCollections.observableArrayList(user.shift1,user.shift2,user.shift3);
                ListofShifts.setItems(shList);

            }
        }



    }

    public void shiftCreate(){
        Boolean overWriteFlag = false;
        User myUser = null;
        int mycounter = 0;

        ArrayList<User> myUserList = (ArrayList<User>) state.getUsers();
        for (User user: myUserList){
            mycounter++;
            if (user.userName.equals(this.UName.getText())){
                myUser=user;
            }
        }

        if (myUser!=null){
            if (myUser.shift1.isEmpty()){

                myUser.shift1.add(Stand.getText());
                myUser.shift1.add(Function.getText());
                myUser.shift1.add(Time.getText());
                overWriteFlag = true;
            }else if (myUser.shift2.isEmpty()){

                myUser.shift2.add(Stand.getText());
                myUser.shift2.add(Function.getText());
                myUser.shift2.add(Time.getText());
                overWriteFlag = true;
            } else if (myUser.shift3.isEmpty()) {
                myUser.shift3.add(Stand.getText());
                myUser.shift3.add(Function.getText());
                myUser.shift3.add(Time.getText());
                overWriteFlag = true;
            }
            if (overWriteFlag){

                myUserList.set((mycounter-1),myUser);
                this.state.setUser((List<User>) myUserList);
                dataController.saveAppState(this.state);

            }


        }else{

        }
    }

    public void shift1Remove(){
        Boolean overWriteFlag = false;
        User myUser = null;
        int mycounter = 0;

        ArrayList<User> myUserList = (ArrayList<User>) state.getUsers();
        for (User user: myUserList){
            mycounter++;
            if (user.userName.equals(this.UName.getText())){
                myUser=user;
            }
        }

        if (myUser!=null){
            myUser.shift1=new ArrayList<>();
            overWriteFlag = true;

            if (overWriteFlag){

                myUserList.set((mycounter-1),myUser);
                this.state.setUser((List<User>) myUserList);
                dataController.saveAppState(this.state);

            }


        }else{

        }
    }
    public void shift2Remove() {
        Boolean overWriteFlag = false;
        User myUser = null;
        int mycounter = 0;

        ArrayList<User> myUserList = (ArrayList<User>) state.getUsers();
        for (User user : myUserList) {
            mycounter++;
            if (user.userName.equals(this.UName.getText())) {
                myUser = user;
            }
        }

        if (myUser != null) {
            myUser.shift2 = new ArrayList<>();
            overWriteFlag = true;

            if (overWriteFlag) {

                myUserList.set((mycounter - 1), myUser);
                this.state.setUser((List<User>) myUserList);
                dataController.saveAppState(this.state);

            }


        } else {

        }
    }
    public void shift3Remove() {
        Boolean overWriteFlag = false;
        User myUser = null;
        int mycounter = 0;

        ArrayList<User> myUserList = (ArrayList<User>) state.getUsers();
        for (User user : myUserList) {
            mycounter++;
            if (user.userName.equals(this.UName.getText())) {
                myUser = user;
            }
        }

        if (myUser != null) {
            myUser.shift3 = new ArrayList<>();
            overWriteFlag = true;

            if (overWriteFlag) {

                myUserList.set((mycounter - 1), myUser);
                this.state.setUser((List<User>) myUserList);
                dataController.saveAppState(this.state);

            }


        } else {
        }
    }
}
