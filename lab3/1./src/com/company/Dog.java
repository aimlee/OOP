package com.company;

public class Dog extends Animal{
private int dN;

public Dog(){
    super();
    this.dN = 0;
}

    public Dog(int initialNumber){
        super();
        this.dN = initialNumber;
    }
    public Dog(int initialNumber, String color){
    super(color);
    this.dN= initialNumber;
    }

    @Override

    public String info(){
    String res =super.info();
    res = res+ "number: "+dN+ '\n';
    return res;
    }


}
