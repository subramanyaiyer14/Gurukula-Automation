package testsel;

public class Gurukulatestcases extends App {

	static App newapp = new App();
	static testmethods testm; 
	
@org.testng.annotations.BeforeClass
public static void setup(){
	
	testm = new testmethods();

}

@org.testng.annotations.Test
public void branchverify() throws InterruptedException {
	
	testm.entityclick(driver);
	testm.branchclick(driver);
	
}

@org.testng.annotations.Test
public void branchcreate() {
	
	testm.entityclick(driver);
	testm.branchclick(driver);
	testm.branchcreate(driver);
	
}

@org.testng.annotations.Test
public void branchsearch() throws InterruptedException {
	
	testm.entityclick(driver);
	testm.branchclick(driver);
	testm.branchsearch(driver);
	
}

@org.testng.annotations.Test
public void branchedit() throws InterruptedException {
	
	testm.entityclick(driver);
	testm.branchclick(driver);
	testm.branchedit(driver);
	
}


@org.testng.annotations.Test
public void staffverify() throws InterruptedException {
	
	testm.entityclick(driver);
	testm.staffcheck(driver);
	
}

@org.testng.annotations.Test
public void staffcreate() throws InterruptedException {
	
	testm.entityclick(driver);
	testm.staffcheck(driver);
	testm.staffcreate(driver);
		
}

@org.testng.annotations.Test
public void staffsearch() throws InterruptedException {
	
	testm.entityclick(driver);
	testm.staffcheck(driver);
	testm.staffsearch(driver);
		
}

@org.testng.annotations.Test
public void staffedit() throws InterruptedException {
	
	testm.entityclick(driver);
	testm.staffcheck(driver);
	testm.staffedit(driver);
		
}


@org.testng.annotations.Test
public void cleardata() {
	
	testm.branchdelete(driver);
	testm.staffdelete(driver);
	
}
	
}
