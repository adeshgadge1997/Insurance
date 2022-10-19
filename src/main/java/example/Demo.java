package example;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class Demo 
{
	public static final String FC021 = "FC021";
	public static final String FC022 = "FC022";
	public static final String FC023 = "FC023";
	public static final String FC024 = "FC024";
	
	public static final String[] str1 = {"Adesh"};
	
	
	
	
	public static final String[] str = {"FC021","FC022","FC023","FC024"};
	
	public static void main(String[] args) 
	{
		ArrayList<String> codes = new ArrayList<String>();
		codes.add(FC021);
		codes.add(FC022);
		codes.add(FC023);
		codes.add(FC024);
		
		
		for(String str : codes)
		{
			System.out.println(str);
		}
		
	}
	
	
}