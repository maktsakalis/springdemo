public class BaseballCoach implements Coach {

    private final FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyTraining() {
        return "Run to the base!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortuneMessage();
    }
}
