package StructuralPatterns.Decorator;

public class Client {

    public static void main(String[] args) {

        Component email = new Email();
        Component sms = new SmsDecorator(email);
        Component telegram = new TelegramDecorator(sms);
        Component whatsup = new WhatSupDecorator(telegram);
        Component supermario = new SuperMario(whatsup, "Super Mario HERE!!!");

        supermario.sent();

    }
}
