public class Location{

        private String campusName;
        private Department dep1;
        private Department dep2;

        //setters
        public void setDep1(Department dep11){
            dep1=dep11;
        }
        public void setDep2(Department dep22){
            dep2=dep22;
        }
        public void setCampusName(String Cn2){
            campusName=Cn2;
        }

        //getters
        public Department getDep1(){
            return dep1;
        }
        public Department getDep2(){
            return dep2;
        }
        public String getCampusName(){
            return campusName;
        }



    //diplaying method
    public void displayCampus(){
        System.out.printf("Campus name : %-20s%n",campusName);
        dep1.displayDepartment();
        dep2.displayDepartment();
    }
}

