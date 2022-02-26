import java.util.*;
import java.io.*;
class 3nameadr
{
public static void main(String[] args) throws Exception
    {
    try
    {
    Scanner sc = new Scanner(System.in);
    FileWriter fw = new FileWriter("exp2.txt");
    String name = sc.nextLine();
    String address = sc.nextLine();
    fw.write(name+"\n");
    fw.write(address);
	fw.close();
	FileReader fr = new FileReader("exp2.txt");
    int ch;
    while((ch=fr.read())!=-1)
        {
        System.out.print((char)ch);
        }
    
    fr.close();
    }
    catch(Exception e){System.out.println(e);}
    }
}
