package pck_22_07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import pck_15_7.scanner_condition;

public class assignment_read_particular_row 
{
	public void readdata(int initial,int end) throws IOException
	{
		File f=new File("../project_1/assignmentbody.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String a;
		
		while((a=b.readLine())!=null)
		{
			for(int i=initial;i<end;i++)
			{
				System.out.println(a);
			}
			
		}
		
	}
	public static void main(String[] args) throws IOException 
	{
		assignment_read_particular_row r=new assignment_read_particular_row();
		r.readdata(1,2);
	}
}
