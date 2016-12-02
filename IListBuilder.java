package lab8;

import java.util.List;


public interface IListBuilder {
	//tworzymy liste artykulow
	List<IArticle> makeList(List<String> file);
	
	void deleteTxtFromArticle(List<IArticle> arts);
	
}
