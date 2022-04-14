package Data;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

    @DataProvider(name = "TEST1_Sheet1")
     public Object [][] GET_EData (){
        String path= "C:\\Users\\metr\\IdeaProjects\\TEST\\Excel\\data.xlsx";
        String SheetName = "Sheet1";
        Object Data [][] =TestData(path,SheetName);
        return Data;
    }

   public  Object[][] TestData (String path,String sheetName){
    Excel_Data excel= new Excel_Data(path,sheetName);
    int RoWCount = excel.getRowCount();
    int ColCount = excel.getColCount();
    Object[][] E_Data = new Object[RoWCount-1][ColCount];

    for (int i=1 ;i<RoWCount;i++)
    {
        for ( int j=0;j<ColCount;j++)
        {
            String data = excel.Get_cell_data_String(i,j);
            System.out.print(data+ "|");
            E_Data[i-1][j]=data;
        }
        System.out.println();
    }
    return E_Data;

}
}
