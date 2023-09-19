package evoMock;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class EnvExample {

	public boolean checkContent() throws Exception
	{

		Scanner console = new Scanner(System.in);
		String fileName = console.nextLine();
		console.close();

		File file = new File(fileName);
		if(!file.exists())
			return false;

		Scanner fromFile = new Scanner(new FileInputStream(file));
		String fileContent = fromFile.nextLine();
		fromFile.close();
		String date = DateFormat.getDateInstance(DateFormat.SHORT).format(new Date());
		
		System.out.println(date);
		if(fileContent.equals(date))  
			return true;

		return false; 
	} 


	/*public static void main(String[] args) {
		EnvExample e = new EnvExample();
		boolean f =false;
		try {
			f= e.checkContent();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(f);
		
	}*/

}
