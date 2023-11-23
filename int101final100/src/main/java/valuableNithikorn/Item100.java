package valuableNithikorn;

import static utilNithikorn.Tool100.isUsable100;

public class Item100 {
    private final String name;
    private int amount;
    private Item100(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public static Object create(String name, int amount) {
        if(isUsable100(name) && amount > 0) return new Item100(name, amount);
        return null;
    }

    @Override
    public String toString() {
        return String.format("(%s,%d)", name, amount);
    }
    
    public int add(Item100 item) {
        return this.amount += item.amount;
    }
    
    public boolean isMatched(Item100 item) {
        return this.name.equals(item.name);
    }
}
