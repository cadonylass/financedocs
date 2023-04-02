package com.mycompany.app;

import com.mycompany.app.CashflowBuilderint;
import com.mycompany.app.CashflowstatementBuilder;

class Othercfstatement  {

    private String CompanyName;
    private int operationalflow;
    private int investmentflow;
    private int fundingflow;
    private int netearnings;
    private int depreciations;
    private int DECREASE_IN_AMOUNTS_RECIEVABLE;
    private int INCREASE_IN_ACCOUNTS_PAYABLE;
    private int EQUIPTMENT;
    private int notespaybale;
    private int month;
    private int year;
    private int daynum;
    private int projectedyears;


    public Othercfstatement(CashflowstatementBuilder CashflowstatementBuilder ){

this.CompanyName = CashflowstatementBuilder.CompanyName;
this.operationalflow = CashflowstatementBuilder.operationalflow;
this.investmentflow = CashflowstatementBuilder.investmentflow;
this.fundingflow= CashflowstatementBuilder.fundingflow;
this.netearnings = CashflowstatementBuilder.netearnings;
this.depreciations = CashflowstatementBuilder.depreciations;
this.DECREASE_IN_AMOUNTS_RECIEVABLE = CashflowstatementBuilder.DECREASE_IN_AMOUNTS_RECIEVABLE;
this.INCREASE_IN_ACCOUNTS_PAYABLE = CashflowstatementBuilder.INCREASE_IN_ACCOUNTS_PAYABLE;
this.EQUIPTMENT = CashflowstatementBuilder.EQUIPTMENT;
this.notespaybale = CashflowstatementBuilder.notespaybale;
this.month = CashflowstatementBuilder.month;
this.year = CashflowstatementBuilder.year;
        this.daynum = CashflowstatementBuilder.daynum;
this.projectedyears = CashflowstatementBuilder.projectedyears;

// this.CompanyName = CashflowstatementBuilder.getname();
// this.CompanyName = CashflowstatementBuilder.getdate();
// this.CompanyName = CashflowstatementBuilder.setoperationalflow();
// this.CompanyName = CashflowstatementBuilder.setdepreciation();
// this.CompanyName = CashflowstatementBuilder.setdecreaserecievables();
// this.CompanyName = CashflowstatementBuilder.setincreaseinpayables();
// this.CompanyName = CashflowstatementBuilder.setequiptment();
// this.CompanyName = CashflowstatementBuilder.setnotespayable();
// this.CompanyName = CashflowstatementBuilder.gettotaloperationalflow();
// this.CompanyName = CashflowstatementBuilder.gettotaloperationalflowsen();
// this.CompanyName = CashflowstatementBuilder.getinvestingcf();
// this.CompanyName = CashflowstatementBuilder.getfinacingcf();
// this.CompanyName = CashflowstatementBuilder.gettotalcf();
// this.CompanyName = CashflowstatementBuilder.DCF();

    }


}