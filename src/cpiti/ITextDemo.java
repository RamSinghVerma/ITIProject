package cpiti;


import com.itextpdf.text.Document;
import com.itextpdf.text.Element;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ITextDemo {
    SessionFactory sessionFactory;
    Session session;
    Transaction tx;
    public ITextDemo() {
        sessionFactory=new Configuration().configure().buildSessionFactory();
        session=sessionFactory.openSession();
        tx=session.beginTransaction();
    }
    
    

    public static void main(String[] args) {
        new ITextDemo().allReportWithId();
             
    }
    
    void allReportWithId(){
        try{ 
        Document document=new Document();
        PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream(new File("StudentsImages\\newfile.pdf")));
        document.open();
        ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Balance Of All Receipt NO"), (document.right() - document.left()) / 2 + document.leftMargin(), document.top() + 10, 0);
        String s[]="S.No,ID No,Name,Phone no,Balance".split(",");
        PdfPTable table=new PdfPTable(new float[]{2,2});
        PdfPCell cell;

        //Table Heading
         session.beginTransaction();
    Query query2=session.createQuery("select distinct t.trainee_session_id,t.trainee_name,t.trainee_mobile_no,t.trainee_trade_name from Trainee t,Fee_Details f where t.trainee_session_id=f.fee_trainee_session_id and f.fee_trainee_session_id='2' order by 2");
        List list=query2.list();
        Iterator i=list.iterator();
       int sno=1;String trade_name="";
        if(i.hasNext()){
        Object obj[]=(Object[])i.next();
                     cell=new PdfPCell(new Phrase("ID NO :"+obj[0]+""));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase("Trainee Name :"+obj[1]+""));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase("Phone no :"+obj[2]+""));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase("Phone no :"+obj[3]+""));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);trade_name=obj[3]+"";
                      }
        cell=new PdfPCell(new Phrase("\n"));cell.setColspan(2);cell.setBorder(0);
                     table.addCell(cell);
        cell=new PdfPCell(new Phrase("Receipt No"));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase("Fees Amount"));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     float sum=0;
        query2=session.createQuery("select distinct f.fee_receipt_no,f.fee_amount From Fee_Details f where f.fee_trainee_session_id='2'");
                     list=query2.list();
                    i=list.iterator();
                    while(i.hasNext()){
                     Object obj[]=(Object[])i.next();   
                     cell=new PdfPCell(new Phrase(obj[0]+""));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     sum+=Float.parseFloat(obj[1]+"");
                     cell=new PdfPCell(new Phrase(obj[1]+""));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                    }
                    query2=session.createQuery("select tr.trade_total_semester,tr.trade_fee from Trade tr where lower(tr.trade_name)=lower('"+trade_name+"')");
                     list=query2.list();
                    i=list.iterator();
                    if(i.hasNext()){
                        Object obj[]=(Object[])i.next();
                     cell=new PdfPCell(new Phrase("Balance "));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                     cell=new PdfPCell(new Phrase(obj[0]+"*"+obj[1]+"-"+sum+"="+(Integer.parseInt(obj[0]+"")*Float.parseFloat(obj[1]+"")-sum)+""));cell.setHorizontalAlignment(Rectangle.ALIGN_CENTER);
                     table.addCell(cell);
                                }
        tx.commit();             
                     
        document.add(table);
        document.close();
        Desktop.getDesktop().open(new File("StudentsImages\\newfile.pdf"));
        }catch(Exception e){}
    }
  
}
