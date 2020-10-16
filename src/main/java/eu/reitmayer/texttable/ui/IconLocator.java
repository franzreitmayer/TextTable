package eu.reitmayer.texttable.ui;

import java.util.Hashtable;

import javax.swing.ImageIcon;

public class IconLocator {
    
    private static IconLocator instance = null;
   
    public static IconLocator getInstance() {
            if (instance  == null) {
                    instance = new IconLocator();
            }
            return instance;
    }
   
    private final String CLASSAPTH_PREFIX = "img/";
   
    private Hashtable<String, ImageIcon> cache = null;
   
    private IconLocator() {
            cache = new Hashtable<String, ImageIcon>();
    }
   
    public ImageIcon getIcon(String name) {
            ImageIcon icon = cache.get(name);
            if (icon == null) {
                    ClassLoader cl = this.getClass().getClassLoader();
                    icon = new ImageIcon(cl.getResource(CLASSAPTH_PREFIX + name));
                    cache.put(name, icon);
            }
            return icon;
    }
}
