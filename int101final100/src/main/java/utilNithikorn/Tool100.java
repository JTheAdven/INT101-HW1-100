package utilNithikorn;

public final class Tool100 {
    public static boolean isUsable100(String s) {
        if(s.isBlank() && s == null) return false;
        return true;
        //return s != null && !s.isBlank();
    }
    
    public static boolean isUsable100(Object[] o) {
        if(o.length <= 0 && o == null) return false;
        return true;
        //return o !- null && o.length > 0;
    }
    
    public static int count100(Object[] o) {
        if(!isUsable100(o)) return -1;
        int count = 0;
        for (Object object : o) {
            if(object != null) count++;
        }
        return count;
    }
}
