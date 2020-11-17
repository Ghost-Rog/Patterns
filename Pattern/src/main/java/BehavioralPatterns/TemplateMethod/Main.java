package BehavioralPatterns.TemplateMethod;

public class Main {
    public static void main(String[] args) {

        DataMiner pdf = new PDFDataMiner();
        pdf.mine("SOLID");

        System.out.println();

        DataMiner csv = new CSVDataMiner();
        csv.mine("GREAT CSV!!!");

    }
}
