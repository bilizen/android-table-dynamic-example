package com.example.rodrigo.android_table_dynamic_example;

/**
 * Created by rodrigo on 17/03/17.
 */

public class Person {
    private boolean checkBox;
    private String Name;
    private String Dni;

    public Person(String dni, String name) {
        Dni = dni;
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public boolean isCheckBox() {
        return checkBox;
    }

    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }
}
