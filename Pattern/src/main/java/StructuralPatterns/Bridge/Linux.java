package StructuralPatterns.Bridge;

public class Linux implements Os{
    @Override
    public void openWindow() {
        System.out.println("Открылось окно Linux");
    }

    @Override
    public void pushTheButton() {
        System.out.println("Нажата кнопка Linux");

    }

    @Override
    public void createTable() {
        System.out.println("Создана таблица в Linux");

    }
}
