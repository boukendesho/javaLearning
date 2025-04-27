public class LeapYearCal {
    public static void main(String[] args) {
        int year = 2100;
        if (cal1(year)) {
            System.out.printf("cal1: %d is leap year\n", year);
        } else {
            System.out.printf("cal1: %d is not leap year\n", year);
        }

        if (cal2(year)) {
            System.out.printf("cal2: %d is leap year\n", year);
        } else {
            System.out.printf("cal2: %d is not leap year\n", year);
        }

        if (cal3(year)) {
            System.out.printf("cal3: %d is leap year\n", year);
        } else {
            System.out.printf("cal3: %d is not leap year\n", year);
        }
    }

    static boolean cal1(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            }

            if (year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    static boolean cal2(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            return false;
        } else {
            if (year % 4 == 0) {
                return true;
            }
            return false;
        }
    }

    static boolean cal3(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 100 == 0) {
                return false;
            }

            if (year % 4 == 0) {
                return true;
            }
            return false;
        }
    }
}
