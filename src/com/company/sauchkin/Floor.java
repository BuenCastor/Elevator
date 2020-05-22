package com.company.sauchkin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Floor {
    private int [] floor = new int[(int) (Math.random()*20)+5];
    private int [] persons;
    public Elevator elevator;
}