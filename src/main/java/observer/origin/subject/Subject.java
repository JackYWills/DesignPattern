package observer.origin.subject;

import observer.origin.observer.Observer;

/**
 * @Title: DesignPattern
 * @ClassName: Subject
 * @Description:
 * @Author: yanwenjie
 * @Date2019/11/28 17:59
 * @Version V1.0
 **/
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
