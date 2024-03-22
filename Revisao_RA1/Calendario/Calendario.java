class Calendario {
    private int day;
    private int month;
    private int year;

    public Calendario(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void showDate() {
        System.out.println(day + "/" + month + "/" + year);
    }

    public boolean isLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}