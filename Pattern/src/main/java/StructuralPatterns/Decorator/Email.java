package StructuralPatterns.Decorator;

public class Email implements Component {

    @Override
    public void sent() {
        System.out.println("Отправлен Email");
    }
}
