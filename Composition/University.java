public class University {
    private String UniName;
    private Location campus1;
    private Location campus2;
//    setters
    public void setUniName(String Un){
        UniName=Un;
    }
    public void setCampus1(Location Cm){
        campus1=Cm;
    }
    public void setCampus2(Location Cm1){
        campus2=Cm1;
    }
//    getters
    public String getUniName() {
        return  UniName;
    }
    public Location getCampus1(){
        return campus1;
    }
    public Location getCampus2(){
        return campus2;
    }

public void displayInfo(){
    System.out.printf("University name : %20s%n",UniName);
    campus1.displayCampus();
    campus2.displayCampus();
}
}
