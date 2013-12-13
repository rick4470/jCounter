/**
 *
 * @author rick
 */
package controller;

import library.Actions;
import java.awt.Component;

public abstract class AbstractController implements Actions
{

    @Override
    public void removeView(Component obj){}

    @Override
    public void addView(Component objw){}
    
}
