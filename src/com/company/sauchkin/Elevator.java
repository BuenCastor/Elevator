package com.company.sauchkin;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Elevator {
    private int state;
    private int[] in = new int[5];
    private Floor floor;

    public void moveUp(){
        System.out.println("⇑");
    }
    public void moveDown(){
        System.out.println("⇓");
    }

    public void printElevator(){
        System.out.println("________________");
        System.out.println("/-|- FLOOR -|-\\");
        System.out.println("/---|-_____-|---\\");
        System.out.println("________________");
        System.out.println("| " + in[0] + " | " + in[1] + " | " + in[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + in[3] + " | " + in[4] + " | ");
        System.out.println("/---|---|---\\");
    }

}