package FactoryMethodPattern;

public class FactoryPatternTest {
    public static void main(String[] args) {
        FactoryPattern wordFactory = new WordDocumentFactoryPattern();
        Document word = wordFactory.createDocument();
        word.open();

        FactoryPattern pdfFactory = new PdfDocumentFactoryPattern();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        FactoryPattern excelFactory = new ExcelDocumentFactoryPattern();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
