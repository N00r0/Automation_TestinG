package TAU;

import org.testng.annotations.Test;

public class Groups_Ex {
    @Test(groups = "smoke")
    public void LogIn ()
    {
        System.out.println("1. Log In / Group = smoke" + "\n");
    }

    @Test (groups = { "smoke", "regression" } )
    public void SearchProducts ()
    {
        System.out.println("2. Search Products / Group = smoke, regression" + "\n");
    }

    @Test (groups = { "regression", "confirmation" } )
    public void PlaceOrder ()
    {
        System.out.println("3. Place Order / Group = regression, confirmation" + "\n");
    }

    @Test (groups = { "confirmation" } )
    public void  SendConfirmation ()
    {
        System.out.println("4. Send Confirmation / Group = confirmation" + "\n");
    }

    @Test (groups = { "regression"} )
    public void ShipOrder ()
    {
        System.out.println("5. Ship Order / Group = regression" + "\n");
    }

    @Test
    public void LogOut ()
    {
        System.out.println("6. Log Out / Group = None" + "\n");
    }
}
