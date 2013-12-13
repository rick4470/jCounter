/**
 *
 * @author rick
 */
package view;

import controller.Controller;
import java.awt.Component;

public abstract class AbstractView 
{
    public abstract void addController(Controller controllerAction);
    public abstract void removeView(Component controllerAction);
    public abstract void addView(Component controllerAction);
}
