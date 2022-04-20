import java.util.ArrayList;

public class Fifa implements Observed<Game>{
    public ArrayList<Observer<Game>> fans;

    @Override
    public void notifySubscribers(Game newEvent) {
        for (Observer fan : fans)
            fan.update(newEvent);
    }

    @Override
    public void addSubcriber(Observer<Game> newSubscriber) {
        fans.add(newSubscriber);
    }
}
