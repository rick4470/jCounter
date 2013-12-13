/**
 *
 * @author rick
 */
package controller;

import library.Actions;
import java.awt.Component;
import view.View;

public class Controller extends AbstractController implements Actions
{
    private final View myView;
    
    public Controller(View view)
    {
        myView = view;
    }
    
    public View getView()
    {
        return myView;
    }
    @Override
    public void removeView(Component obj)
    {
        myView.removeView(obj);
    }
    @Override
    public void addView(Component obj)
    {
        myView.addView(obj);
    }
}
