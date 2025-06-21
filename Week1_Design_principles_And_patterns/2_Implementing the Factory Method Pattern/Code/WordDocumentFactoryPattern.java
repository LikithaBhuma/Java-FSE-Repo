package FactoryMethodPattern;

public class WordDocumentFactoryPattern extends FactoryPattern {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

