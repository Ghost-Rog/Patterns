package StructuralPatterns.Bridge;

public class Windows implements Os{
    @Override
    public void openWindow() {
        System.out.println("Открылось окно Windows");
    }

    @Override
    public void pushTheButton() {
        System.out.println("Нажата кнопка Windows");

    }

    @Override
    public void createTable() {
        System.out.println("Создана таблица в Windows");

    }
}
