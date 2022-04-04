import org.testng.annotations.Test;

public class LoginUsingDiffClass2 {
  @Test(dataProviderClass= LoginUsingDiffClass1.class, dataProvider="loginData")
  public void loginTestDataDisplay(String username, String passwd, String browser, String version) {
	  System.out.println("Username    " + username);
      System.out.println("pwd        " + passwd);
      System.out.println("browser    " + browser);
      System.out.println("vrsn        " + version);  
  }
  
}
