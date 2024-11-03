public class MyDate {
    private int year;
    private int month;
    private int day;
    private static final String[] MONTHS = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    private static final String[] DAYS = {
        "Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"
    };
    private static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int daysInMonth = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        }
        return day >= 1 && day <= daysInMonth;
    }
    public int getDaysofWeek(int year, int month, int day) {
        int[] centuryOffsets = {0, 5, 3, 1};  // cho các thế kỷ 1600, 1700, 1800, 1900, v.v.
        int[] monthOffsets = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        int centuryOffset = centuryOffsets[(year / 100) % 4];
        int yearOffset = (year % 100) + (year % 100) / 4;
        int monthOffset = monthOffsets[month - 1];

        if (isLeapYear(year) && (month == 1 || month == 2)) {
            yearOffset--;
        }

        int dayOfWeek = (centuryOffset + yearOffset + monthOffset + day) % 7;
        if (dayOfWeek < 0) {
            dayOfWeek += 7;
        }
        return dayOfWeek;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public String toString() {
        int dayOfWeek = getDaysofWeek(year, month, day);
        return DAYS[dayOfWeek] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }
    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (month < 12) {
            month++;
            day = 1;
        } else {
            year++;
            month = 1;
            day = 1;
        }
        return this;
    }
    public MyDate nextMonth(){
        if (month < 12) {
            month++;
        } else {
            month = 1;
            year++;
        }
        if (!isValidDate(year, month, day )){
            day = DAYS_IN_MONTHS[month - 1];
            if ( month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }
    public MyDate nextYear(){
        year++;
        if (!isValidDate(year, month, day)) {
            day = 28;
        }
        return this;
    }
    public MyDate previousDay(){
        if (day > 1) {
            month--;
        } else if (month > 1) {
            month--;
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        } else {
            year--;
            month = 12;
            day = 31;
        }
        return this;
    }
    public MyDate previousMonth(){
        if (month > 1) {
            month--;
        } else {
            month = 12;
            year--;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        }
        return this;
    }
    public MyDate previousYear(){
        year--;
        if (!isValidDate(year, month, day)) {
            day = 28;
        }
        return this;
    }
}
