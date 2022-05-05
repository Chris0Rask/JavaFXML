package control;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Objects;

public class AdminLoginController {
    public TextField userName;
    public PasswordField passWord;
    private FXMLApp app;
    public void setMaincontroller(FXMLApp fxmlApp) {
        this.app=fxmlApp;
    }

public void adminBack(){
        app.back();
}
public void adminui() throws IOException {
        if(Objects.equals(this.userName.getText(), "admin") && Objects.equals(this.passWord.getText(), "123")){
        app.adminUI();
    }
}
}
