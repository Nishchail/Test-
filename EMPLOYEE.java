import java .util.*;
public class EMPLOYEE {
    String Ename ;
    String Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;

    void read(Scanner sc) {
        System.out.println("Enter the name of the employee");
        Ename = sc.next();
        System.out.println("enter the ID of the employee");
        Eid = sc.next();
        System.out.println("enter the basic salary of the employee");
        Basic = sc.nextDouble();
        calculate_salary();
    }

    void calculate_salary() {
        DA = Basic * 0.52;
        Gross_Sal = Basic + DA;
        Net_Sal = Gross_Sal - (Gross_Sal * 0.30);
        display();
    }

    void display() {
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("Dearness of Meals Allowance: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        EMPLOYEE e = new EMPLOYEE();

        System.out.println("Enter the number of data of employees you widh to enter ");
        int n = scan.nextInt();

        for(int i = 0 ; i < n ; i++) {
            e.read(scan);
        }

    }

}
