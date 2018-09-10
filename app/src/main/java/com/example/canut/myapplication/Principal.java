package com.example.canut.myapplication;
import java.util.ArrayList;
import java.util.List;

public class Principal {



    public static void main(String arg[]) {
        String a = "Hola";

        try {

            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.charAt(i));
            }

        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Esto siempre se hace");
        }


        //---------------------------------------------------

        List<float> numeros = new ArrayList<Float>();

        numeros.add(3);
        numeros.add(4);

        for(int i=0; i   <
                numeros.size() ; i++){
            int x = numeros.get(i);
            System.out.println(x);

        }




    }
}
