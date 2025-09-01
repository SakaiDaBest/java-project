public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("mutt", "Big", 50);//calls super class from subclass constructor

    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight <35 ? "medium" : "large"), weight);
        this.earShape = earShape;   //size|
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("Howl!");
        }
        bark();
        System.out.print("Woof!");
    }

    private void bark(){
        System.out.print("Bark!");
    }
    private void run(){
        System.out.print("Running!");
    }
    private void walk(){
        System.out.print("Walking!");
    }
    private void wagTail(){
        System.out.print("Tail Wagging!");
    }
}
