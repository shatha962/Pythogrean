public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
    int sum = legA*legA + legB*legB;
    double squareRoot = Math.sqrt(sum);
    return squareRoot;
    }
}