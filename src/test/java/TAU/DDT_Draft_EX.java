package TAU;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DDT_Draft_EX {

    @Test (dataProvider = "logInData")
    public void logIn (String email, String password, boolean expected_R)
    {
        System.out.println("Log In Credentials: " + "\n" +
                "  Email = " + email + "\n" +
                "  Password = " + password + "\n" +
                "  Successful Log In = " + expected_R + "\n" );
    }

    @DataProvider
    public Object [] [] logInData ()
    {
        Object [] [] data = new Object [3] [3];

        data [0] [0] = "TestNG@Framework.com";		data [0] [1] = "TestNG1234";		data [0] [2] = true;
        data [1] [0] = "Joe@Doe.com";				data [1] [1] = "DoeDoe34";			data [1] [2] = false;
        data [2] [0] = "Test@AutomationU.com";		data [2] [1] = "TAU1234";			data [2] [2] = true;

        return data;
    }

}
