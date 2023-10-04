package bandeau;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BandeauLock extends Bandeau{
    private Lock myLock = new ReentrantLock();

    public void lock(){
        myLock.lock();
    }

    public void unlock(){
        myLock.unlock();
    }
}
