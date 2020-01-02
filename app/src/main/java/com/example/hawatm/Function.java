package com.example.hawatm;

public class Function {
    String name;
    int icon;

    public String getName() {
        return name;
    }

    public Function(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Function(String name) {
        this.name = name;
    }

    public Function() {
    }
}

