public class studentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStudDetails(2,"abc",99,95,99);
        s1.calculateTotal();

        s1.displayStudDetails();

    }
}

class Student{
   int rollNum;
   String studName;
    int mark1, mark2, mark3, totalMarks;

     void setStudDetails(int rollNum,String  studName,int  mark1,int  mark2,int  mark3){
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    };
    public int calculateTotal(){
         totalMarks = mark1+mark2+mark3;
         return totalMarks;
     }
    public void displayStudDetails(){
        System.out.println("Roll No: "+rollNum);
        System.out.println("Student Name: "+studName);
        System.out.println("Total Marks: "+totalMarks);
    }
}