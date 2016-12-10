package lab8;

import java.util.List;

import konstytucja.Article;


public interface IListBuilder {
	//tworzymy liste artykulow
	List<Article> makeList(List<String> file);
	
	void deleteTxtFromArticle(List<Article> articleList);
	
}
