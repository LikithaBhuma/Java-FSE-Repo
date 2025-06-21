package FactoryMethodPattern;

public class ExcelDocumentFactoryPattern extends FactoryPattern {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}