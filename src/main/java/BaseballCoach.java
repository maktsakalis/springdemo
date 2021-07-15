public class BaseballCoach implements Coach {

    private String emailAddress;
    private String type;

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

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getType() {
        return type;
    }
}
