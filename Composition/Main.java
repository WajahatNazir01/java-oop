//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          Department d1=new Department();
          Department d2=new Department();
          Location c1=new Location();
          Location c2=new Location();
          University u1=new University();
          u1.setCampus1(c1);
          u1.setCampus2(c2);
          c1.setDep1(d1);
          c1.setDep2(d2);
          c2.setDep1(d1);
          c2.setDep2(d2);

//          setting values
        u1.setUniName("COMSATS UNIVERSITY");
        d1.setDeptName("Computer Science");
        d1.setHodName("Abdul Ghafoor");
        c1.setCampusName("WAH CANTT");

        d2.setDeptName("Architect and Design");
        d2.setHodName("Mustansar Hussain");
        c2.setCampusName("ISLAMABAD");




//        now if we want to change any campus' hod name thenc

//        c1.getDep1().setHodName("ABBB CCCC");
//       c2.getDep1().setHodName("Louis Pastor");
//       c2.getDep2().setHodName("William Harry");


        u1.displayInfo();
    }
}