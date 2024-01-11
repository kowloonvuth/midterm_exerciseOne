import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter short date(YYYY-MM-DD): ");
        String shortDate = input.nextLine();

        String[] parts = shortDate.split("-");
        int year = Integer.parseInt(parts[0]);
        int month= Integer.parseInt(parts[1]);
        int day = Integer.parseInt((parts[2]));

        String monthName = getMonthName(month);

        System.out.println(monthName + " " + day + ", " + year);

        input.close();
    }
    public static String getMonthName(int month){
        switch(month){
            case 1:
                return "Janurary";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return "Invalid Month";
        }
    }
}