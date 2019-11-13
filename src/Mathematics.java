import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mathematics {


    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public byte sum(byte a, byte b) {
        return (byte) (a + b);
    }

    public short sum(short a, short b) {
        return (short) (a + b);
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public String sum(String a, String b) {
        return a + b;
    }

    public int[] sum(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        System.arraycopy(a, 0, res, 0, a.length);
        System.arraycopy(b, 0, res, a.length, b.length);
        return res;
    }
    public List sum (List a, List b){
        List res = new ArrayList();
        res.addAll(a);
        res.addAll(b);
        return res;
    }
    public Map sum(Map a, Map b){
        Map res = new HashMap();
        res.putAll(a);
        res.putAll(b);
        return res;
    }
}
