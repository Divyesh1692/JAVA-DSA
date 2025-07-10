public class holiday_test {
    public static void main(String[] args) {
        Holiday h1 = new Holiday(15,"IDay","Aug");
        Holiday h2 = new Holiday(26,"RDay","Jan");
        Holiday h3 = new Holiday(25,"Janmashtami","Aug");

        System.out.println(h3.inSameMonth(h1));

        Holiday [] holidays = new Holiday[3];

        holidays[0] = h1;
        holidays[1] = h2;
        holidays[2] = h3;

        System.out.println(h1.avgDate(holidays));

    }
}

class Holiday{
    String name;
    int day;
    String month;

    public Holiday(int day,String name,  String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public  boolean inSameMonth(Holiday h2){
        if(month == h2.month){
            return true;
        }
        return false;
    }

    public double avgDate(Holiday[] holidays){
        double sum = 0;
        for(Holiday h: holidays){
            sum+=h.day;
        }
        return sum/holidays.length;

    }

    

}