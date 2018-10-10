package cpiti;


import com.itextpdf.text.Document;
import java.io.FileOutputStream;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.awt.Desktop;
import java.io.File;
public class Watermark {
    public static void main(String[] args) {
        new Watermark().withWatermark("receipt.pdf","images\\cpiti.jpg");
    }
    void withWatermark(String fileName,String watermarkImagePath){
        try {
            if(new File(fileName).exists())
                new File(fileName).renameTo(new File("temp.pdf"));
            PdfReader Read_PDF_To_Watermark = new PdfReader("temp.pdf");
            int number_of_pages = Read_PDF_To_Watermark.getNumberOfPages();
            PdfStamper stamp = new PdfStamper(Read_PDF_To_Watermark, new FileOutputStream(fileName));
            int i = 0;
            Image watermark_image = Image.getInstance(watermarkImagePath);
            PdfGState gs1 = new PdfGState();
            gs1.setFillOpacity(0.7f);
            PdfContentByte add_watermark;           
            while (i < number_of_pages) {
              i++;
              watermark_image.setAbsolutePosition(250f,600f);
              add_watermark = stamp.getUnderContent(i);
              add_watermark.addImage(watermark_image);
              add_watermark.setGState(gs1);
             
              watermark_image.setAbsolutePosition(250f,200f);
              add_watermark = stamp.getUnderContent(i);
              add_watermark.addImage(watermark_image);
              add_watermark.setGState(gs1);
            }
            stamp.close();
            if(new File("temp.pdf").exists())
                new File("temp.pdf").delete();
            Desktop.getDesktop().open(new File(fileName));
        }
        catch (Exception i1) {
            i1.printStackTrace();
        }
    }
}