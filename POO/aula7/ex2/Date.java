package aula7.ex2;

import java.util.Objects;

public abstract class Date implements Comparable {
    protected int day, month, year;

    public Date(int day, int month, int year) {
        if (utils.year.validarData(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public abstract int getDay();
    public abstract void setDay(int day);
    public abstract int getMonth();
    public abstract void setMonth(int month);
    public abstract int getYear();
    public abstract void setYear(int year);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
