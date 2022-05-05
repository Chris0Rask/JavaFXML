package control;

import java.io.*;
import java.util.HashMap;
import java.util.Map;



public class DataController{

    public void saveAppState(AppState state){
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Appstate.dat"));
            os.writeObject(state);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public AppState loadState(){
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("Appstate.dat"));

        ){

            AppState state = (AppState) is.readObject();
            is.close();
            return state;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
/*
    public double getAverage(String studentID){

        double avg=0;
        Map<String, Double> stringDoubleMap = loadGrades(studentID);
        for (Double value : stringDoubleMap.values()) {
            avg+=value;
        }

        return avg/stringDoubleMap.values().size();
    }*/

}
