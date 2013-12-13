/**
 * @author Vlad
 * @author Rick
 */
package library;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject
{

    private List<Observer> observers = new ArrayList<>();

    public void Attach(Observer observer)
    {
        observers.add(observer);
    }

    public void Detach(Observer observer)
    {
        observers.remove(observer);
    }

    public void NotifyObservers()
    {
        for (Observer obs : observers)
        {
            obs.Update(this);
        }
    }

    /**
     * @return the observers
     */
    public List<Observer> getObservers()
    {
        return observers;
    }

    /**
     * @param observers the observers to set
     */
    public void setObservers(List<Observer> observers)
    {
        this.observers = observers;
    }
}
