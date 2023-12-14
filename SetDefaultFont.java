import java.awt.Font;
import java.util.Enumeration;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
public class SetDefaultFont {
		public static void setAll(Font newFont) {
			FontUIResource fr = new FontUIResource(newFont);
			Enumeration<Object> keys=UIManager.getDefaults().keys();
			Object key,value;
			while(keys.hasMoreElements()) {
				key=keys.nextElement();
				value=UIManager.get(key);
				if(value instanceof FontUIResource)
					UIManager.put(key,fr);}
			}
}
