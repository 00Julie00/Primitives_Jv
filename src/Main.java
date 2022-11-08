public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000; //  стоимость авиа билета
        int oneMileBonus = 20; // бонус за 1 милю
        int bonusCalculation = (ticketPrice / oneMileBonus);// расчет бонусных милей за билет
        int bonusMile = bonusCalculation;// итоговый бонус
        System.out.println("Итоговый бонус:" + bonusMile);

    }
}