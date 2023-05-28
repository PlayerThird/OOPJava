package Hm7.observer;

/**
 * Интерфейс наблюдателя(соискателя)
 */
public interface Observer {
    void reciveOffer(String companyName, double salary, String nameVak);
}
