package BehavioralPatterns.TemplateMethod;

public class PDFDataMiner extends DataMiner {

    @Override
    public String extractData(String p) {
        System.out.println("File " + p + " converted to PDf");
        return "Данные получены из " + p;
    }

    @Override
    public String parseData(String p) {
        System.out.println("PDF file " + p + " parsed");
        return "Данные проанализированны " + p;
    }
}
