package TAU;

import org.testng.annotations.DataProvider;

public class DDT_LoginData {
    @DataProvider(name = "signin-provider")
    public static Object [] [] signInData ()
    {
        Object [] [] data = new Object [3] [3];

        data [0] [0] = "Invalid";		data [0] [1] = "Invalid123";		data [0] [2] = false;
        data [1] [0] = "Admin";			data [1] [1] = "admin123";		     data [1] [2] = true;
        data [2] [0] = "admin";			data [2] [1] = "admin123";			 data [2] [2] = true;

        return data;
    }
}
