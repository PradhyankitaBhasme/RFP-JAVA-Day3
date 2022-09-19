package com.bridgelabz.employeewage;

public class EmployeeWageComputation {


        public enum Attendance{
            IS_FULL_TIME,IS_PART_TIME
        }
        static final int FULL_DAY_HOUR=10;
        static final int PART_TIME_HOUR=5;
        static final int MAX_HOURS=100;
        static final int MAX_DAYS=20;
        static int wagePerHour;


        public static void main(String[] args) {
            System.out.println("Welcome to Employee Wage Computation");
            EmployeeWageComputation.getEmployeeWage();
        }

        static void getEmployeeWage(){
            Attendance attendance;
            int dailyWage=0;
            int day=1;
            int totalWage=0;
            int totalWorkingHrs=0;

            while (day <=MAX_DAYS && totalWorkingHrs<MAX_HOURS) {
                attendance = checkAttendance();

                switch (attendance) {
                    case IS_FULL_TIME:
                        if (totalWorkingHrs+FULL_DAY_HOUR <= MAX_HOURS) {
                            dailyWage = wagePerHour * FULL_DAY_HOUR;
                            totalWorkingHrs+=FULL_DAY_HOUR;
                        }else {
                            dailyWage = wagePerHour * PART_TIME_HOUR;
                            totalWorkingHrs+=PART_TIME_HOUR;
                        }
                        break;
                    case IS_PART_TIME:
                        dailyWage = wagePerHour * PART_TIME_HOUR;
                        totalWorkingHrs+=PART_TIME_HOUR;
                        break;
                    default:
                        break;
                }
                totalWage+=dailyWage;
                System.out.println("day "+day+" wage= "+ dailyWage);
                day++;

    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=10;
    static final int PART_TIME_HOUR=5;
    static final int MAX_HOURS=100;
    static final int MAX_DAYS=20;
    public static void main(String[] args) {
        int attendance;
        int dailyWage=0;
        int day=1;
        int totalWage=0;
        int totalWorkingHrs=0;

    public static void main(String[] args) {
        int attendance;

        System.out.println("Welcome to Employee Wage Computation");

        while (day <=MAX_DAYS && totalWorkingHrs<MAX_HOURS) {
            attendance = checkAttendance();

            switch (attendance) {
                case IS_FULL_TIME:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWorkingHrs+=FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingHrs+=PART_TIME_HOUR;
                    break;
                default:
                    break;

            }
            System.out.println();
            System.out.println("Total Days = "+(day-1));
            System.out.println("Total Working Hours = "+totalWorkingHrs);
            System.out.println("Total Wage of month= "+totalWage);

        }

        static Attendance checkAttendance(){
            int random=(int)(Math.random()*10)%3;
            return (random==Attendance.IS_FULL_TIME.ordinal()) ? Attendance.IS_FULL_TIME: Attendance.IS_PART_TIME;
        }

    }

        System.out.println();
        System.out.println("Total Days = "+(day-1));
        System.out.println("Total Working Hours = "+totalWorkingHrs);
        System.out.println("Total Wage of month= "+totalWage);

    }
    
    static int checkAttendance(){

        int random=(int)(Math.random()*10)%3;

        int random=(int)(Math.random()*10)%2);

        return random;
    }
}

