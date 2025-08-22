public class polymorphysmInJava {

    public static void main(String[] args) {


        System.out.println("Polymorphism In Java..................");  //Also Called Function Overloading

        Student student=new Student();
        student.printInfo("Mehedi Hasan");
        student.printInfo(21);
        student.printInfo("Mehedi",23);

    }


    /// Student Class
    static class Student{

        String name;
        int age;

        public void printInfo(String name){
            System.out.println("Name:"+name);
        }

        public void printInfo(int age){
            System.out.println("Age:"+age);
        }

        public void printInfo(String name,int age){
            System.out.println("Name:"+name+ "&" +"Age:"+age);
        }

    }




}
