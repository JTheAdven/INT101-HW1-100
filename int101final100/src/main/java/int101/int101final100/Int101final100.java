package int101.int101final100;

import utilNithikorn.Tool100;
import valuableNithikorn.*;

public class Int101final100 {

    public static void main(String[] args) {
        testTool100();
        testItem100();
    }
    
    static void testTool100() {
        String greet = "Greet";
        String nothing = "";
        
        System.out.println("1.1.a. greet : " + Tool100.isUsable100(greet));
        System.out.println("1.1.b. nothing : " + Tool100.isUsable100(nothing));
        
        String[] s1 = new String[0];
        String[] s2 = new String[3];

        s2[0] = null;
        s2[1] = "";
        s2[2] = "bye";
        
        System.out.println("1.2.a. s1 : " + Tool100.isUsable100(s1));
        System.out.println("1.2.b. s2 : " + Tool100.isUsable100(s2));
        
        System.out.println("1.3.a. s1 : " + Tool100.count100(s1));
        System.out.println("1.3.b. s2 : " + Tool100.count100(s2));
    }
    static void testItem100() {
        System.out.println("2.1-3. " + Item100.create("Jake", 1000));
        
        Object i1 = Item100.create("Jake", 1000);
        Object i2 = Item100.create("John", 2000);
        
        System.out.println("2.4. " + i1.add(i2));
        
        System.out.println("2.5. " + i1.isMatched(i2));
    }
}
