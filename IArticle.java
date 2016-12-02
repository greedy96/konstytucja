package lab8;

import java.util.LinkedList;
import java.util.List;

public interface IArticle {
	
	List<String> txt = new LinkedList<>();
	
	int getChapter();
	
	int getNumber();
	
	void deletename();
	
	void deletedate();
	
	
}
