package com.concept;

public class Circle implements Shape {
	
	int r = 0;
    double pi = 3.14, ar = 0;
    
    @Override
    public void input()
    {
        r = 5;
    }
    @Override
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }

}
