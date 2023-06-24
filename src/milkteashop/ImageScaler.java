package milkteashop;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageScaler {
    private Map<Icon, ImageIcon> scaledImages;
    
    public ImageScaler() {
        scaledImages = new HashMap<>();
    }

    public void stretchImage(JLabel label) {
        Icon icon = label.getIcon();
        if (icon == null) {
            return; // No icon to scale
        }

        ImageIcon scaledIcon = scaledImages.get(icon);
        if (scaledIcon == null || isSizeChanged(label, scaledIcon)) {
            
            Image image = ((ImageIcon) icon).getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            scaledIcon = new ImageIcon(image);
            scaledImages.put(icon, scaledIcon);
        }

        label.setIcon(scaledIcon);
    }

    private boolean isSizeChanged(JLabel label, ImageIcon icon) {
        int iconWidth = icon.getIconWidth();
        int iconHeight = icon.getIconHeight();
        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();

        return iconWidth != labelWidth || iconHeight != labelHeight;
    }
}
