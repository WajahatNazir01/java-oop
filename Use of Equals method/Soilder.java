import java.util.Objects;

public class Soilder {
    private String name;
    private int age;
    private Weapon weapon;
    private Uniform uniform;
    private Unit unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Uniform getUniform() {
        return uniform;
    }

    public void setUniform(Uniform uniform) {
        this.uniform = uniform;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    //parametarized cons
    public Soilder(String name, int age, Weapon weapon, Uniform uniform, Unit unit) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.uniform = uniform;
        this.unit = unit;
    }



    @Override
    public boolean equals(Object o) {
        Soilder soilder = (Soilder) o;
        return age == soilder.age && Objects.equals(name, soilder.name)
                && Objects.equals(weapon, soilder.weapon)
                && Objects.equals(uniform, soilder.uniform)
                && Objects.equals(unit, soilder.unit);
    }

    @Override
    public boolean equals(Object o){
        Soilder s=(Soilder)o;
        return this.age==s.age && this.name.equals(name,s.name) &&
    }

    @Override
    public String toString() {
        return "Soilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weapon=" + weapon +
                ", uniform=" + uniform +
                ", unit=" + unit +
                '}';
    }
}


