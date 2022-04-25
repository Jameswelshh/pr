import java.util.*;
class optimization
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of productions");
int n =sc.nextInt();
sc.nextLine();
LinkedHashMap <String,Integer> hsh = new LinkedHashMap<String,Integer>();
int cnt=1;
System.out.println("Enter Production Rules :");
for(int i=0;i<n;i++)
{
String r = sc.nextLine();
int l = r.indexOf("=");
String c = r.substring(l+1);
if(hsh.containsKey(c))
continue;
else{
hsh.put(c,cnt);
cnt++;
}
}
System.out.println("Optimized Code is :");
for(Map.Entry<String,Integer>it:hsh.entrySet())
{
System.out.println("t"+it.getValue()+"="+it.getKey());
}
}
}