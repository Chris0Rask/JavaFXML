package control;

public class InterfaceController {

    private FXMLApp app;
    public void setMaincontroller(FXMLApp fxmlApp) {
        this.app=fxmlApp;
    }

public void Logout(){
app.back();
}



}
