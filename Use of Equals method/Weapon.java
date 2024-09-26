import java.util.Objects;

public class Weapon {
    private String weaponName;
    private int damage;

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public Weapon(String weaponName, int damage) {
        this.weaponName = weaponName;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", damage=" + damage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weapon weapon = (Weapon) o;
        return damage == weapon.damage && Objects.equals(weaponName, weapon.weaponName);
    }

    public Object clone(){
        return new Weapon("AKM",6700);
    }
}
