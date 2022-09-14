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

    public double lastGrade() {
        if (size==0){
            System.out.println("There is no grades");
            return 0;
        }
        return grades[size-1];

    }

    public double averageGrades() {
        double sum = 0;
        for(int i = 0; i < grades.length; i++){
            sum+=grades[i];

        }
        return sum / size;

    }
}

