public class vehicle {
    public static void main(String[] args) {
        ve bicycle = new Bicycle();
        ve bike = new Bike();
        ve car = new Car();

        bicycle.changeGear(2);  // Valid
        bicycle.changeGear(3);  // Invalid

        bike.changeGear(3);     // Valid
        bike.changeGear(4);     // Invalid

        car.changeGear(4);      // Valid
        car.changeGear(6);      // Invalid
    }
}


interface ve{
    void changeGear(int newGear);
}

class Bicycle implements ve{
    private int currentGear = 1;

   public void changeGear(int newGear){
       if (newGear >= 1 && newGear <= 2) {
           currentGear = newGear;
           System.out.println("gear: " + currentGear);
       } else {
           System.out.println("max gear is 2");
       }
   }
}

class Bike implements ve {
    private int currentGear = 1;

    public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= 3) {
            currentGear = newGear;
            System.out.println("gear: " + currentGear);
        } else {
            System.out.println("max gear is 3");
        }
    }
}

class Car implements ve {
    private int currentGear = 1;

    public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= 5) {
            currentGear = newGear;
            System.out.println("gear: " + currentGear);
        } else {
            System.out.println("max gear is 5");
        }
    }
}
