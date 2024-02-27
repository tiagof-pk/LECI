package aula7.ex2;

public class DateYMD extends Date implements Comparable {

    public DateYMD(int day, int month, int year) {
        super(day,month,year);
    }

    public static boolean validMonth(int month) {
        return month >= 1 && month <= 12;

    }

    public static int monthDays(int month, int year) {
        int diasNoMes = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasNoMes = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                diasNoMes = 30;
                break;

            case 2:
                if (leapYear(year)) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
                break;

            default:
                System.out.println("Mês inválido.");
        }

        return diasNoMes;

    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0));
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void setYear(int year) {
        this.year=year;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void setMonth(int month) {
        this.month=month;
    }

    public void setDay(int day) {
        this.day=day;
    }



    public void setDate(int day, int month, int year) {
        if (utils.year.validarData(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public void increment() {
        if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year += 1;
        } else if (day == monthDays(month, year)) {
            day = 1;
            month += 1;
        } else {
            day += 1;
        }
    }

    public void decrement() {
        if (day == 1 && month == 1) {
            day = 31;
            month = 12;
            year -= 1;
        } else if (day == 1) {
            day = monthDays(month - 1, year);
            month -= 1;
        } else {
            day -= 1;
        }
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof DateYMD other) {

            if (this.year != other.year) {
                return this.year - other.year;
            } else if (this.month != other.month) {
                return this.month - other.month;
            } else {
                return this.day - other.day;
            }
        } else {
            throw new IllegalArgumentException("Incompatible type for comparison");
        }
    }
}
