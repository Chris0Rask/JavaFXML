package control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppState implements Serializable {
    private List<User> user = new ArrayList<>();

    public List<User> getUsers() {

        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
