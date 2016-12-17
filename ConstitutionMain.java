package lab8;

import java.util.List;



public class ConstitutionMain {

	public static void main(String[] args) {
		
		if(args.length<=1){
			System.out.println("B³êdne wywo³anie programu. Poprawne wywo³anie to: nazwa_pliku numery_artyku³ów i/lub Rozdzia³.numer_rozdzia³u");
		}
		else {
			try{
			FileReader f1 = new FileReader();
			List <String> nowecos = f1.readDate(args[0]);
			if (nowecos.size()!=0){
				ListBuilder f2 = new ListBuilder();
				List<Article> nowecos2= f2.makeList(nowecos);
		
				Commands f3 = new Commands();
				f3.doComands(f3.commands(args,nowecos2.get(0).getChapter()), nowecos2);
			}}
			catch (NumberFormatException | IndexOutOfBoundsException ex){
				
				System.out.println("\n"+ex.getMessage());
			}
			
		}
	}
}
