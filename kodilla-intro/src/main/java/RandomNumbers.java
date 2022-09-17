public class RandomNumbers {
    int numbers;
    int sum;
    int i = 30;
    int b = 0;
    public void draw() {
        do {
            numbers = (int) (Math.random() * 31); // 31 ponieważ zaokrągli w dół (int)
            sum += numbers;
            System.out.println(numbers);
            if (i > numbers) { //minimum
                i = numbers;
            }
            if ( b < numbers) { //maximum
                b = numbers;
            }
        } while (sum <= 50);


    }

    public int minimum() {
        return i;
    }

    public int maximum() {
        return b;
    }
}




