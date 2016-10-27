package function.oneleveofabstractionperfunction;

import function.problem.PathParser;
import function.problem.WikiPagePath;

public class Example {
	
	private Object suiteTeardown;

	// It is multiple abstraction 
	WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath (suiteTeardown);
	
	//It is good . Only one level of abstraction
	String pagePathName = PathParser.render(pagePath);
}
