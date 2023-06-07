//WAP using a do while for creating an array 5 students with user define values
// WAP create 5 employeeobject for an employee class and showthe count of no of employees
import java.util.*;

class Student1 {
    private int roll_no;
    private String student_name;
    private int marks;

    @Override
    public String toString() {
        return "Student [roll_no=" + roll_no + ", student_name=" + student_name + ", marks=" + marks + "]";
    }

    public Student1() {

    }

    public Student1(int roll_no, String student_name, int marks) {
        this.roll_no = roll_no;
        this.student_name = student_name;
        this.marks = marks;
    }
}

class employee1 {
    String emp_name;

    public static int count = 0;

    public employee1(String emp_name) {
        this.emp_name = emp_name;
        count++;
    }

}

public class ArrayOfObjects {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Student[] batch_name = new Student[5];

        // for (int i = 0; i < 5; i++) {
        // batch_name[i] = new Student();
        // System.out.println(batch_name[i]);
        // }

        // -------------------------------------------
        // Student1[] batch2 = {
        // new Student1(),
        // new Student1(1, "X", 55),
        // new Student1(2, "Y", 88),
        // new Student1()
        // };

        // for (int i = 0; i < batch2.length; i++) {
        // System.out.println(batch2[i]);
        // }

        // --------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // Student1[] batch3 = new Student1[5];
        // int a = 0;
        // do {
        // System.out.println("Enter roll_no of batch3 student" + a);
        // int rn = sc.nextInt();
        // System.out.println("Enter name of batch3 student" + a);
        // String name = sc.next();
        // System.out.println("Enter marks of batch3 student" + a);
        // int mrks = sc.nextInt();
        // batch3[a] = new Student1(rn, name, mrks);
        // a++;
        // } while (a < batch3.length);
        // int t = 0;
        // do {
        // System.out.println(batch3[t]);
        // t++;
        // } while (t < batch3.length);

        // -------------------------------------------

        employee1 em = new employee1("vansh");
        employee1 em1 = new employee1("ram");
        employee1 em2 = new employee1("bunti");
        employee1 em3 = new employee1("bhavy");
        employee1 em4 = new employee1("tiro");
        System.out.println("no. of  employee objects " + employee1.count);
    }
}
