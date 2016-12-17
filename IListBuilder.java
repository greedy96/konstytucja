package lab8;

import java.util.List;

import lab8.Article;


public interface IListBuilder {
	//tworzymy liste artykulow
	List<Article> makeList(List<String> file);
	
	void deleteTxtFromArticle(List<Article> articleList);
	
}
