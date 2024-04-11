package stundent_grades;

public class Student {
    private String nome;
    private double media;
    private int gradeNumber;

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    public void gradePointAverageCalculator(int i){
        media += i;
        gradeNumber++;
    }
    public double returnRating(){
        return media / gradeNumber;
    }
}
