/**
 *
 * @author rick
 */
package library;

import java.awt.Component;

public interface TabsActions extends Actions
{
    public void dashboardTab();
    public void foodTab();
    public void reportTab();
    public void updateTab();

    public Component getSelectedTabView();
}
