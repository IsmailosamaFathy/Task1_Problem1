package Calc;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double sun=865000;
		double earth=7600;
        double Sun_volume=0;
        double earth_volume=0;
        
        sun=sun/2;
        
       
        
        Sun_volume=Math.pow(sun, 3);
        
        Sun_volume=4*Math.PI*Sun_volume;
        
        Sun_volume=Sun_volume/3;
        
        System.out.println("The volume of the sun is Y cubic miles: "+Sun_volume+" cubic miles");
        
        
        earth=earth/2;
        
        earth_volume=Math.pow(earth, 3);
        
        earth_volume=4*Math.PI*earth_volume;
        
        
        earth_volume=earth_volume/3;
        
        System.out.println("The volume of the Earth is X cubic miles: "+earth_volume+" cubic miles");
        
        System.out.println("The ratio of the volume of the Sun to the volume of the Earth is : "+(sun/earth));
        
        
        
        
	}

}
