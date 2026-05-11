/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reportepdf;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/**
 *
 * @author USUARIO
 */
public class ReportePDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("mi_archivo.pdf"));
            document.open();

            document.add(new Paragraph("Hola, este es mi primer PDF generado desde Java."));
            document.add(new Paragraph("Puedes agregar textos, tablas, imágenes, etc."));

            document.close();
            System.out.println("PDF generado correctamente.");

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        }
    }
    
}
