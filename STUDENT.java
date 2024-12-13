import java .util . * ;
class STUDENT{
    // Member variables
    String sname;
    int[] marks_array;
    int total;
    double avg;

    //Starting Here is Lab 4a
    
    public STUDENT(){ // DEFAULT CONSTRUCTOR
        System.out.println("Default constructor");
        sname = "";
        marks_array = new int[0];
        total = 0;
        avg = 0.0;
    }

    /* The assign method and the parameterized constructor does the same kind of work */
    public STUDENT(String name, int marks[]) { // parameterized CONSTRUCTOR
        System.out.println("Parameterized constructor");
        this.sname = name;
        this.marks_array = marks;
    }

    void assign(String name, int[] marks) {
        sname = name;
        marks_array = marks;
        compute(); 
    }

    public void display() {
        System.out.println("Student Name: " + sname);
        System.out.print("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }

    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        STUDENT student = new STUDENT();
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("enter the number of marks to put ");
        int len = sc.nextInt();
        System.out.println("Enter the marks of " + name + ":");

        int[] marks = new int[len];
        for (int i = 0; i < len ; i++) {
            marks[i] = sc.nextInt();
        }
        student.assign(name , marks);
        // FOR LAB4A
        //STUDENT student2 = new STUDENT("Nishchail Jain", marks);


        student.display();
        //student2.display();
        sc.close();
    }
}
