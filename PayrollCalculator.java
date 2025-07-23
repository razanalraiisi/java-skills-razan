public class PayrollCalculator {
    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate){
        double weeklyPay = 0;
        switch(employeeType) {
            case "full time":
                if(hoursWorked>40){
                    weeklyPay= (hoursWorked - 40) * hourlyRate * 1.5;
                }else{
                    weeklyPay= hoursWorked * hourlyRate;
                }
                break;
            case "part time":
                if(hoursWorked>25){
                    System.out.println("A part time employee cannot work more than 25 hours per week.");

                }else{
                    weeklyPay= hoursWorked * hourlyRate;
                }

                break;
            case "contractor":
                weeklyPay= hoursWorked * hourlyRate;

                break;
            case "intern":
                if(hoursWorked>20){
                    System.out.println("an intern cannot work for more than 20 hours.");

                }else{
                    weeklyPay= hoursWorked * (hourlyRate * 0.8);
                }

                break;
            default:
                System.out.println("Invalid employee type.");
                break;

        }
        return weeklyPay;
    }
    public static double calculateTaxDeduction(double grosspay, boolean hasHealthInsurance){
        double tax=0;
        double totalTax=0;

        if(grosspay<=500){
            tax=grosspay * 0.1;
        } else if (grosspay>500 && grosspay<=1000) {
            tax=grosspay * 1.5;
            
        } else if (grosspay>1000 && grosspay<=2000) {
            tax=grosspay * 0.2;
        } else {
            tax=grosspay * 2.5;
        }
        if(hasHealthInsurance == true){
            totalTax=tax-50;
        }
        return totalTax;
    }

    public static void processPayroll(String[] names, String[] types, double[] hours, double[] rates) {
        double totalPay = 0;
        double highestPay = 0;
        double lowestPay = Double.MAX_VALUE;
        String highestPaid = "";
        String lowestPaid = "";
        int overtimeCount = 0;

        for (int i = 0; i < names.length; i++) {
            double gross = calculateWeeklyPay(types[i], hours[i], rates[i]);
            double tax = calculateTaxDeduction(gross, true); // assuming everyone has insurance
            double net = gross - tax;

            System.out.println(" Employee: " + names[i] + " ---");
            System.out.println("Type: " + types[i]);
            System.out.println("Hours: " + hours[i]);
            System.out.println("Hourly Rate: " + rates[i]);
            System.out.println("Gross Pay: " + gross);
            System.out.println("Tax Deducted: " + tax);
            System.out.println("Net Pay: " + net);

            totalPay += net;

            if (gross > highestPay) {
                highestPay = gross;
                highestPaid = names[i];
            }

            if (gross < lowestPay) {
                lowestPay = gross;
                lowestPaid = names[i];
            }

            if (hours[i] > 40) {
                overtimeCount++;
            }
        }

        double average = totalPay / names.length;

        System.out.println("Payroll Summary");
        System.out.println("Highest Paid: " + highestPaid + " " + highestPay + ")");
        System.out.println("Lowest Paid: " + lowestPaid + " " + lowestPay + ")");
        System.out.println("Average Net Pay:" + average);
        System.out.println("Overtime Workers: " + overtimeCount);
    }
    public static void main(String[] args) {
        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN", "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};


        System.out.println("Individual Pay: " + calculateWeeklyPay("FULL_TIME", 45, 25));


        processPayroll(names,types,hours,rates);
    }
}
