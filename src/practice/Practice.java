package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

public class Practice{
	public static void main(String[] args) throws IOException {
		puk("stark.txt");
		
	}
	
	private static void puk(String du) throws IOException {
		FileOutputStream fl = new FileOutputStream(du);
		ObjectOutputStream ot = new ObjectOutputStream(fl);
		System.out.println("mass nae");
		String dua = "mass of all time";
		ot.writeObject(dua.getBytes());
		ot.close();
	}
	
	
	private static void CFil(String name) throws IOException {
		File fl = new File(name);
		boolean res = fl.createNewFile();
		
		if(res){
		System.out.println("super bro");
		}else {
			System.out.println("mbu vro");
		}
		
		FileWriter wr = new FileWriter(fl);
		
		wr.write("Enna vazha vidu nae");
		
		wr.append( " pee siva");
		wr.close();
		fl.createNewFile();
	}
}
