package stundent_grades;

public class run {
    public static void main(String[] args) {

        Student clara = new Student();

        clara.setNome("Clara");

        clara.gradePointAverageCalculator(3);

        clara.gradePointAverageCalculator(5);

        clara.gradePointAverageCalculator(10);

        System.out.println(clara.returnRating());
    }
}
