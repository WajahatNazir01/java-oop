import java.util.Objects;

public class Uniform {
    private String color;
    private boolean bulletproof;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBulletproof() {
        return bulletproof;
    }

    public void setBulletproof(boolean bulletproof) {
        this.bulletproof = bulletproof;
    }

    public Uniform(String color,boolean bulletproof){
        this.color=color;
        this.bulletproof=bulletproof;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uniform uniform = (Uniform) o;
        return bulletproof == uniform.bulletproof && Objects.equals(color, uniform.color);
    }

    @Override
    public String toString() {
        return "Uniform{" +
                "color='" + color + '\'' +
                ", bulletproof=" + bulletproof +
                '}';
    }

    public Object clone(){
        return new Uniform("Dark Grey",true);
    }
}
