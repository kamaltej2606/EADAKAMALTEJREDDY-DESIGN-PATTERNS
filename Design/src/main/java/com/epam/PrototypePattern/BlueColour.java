package com.epam.PrototypePattern;

public class BlueColour extends Colour{
	public BlueColour()  
    { 
        this.colourName = "blue"; 
    } 
   
    @Override
    void addColour()  
    { 
        System.out.println("Blue colour added"); 
    } 
}

