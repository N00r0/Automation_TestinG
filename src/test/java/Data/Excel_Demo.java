package Data;

public class Excel_Demo {

    public  static void main(String []args)  {
        Excel_Data data= new Excel_Data(
                "C:\\Users\\metr\\IdeaProjects\\TEST\\Excel\\DATA_TEST.xlsx" ,
                "Sheet1");
        System.out.println(data.getRowCount());

    }

}
