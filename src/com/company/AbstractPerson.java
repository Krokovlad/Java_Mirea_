package com.company;
import com.company.IHuman;

public abstract class AbstractPerson implements IHuman{
    String name;

    public AbstractPerson(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract String think();

    public enum Gender {
        MALE,
        FEMALE,
        TRANSFORMER
    }

    public enum PositionEnum {
        MANAGER,
        SELLER,
        CLEANER
    }
}
