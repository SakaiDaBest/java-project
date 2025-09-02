public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch", "Acer", 27, "2540x1440");
        Motherboard themotherboard = new Motherboard("BJ-200", "Asus", 4, "v2.44", 6);
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, themotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Window OS");
//        thePC.getComputercase().pressPowerButton();
        thePC.powerUp();
    }
}