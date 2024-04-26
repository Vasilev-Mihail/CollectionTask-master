package controller;

import collectionTask.SortCollection;
import model.HouseBuild;

import java.util.ArrayList;
import java.util.Collections;

public class Controller {
    public void Controller(ArrayList<HouseBuild> HB){
        System.out.println("1) Hand creation.");
        System.out.println("2) Automatic test creation.");
        System.out.println("3) House list.");
        System.out.println("4) Sort list comparator.");
        System.out.println("5) Sort list comparable flats.");
        IntStringController intStringController = new IntStringController();
        ControllerHandAuto controllerHandAuto = new ControllerHandAuto();
        int buff = intStringController.IntController();
        if(buff == 5){
            SortCollection sortCollection = new SortCollection();
            HB = sortCollection.SortByFlats(HB);
            ControllerHouseBuild(HB);
        }
        if(buff == 4){
            Collections.sort(HB);
            ControllerHouseBuild(HB);
        }
        if (buff == 3){
            System.out.println("House list: ");
            ControllerHouseBuild(HB);
        }
        if (buff == 2){
            System.out.print("Enter house count: ");
            IntStringController intStringController1 = new IntStringController();
            int houseCount = intStringController1.IntController();
            controllerHandAuto.ControllerAuto(houseCount, HB);
        }
        if (buff == 1) {
            System.out.println("For escape enter -1");
            controllerHandAuto.ControllerHand(HB);
        }
        else Controller(HB);
    }
    public void ControllerHouseBuild(ArrayList<HouseBuild> HB){

        for(HouseBuild h:HB){
            System.out.println("House id:" + h.getId() + ", floors:" + h.getCountFloors()
                    + ", flats:" + h.getCountFlats() + ", address:" + h.getAddress() + ", name:" + h.getComplexName());
        }
        Controller(HB);
    }
}
