package com.stackroute.pe_5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppearanceOfString {

        //this method is used to check occurrence of string
// value in big paragraph we set value is true if that string appears 2 or more times in the array
        public String checkAppearance(String input){
            if(input==null)return null;
            List<String> stringList= Arrays.asList(input.split("[\\W_]+"));
            Map<String,Integer> map=new HashMap<>();
            for(String each:stringList){
                if(map.containsKey(each)){
                    map.replace(each,map.get(each)+1);
                }else{
                    map.put(each,1);
                }
            }

            // new HashMap for desired output

            Map<String,Boolean> booleanMap=new HashMap<>();
            for(String each:map.keySet()){
                if(map.get(each)>=2){
                    booleanMap.put(each,true);
                }else {
                    booleanMap.put(each,false);
                }
            }
            return booleanMap.toString();
        }
    }

