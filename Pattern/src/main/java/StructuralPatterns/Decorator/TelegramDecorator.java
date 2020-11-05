package StructuralPatterns.Decorator;

public class TelegramDecorator implements Component {

    private Component wrapper;

    public TelegramDecorator(Component wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void sent() {
        System.out.println("Отправлено сообщение в Telegram");
        wrapper.sent();

    }
}
