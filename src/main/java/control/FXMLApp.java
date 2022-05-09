package control;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.io.IOException;

public class FXMLApp extends Application {
    private  DataController dataController = new DataController();
    private AppState state =dataController.loadState();
    private Stage stage;
    public static String currentUser;


    public static void run(){
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception{

        this.stage=stage;
        FXMLLoader loader=
                new FXMLLoader(getClass().getResource("/GUI.fxml"));

        FlowPane flowPane=loader.load();
        GuiController ctrl =loader.getController();
                ctrl.setMaincontroller(this);
        Scene scene=new Scene(flowPane);
        stage.setScene(scene);
        stage.show();

    }


    public void handleLogin() throws IOException {

        FXMLLoader loader=
                new FXMLLoader(getClass().getResource("/maingui.fxml"));
        FlowPane flowPane=loader.load();
        MainguiController ctrl =loader.getController();
        ctrl.setMaincontroller(this);
        Scene scene=new Scene(flowPane);
        stage.setScene(scene);
        stage.show();

    }


    public void back() {
        FXMLLoader loader=
                new FXMLLoader(getClass().getResource("/GUI.fxml"));
        FlowPane flowPane= null;
        try {
            flowPane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        GuiController ctrl =loader.getController();
        ctrl.setMaincontroller(this);
        Scene scene=new Scene(flowPane);
        stage.setScene(scene);

    }


    public void Log() throws IOException {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("/InterfaceU.fxml"));
        FlowPane flowPane = loader.load();
        InterfaceController ctrl = loader.getController();
        ctrl.setMaincontroller(this);
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();


    }

    public void deleteUser()throws IOException{
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("/DeleteUser.fxml"));
        FlowPane flowPane = loader.load();
        DeleteController ctrl = loader.getController();
        ctrl.setMaincontroller(this);
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.show();

    }

    public void adminUI() throws IOException {

        FXMLLoader loader=
                new FXMLLoader(getClass().getResource("/AdminUI.fxml"));
        AnchorPane anchorPane=loader.load();
        AdminUIController ctrl =loader.getController();
        ctrl.setMaincontroller(this);
        Scene scene=new Scene(anchorPane);
        stage.setScene(scene);
        stage.show();

    }

    public void adminLogin() throws IOException {

        FXMLLoader loader=
                new FXMLLoader(getClass().getResource("/AdminLogin.fxml"));
        FlowPane flowPane=loader.load();
        AdminLoginController ctrl =loader.getController();
        ctrl.setMaincontroller(this);
        Scene scene=new Scene(flowPane);
        stage.setScene(scene);
        stage.show();

    }
    public void shiftEdit() throws IOException{
        FXMLLoader loader=
                new FXMLLoader(getClass().getResource("/ShiftEdit.fxml"));
        AnchorPane anchorPane=loader.load();
        ShiftEditController ctrl =loader.getController();

        ctrl.setMaincontroller(this);
        Scene scene=new Scene(anchorPane);
        stage.setScene(scene);
        stage.show();
    }


}
