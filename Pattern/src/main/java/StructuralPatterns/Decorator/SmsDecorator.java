package StructuralPatterns.Decorator;

public class SmsDecorator implements Component{

    private Component wrapper;

    public SmsDecorator(Component wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void sent() {
        System.out.println("Отправлено SMS");
        wrapper.sent();
    }
}
