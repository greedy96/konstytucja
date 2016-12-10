package lab8;

import java.util.LinkedList;
import java.util.List;

public interface IArticle {
	
	List<String> txt = new LinkedList<>();
	
	List<Integer> getChapter();
	
	int getNumber();
	
	void deletename();
	
	void deletedate();

	void addTxt(String txt);
	
	
}
