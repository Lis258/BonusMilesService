public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 5963;
        int miles = service.calculate(cost);
        System.out.println(miles);
    }
}
