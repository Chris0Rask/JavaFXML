package control;

import javafx.event.ActionEvent;

import java.io.IOException;

public class AdminUIController {
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
}
