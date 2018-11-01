package pack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class TestClass {
	@RunWith (Suite.class)
	@SuiteClasses ({MassiveTest.class})
	public class TestRunner{
	}
}
