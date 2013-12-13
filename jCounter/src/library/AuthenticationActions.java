/**
 *
 * @author rick
 */
package library;

import java.awt.Component;

public interface AuthenticationActions extends Actions
{
    public boolean validateKey(Key e, Component view);
}
