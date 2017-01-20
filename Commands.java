package lab8;

import java.util.LinkedList;
import java.util.List;

public class Commands implements ICommands{

	@Override
	public List<Integer> commands(String[] com, List<Integer> chapters) {
		List<Integer> comList = new LinkedList<>();
		for (int i=1; i<com.length;i++){
			String[] dividecom=com[i].split(",");
			for (int j=0; j<dividecom.length; j++){
				insertToListCom(comList,dividecom[j],chapters);
			}
		}
		return comList;
	}

	private void insertToListCom(List<Integer> comList, String com, List<Integer> chapters) {
		try{
		if(com.toString().toLowerCase().contains("rozdzia³")){
			String [] newcom2 = com.split("\\.");
			if(newcom2.length<2){
				System.out.println("B³êdny wywo³anie argumentu rozdzia³u, poprawne wywo³anie to: Rozdzia³.numer_rozdzia³u\n");
			}
			else{
				int x = toDecimal(newcom2[1]);
				for(Integer i = chapters.get(2-1); i<chapters.get(x); i++){
					comList.add(i);
				}
			}
		}
		else if (com.toString().contains("-")){
			String [] newcom = com.split("-");
			for(Integer i = Integer.valueOf(newcom[0]); i<=Integer.valueOf(newcom[1]); i++){
				comList.add(i);
			}
		}
		else {
			comList.add(Integer.valueOf(com));
		}
		}
		catch (NumberFormatException xs){
			throw new NumberFormatException("B³êdny argument: "+xs);
		}
	}

	@SuppressWarnings("finally")
	private int toDecimal(String string) {
		int decimal=0;
		try{
		for (int i=0; i<string.length(); i++){
			if(string.toLowerCase().charAt(i)=='x'){
				decimal+=10;
			}
			if(string.toLowerCase().charAt(i)=='v'){
				decimal+=5;
			}
			if(string.toLowerCase().charAt(i)=='i'){
				decimal+=1;
			}
			
		}
		if (string.toLowerCase().contains("iv"))
			decimal-=2;
		if (string.toLowerCase().contains("ix"))
			decimal-=2;
		if (decimal == 0) decimal = Integer.valueOf(string);
		}
		catch (NumberFormatException ex){
			System.out.println("B³êdny wywo³anie argumentu rozdzia³u, poprawne wywo³anie to: Rozdzia³.numer_rozdzia³u\n");
		}
		finally{
			return decimal;
		}
	}

	@Override
	public void doComands(List<Integer> coms, List<Article> article) {
		coms.sort(null);
		int last=-1;
		for (Integer com: coms){
			if (com>article.size()-1){
				throw new IndexOutOfBoundsException("Niepoprawny argument: "+com);
			}
			if (last!=com)
				for (int i=0; i<article.get(com).getTxt().size();i++){
					System.out.println(article.get(com).getTxt().get(i));
				}
			last=com;
		}
		
	}

}
