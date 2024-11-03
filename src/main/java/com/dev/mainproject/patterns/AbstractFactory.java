package com.dev.mainproject.patterns;

interface Button {
    void click();
}

interface Checkbox {
    void check();
}

class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Click on Button");
    }
}

class WindowsCheckbox implements Checkbox {

    @Override
    public void check() {
        System.out.println("Checking in Checkbox");
    }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class Main {
    public static void configureApplication (GUIFactory factory) {
        Button button = factory.createButton();
        button.click();

        Checkbox checkbox = factory.createCheckbox();
        checkbox.check();
    }

    //Client uses GUIFactory
    public static void main(String[] args) {
        configureApplication(new WindowsFactory());
    }
}

/*class ButtonsFactory {
    public enum ButtonTypes {
        WINDOWS
    }
    Button createButton(ButtonTypes type) {
        return switch (type) {
            case WINDOWS -> new WindowsButton();
        };
    }
}*/



public class AbstractFactory {

}