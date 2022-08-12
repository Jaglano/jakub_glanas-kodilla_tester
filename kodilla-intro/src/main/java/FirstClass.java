public class FirstClass {                           // [1]
    public static void main(String[] args) {         // [2]
        String hello = "Hello from FirstClass!";
        System.out.println(hello);// [3]

        if (1 > 2){
            System.out.println("Niesamowite! Jeden jest większe niż dwa");
        }   else {
                System.out.println("Wszystko po staremu, jeden jest mniejszę niż dwa");
        }
    }
}