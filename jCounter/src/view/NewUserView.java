/**
 * @author Camille
 * @author Rick
 */
package view;
import controller.Controller;
import library.NewUserActions;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import library.NewUserData;

public class NewUserView implements ActionListener
{
    private JPanel view;
    private JTextField firstName, lastName, weight, targetWeight;
    private JComboBox gender, DOBmonth, DOBday, DOByear, heightFeet, heightInches, activityLevel;
    private NewUserActions newUserAction;
    private JButton btnNext;
    private NewUserData data;

    //arrays to populate comboboxes with
    private String[] genders = {"M", "F"};
    private String[] DOBmonths = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
        "11", "12"};
    private String[] DOBdays = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private String[] DOByears = new String[97];
    private String[] activityLevels = {"Low (less than 30 min/day)",
        "Moderate (about 30 min/day)",
        "High (2 or more hrs/day)"};
    private String[] feetIntegers = {"1","2","3","4","5","6","7","8"};
    private String[] inchesIntegers = {"0","1","2","3","4","5","6","7","8","9","10","11"};

    public NewUserView()
    {
        this.populateDOByearsArray();
        this.initView();
    }

    private void initView()
    {
        view = new JPanel();
        view.setBorder(new EmptyBorder(5, 5, 5, 5));
        view.setLayout(null);

        //labels that do not need to be accessed or changed
        JLabel lblNewUser = new JLabel("New User");
        JLabel lblFirstName = new JLabel("First Name: ");
        JLabel lblLastName = new JLabel("Last Name: ");
        JLabel lblGender = new JLabel("Gender: ");
        JLabel lblDateOfBirth = new JLabel("Date of Birth: ");
        JLabel lblWeight = new JLabel("Weight: ");
        JLabel lblActivityLevel = new JLabel("Activity Level: ");
        JLabel lblWeight_2 = new JLabel("lbs.");
        JLabel lblHeight = new JLabel("Height: ");
        JLabel lblHeight_2 = new JLabel("ft. ");
        JLabel lblHeight_3 = new JLabel("in. ");
        JLabel lblTargetWeight = new JLabel("Target Weight: ");
        JLabel lblTargetWeight_2 = new JLabel("lbs.");

        //itmes that will need to be accessed and/or altered
        firstName = new JTextField();
        lastName = new JTextField();
        gender = new JComboBox(genders);
        DOBmonth = new JComboBox(DOBmonths);
        DOBday = new JComboBox(DOBdays);
        DOByear = new JComboBox(DOByears);
        weight = new JTextField();
        heightFeet = new JComboBox(feetIntegers);
        heightInches = new JComboBox(inchesIntegers);
        activityLevel = new JComboBox(activityLevels);
        targetWeight = new JTextField();
        btnNext = new JButton("Next");

        //setting fonts, bounds, etc. and adding to window
        lblNewUser.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewUser.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        lblNewUser.setBounds(314, 37, 149, 36);
        view.add(lblNewUser);

        lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblFirstName.setBounds(136, 144, 91, 14);
        view.add(lblFirstName);

        lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblLastName.setBounds(440, 144, 80, 14);
        view.add(lblLastName);

        firstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        firstName.setBounds(234, 143, 122, 20);
        firstName.setHorizontalAlignment(SwingConstants.CENTER);
        view.add(firstName);
        firstName.setColumns(10);

        lastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lastName.setBounds(530, 143, 137, 20);
        lastName.setHorizontalAlignment(SwingConstants.CENTER);
        view.add(lastName);
        lastName.setColumns(10);

        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGender.setBounds(136, 245, 80, 14);
        view.add(lblGender);

        gender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        gender.setBounds(211, 244, 56, 20);
        view.add(gender);

        lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDateOfBirth.setBounds(385, 245, 96, 14);
        view.add(lblDateOfBirth);

        DOBmonth.setBounds(479, 244, 56, 20);
        view.add(DOBmonth);

        DOBday.setBounds(545, 244, 56, 20);
        view.add(DOBday);

        DOByear.setBounds(611, 244, 56, 20);
        view.add(DOByear);

        lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblWeight.setBounds(136, 353, 69, 20);
        view.add(lblWeight);

        lblActivityLevel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblActivityLevel.setBounds(136, 463, 101, 20);
        view.add(lblActivityLevel);

        btnNext.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNext.setBounds(354, 566, 89, 36);
        view.add(btnNext);

        weight.setHorizontalAlignment(SwingConstants.CENTER);
        weight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        weight.setBounds(211, 355, 69, 20);
        view.add(weight);
        weight.setColumns(10);

        lblWeight_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblWeight_2.setBounds(290, 353, 46, 20);
        view.add(lblWeight_2);

        lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHeight.setBounds(440, 358, 59, 17);
        view.add(lblHeight);

        heightFeet.setFont(new Font("Tahoma", Font.PLAIN, 14));
        heightFeet.setBounds(509, 355, 45, 20);
        view.add(heightFeet);

        lblHeight_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHeight_2.setBounds(564, 358, 20, 14);
        view.add(lblHeight_2);

        heightInches.setFont(new Font("Tahoma", Font.PLAIN, 14));
        heightInches.setBounds(594, 355, 45, 20);
        view.add(heightInches);

        lblHeight_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblHeight_3.setBounds(649, 358, 46, 14);
        view.add(lblHeight_3);

        activityLevel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        activityLevel.setBounds(234, 465, 154, 20);
        view.add(activityLevel);

        lblTargetWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTargetWeight.setBounds(432, 463, 103, 20);
        view.add(lblTargetWeight);

        targetWeight.setFont(new Font("Tahoma", Font.PLAIN, 14));
        targetWeight.setBounds(542, 465, 69, 20);
        targetWeight.setHorizontalAlignment(SwingConstants.CENTER);
        view.add(targetWeight);
        targetWeight.setColumns(10);

        lblTargetWeight_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblTargetWeight_2.setBounds(621, 468, 46, 14);
        view.add(lblTargetWeight_2);

        //add button listners
        btnNext.addActionListener(this);
    }

    public JPanel getView()
    {
        return view;
    }
    /**
     * Check for data validation, if data is valid
     * add user to the DB and send them over to the Dashboard
     * if the data is bad prompt the user to enter valid data.
     * @param e 
     */

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(newUserAction != null)
        {
            setNewUsersData();
            if (data.isTheDataValid()) 
            {
                newUserAction.addNewUser(data);
                newUserAction.goToTabs();
            } else 
            {
                JOptionPane.showMessageDialog(null, "It looks like you did not fill in one of the fields correctly\n              Please Try again.", "Invalid data", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public void addController(Controller action)
    {
        newUserAction = (NewUserActions) action;
    }

    private void setNewUsersData()
    {
        if (weight.getText().matches("[0-9]+") && weight.getText().length() > 2 && (targetWeight.getText().matches("[0-9]+") && targetWeight.getText().length() > 2)) 
        {
            data = new NewUserData();
            data.setFirstName(firstName.getText());
            data.setLastName(lastName.getText());
            data.setGender(gender.getSelectedItem().toString());
            data.setDOB(DOBmonth.getSelectedItem().toString(), DOBday.getSelectedItem().toString(), DOByear.getSelectedItem().toString());
            data.setWeight(weight.getText());
            data.setHeight(heightFeet.getSelectedItem().toString(), heightInches.getSelectedItem().toString());
            data.setActivityLevel(activityLevel.getSelectedItem().toString());
            data.setTargeWeight(targetWeight.getText());
        }else{
            data = new NewUserData();
            data.setFirstName("");
            data.setLastName("");
            data.setGender("");
            data.setDOB("", "", "");
            data.setWeight("");
            data.setHeight("", "");
            data.setActivityLevel("");
            data.setTargeWeight("");
        }

        data.checkIfValid();
    }

    private void populateDOByearsArray()
    {
        int year = 2006;

        for (int i = 0; i < 97; i++) {
            String yyear = "";
            yyear += year;
            DOByears[i] = yyear;
            year--;
        }
    }
}
