package BehavioralPatterns.TemplateMethod;


public abstract class DataMiner {

    public void mine(String p) {
        openFile(p);
        String extractData = extractData(p);
        String parseData = parseData(p);
        String analyzeData = analyzeData(p);
        String sendReport = sendReport(p);
        closeFile(p);

    }

    public void openFile(String p) {
        System.out.println("File " + p + " opened");

    }

    public abstract String extractData(String p);

    public abstract String parseData(String p);

    public String analyzeData(String p) {
        System.out.println("File analyzing " + p);
        return "Проанализированно " + p;
    }

    public String sendReport(String p) {
        System.out.println("Send report from " + p);
        return "Отправлен репорт " + p;
    }

    public void closeFile(String p) {
        System.out.println("File " + p + " closed");
    }


}
