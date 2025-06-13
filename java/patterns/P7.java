class P7{
public static void main(String [] args)
{
int i,j;
int t=1;

for (i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
if (t % 2 == 0){
System.out.print("0");
}
else {
System.out.print("1");
}
t++;
}
System.out.println();
}}}