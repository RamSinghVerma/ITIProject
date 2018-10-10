/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpiti;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.lowagie.text.Font;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.JFileChooser;

/**
 *
 * @author windows7
 */
public class CPITI {

    public static void main(String[] args) {
// Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
//      	sc.close();
//        // 9 -100 50 0 56.6 90 0.12 .12 02.34 000.000
//         for (int i = 0; i < n; i++) 
//        {
//            for (int j = i + 1; j < n; j++) 
//            {
//                if (new BigDecimal(s[i]).compareTo(new BigDecimal(s[j]))<0 )
//                {
//                  String  temp = s[i];
//                    s[i] = s[j];
//                    s[j] = temp;
//                }
//            }
//        }
//         System.out.println("================output=======================");
//         for(int i=0;i<n;i++)
//        {
//            System.out.println(s[i]);
//        }
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        
         
         
    }
    
    

   
  
    private void wholePart(){
       try{ Document document=new Document(PageSize.A4, 20,20,20,20);
            PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream(new File("newDemo.pdf")));
            document.open();
          //  document.setMargins(10, 10, 5, 5);
            PdfPTable table2=new PdfPTable(1);
            table2.setWidthPercentage(100);
            PdfPCell cell2;//=new PdfPCell(new Phrase(""));
//            cell2.setBorder(0);
//            table2.addCell(cell2);
            
            PdfPTable table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
            part1(table);
            cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(6);
           cell2.setPaddingTop(6);
            table2.addCell(cell2);
                      table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
            part2(table);
            cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(6);
           cell2.setPaddingTop(6);
            table2.addCell(cell2);
            table=new PdfPTable(new float[]{.5f,1,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.25f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f,.5f});
            table.setWidthPercentage(100);
            part3(table);
             cell2=new PdfPCell();
            cell2.addElement(table);
           cell2.setPaddingBottom(6);
           cell2.setPaddingTop(6);
            table2.addCell(cell2);
            document.add(table2);
            document.close();
            Desktop.getDesktop().open(new File("newDemo.pdf"));
            }catch(Exception e){}
    }
    private void part1(PdfPTable table){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Student Copy",FontFactory.getFont(null,8,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Reciept no and Date",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("ID No."+"    Semester",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Trade."+"    Section",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"   Rupees   ","                  Particulars               ","SNo."};
            String contents[]={"Tuition fees","Admission Fees","WorkShop Fees","Examination Fees","Computer Fees","I. Card Fees","Library Fees","Sports","Caution Money","","",""};
            float value1[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<13;y++){
            if(x==0){    
            cell=new PdfPCell(new Phrase(y+"",FontFactory.getFont(null,10,Font.NORMAL)));
            if(y==12)
             cell=new PdfPCell(new Phrase("total",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            }
            if(x==1 && y!=12){
            cell=new PdfPCell(new Phrase(contents[y],FontFactory.getFont(null,10,Font.NORMAL)));
            }
            if(y==12 && x==1){
            cell=new PdfPCell(new Phrase("Grand Total",FontFactory.getFont(null,11,Font.BOLD)));    
            cell.setRowspan(2);
            }
            if(x==2){
                cell=new PdfPCell(new Phrase(y+1+"",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);}
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            if(x==0 && y==12){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees)",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("(In Words)",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
    
    private void part2(PdfPTable table){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Institute Copy",FontFactory.getFont(null,8,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Reciept no and Date",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("ID No."+"    Semester",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Trade."+"    Section",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"   Rupees   ","                  Particulars               ","SNo."};
            String contents[]={"Tuition fees","Admission Fees","WorkShop Fees","Examination Fees","Computer Fees","I. Card Fees","Library Fees","Sports","Caution Money","","",""};
            float value1[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<13;y++){
            if(x==0){    
            cell=new PdfPCell(new Phrase(y+"",FontFactory.getFont(null,10,Font.NORMAL)));
            if(y==12)
             cell=new PdfPCell(new Phrase("total",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            }
            if(x==1 && y!=12){
            cell=new PdfPCell(new Phrase(contents[y],FontFactory.getFont(null,10,Font.NORMAL)));
            }
            if(y==12 && x==1){
            cell=new PdfPCell(new Phrase("Grand Total",FontFactory.getFont(null,11,Font.BOLD)));    
            cell.setRowspan(2);}
            if(x==2){
                cell=new PdfPCell(new Phrase(y+1+"",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);}
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            if(x==0 && y==12){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees)",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("(In Words)",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
    private void part3(PdfPTable table){
       try{ PdfPCell cell=new PdfPCell(new Phrase("Bank Copy",FontFactory.getFont(null,8,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setBorder(0);
            cell.setRotation(90);cell.setRowspan(3);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chandra Private Industrial Training\nInstitute",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Chaudhary Purva, Nahar Road Jankipuram Lucknow-226021",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Gramin Bank of Aryawart,60 Feet Road, Jankipuram",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank line
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("A/C No. 002020110000066",FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Reciept no and Date",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Name of Student",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("ID No."+"    Semester",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Trade."+"    Section",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Mobile No.",FontFactory.getFont(null,10,Font.NORMAL)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));//blank space
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            String heading[]={"        Total        ","    No. of Notes  ","Denomination"};
            String contents[]={"1000","500","100","50","20","10"," "," "," ",""};
            float value1[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
            for(int x=0;x<heading.length;x++){
            cell=new PdfPCell(new Phrase(heading[x],FontFactory.getFont(null,10,Font.BOLD)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell);
            for(int y=0;y<11;y++){
            if(x==2 )
                if(y<6)
                cell=new PdfPCell(new Phrase(contents[y]));
                else{
                  cell=new PdfPCell(new Phrase(contents[y]));
                  cell.setBorder(0);
                }
            else if(x==1 && y==6){
                cell=new PdfPCell(new Phrase("Grand Total"));
                cell.setRowspan(2);}
            else if(y>6 && y<11){
                cell=new PdfPCell(new Phrase(""));
                cell.setBorder(0);
            }
            else
               cell=new PdfPCell(new Phrase("")); 
            cell.setFixedHeight(5);
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            table.addCell(cell); 
            
            if(x==0 && y==9){
            cell=new PdfPCell(new Phrase("Total Amount (In Rupees)",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);
            cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("(In Words)",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("",FontFactory.getFont(null,10,Font.BOLD|Font.UNDERLINE)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            
            cell=new PdfPCell(new Phrase("Prep By.\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of Student\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature of",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_CENTER);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase("Bank Cashier",FontFactory.getFont(null,8)));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setHorizontalAlignment(Rectangle.ALIGN_RIGHT);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            cell=new PdfPCell(new Phrase(""));
            cell.setVerticalAlignment(Rectangle.ALIGN_TOP);
            cell.setRotation(90);cell.setRowspan(3);cell.setBorder(0);
            table.addCell(cell);
            }
            }
            
            }
            
        }catch(Exception e){}
    }
    
}
class MyRegex{
protected String pattern="((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?:\\.))"+"((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?:\\.))"+"((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?:\\.))"+"((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(?))";
    
    
    
}