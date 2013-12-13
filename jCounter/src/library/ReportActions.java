/**
 *
 * @author Rick
 * 
 */

package library;

import java.awt.Component;

public interface ReportActions extends Actions
{
    public Component getReportView();
    public void reportTab();
    public void customReportView(int days);
}
