package com.company;

public class Figur extends Shape {

    public void figur() {
        System.out.print("1.Triangle");
        System.out.print("2.Diamant");
        System.out.print("3.Trapeze");
        System.out.print("4.Circle");
        System.out.print("5.Quad");
    }


    @Override
    public String printShape(int nam) {
        switch (nam) {
            case 1:
                return Triangle.nameT;
            case 2:
                return Diamant.nameD;
            case 3:
                return Trapeze.nameTr;
            case 4:
                return Circle.nameC;
            case 5:
                return Quad.nameQ;
        }
        return null;
    }

}
