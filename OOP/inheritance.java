public class inheritance {
    public static void main(String[] args) {
       s s1= new s();
        System.out.println();
        s1.fee=2000;
        s1.name="a";
        s1.no=123456;
        s1.std=5;
        s1.display();
        System.out.println();

        p p1 = new p();
        p1.name="bbb";
        p1.no=456320;
        p1.salary=50000;
        p1.sub="maths";
        p1.display();

        x x1= new x();
        x1.name="ccc";
        x1.no=523;
        x1.salary=40000;
        x1.sub="science";
        x1.hours = 44;
        x1.leaves = 10;
        x1.display();
    }
}


class person{
    String name;
    int no;
}

class s extends person{
    int std;
    int fee;

    public void display(){
        System.out.println("name: "+name+"   "+"no: "+no+"   "+"std: "+std+"   "+"fees: "+fee );
    }
}

class p extends person{
    int salary;
    String sub;

    public void display(){
        System.out.println("name: "+name+"   "+"no: "+no+"   "+"salary: "+salary+"   "+"sub: "+sub );
    }
}


class x extends p{
    int hours;
    int leaves;
    public void display(){
        System.out.println("name: "+name+"   "+"no: "+no+"   "+"salary: "+salary+"   "+"sub: "+sub+"   "+"hours: "+hours+"   "+"leaves: "+leaves );
    }
}