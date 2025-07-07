public class oop {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "divyesh";
        s1.rollNo = 1;

//        student s2 = new student(2,"john");

        System.out.println(s1);
    }
}

class student{
    int rollNo;
    String name;

//    public student(int rollNo, String name){
//        this.rollNo = rollNo;
//        this.name = name;
//    }
}