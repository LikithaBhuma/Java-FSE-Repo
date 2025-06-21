package FactoryMethodPattern;

public class PdfDocumentFactoryPattern extends FactoryPattern {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

