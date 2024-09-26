//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Weapon w1=new Weapon("AKM",6500);
    Uniform u1=new Uniform("Dark grey",true);
    Unit un1=new Unit("AL HADI",8484);
    Soilder s1=new Soilder("Ali",22,w1,u1,un1);
       // System.out.println(s1.toString());

        Weapon w2=new Weapon("AKM",6500);
        Uniform u2=new Uniform("Dark grey",true);
        Unit un2=new Unit("AL HADI",8484);
        Soilder s2=new Soilder("Ali",22,w1,u1,un1);


        if(s1.equals(s2)){
            System.out.println("Soilders are equal");

        } else{
            System.out.println("Soilders are not equal");
        }

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        s2.setName("Ahmad");
        w2.setWeaponName("m416");
        s2.setWeapon(w2);
        un2.setUnitCode(6464);
        s2.setUnit(un2);
        System.out.println("After modfications");

        if(s1.equals(s2)){
            System.out.println("Soilders are equal");

        } else{
            System.out.println("Soilders are not equal");
        }
        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }

}