package control;

import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class ShiftEditController {
    private  DataController dataController = new DataController();
    private AppState state = dataController.loadState();
    public ListView<String> ListofShifts;
    private FXMLApp app;
    public void setMaincontroller(FXMLApp fxmlApp) {
        this.app=fxmlApp;
    }

    public void back() throws IOException {
        app.adminUI();
    }

    public void shiftList( ){

        String[] stand ={"Bar", "food"};
            ListofShifts.getItems().addAll(stand);


    }
}
