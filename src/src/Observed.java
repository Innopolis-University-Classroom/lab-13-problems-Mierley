public interface Observed<T> {
    void notifySubscribers(T newEvent);
    void addSubcriber(Observer<T> newSubscriber);
}
