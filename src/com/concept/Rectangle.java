package com.concept;

public class Rectangle implements Shape {
	
	int l = 0, b = 0;
    double ar;
    
    @Override
    public void input()
    {
       
        l = 6;
        b = 4;
    }
    @Override
    public void area()
    {
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
    }

}
