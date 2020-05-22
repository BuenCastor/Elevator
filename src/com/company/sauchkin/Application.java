package com.company.sauchkin;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

public class Application {
    @SneakyThrows
    public static void run(){
        int x;
        int s = 1;
        Floor floor = new Floor();
        Floor persons = new Floor();
        Elevator state = new Elevator();
        Elevator in = new Elevator();
        persons.setPersons(new int[(int) (Math.random()*10)]);


        System.out.println("< - EMPLOYEES INCLUDED LIFT OPERATION FROM A RANDOM FLOOR - >");
        TimeUnit.SECONDS.sleep(2);

        x = floor.getFloor().length;


        for (int i = 0; i < in.getIn().length; i++){
            in.getIn()[i] = 1;
        }
        int n;

        while (in.getIn().length > 0){
            n = ((int) (Math.random() * 4));
            state.setState(in.getIn()[n]);

            if(state.getState() > s){
                state.moveUp();
            } else if (state.getState() < s){
                state.moveDown();
            } else {
                System.out.println("< - TEMPORARY STOP - >");
            }

            s = state.getState();
            TimeUnit.SECONDS.sleep(2);

            if (state.getState() > 0){
                System.out.println("ELEVATOR HAVE ARRIVED TO "+ state.getState() + " FLOOR!");
                for (int i = 0; i < in.getIn().length; i++){
                    if (in.getIn()[i] == 0 || in.getIn()[i] == state.getState()) {
                        for (int k=0; k<persons.getPersons().length; k++) {
                            persons.getPersons()[k] = ((int) (Math.random() * x) + 1);
                            in.getIn()[i] = persons.getPersons()[k];
                        }
                    }
                }
                in.printElevator();
            }
        }
    }

}
