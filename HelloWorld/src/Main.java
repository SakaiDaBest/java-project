public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Proton");
        car.setModel("Saga");
        car.setColor("Black");
        car.setConvertible(true);
        car.setDoors(4);
        System.out.println("Make = "+ car.getMake());
        System.out.println("Model = "+ car.getModel());
        System.out.println("Colour = "+ car.getColor());
        System.out.println("Doors = "+ car.getDoors());
        System.out.println("Covertible = "+ car.isConvertible());
        car.describeCar();

        Car sec = new Car();
        sec.setMake("Tesla");
        sec.setModel("Model X");
        sec.setColor("Gray");
        sec.setConvertible(true);
        sec.setDoors(2);
        sec.getColor();
    }
}
