public class Main {

    public static void main(String[] args) {
        int ticketPrice = 510; // цена билета
        int priceForMile = 20; // количество рублей для одной бонусной мили

        int bonusMiles = ticketPrice / priceForMile; // расчитываем количество бонусных миль
        System.out.println(bonusMiles); // выводим результат вычисления миль в консоль

    }
}
