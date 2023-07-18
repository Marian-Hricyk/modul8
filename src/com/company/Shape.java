package com.company;

public class Shape implements Circle, Quad {



    public String printShape(int nam){
if(nam==1){
    return Circle.nameC;
}

        return Quad.nameQ;
    }
}
