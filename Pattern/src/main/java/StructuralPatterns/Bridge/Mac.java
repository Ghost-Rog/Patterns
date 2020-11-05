package StructuralPatterns.Bridge;

public class Mac implements Os{
    @Override
    public void openWindow() {
        System.out.println("Открылось окно Mac");
    }

    @Override
    public void pushTheButton() {
        System.out.println("Нажата кнопка Mac");

    }

    @Override
    public void createTable() {
        System.out.println("Создана таблица в Mac");

    }
}
