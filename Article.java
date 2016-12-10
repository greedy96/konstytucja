package konstytucja;

import java.util.LinkedList;
import java.util.List;

import lab8.IArticle;

public class Article implements IArticle {

	private int Number;
	private List<String> txt = new LinkedList<>();
	private static List<Integer> chapters = new LinkedList<>();
	
	Article (int Number, String txt){
		this.Number=Number;
		this.txt.add(txt);
	}
	Article (int Number){
		this.Number=Number;
	}
	
	@Override
	public void addTxt(String txt){
		this.txt.add(txt);
	}
	
	@Override
	public List<Integer> getChapter() {
		// TODO Auto-generated method stub
		return chapters;
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return this.Number;
	}
	
	public List<String> getTxt(){
		return this.txt;
	}

	@Override
	public void deletename() {
		for (int i=0; i<this.txt.size(); i++){
			if (this.txt.get(i).toString().endsWith("-")) {
				String nowe1 = this.txt.get(i).toString();
				String nowe2 = this.txt.get(i+1).toString();	
				String [] nowe3 = nowe2.split(" ");
				nowe1 = nowe1.substring(0, nowe1.length()-1);
				nowe1+=nowe3[0];
				int x = nowe3[0].length()+1;
				if (nowe3.length>1){
					nowe2=nowe2.substring(x, nowe2.length());
					this.txt.set(i, nowe1);
					this.txt.set(i+1, nowe2);
				}
				else {
					this.txt.set(i, nowe1);
					this.txt.remove(i+1);
				}
			}
		}
	}

	@Override
	public void deletedate() {
		for (int i=0; i<this.txt.size(); i++){
			if (this.txt.get(i).toString().contains("©Kancelaria Sejmu"))
				this.txt.remove(i);
			if (this.txt.get(i).toString().contains("2009-11-16") )
					this.txt.remove(i);
		}
		
	}

}
