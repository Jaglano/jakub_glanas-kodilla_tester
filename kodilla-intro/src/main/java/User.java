public class User {
    String name;
    int howOld;

    public User (String name, int howOld) {
        this.name = name;
        this.howOld = howOld;
    }



    public String getName() {
        return name;
    }

    public int getHowOld() {
        return howOld;
    }

    public void setHowOld(int howOld) {
        this.howOld = howOld;
    }

    public void setName(String name) {
        this.name = name;
    }
}