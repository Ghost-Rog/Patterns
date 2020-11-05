package StructuralPatterns.Decorator;

public class WhatSupDecorator implements Component {

    private final Component wrapper;

    public WhatSupDecorator(Component wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void sent() {
        System.out.println("Отправлено сообщение в WhatSup");
        wrapper.sent();
    }
}
