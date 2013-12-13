/**
 *
 * @author rick
 */
package view;

import library.AuthenticationActions;
import controller.Controller;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import library.Key;

class AuthenticationView implements ActionListener
{
    private JPanel view;
    private GridBagConstraints grid;
    private JPasswordField keyForProgram;
    private JButton start;
    private AuthenticationActions authAction;
    private boolean prompted = false;
    
    public AuthenticationView()
    {
        initView();
    }
    
    private void initView()
    {
        //panel configs
        view = new JPanel();
        view.setLayout(new GridBagLayout());
        
        // layout configs
        grid = new GridBagConstraints();
        grid.anchor = GridBagConstraints.BASELINE_TRAILING;
        
        
        //set to zero no columns or row
        grid.gridx = 0;
        grid.gridy = 0;
        
        
        //column 1 row 1
        //label field
        JLabel id = new JLabel("License #:");
        view.add(id, grid);
        
        // column 2 row 1 password field 
        grid.gridx = 1;
        keyForProgram = new JPasswordField();
        keyForProgram.setPreferredSize(new Dimension(150,20));
        view.add(keyForProgram, grid);
        
        keyForProgram.addKeyListener(new KeyListener() { 
            @Override
            public void keyPressed(KeyEvent e) { 
                if(e.getKeyChar() == KeyEvent.VK_ENTER) { 
                        keyValidation(new String(keyForProgram.getPassword()));
                        prompted = true;
                    }
                } 
            @Override
            public void keyTyped(KeyEvent e) {} 

            @Override
            public void keyReleased(KeyEvent e) 
            {
                if(prompted)
                {
                    prompted = false;
                }
            } 
        });
        
        
        //row 2 column 2 
        grid.gridy++;
        grid.ipady = 4; //internal padding
        grid.insets = new Insets(20,0,0,40);
        //widget configs for button
        start = new JButton("Start");
        view.add(start, grid);
        start.addActionListener(this);
    }
    
    public JPanel getView()
    {
        return view;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(authAction != null || e.getSource() == keyForProgram && keyForProgram != null)
        {
            keyValidation(new String(keyForProgram.getPassword()));
        }

    }

    public void addController(Controller action)
    {
        authAction = (AuthenticationActions) action;
    }
    
    /**
     * Check if the key is not empty if it is prompt the user that there
     * key is empty. Check if it's a valid key, if it is let the user in the system
     * if it is not a valid key then display error about not having correct license number.
     */
    private void keyValidation(String key)
    {
        if(keyForProgram.getPassword().length > 0)
        {
            if(authAction.validateKey(new Key(key),this.getView()))
            {
                
            }else{
                JOptionPane.showMessageDialog(null, "O no, we did not find you in the system\n"
                                                   +"Make sure CAPS lock is off.", "License Incorrect", JOptionPane.WARNING_MESSAGE);
                keyForProgram.selectAll();
            }
        }else{
            JOptionPane.showMessageDialog(null, "License number can not be empty\n"
                                             +"                 Try again.", "License Empty", JOptionPane.WARNING_MESSAGE);
            keyForProgram.selectAll();
        }
    }
}
