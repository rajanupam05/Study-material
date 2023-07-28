package pck_22_07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read_l_by_l 
{
	public void readlinebyline(int initial, int end) throws IOException
	{
		File f=new File("../project_1/testing1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String a;
		while((a=b.readLine())!=null)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) throws IOException {
		read_l_by_l r=new read_l_by_l();
		r.readlinebyline(2,4);
	}
}
