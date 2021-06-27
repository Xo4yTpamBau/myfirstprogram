package com.company.inter;


import java.util.Arrays;

public class CacheCalculator extends CalculatorV1 implements Calculation {
    private String[] cache = new String[10];
    private int cursor = 0;

    private int getResultAtCache(int a, int b, String type){
        String string = "%d %s %d";
        string = String.format(string, a, type, b);

        for (int i = 0; i < cache.length; i++) {
            if (cache[i] == null) break;
            String s = cache[i];
            String[] s1 = s.split(" ");
            String[] s2 = string.split(" ");
            if (s1[0].equals(s2[0]) && s1[1].equals(s2[1]) && s1[2].equals(s2[2])){
                return Integer.parseInt(s1[3]);
            }
        }
        return -1;
    }


    private void setResultInCache(int a, int b, String type, int result){
        String string = "%d %s %d %d";
        string = String.format(string, a, type, b, result);

        if (cursor == cache.length) cursor = 0;
        cache[cursor++] = string;
    }

    @Override
    public int getResult(int a, int b, String type) {
        int resultAtCache = getResultAtCache(a, b, type);

        if (resultAtCache == -1){
            switch (type) {
                case "sum":
                    int sum = sum(a, b);
                    setResultInCache(a, b, type, sum);
                    return sum;
                case "sub":
                    int sub = sub(a, b);
                    setResultInCache(a, b, type, sub);
                    return sub;
                case "div":
                    int div = div(a, b);
                    setResultInCache(a, b, type, div);
                    return div;
                case "mod":
                    int mod = mod(a, b);
                    setResultInCache(a, b, type, mod);
                    return mod;
            }
            return 0;
        } else {
            return resultAtCache;
        }
    }
}
