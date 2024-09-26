import java.util.Objects;

public class Unit {
    private String unitName;
    private int unitCode;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public int getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(int unitCode) {
        this.unitCode = unitCode;
    }

    public Unit(String unitName,int unitCode){
        this.unitName=unitName;
        this.unitCode=unitCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return unitCode == unit.unitCode && Objects.equals(unitName, unit.unitName);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "unitName='" + unitName + '\'' +
                ", unitCode=" + unitCode +
                '}';
    }

    @Override
    public Object clone(){
    return new Unit("AL HADi",8484);
    }


}
