/**
 *
 * @author rick
 */
package view;

import controller.Controller;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends AbstractView
{
    private Controller action;
    private JFrame view;
    private AuthenticationView authView;
    
    public View()
    {
        initView();
    }

    private void initView()
    {   
        view = new JFrame("jCounter");
        authView = new AuthenticationView();
        this.addView(authView.getView());
        view.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        view.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e) 
            {
                int reply = JOptionPane.showConfirmDialog(null, "Any unsaved data will be lost. \n Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
                if(reply == JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
            }
	});
        view.setSize(800, 700);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        view.setResizable(false);
    }
    
    @Override
    public void addController(Controller controllerAction)
    {
        action = controllerAction;
        authView.addController(action);
    }
    
    @Override
    public void removeView(Component obj)
    {
        view.remove(obj);
    }
    
    @Override
    public void addView(Component obj)
    {
        view.add(obj);
        view.revalidate();
        view.repaint();
    }
    
    public void redraw()
    {
        view.revalidate();
        view.repaint();
    }
    
}
