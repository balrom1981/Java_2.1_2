public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int addition = 15000;
        int cost = 100;
        int bonus = addition / cost;
        int limit = 1000;
        int total;
        if (addition > limit) {
            total = amount + addition + bonus;
        } else {
            total = amount + addition;
        }
        System.out.println(total);
    }
}
