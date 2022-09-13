public class Grades {
    private int[] grades;
    private int size;
    private int sum;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.sum = sum;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void lastGrade(int value) {
        int index = grades[this.size-1];
    }


    public void average() {
        for(int i = 0; i < grades.length; i++){
            sum+=grades[i];
            double averageGrade = sum / size;
        }
    }
    public class Journal {

    }
}
