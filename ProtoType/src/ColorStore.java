import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> map = new HashMap<String, Color>();
        static {
            map.put("red",new RedColor());
            map.put("green",new GreenColor());

    }
    public static Color getColor(String colorName){
            return(Color) map.get(colorName).clone();
    }
}
