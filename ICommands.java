package lab8;

import java.util.List;

import konstytucja.Article;

public interface ICommands {
	//wczytyuje  komendy
	List<Integer> commands(String[] com, List<Integer> chapters);
	
	void doComands(List<Integer> com, List<Article> article);
}
