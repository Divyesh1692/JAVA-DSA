class SalarySlip {
    int empId;
    String name;
    int salary;
    int month;

    public SalarySlip(int empId, String name, int salary, int month) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.month = month;
    }
}

public class company {
    public static void main(String[] args) {
        SalarySlip[][] slips = new SalarySlip[6][6];

        // Sample data for all 6 months and 6 employees per month
        int id = 1001;
        for (int i = 0; i < 6; i++) { // month
            for (int j = 0; j < 6; j++) { // 6 slips per month
                slips[i][j] = new SalarySlip(id, "Emp" + id, (int)(Math.random() * 50000 + 20000), i + 1);
                id++;
                if (id > 1006) id = 1001; // repeat employee IDs
            }
        }

        // Print all slips for reference
        System.out.println("All Salary Slips:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Month " + (i + 1) + ":");
            for (SalarySlip s : slips[i]) {
                System.out.println("EmpID: " + s.empId + ", Salary: " + s.salary);
            }
            System.out.println();
        }

        // Find top 2 salaries in each row/month
        System.out.println("Top 2 salaries per month:");
        for (int i = 0; i < 6; i++) {
            SalarySlip first = null, second = null;
            for (SalarySlip s : slips[i]) {
                if (first == null || s.salary > first.salary) {
                    second = first;
                    first = s;
                } else if (second == null || s.salary > second.salary) {
                    second = s;
                }
            }

            System.out.print((i + 1) + " -> ");
            if (first != null) System.out.print(first.empId);
            if (second != null) System.out.print("," + second.empId);
            System.out.println();
        }
    }
}
