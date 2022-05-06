package control;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
     String userName;
     String passWord;
     String name;
     String address;
     ArrayList<String> shift1 = new ArrayList<>();
     ArrayList<String> shift2 = new ArrayList<>();
     ArrayList<String> shift3 = new ArrayList<>();

     @Override
     public String toString() {
          return "User{" +
                  "userName='" + userName + '\'' +
                  ", passWord='" + passWord + '\'' +
                  ", name='" + name + '\'' +
                  ", address='" + address + '\'' +
                  ", shift1=" + shift1 +
                  ", shift2=" + shift2 +
                  ", shift3=" + shift3 +
                  '}';
     }

     //  public User(String un, String pw, String fn, String ad) {}

     // List<Shift>
}
