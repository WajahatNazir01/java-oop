
    public class Department {
        private String deptName;
        private String hodName;

        public void setDeptName(String dn){
            deptName=dn;
        }
        public String getDeptName(){
            return deptName;
        }

        public void setHodName(String hn){
            hodName=hn;
        }
        public String getHodName(){
            return hodName;
        }

        public void displayDepartment(){
            System.out.printf("Department Name : %-20s\n",deptName);
            System.out.printf("HOD Name : %-20s\n",hodName);
        }
    }


