interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium Plan");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold Plan");
    }
}

class SmartTV implements StreamingService, GamingService {

    String[] movies = {"Avengers", "Inception", "Interstellar"};
    String[] games = {"FIFA 25", "Minecraft", "GTA V"};

    @Override
    public void streamMovie() {
        System.out.println("Available Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void playGame() {
        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class Main {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();
        System.out.println();

        tv.streamMovie();
        System.out.println();

        tv.playGame();
    }
}