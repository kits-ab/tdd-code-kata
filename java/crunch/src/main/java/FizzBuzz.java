import java.util.List;

public class FizzBuzz {
    public static String[] fb(int f, int b,int size) {
        String[] reply = new String[size];
        for (int i = 1; i <= size; i++) {
            String res = "";
            if (i%f == 0) res = "fizz";
            if (i%b == 0) res += "buzz";
            if (res.isEmpty()) res = i + "";
            reply[i-1] = res;
        }
        return reply;
    }
}
