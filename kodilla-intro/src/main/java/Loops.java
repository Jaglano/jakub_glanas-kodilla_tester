public class Loops {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 3, 4};
        System.out.println("Suma liczb wynosi " + sumOfnumbers(numbers));
    }

    public static int sumOfnumbers(int[] numbers) {
        int sumOfNumbers = 0; //inicjujesz zmienna do sumowania wyniku przed petla
        for (int i = 0; i < numbers.length; i++) { //petla przejdzie 5 razy -> dla i = 0 do i = 4
            sumOfNumbers = sumOfNumbers + numbers[i]; //do sumy 0 dodajesz element i z tablicy, gdzie i masz od 0 do 4 xD
            System.out.println(i + 1 + " przejscie petli, gdzie suma wynosi dotychczas " + sumOfNumbers);
        }
        return sumOfNumbers;
    }
}