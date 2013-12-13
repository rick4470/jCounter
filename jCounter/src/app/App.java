/**
 * @author rick
 * Main entry to the application.
 * Controller becomes aware of the view 
 * the view becomes aware of the controller.
 * Sets the default look and feel for cross platform 
 * components.
 * 
 */
package app;

import controller.AuthenticationController;
import controller.Controller;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.View;

public class App 
{
    public static void main(String[]args)
    {
        try 
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());// Set cross-platform Java L&F (also called "Metal")
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) 
        {
            Logger logger = Logger.getAnonymousLogger();
            logger.log(Level.SEVERE, "Something went wrong in the calorie counter app", e);
        }
            App myApp = new App(); //starts the app
    }

    protected App()
    {
        View myView = new View();
        Controller myController = new AuthenticationController(myView);
        myView.addController(myController); //add them in
    }
}
