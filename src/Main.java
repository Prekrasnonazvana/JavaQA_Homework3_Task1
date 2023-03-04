public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        //int ticketPrice = 2075;
        //int bunusMilesForTicketPrice = ticketPrice / 20;
        System.out.println("Вы заработали " + miles + " бонусных миль");
    }
}