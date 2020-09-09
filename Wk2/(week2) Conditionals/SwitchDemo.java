import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        int monthNumber = input.nextInt();

        System.out.println("********** getMonthByNumber() ************");
        System.out.println("monthNumber == 8, name == " + SwitchDemo.getMonthByNumber(monthNumber));
        System.out.println("monthNumber == 2, name == " + SwitchDemo.getMonthByNumber(2));
        System.out.println("monthNumber == 12, name == " + SwitchDemo.getMonthByNumber(12));
        System.out.println("monthNumber == 34, name == " + SwitchDemo.getMonthByNumber(34));

        System.out.print("Enter a month string: ");

        String month = input.next();

        System.out.println("********** getMonthByName() ************");
        System.out.println("monthName == \"" + month + "\", number == " + SwitchDemo.getMonthByName(month));
        System.out.println("monthName == \"January\", number == " + SwitchDemo.getMonthByName("January"));
        System.out.println("monthName == \"dsfs s\", number == " + SwitchDemo.getMonthByName("dsfs s"));
        System.out.println("monthName == \"August\", number == " + SwitchDemo.getMonthByName("August"));

    }

    public static String getMonthByNumber(int monthNumber) {
        String monthString;

        switch (monthNumber) {
            // monthNumber == 1
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            case 13:
            default: monthString = "Invalid month";
                break;
        }
        return monthString;
    }

    public static int getMonthByName(String monthName) {
        int monthNumber = -1;
        switch (monthName) {
            case "January":
                monthNumber = 1;
                System.out.println("hi");
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber = -1;
                break;
        }
        return monthNumber;
    }
}