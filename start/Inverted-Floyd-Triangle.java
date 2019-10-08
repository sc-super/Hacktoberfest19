/* Program for Inverted Floyd Triangle*/
import java.util.*;
class InvFloydTriangle
{
public static void main(String args [])
{
Scanner inp=new Scanner(System.in);
System.out.print("\n Enter Any Character: ");
char c=((inp.nextLine()).charAt(0));
System.out.print("\n Enter Size Limit: ");
int n=inp.nextInt();
int i,j,k;
System.out.println("Inverted Floyd Triangle: \n");
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
  System.out.print(c);
System.out.println();
}

}
}
