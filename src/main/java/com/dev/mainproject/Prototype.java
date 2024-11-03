/*
package com.dev.mainproject;

public class Prototype<T> implements Cloneable {
    public T copy() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}

abstract class Beast extends Prototype<Beast> {
    public Beast(Beast source) {}
}

class OrcBeast extends Beast {
    private final String weapon;

    public OrcBeast (OrcBeast orcBeast) {
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }
}

interface HeroFactory {
    Beast createBeast() throws CloneNotSupportedException;
*/
/*    Mage createMage();
    Warlord createWarlord();*//*

}

class HeroFactoryImpl implements HeroFactory {
    private final Beast beast;

    HeroFactoryImpl(Beast beast) {
        this.beast = beast;
    }

    */
/*private final Mage mage;
    private final Warlord warlord;*//*


    @Override
    public Beast createBeast() throws CloneNotSupportedException {
        return beast.copy();
    }

    */
/*public Mage createMage() {
        return mage.copy();
    }

    public Warlord createWarlord() {
        return warlord.copy();
    }*//*

}

*/
/*public static void main(String[] args) throws CloneNotSupportedException {
    var factory = new HeroFactoryImpl(
            new ElfBeast("protecting")
    );
    var beast = factory. createBeast();*//*


}*/
