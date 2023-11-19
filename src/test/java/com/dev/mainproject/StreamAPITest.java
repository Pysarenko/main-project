package com.dev.mainproject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StreamAPITest {

    @Test
    void someTest(){
   StreamAPI streamAPI =  new StreamAPI();
  List<String>  result = streamAPI.getSomeMagic();
  assertTrue(result.size()==5);
  assertTrue(result.get(0).equals("aA"));
  
    }


}