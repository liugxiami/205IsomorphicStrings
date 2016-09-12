package com.ccsi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s="paper";
        String t="title";
        System.out.println(isIsomorphic(s,t));
    }
    //Given two string s and t,determine if they are isomorphic
    //Two strings are isomorphic if the characters in s can be replaced to get t.
    //All occurrences of a character must be replaced with another character while
    //preserving the order of characters.No two characters may map to the same
    //character but a character may map to itself.
    public static boolean isIsomorphic(String s,String t){
        if(s==null||t==null)return false;
        if(s.length()!=t.length())return false;
        Map<Character,Character> map=new HashMap<>();
        Set<Character> set=new HashSet<>();    //注意反查
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)) return false;
            }else{
                if(set.contains(t.charAt(i))) return false;
                map.put(s.charAt(i),t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;
    }
}
