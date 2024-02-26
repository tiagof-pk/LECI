package aula11.ex2;

import java.util.List;

public class SimpleGradeCalculator implements IGradeCalculator {

    @Override
    public double calculate(List<Double> grades) {
        if (grades == null || grades.isEmpty()) {
            throw new IllegalArgumentException("Grades list cannot be null or empty.");
        }

        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }
}
