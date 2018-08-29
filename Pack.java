package mypackage;

//Class declaration
public class Pack 
{
public void display()
{
	
	System.out.printf("*************DESCRIPTION OF MY GARDEN**************\n\n"
			+ "->My gardern contains beautiful flowers and trees."
			+ "\n->Beautiful birds chirping all around the majestic trees."
			+ "\n->Some of the Species and their Scientific names are listed below:\n\n");
	
//2D Array declaration and initialization
String[][]names=
{
		{"\t*Mango\t-","\t*Tulip\t-","\t*Jasmine-"},{"Magnifera Indica","Tulipa","Jasminum"}
};
		System.out.println(names[0][0]+names[1][0]);
		System.out.println(names[0][1]+names[1][1]);
		System.out.println(names[0][2]+names[1][2]);
		}
}


