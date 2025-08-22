public class constructorJava {
    public static void main(String[] args) {

        System.out.println("Constructor in Java..................");

        /// Creating Object for Student Class
        Student student1=new Student("Mehedi Hasan",25);
        student1.studentInfo();

        System.out.println("Second Student Information.............");
        Student student2=new Student("Limon Hasan",27);
        student2.studentInfo();

    }


    /// Student Class
    static  class Student{
        String name;
        int age;

        /// Creating Parameterized Constructor
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }

        public  void studentInfo(){
            System.out.println("Name: " +this.name);
            System.out.println("Age: "+this.age);
        }


    }

}
