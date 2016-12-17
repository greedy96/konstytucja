package lab8;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import lab8.IFIleReader;

public class FileReader implements IFIleReader{

	@SuppressWarnings("finally")
	@Override
	public List<String> readDate(String file) {
		List<String> konstytucja = new LinkedList<>();
		try(Scanner odczyt = new Scanner(new File(file))){
			;
			while (odczyt.hasNextLine()){
				konstytucja.add(odczyt.nextLine());
			}
		}
		catch(IOException ex){
			System.out.println("Problem z odczytem pliku:  " + ex.getMessage());
		}
		finally{
			return konstytucja;
		}
	}

}
