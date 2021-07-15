public class BasketballCoach implements Coach {

    public String getDailyTraining() {
        return "Play some basket!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
