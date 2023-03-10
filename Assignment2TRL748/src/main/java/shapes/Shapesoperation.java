package shapes;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Shapesoperation {
	double triangle;
	double rectangle;
	double circle;
    double length;
    double width;
    double radius;
    double base;
    double height;
    double sidelength;
    static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
    Shapesoperation(double radius)
    {
       this.radius=radius; 
       out.println("Circle Successfully created");
    }
    Shapesoperation(double sidelength,double base,double height)
    {
        this.sidelength=sidelength;
        this.base=base;
        this.height=height;
       out.println("Triangle Successfully created");
    }
    Shapesoperation(double length,double width)
    {
        this.length=length;
        this.width=width;
        out.println("Rectangle Successfully created");
    }
    double area(int choise)
    {
        if(choise==1){
            circle=3.14115* this. radius * this.radius;
           return circle;
        }
        else if(choise==2)
        {

            triangle= 0.5 * this.base * this.height;
            return triangle;
            
        }
        else
        {
        	rectangle=this.length * this.width;
            return rectangle;
        }
       
    }
    double perimeter(int choise)
    {
        if(choise==1)
        {
            circle=2*3.14115*this.radius;
            return circle;
        }
        else if(choise==2)
        {
        	triangle=this.base + this.height+this.sidelength;
            return triangle;
            
        }
        else
        {
        	rectangle=(this.length+this.width)*2;
            return rectangle;
        }
    }
     public void operation(int choice)
     {
    	 Scanner p=new Scanner(System.in);
    	 out.println("Enter your choice 1-area 2-perimeter");
		  int ch=p.nextInt();
		  if(ch==1)
		  {
		     out.println(area(choice));
		  }
		  else if(ch==2)
		  {
			  out.println(perimeter(choice));
		  }
		  else {
			  out.println("Invalid choice!!!");
		  }
     }
       public static void main(String[] args) {
    	Scanner p=new Scanner(System.in);
    	out.println("Enter the radius:");
    	double radius=p.nextDouble();
	   Shapesoperation a1=new Shapesoperation(radius);
	   out.println("Enter the length and base and height :");
	   double length=p.nextDouble();
	   double base=p.nextDouble();
	   double height=p.nextDouble();
	   Shapesoperation a2=new Shapesoperation(length,base,height);
	   out.println("Enter the lenght and width:");
	   double reclength=p.nextDouble();
	   double width=p.nextDouble();
	   Shapesoperation a3=new Shapesoperation(reclength,width);
	   while(true)
	   {
		   out.println("Enter your choice 1-circle 2-Tringle 3-Rectangle");
		   int choice=p.nextInt();
		   switch(choice) {
		   case 1:
		   {
			   a1.operation(choice);
			   break;
		   }
		   case 2:
		   {
			   a2.operation(choice);
			   break;
		   }
		   case 3:
		   {
			   a3.operation(choice);
			   break;
		   }
		   default:
		   {
			   System.exit(0);
		   }
		   }
	   }
	}
}
