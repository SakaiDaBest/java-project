public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/09/2006",  "01/01/2020");
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020",
                35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Pension pay = $" + joe.collectPay());

        HourlyEmployee john = new HourlyEmployee("John","11/11/1990", "03/03/2020",15);
        System.out.println(john);
        System.out.println("John's Hourly Pay = $" + john.getDoublePay());
    }
}