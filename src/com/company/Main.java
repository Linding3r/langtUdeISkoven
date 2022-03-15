package com.company;

public class Main {

    public void verse1(){
        System.out.println("\nLangt ud' i skoven lå et lille bjerg,");
        System.out.println("aldrig så jeg så dejligt et bjerg.");
        chorusEnd();
    }
    public void verse2(){
        System.out.println("\nPå det lille bjerg der stod et lille træ,");
        System.out.println("aldrig så jeg så dejligt et træ.");
        chorus1();
    }
    public void verse3(){
        System.out.println("\nPå det lille træ der sad en lille gren,");
        System.out.println("aldrig så jeg så dejlig en gren.");
        chorus2();
    }
    public void verse4(){
        System.out.println("\nPå den lille gren der sad en lille kvist,");
        System.out.println("aldrig så jeg så dejlig en kvist.");
        chorus3();
    }
    public void verse5(){
        System.out.println("\nPå den lille kvist der sad et lille blad,");
        System.out.println("aldrig så jeg så dejligt et blad.");
        chorus4();
    }
    public void verse6(){
        System.out.println("\nPå det lille blad der var en lille rede,");
        System.out.println("aldrig så jeg så dejlig en rede.");
        chorus5();
    }
    public void verse7(){
        System.out.println("\nI den lille rede var et lille æg,");
        System.out.println("aldrig så jeg så dejligt et æg.");
        chorus6();
    }
    public void verse8(){
        System.out.println("\nAf det lille æg der kom en lille fugl,");
        System.out.println("aldrig så jeg så dejlig en fugl.");
        chorus7();
    }
    public void verse9(){
        System.out.println("\nPå den lille fugl der sad en lille fjer,");
        System.out.println("aldrig så jeg så dejlig en fjer.");
        chorus8();
    }
    public void verse10(){
        System.out.println("\nAf den lille fjer der blev en lille pude,");
        System.out.println("aldrig så jeg så dejlig en pude.");
        chorus9();
    }
    public void verse11(){
        System.out.println("\nPå den lille pude lå en lille dreng,");
        System.out.println("aldrig så jeg så dejlig en dreng.");
        chorus10();
    }
    public void chorus1(){
        System.out.println("Træet på bjerget.");
        chorusEnd();
    }
    public void chorus2(){
        System.out.println("Grenen på træet.");
        chorus1();
    }
    public void chorus3(){
        System.out.println("Kvisten på grenen.");
        chorus2();
    }
    public void chorus4(){
        System.out.println("Bladet på kvisten.");
        chorus3();
    }
    public void chorus5(){
        System.out.println("Reden på bladet.");
        chorus4();
    }
    public void chorus6(){
        System.out.println("Ægget i reden.");
        chorus5();
    }
    public void chorus7(){
        System.out.println("Fuglen af ægget.");
        chorus6();
    }
    public void chorus8(){
        System.out.println("Fjeren på fuglen.");
        chorus7();
    }
    public void chorus9(){
        System.out.println("Puden af fjeren.");
        chorus8();
    }
    public void chorus10(){
        System.out.println("Drengen på puden.");
        chorus9();
    }
    public void chorusEnd() {
        System.out.println("Bjerget ligger langt ud' i skoven");
    }


    public void sing(){
       verse1();
       verse2();
       verse3();
       verse4();
       verse5();
       verse6();
       verse7();
       verse8();
       verse9();
       verse10();
       verse11();
    }

    public static void main(String[] args) {


        Main song = new Main();
        song.sing();

    }
}
