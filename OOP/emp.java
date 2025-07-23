public class emp {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("1", "Ram", jt.Peon, 21000),
                new Employee("2", "Shyam", jt.Prof, 50000),
                new Employee("3", "Geeta", jt.HOD, 70000),
                new Employee("4", "Sita", jt.Principal, 90000),
                new Employee("5", "Ravi", jt.Prof, 62000),
                new Employee("6", "Anita", jt.HOD, 60000),
                new Employee("7", "Amit", jt.Prof, 58000),
                new Employee("8", "Meena", jt.Principal, 45000),
                new Employee("9", "Vikas", jt.Peon, 19000),
                new Employee("10", "Neha", jt.HOD, 64000)
        };

        calculateTitleWiseSalary(employees);
    }
    public static void calculateTitleWiseSalary(Employee[] employees) {
        int peonTotal = 0, profTotal = 0, hodTotal = 0, principalTotal = 0;

        for (Employee emp : employees) {
            switch (emp.jobTitle) {
                case Peon:
                    peonTotal += emp.salary;
                    break;
                case Prof:
                    profTotal += emp.salary;
                    break;
                case HOD:
                    hodTotal += emp.salary;
                    break;
                case Principal:
                    principalTotal += emp.salary;
                    break;
            }
        }
        System.out.println("Peon      : " + peonTotal);
        System.out.println("Prof      : " + profTotal);
        System.out.println("HOD       : " + hodTotal);
        System.out.println("Principal : " + principalTotal);
    }
}


class Employee{
    String empId, name;
    jt jobTitle;
    int salary;

    public Employee(String empId, String name,jt  jobTitle, int salary) {
        this.empId = empId;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}

enum jt{
    Peon, Prof, HOD, Principal
}