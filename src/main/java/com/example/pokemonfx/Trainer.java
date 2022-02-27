package com.example.pokemonfx;

import java.util.ArrayList;

/** Application Purpose: Blueprint Class for a Trainer object. Instance variables include the name and an array of Pokémon, as well as their setters and getters
 *  Authour: Mike Rosanelli
 *  Date: November 13th 2021
 *  Time: 1:02 PM
 */

public class Trainer {  //initial class declaration

    //2 instance variables, one for the name, the other is a Pokemon array of length 6
    private String name;
    private ArrayList<Pokemon> mons;

    //constructor that takes no arguments
    public Trainer(){
        mons = new ArrayList<>();
    }

    //setter for the name
    public void setName(String name) {
        this.name = name;
    }

    //setters for the individual elements in the mons array
    public void setMon1(Pokemon mon) {
        mons.set(0, mon);
    }
    public void setMon2(Pokemon mon) {
        mons.set(1, mon);
    }
    public void setMon3(Pokemon mon) {
        mons.set(2, mon);
    }
    public void setMon4(Pokemon mon) {
        mons.set(3, mon);
    }
    public void setMon5(Pokemon mon) {
        mons.set(4, mon);
    }
    public void setMon6(Pokemon mon) {
        mons.set(5, mon);
    }

    public void addMon(Pokemon mon){
        mons.add(mon);
    }

    //getter for the name
    public String getName() {
        return name;
    }

    //getter for the entire mons array
    public ArrayList<Pokemon> getMons(){
        return mons;
    }

    //getters for the individual elements in the mons array
    public Pokemon getMon1() {
        return mons.get(0);
    }
    public Pokemon getMon2() {
        return mons.get(1);
    }
    public Pokemon getMon3() {
        return mons.get(2);
    }
    public Pokemon getMon4() {
        return mons.get(3);
    }
    public Pokemon getMon5() {
        return mons.get(4);
    }
    public Pokemon getMon6() {
        return mons.get(5);
    }

    //method that "heals" the Pokemon by bringing their level and HP values up
    public void healUp(){

        try{
            //increment all the levels by 15
            for (int i = 0; i < mons.size(); i++)
                mons.get(i).setLevel(mons.get(i).getLevel() + 15);

        }
        catch (NullPointerException e){
            //if a null exception occurs, simply ignore and move on
        }

        try{
            //increment all maxHP values by 50
            for (int i = 0; i < mons.size(); i++)
                mons.get(i).setMaxHP(mons.get(i).getMaxHP() + 50);

        }
        catch (NullPointerException e){
            //if a null exception occurs, simply ignore and move on
        }

        try {
            //set the actual HP values to their new value based on the maxHP value. this also basically "heals" any damage taken from last battle
            for (int i = 0; i < mons.size(); i++)
                mons.get(i).setHP(mons.get(i).getMaxHP());

        }
        catch (NullPointerException e){
            //if a null exception occurs, simply ignore and move on

        }

    }
}
