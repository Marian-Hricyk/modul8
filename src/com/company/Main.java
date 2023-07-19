package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        int name=0;
        Scanner scanner=new Scanner(System.in);
   Figur figur=new Figur();
   figur.figur();
   name=scanner.nextInt();
   System.out.print(figur.printShape(name));

    }
}


