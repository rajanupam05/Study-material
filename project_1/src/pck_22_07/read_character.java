package pck_22_07;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read_character 
{
	public void readingcharbychar() throws IOException
	{
		File f=new File("../project_1/testing1.txt");
		FileReader fr=new FileReader(f);
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.print((char)a);
		}
	}
	public static void main(String[] args) throws IOException 
	{
		read_character r=new read_character();
		r.readingcharbychar();
	}

}
