package konstytucja;

import java.util.LinkedList;
import java.util.List;
import lab8.IListBuilder;

public class ListBuilder implements IListBuilder {

	@Override
	public List<Article> makeList(List<String> file) {
		List<Article> articleList = new LinkedList<>();
		articleList.add(new Article(0));
		int x=0;
		for (int i = 0; i<file.size(); i++){
			if (file.get(i).toString().startsWith("Rozdzia³ ")){
				articleList.get(0).getChapter().add(x+1);
			}
			
			else if (file.get(i).toString().startsWith("Art. ")){
				x=Integer.valueOf(file.get(i).toString().substring(5).split("\\.")[0]);
				articleList.add(new Article(x, file.get(i))); 
			}
			else {
				articleList.get(x).addTxt(file.get(i));
			}
		}
		articleList.get(0).getChapter().add(x+1);
		deleteTxtFromArticle(articleList);
		return articleList;
	}

	@Override
	public void deleteTxtFromArticle(List<Article> articleList) {
		for (int i=0; i<articleList.size(); i++){
			articleList.get(i).deletedate();
			articleList.get(i).deletename();
		}
		
	}

}
