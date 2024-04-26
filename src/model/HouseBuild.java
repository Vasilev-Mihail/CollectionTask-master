package model;

public class HouseBuild implements Comparable<HouseBuild>{
    private Integer id;
    private Integer countFloors;
    private Integer countFlats;
    private String address;
    private String complexName;
    public HouseBuild(int id, int countFloors, int countFlats, String address, String complexName){
        this.id = id;
        this.countFloors = countFloors;
        this.countFlats = countFlats;
        this.address = address;
        this.complexName = complexName;
    }
    public int getId(){
        return id;
    }
    public int getCountFloors(){
        return countFloors;
    }
    public int getCountFlats(){
        return countFlats;
    }
    public String getAddress(){
        return address;
    }
    public String getComplexName(){
        return complexName;
    }

    @Override
    public int compareTo(HouseBuild o) {
        int result = this.address.compareTo(o.address);
        if (result == 0){
            result = this.countFloors.compareTo(o.countFloors);
            if (result == 0){
                result = this.countFlats.compareTo(o.countFlats);
            }
        }
        return result;
    }
}
