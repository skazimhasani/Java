package ConditionalStatements;

public class Fever {
    public static void main(String[] args) {
        double temp = 103.5;
        String fever = temp > 100 ? "You have a fever" : "You don't have a fever";
        System.out.println(fever);
    }
}
