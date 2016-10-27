package function.small;

import function.problem.PageData;

public class Example {

	public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws Exception {
		if (isTestPage(pageData))
			includeSetupAndTeardownPages(pageData, isSuite);
		return pageData.getHtml()
	}

	private static boolean isTestPage(PageData pageData) {
		// TODO Auto-generated method stub
		return false;
	}

	private static void includeSetupAndTeardownPages(PageData pageData, boolean isSuite) {
		// TODO Auto-generated method stub

	}
}
