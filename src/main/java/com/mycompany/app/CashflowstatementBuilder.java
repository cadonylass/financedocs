package com.mycompany.app;
import java.time.Year;

public class CashflowstatementBuilder implements CashflowBuilderint{


public String CompanyName;
    public int operationalflow;
    public int investmentflow;
    public int fundingflow;
    public int netearnings;
    public int depreciations;
    public int DECREASE_IN_AMOUNTS_RECIEVABLE;
    public int INCREASE_IN_ACCOUNTS_PAYABLE;
    public int EQUIPTMENT;
    public int notespaybale;
    public int month;
    public int year;
    public int daynum;
    public int projectedyears;
    //period in years
    public CashflowstatementBuilder(String CompanyName, int depreciations, int DECREASE_IN_AMOUNTS_RECIEVABLE, int INCREASE_IN_ACCOUNTS_PAYABLE, int EQUIPTMENT, int notespaybale , int year, int daynum, int month, int projectyears)
   {
//        this.operationalflow = operationalflow;
//        this.investmentflow = investmentflow;
//        this.fundingflow = fundingflow;

        this.CompanyName = CompanyName;
        this.depreciations = depreciations;
        this.DECREASE_IN_AMOUNTS_RECIEVABLE = DECREASE_IN_AMOUNTS_RECIEVABLE;
        this.INCREASE_IN_ACCOUNTS_PAYABLE = INCREASE_IN_ACCOUNTS_PAYABLE;
        this.EQUIPTMENT = EQUIPTMENT;
        this.notespaybale = notespaybale;
        this.year = year;
        this.daynum = daynum;
        this.month = month;
        this.projectedyears = projectyears;
    }


    public Othercfstatement build(){
        return new Othercfstatement(this);
    }

    public String getname(){


        return CompanyName;
    }

    public String getdate()throws ArithmeticException{

        if(daynum > 31 && month == 1 ) {
            throw new ArithmeticException("January does not have more than 31 days");
        }
//March, May, July, August, October, and December.

        if(daynum > 31 && month == 3 ) {
            throw new ArithmeticException("March does not have more than 31 days");

        }
        if(daynum > 31 && month == 5 ) {
            throw new ArithmeticException("May does not have more than 31 days");

        }
        if(daynum > 31 && month == 7 ) {
            throw new ArithmeticException("July does not have more than 31 days");

        }
        if(daynum > 31 && month == 8 ) {
            throw new ArithmeticException("August does not have more than 31 days");

        }
        if(daynum > 31 && month == 10 ) {
            throw new ArithmeticException("October does not have more than 31 days");
        }

            if (daynum > 31 && month == 12) {
                throw new ArithmeticException("December does not have more than 31 days");
            }

        if (daynum > 30 && month == 2) {
            throw new ArithmeticException("February does not have more than 31 days");

        }

        if (daynum > 30 && month == 4) {
            throw new ArithmeticException("April does not have more than 31 days");

        }

        if (daynum > 30 && month == 6) {
            throw new ArithmeticException("June does not have more than 31 days");

        }

        if (daynum > 30 && month == 9) {
            throw new ArithmeticException("September does not have more than 31 days");

        }
        if (daynum > 30 && month == 11) {
            throw new ArithmeticException("November does not have more than 31 days");

        }

        if(Year.isLeap(year) && daynum > 28 && month == 2){
            throw new ArithmeticException("February was a leap year and does not have more than 28 days");
        }

//        if (5 = !(projectedyears || projectedyears != 7)) {
//            throw new ArithmeticException("Projections need to be either 5 or 7 years");
//        }

        return daynum + "/" + month + "/" + year;

        }


//function cashflowfrominvesting
    //cashflowfrom financing


    public CashflowstatementBuilder setoperationalflow(int operationalflowtotal){
        return this;
    };
    public CashflowstatementBuilder setdepreciation(int depreciations ){
        return this;

    };

    public CashflowstatementBuilder setdecreaserecievables(int DECREASE_IN_AMOUNTS_RECIEVABLE ){
        this.DECREASE_IN_AMOUNTS_RECIEVABLE = DECREASE_IN_AMOUNTS_RECIEVABLE;
        return this;
    }

    public CashflowstatementBuilder setincreaseinpayables(int INCREASE_IN_ACCOUNTS_PAYABLE ){
        this.INCREASE_IN_ACCOUNTS_PAYABLE= INCREASE_IN_ACCOUNTS_PAYABLE;
        return this;
    }

    public CashflowstatementBuilder setequiptment(int EQUIPTMENT ){
        this.EQUIPTMENT =  EQUIPTMENT;
        return this;
    }


    public CashflowstatementBuilder setnotespayable(int NOTESPAYBALE){
        this.notespaybale =   notespaybale;
        return this;
    }
//
    public int gettotaloperationalflow(){
        int total = depreciations + DECREASE_IN_AMOUNTS_RECIEVABLE + INCREASE_IN_ACCOUNTS_PAYABLE;
        return total;

    }

    public String gettotaloperationalflowsen(){
        String output = getname() +" has a total operational flow of £" + gettotaloperationalflow();

        System.out.println(getname() +" has a total operational flow of £" + gettotaloperationalflow());
        System.out.println(output);
        return getname() + gettotaloperationalflow();
    }

    public String getinvestingcf(){
        System.out.println(getname() +" has a total investing flow of £" + EQUIPTMENT );
        return (getname() +" has a total investing flow of £" + EQUIPTMENT );
    }


    public String getfinacingcf(){

        System.out.println(getname() +" has a total financing flow of £" + notespaybale);
        return (getname() +" has a total financing flow of £" + notespaybale );
    }

    public String gettotalcf(){
        int totalcf = gettotaloperationalflow() + EQUIPTMENT + notespaybale;
        System.out.println(getname() +" has a total cashflow of £" + totalcf + " as of " + getdate());
        return getname() +" has a total cashflow of £" + gettotaloperationalflow() + EQUIPTMENT + notespaybale + " as of " + getdate();
    }

    public int DCF(){
        int totalcf = gettotaloperationalflow() + EQUIPTMENT + notespaybale;
       // int formula = totalcf/(1+)


    return totalcf;
    }




//    public CashflowstatementBuilder setequiptment(int  EQUIPTMENT ){
//        this. EQUIPTMENT =  EQUIPTMENT;
//        return this;
//    }




//    public CashflowstatementBuilder Getnetcashfinancing(){}
//    public CashflowstatementBuilder Getnetcashinvesting(){}

//    public CashflowstatementBuilder GetCashFlowEarnings(){
//
//
//    }


//public CashflowstatementBuilder GetNetEarnings(){
//
//
//}


}

