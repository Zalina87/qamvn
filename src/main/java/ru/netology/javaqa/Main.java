public class Main {
    public static void main(String[] arcs) {
        BonusService service = new BonusService();
        long amount = 5_000;
        boolean registered = true;
        long bonus = service.calculate(amount, registered);
        System.out.println(bonus);
    }
}