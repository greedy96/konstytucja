package konstytucja;

import java.io.FileNotFoundException;
import java.util.List;
import konstytucja.Commands;


public class ConstitutionMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader f1 = new FileReader();
		List <String> nowecos = f1.readDate(args[0]);
		ListBuilder f2 = new ListBuilder();
		List<Article> nowecos2= f2.makeList(nowecos);
		
		Commands f3 = new Commands();
		f3.doComands(f3.commands(args,nowecos2.get(0).getChapter()), nowecos2);
	}
}
