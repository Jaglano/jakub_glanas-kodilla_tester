public class Main {
    public static void main(String[] args) {
    User kuba = new User("Kuba", 27);
    User kinga = new User("Kinga", 26);
    User mateusz = new User("Mateusz", 33);
    User tobiasz = new User("Tobiasz", 50);
    User borys = new User("Borys", 77);
    User elon = new User("Elon", 47);
    User cezary = new User("Cezary", 45);

    User[] users = {kuba, kinga, mateusz, tobiasz, borys, elon, cezary};

    int sum = 0;

    for (int i = 0; i < users.length; i++) {
        sum = sum + users[i].howOld;
        }
        System.out.println(sum);

    int averageAge = sum / users.length;
        System.out.println(averageAge);



    for (int i = 0; i < users.length; i++) {
        if (averageAge > users[i].howOld) {
            System.out.println("Osoby, których wiek jest poniżej średniej: " + users[i].name);
        }
    }

    // 2.6 pkt 2 zadania
        RandomNumbers numbers = new RandomNumbers();
        numbers.draw();
        RandomNumbers minimum = new RandomNumbers();
        RandomNumbers maximum = new RandomNumbers();

        System.out.println("Minimalna wartość to: " + numbers.minimum());
        System.out.println("Maksymalna wartość to: " + numbers.maximum());





    // poniżej dotyczy zadania 2.4 klasa Grades
        Grades grades = new Grades();
        grades.add(2);

        System.out.println("Ostatnia ocena to: " + grades.lastGrade());

        grades.add(5);
        System.out.println("Średnia ocen to: " + grades.averageGrades());
    }

}
