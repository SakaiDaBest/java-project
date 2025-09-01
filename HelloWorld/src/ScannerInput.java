import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year were you born? ");
        boolean validAge = false;
        int currentYear = 2025;
        int age = 0;
        do{
            System.out.println("Enter a year of birth >= "+(currentYear-125)+" and <= "+(currentYear));
            try{
                age = CheckData(currentYear,scanner.nextLine());
                validAge = age<0 ? false : true;
            }catch(NumberFormatException badUserData){
                System.out.println("Characters not allowed! Try Again");
            }

        }while(!validAge);
        System.out.println("So you are " + age + " years old");
    }

    public static int CheckData(int currentYear, String DateofBirth) {
        int dob = Integer.parseInt(DateofBirth);
        int minimumYear = currentYear -125;
        if((dob<minimumYear)||(dob>currentYear)){
            return -1;
        }
        return(currentYear - dob);
    }
}
