public class RealMadridFan<Game> implements Observer<Game> {

    @Override
    public void update(Game item) {
        System.out.println("Let watch game!!");
    }
}
