package com.dev.mainproject;

public class StreamAPI {


    public List<String> getSomeMagic(){
        List<String> a = List.of("A", "B", "C", "D", "E");
        List<String> lower = new ArrayList<>();
        for(int i=0; i<a.size();i++){
            String y =  a.get(i);
            lower.add(y.toLowerCase());
        }
        for (String s: a) {
            lower.add(s.toLowerCase());
        }
        return a.stream().map(String::toLowerCase).map(s -> s+s.toUpperCase()).collect(Collectors.toList());
    }

}
