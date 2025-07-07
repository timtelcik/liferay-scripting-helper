package au.com.permeance.utility.scriptinghelper.util;

import com.liferay.portal.kernel.language.UTF8Control;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

   private static final Logger log = LoggerFactory.getLogger(ScriptingHelperResourceBundle.class);

   private final ResourceBundle resourceBundle;

   public ScriptingHelperResourceBundle() {
      this.resourceBundle = ResourceBundle.getBundle("content.Language", UTF8Control.INSTANCE);
   }

   @Activate
   public void activate() {
      log.info("Scripting Helper resource bundle activated: {}", this.resourceBundle.getBaseBundleName());
   }

   @Deactivate
   public void deactivate() {
      log.info("Scripting Helper resource bundle deactivated: {}", this.resourceBundle.getBaseBundleName());
   }

   public Enumeration<String> getKeys() {
      return this.resourceBundle.getKeys();
   }

   protected Object handleGetObject(String key) {
      return this.resourceBundle.getObject(key);
   }

}
