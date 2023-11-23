package valuableNithikorn;

import static utilNithikorn.Tool100.*;

public class Container100 {
    private final Item100[] items = new Item100[999];

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= items.length; i++) {
            if(items[i] != null) {
                sb.append(count100(items)).append(" ")
                .append(items[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }
    
    
}
