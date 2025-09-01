public class Car {
    //set private for good practice
    private String make = "Tesla";
    private String color = "Brown";
    private String model = "Model X";
    private int doors = 2;
    private boolean convertible = true;


    //Getters: Get values for private stuff
    public String getMake(){    //setter
        return make;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make){
        if(make==null)make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "proton", "tesla" -> this.make = make;//Must be one of these brands
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    //Setters: Set values for private values
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void describeCar() {
        System.out.println(doors+"-Door "+
                color + " "+
                make +" " +
                model+ " " +
                (convertible ? "Convertible" : ""));
    }
}
