import java.lang.*;
import java.net.*;
import java.io.*;

class Client
{
    public static void main(String arg[]) throws Exception
    {
      System.out.println("Client Application is Running");
      String s1,s2;


        Socket sobj = new Socket("localhost",1100);


        BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        PrintStream ps = new PrintStream(sobj.getOutputStream());
        while(!(s1 = brK.readLine()).equals("Good Night"))
        {
           ps.println(s1);
           s2 = br.readLine();
           System.out.println("Server says :"+s2);
           System.out.println("Enter message for Client");
        }
        sobj.close();
        br.close();
        brK.close();
        ps.close();
    }

}