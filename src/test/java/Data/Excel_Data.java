package Data;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Excel_Data {
      FileInputStream file;
      XSSFWorkbook workbook;
      XSSFSheet sheet;

    public Excel_Data(String Path,String SheetName){
        try
        {
            file = new FileInputStream(new File(Path));
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(SheetName);
        }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }

    public  int getRowCount()  {
        int num=0;
        try {
             num = sheet.getPhysicalNumberOfRows();
        }
        catch (Exception e)
        {
            System.out.println((e.getMessage()));
            System.out.println((e.getCause()));
            e.printStackTrace();
        }
        return num ;
    }
    public  int getColCount()  {
        int num =0;
        try {
            num = sheet.getRow(0).getPhysicalNumberOfCells();
        }
        catch (Exception e)
        {
            System.out.println((e.getMessage()));
            System.out.println((e.getCause()));
            e.printStackTrace();
        }
        return num;
    }
    public String Get_cell_data_String (int RowNum , int ColNum)
    { String data ="";
        try {

            data = sheet.getRow(RowNum).getCell(ColNum).getStringCellValue();

        }catch (Exception e)
        {
            System.out.println((e.getMessage()));
            System.out.println((e.getCause()));
            e.printStackTrace();

        }
        return data;
    }
    public void Get_cell_data_ItegerData (int RowNum , int ColNum)
    {
        try {

            int celldata = (int) sheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
            System.out.println(celldata);
        }catch (Exception e)
        {
            System.out.println((e.getMessage()));
            System.out.println((e.getCause()));
            e.printStackTrace();

        }

    }

}
