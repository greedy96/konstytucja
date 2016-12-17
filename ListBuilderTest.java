package lab8;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ListBuilderTest {

	@Test
	public void test() {
		List<String> string = new LinkedList<>();
		ListBuilder f1 = new ListBuilder();
		string.add("Art. 31.\ncostamcostam");
		string.add("Art. 12.\ncostamcostam");
		string.add("Art. 12.\ncostamcostam");
		System.out.println(f1.makeList(string).size());
	}

}
