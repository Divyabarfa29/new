class Demp5
{
public static void main(String ar[])
{
int i,j,c,a=1,b=1;
for(i=1;i<=25;i++)
{
c=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
   c=1;
   }
   }
   if(c==1)
   {
   System.out.print(i);
   
   if(a==b)
   {
   System.out.println();
   a=0;
   b++;
   }
  a++;
  }
  }
  }
}