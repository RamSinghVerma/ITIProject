package cpiti;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExceldemo {
 
    public static void main(String[] args) {
      // new ReadExceldemo().uploadFile("F:\\CPITI.xlsx","staff", null);
      new ReadExceldemo().uploadFile("C:\\Users\\windows7\\Desktop\\CPITI-Fees.xlsx","Fee Details", null);
    }
    
    Object[][] uploadFile(String filePath,String sheetName,String columnName[]){
        int countRow=countRow(filePath,sheetName);
        int countCols=countCols(filePath,sheetName);
        Object fa[][]=new Object[countRow][countCols];
        try
        {
            FileInputStream file = new FileInputStream(new File(filePath));
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
         // XSSFSheet sheet = workbook.getSheetAt(5);
            XSSFSheet sheet = workbook.getSheetAt(workbook.getSheetIndex(sheetName));
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator = sheet.iterator();
             int iterate=0;
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();  
             int colIndex=0;
                while (cellIterator.hasNext()) 
                { 
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) 
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            
                             if (DateUtil.isCellDateFormatted(cell) && colIndex!=1) {
                            String dateFormat = new SimpleDateFormat("dd-MMM-yyyy").format(cell.getDateCellValue());
                           System.out.print(cell.getDateCellValue() + "\t\t");
                              fa[iterate][colIndex]=new SimpleDateFormat("dd-MMM-yyyy").parse(dateFormat);
                             } else{
                        System.out.print(new DataFormatter().formatCellValue(cell) + "\t");
                          fa[iterate][colIndex]=(Object)new DataFormatter().formatCellValue(cell);}
                           break;
                        case Cell.CELL_TYPE_STRING:
                          System.out.print(cell.getStringCellValue() + "\t");
                          if(!cell.getStringCellValue().isEmpty())
                           fa[iterate][colIndex]=(Object)cell.getStringCellValue();
                          else{
                              fa[iterate][colIndex]=null; System.out.print(cell.getStringCellValue() + "\t\t\t");}
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            System.out.print(cell.getStringCellValue() + "\t\t\t");
                            fa[iterate][colIndex]=null;
                            break;
                        
                    }
               colIndex++;    
               }
                System.out.println("");
                iterate++;
            }
           file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
//        try{
//        for(int x=0;x<countRow;x++){
//            for(int y=0;y<countCols;y++)
//                if(y==1)
//                System.out.print(fa[x][y]+""+"\t");
//            else
//                System.out.print(fa[x][y]+"\t");
//            System.out.println("");}}catch(Exception e){e.printStackTrace();}
     return fa;   
    }
public int countRow(String filePath,String sheetName){
   int row=0,sh=0;
   try{
   FileInputStream file = new FileInputStream(new File(filePath));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(workbook.getSheetIndex(sheetName));   
            row=sheet.getPhysicalNumberOfRows();
            sh=sheet.getLastRowNum();
       }catch(Exception e){e.printStackTrace();}  
   System.out.println("  row="+row);
    return row;
}    
public int countCols(String filePath,String sheetName){
   int noOfColumns=0;
   try{
   FileInputStream file = new FileInputStream(new File(filePath));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(workbook.getSheetIndex(sheetName));   
            noOfColumns=sheet.getRow(0).getPhysicalNumberOfCells();
             System.out.println("  noOfColumns="+noOfColumns);
           }catch(Exception e){e.printStackTrace();} 
    return noOfColumns;
}
    
    
}
