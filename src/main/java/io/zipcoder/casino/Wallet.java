package io.zipcoder.casino;

public class Wallet {


    public Wallet() {}

    String Id;
    String name;
    double wallet;

    public Wallet(String id, String name, double wallet){
        this.Id = Id;
        this.name = name;
        this.wallet = wallet;
    }

    public void setId (String id){
        this.Id = id;
    }

    public String getId () {
        return Id;
    }

    public void setBalance ( double wallet){  //set money won = setBalance
        this.wallet = wallet;
    }

    public double getBalance () {       //retrieving current balance
        return wallet;
    }

//    public void addMoney(double amt) {          //add $ to Wallet
//        setBalance(); += amt;
//        wallet += amt;
    // }

    public void removeMoney ( double amt){     //remove $ from wallet
//       setBalance(); += amt;
        wallet -= amt;
    }
}
