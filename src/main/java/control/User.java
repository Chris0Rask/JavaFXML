package control;

import java.io.Serializable;

public class User implements Serializable {
     String userName;
     String passWord;
     String name;
     String address;

     @Override
     public String toString() {
          return "User{" +
                  "userName='" + userName + '\'' +
                  ", passWord='" + passWord + '\'' +
                  ", name='" + name + '\'' +
                  ", address='" + address + '\'' +
                  '}';
     }

//  public User(String un, String pw, String fn, String ad) {}

     // List<Shift>
}
