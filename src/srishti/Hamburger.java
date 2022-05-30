package srishti;

public class Hamburger {

    private String roll;
    private String meat;
    private double price;
    private String name;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;



    public Hamburger(String roll, String meat, double price, String name) {

        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public void addHamburgerAddition1(String name, double price){

        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){

        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){

        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){

        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){

        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.roll + " price is " + this.price);
        if(addition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + "for an extra " + this.addition1Price);
        }
        if(addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + "for an extra " + this.addition2Price);
        }
        if(addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + "for an extra " + this.addition3Price);
        }
        if(addition4Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + "for an extra " + this.addition1Price);
        }
        return hamburgerPrice;
    }

}
