import java.util.Scanner;

public class ass2 {
    public static void main(String[] args) {
        stud s1 = new stud();
        stud s2 = new stud();
        stud s3 = new stud();

        s1.input();
        s2.input();
        s3.input();

        stud[] students = {s1, s2, s3};

        for (stud s : students) {
            s.show();
            System.out.println("Total Marks: " + s.totalMarks());
            System.out.println("Highest Mark: " + s.getHighest());
            System.out.println("Lowest Mark: " + s.getLowest());
            System.out.println("Average Marks: " + s.getAverage());
            System.out.println("Subjects Passed: " + s.getPassCount());
            System.out.println();
        }

        stud.totalStudents();
    }
}

class stud{
        private int rno;
        private  String name;
        private int[] marks = new int[5];
        private int totalMarks;
        static private int uno =0 ;

        public stud(){
            uno++;
            this.rno = uno;
            this.name = "";
            this.marks = new int[5];
            this.totalMarks = 0;
        }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name for student " + rno + ": ");
        name = sc.nextLine();
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }
    public void show() {
        System.out.println("\nStudent Roll No: " + rno);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
    public static void totalStudents() {
        System.out.println("\nTotal students registered: " + uno);
    }
    public int totalMarks() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }
    public int getHighest() {
        int high = marks[0];
        for (int mark : marks) {
            if (mark > high) high = mark;
        }
        return high;
    }
    public int getLowest() {
        int low = marks[0];
        for (int mark : marks) {
            if (mark < low) low = mark;
        }
        return low;
    }

    public double getAverage() {
        return totalMarks() / 5.0;
    }
    public int getPassCount() {
        int count = 0;
        for (int mark : marks) {
            if (mark >= 34) count++;
        }
        return count;
    }


}