public class classObject {

    public static void main(String[] args) {

        System.out.println("Class And Object in Java ...............");

        /// Calling Pen Class By Object
        Pen pen1=new Pen();
        pen1.Color="Red";
        pen1.type="gel pen";
        pen1.brand="Matador";
        pen1.penInfo();

        System.out.println("Second Pen Info..............");
        /// Pen two
        Pen pen2=new Pen();
        pen2.Color="Blue";
        pen2.type="Ball pen";
        pen2.brand="Hi School";
        pen2.penInfo();

        System.out.println("First Student Information.....................");
        /// Creating Student one Info
        StudentInfo studentInfo1=new StudentInfo();
        studentInfo1.idNo=1181;
        studentInfo1.name="Mehedi hasan";
        studentInfo1.age=24;
        studentInfo1.dept="Computer Science";

        studentInfo1.studentInfo();


        System.out.println("Second Student Information.....................");
        /// Creating Student one Info
        StudentInfo studentInfo2=new StudentInfo();
        studentInfo2.idNo=1182;
        studentInfo2.name="Shad Ahmed";
        studentInfo2.age=26;
        studentInfo2.dept="Social Science";

        studentInfo2.studentInfo();

    }

    /// Pen Class "class is a Blue Print"
    static class Pen{
        String Color;
        String type;
        String brand;

        public void penInfo(){
            System.out.println(this.Color);
            System.out.println(this.type);
            System.out.println(this.brand);
        }


    }

    static  class  StudentInfo{
        double idNo;
        String name;
        int age;
        String dept;

        public void studentInfo(){
            System.out.println("Id Number: " +this.idNo);
            System.out.println("Name: " +this.name);
            System.out.println("Age: " +this.age);
            System.out.println("Department: " +this.dept);

        }

    }





}
