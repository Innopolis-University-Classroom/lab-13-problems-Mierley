import java.util.Scanner;

public class FifaManager {
    private Scanner scanner;
    private Fifa fifa;

    public FifaManager(Scanner scanner, Fifa fifa) {
        this.scanner = scanner;
        this.fifa = fifa;
    }
    public void addGame(Game newGame)
    {
        fifa.notifySubscribers(newGame);
    }
    public void subscriveToPlayStation(Observer<Game> observer)
    {
        fifa.addSubcriber(observer);
    }


}
