package controller;

import model.HouseBuild;

import java.util.ArrayList;

import static main.Main.id;

public class ControllerHandAuto {
    public void ControllerHand(ArrayList<HouseBuild> HB){
        IntStringController intStringController = new IntStringController();
        System.out.print("Add floors or escape with -1:");
        int floors = intStringController.IntController();
        if (floors < 0){
            Controller controller = new Controller();
            controller.Controller(HB);
        }
        System.out.print("Add flats:");
        int flats = intStringController.IntController();
        System.out.print("Add address:");
        String address = intStringController.StringController();
        while (address.trim().equals("")){
            System.out.println("Address is empty! Please add address:");
            address = intStringController.StringController();
        }
        System.out.println("Add complex name optionally:");
        String complexName = intStringController.StringController();
        HB.add(new HouseBuild(id, floors, flats, address, complexName));
        id++;
        System.out.println("House created!");
        ControllerHand(HB);
    }
    public void ControllerAuto(int houseCount, ArrayList<HouseBuild> HB){
        for (int i = 1; i <= houseCount; i++){
            double testFloors = Math.random() * 10;
            double testFlats = Math.random() * 10;
            HB.add(new HouseBuild(id, (int) testFloors, (int) testFlats, "test", "test"));
            id++;
        }
        Controller controller = new Controller();
        controller.Controller(HB);
    }
}
