package StructuralPatterns.Decorator;

public class SuperMario extends SmsDecorator{

    private final String superMassage;

    public SuperMario(Component wrapper, String superMassage) {
        super(wrapper);
        this.superMassage = superMassage;
    }

    @Override
    public void sent() {
        super.sent();
        System.out.println(superMassage);
    }
}
