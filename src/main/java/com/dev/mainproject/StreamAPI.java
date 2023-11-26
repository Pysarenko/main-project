package com.dev.mainproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        StreamAPI streamAPI = new StreamAPI();
//        streamAPI.getSomeMagic(); - на це нажала ctrl+Alt+v:
        List<String> someMagic = streamAPI.getSomeMagic(); //List<String> - тому що public List<String> -
        //System.out.println(someMagic);
        System.out.println(streamAPI.getSomeMagic());
    }
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
