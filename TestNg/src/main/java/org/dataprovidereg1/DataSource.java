package org.dataprovidereg1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataSource {

	@DataProvider(name="data")
	public static Object[][] source(Method method){
		String name = method.getName();
		if ("method1".equals(name)) {
			return new Object[][] {{"Method 1 Datas"}};
		} else if ("method2".equals(name)) {
			return new Object[][] {{"Method2 Datas"}};
		}else {
			return new Object[][] {{"Method3 Datas"}};
		}
	}
}
