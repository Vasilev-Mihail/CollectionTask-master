package main;

import controller.Controller;
import model.HouseBuild;

import java.util.ArrayList;

public class Main {
    public static int id = 1;
    public static void main(String[] args) {
        ArrayList<HouseBuild> HB = new ArrayList<>();
        Controller controller = new Controller();
        controller.Controller(HB);
    }
}
