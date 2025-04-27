public class LeapYearCal {
    public static void main(String[] args) {
        int year = 2100;
        if (cal1(year)) {
            System.out.printf("cal1: %d is a leap year\n", year);
        } else {
            System.out.printf("cal1: %d is not a leap year\n", year);
        }

        if (cal2(year)) {
            System.out.printf("cal2: %d is a leap year\n", year);
        } else {
            System.out.printf("cal2: %d is not a leap year\n", year);
        }

        if (cal3(year)) {
            System.out.printf("cal3: %d is a leap year\n", year);
        } else {
            System.out.printf("cal3: %d is not a leap year\n", year);
        }
    }

    static boolean cal1(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            }

            return year % 100 != 0;
        } else {
            return false;
        }
    }

    static boolean cal2(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }

    static boolean cal3(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 100 == 0) {
                return false;
            }

            return year % 4 == 0;
        }
    }
}
