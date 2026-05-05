package au.com.permeance.utility.scriptinghelper.util;

import com.liferay.portal.kernel.language.UTF8Control;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
* Scripting Helper Resource Bundle Implementation.
*/
@Component(
   immediate = true,
   property = {"language.id=en_AU"},
   service = {ResourceBundle.class}
)
public class ScriptingHelperResourceBundle extends ResourceBundle {

   private static Log _log = LogFactoryUtil.getLog(ScriptingHelperResourceBundle.class);

   private final ResourceBundle resourceBundle;

   public ScriptingHelperResourceBundle() {
      this.resourceBundle = ResourceBundle.getBundle("content.Language", UTF8Control.INSTANCE);
   }

   @Activate
   public void activate() {
      _log.info("Scripting Helper resource bundle activated: " + this.resourceBundle.getBaseBundleName());
   }

   @Deactivate
   public void deactivate() {
      _log.info("Scripting Helper resource bundle deactivated: " + this.resourceBundle.getBaseBundleName());
   }

   public Enumeration<String> getKeys() {
      return this.resourceBundle.getKeys();
   }

   protected Object handleGetObject(String key) {
      return this.resourceBundle.getObject(key);
   }

}
