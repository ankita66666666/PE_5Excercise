package com.stackroute.pe_5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FrequencyOfString {

        //    Map<String,Integer> as key value pair.
        //        Input : String str = “one one -one___two,,three,one @three*one?two”;
//        Output : {"one":5 , "two":2, "three" :2}
        public String checkFrequency(String input) {
            if (input == null) return null;
            List<String> stringList = Arrays.asList(input.split("[^\\W_]+"));
            Map<String, Integer> map = new HashMap<>();
            for (String each : stringList) {
                if (map.containsKey(each)) {
                    map.replace(each, map.get(each) + 1);
                } else {
                    map.put(each, 1);
                }
            }
            return map.toString();
        }


    }



