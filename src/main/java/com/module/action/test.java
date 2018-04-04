package com.module.action;

import java.util.HashMap;
import java.util.Map;

public class test
{
    static Map<Integer,String> rc = new HashMap<Integer,String>();
    static {
        rc.put(0,"1");
        rc.put(1,"0");
        rc.put(2,"X");
        rc.put(3,"9");
        rc.put(4,"8");
        rc.put(5,"7");
        rc.put(6,"6");
        rc.put(7,"5");
        rc.put(8,"4");
        rc.put(9,"3");
        rc.put(10,"2");
    }
    public static void main(String[] args){
    String idCard = "340826198707078728";
        // TODO idCard 倒序
        idCard= new StringBuffer(idCard).reverse().toString();
    char[] cs= idCard.toCharArray();
 int rcValue = 0 * 2;
    for(int i = 1;i<18;i++){
int sna= 2<< (i-1);
int ci = Integer.valueOf(String.valueOf(cs[i]));
        rcValue =rcValue+ ci * sna ;
    }
    int yu = rcValue%11;
       System.out.println(rc.get(yu));
    }

}
