//**************OBJECT ORIENTED PROGRAMMING LANGUAGE*****************
//                           PROJECT-1                                      
//                                                   C.ARAVINDHAN
//                                                    2017103004

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//importing the package
import mypackage.Pack;

//class declaration
public class MyGarden
{
	
//static variable declaration and initialization
	static int a=1;
	String name;
	
//Default constructor
	MyGarden()
	{}
	
//parameterized constructor
	MyGarden(String name)
	{
//usage of this keyword
		this.name=name;	
	}
		public static void main(String[] args)
	{
		Scanner i=new Scanner(System.in);
		
//Object creation for constructors
		MyGarden g1=new MyGarden();
		MyGarden g2=new MyGarden("PARADISE :)\n");
		
//object creation for package	
		Pack g3=new Pack();
		g2.get();
	    g3.display();
	    System.out.println("\nNo. of Gardens I have:"+a);
	    MyGarden g4=new MyGarden(g2);
	    g4.get();
	    
//Array of Objects    
        System.out.println("Total number of Species in my garden:\n");
        Species arr[]=new Species[6];
        arr[0]=new Species(2000,"Flowering Plants");
        arr[1]=new Species(1850,"Non-Flowering Plants");
        arr[2]=new Species(1500,"Ornamental Plants");
        arr[3]=new Species(800,"Desert Plants");
        arr[4]=new Species(450,"Water Plants");
        arr[5]=new Species(990,"Trees\n");
        for(int j=0;j<arr.length;j++)
        {
	        System.out.println(arr[j].c+"\t"+arr[j].s);
        }
        
//composition     
        System.out.println("Adding one more species");
        Species s1=new Species(200,"climbers"); 
        System.out.println(s1.c+"\t"+s1.s);
        
//Class Array for Sorting
        System.out.println("\nThe Species list in sorted order:\n");
        int ar[]= {2000,200,1850,1500,800,450,990};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        
//ArrayList  
        System.out.println("\nSome of the birds in my Garden\n");
        ArrayList<String>birds=new ArrayList<String>(5);
        birds.add("Sparrow");
        birds.add("Peacock");
        birds.add("Crow");
        birds.add("Parrot");
        birds.add("dog");
        System.out.println(birds);
        System.out.println("\nOh! corrected list");
        birds.remove("dog");
        System.out.println(birds);
        
//Enhanced for loop
        int n=5,sum=0;
        int a[] = new int[n];
        System.out.println("\nEnter the no of Rose,Jasmine,Lotus,Marigold,Tulip flowers you want:");
        for(int k:a)
        {
            a[k] = i.nextInt();
            sum = sum + a[k];
        }
        System.out.println("Total flowers you have:"+sum);
        
//Inheritance object
        Birds b=new Birds();
        b.disp();
        
//Abstract class object
        Uses u=new Uses();
        u.properties();
        u.display();
        
//Interface object
        use u1=new use();
        u1.displ();
        
//enumerator
        flower_colours f=flower_colours.White;
        System.out.println("\nMost of the flower colour in my Gardern");
        System.out.println(f);
        
//decision control statements(Using String class)
	    System.out.println("Do you like my garden?");
	    String s=i.next();
	    if(s.equalsIgnoreCase("yes"))
	    {
	     	System.out.println("Thank You! :)\n");
	    }
	    else if(s.equalsIgnoreCase("no"))
	    {
	    	System.out.println("Oh!:( \nSuggest your idea!");
	    	String p;
	    	Scanner o=new Scanner(System.in);
	    	p=o.nextLine();
	    
	    }
	    else
	    {
	    	
	    	System.out.println("Please enter the valid character!");
	    }
	}
		
//Usage of copy constructor
	MyGarden(MyGarden g)
		{
			System.out.println("\nCopying parameterised Constructor:");
			name=g.name;
		}

//using non-access specifier
	final void set(String name)
	{
		this.name=name;
	}
	private void get()
	{
		System.out.println("My Garden name:"+name);		
	}
	
//Static method
	static 
	{
		System.out.println("Hello All! Welcome to my garden!!!");	  
	}
}
class Species
{
	public int c;
	public String s;
	Species(int c,String s)
	{
		this.c=c;
		this.s=s;
	}	
}

//Inheritance
class Animals
{ 
	protected String character;
	protected String specialcharacters;
	void get()
	{   
		Scanner y=new Scanner(System.in);
		System.out.println("Enter the general Characters of the animals:");
		character=y.nextLine();
	}	
}
class Birds extends Animals
{
	void get()
	{
		Scanner z=new Scanner(System.in);
		System.out.println("Enter the Special characters of the birds otherthan animals:");
		specialcharacters=z.nextLine();
	}
	void disp()
	{
		get();
		super.get();
		System.out.println(specialcharacters);
		System.out.println(character);
	}
}

//Abstract class and methods
abstract class Herbs
{
	abstract void properties();
	abstract void display();
}
class Uses extends Herbs
{
	void properties()
	{
		String g;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter any Herb:");
		g=x.nextLine();
	}
	void display()
	{
		System.out.println("Herbs are gernerally short in size.\nThey have high medicinal value.\n"
				+ "It is capable of curing many diseases.");		
	}
}

//Interface class
interface shurb
{
	final int shurb_size=90;
	void displ();
}
class use implements shurb
{
	public void displ()
	{
		System.out.println("\n\nDescription of Shurbs:\n");
		System.out.println("The Shurb's averages height in cm is:"+shurb_size);
		System.out.println("Shurbs are heighter than herbs.\nMany useful shurbs are found in my garden.\n"
				+ "They are usually found in dry areas");
	}	
}

//Enumeration
enum flower_colours
{
	Red,Pink,Yellow,White;
}

