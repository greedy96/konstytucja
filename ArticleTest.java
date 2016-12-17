package lab8;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArticleTest {

	@Test
	public void test() {
		Article article = new Article(0, "ala ma ko-");
		article.addTxt("ta, ale nie ma ps-");
		article.addTxt("a cos nowe-");
		article.addTxt("go.");
		article.deletename();
		System.out.println(article.getTxt());
	}

}
