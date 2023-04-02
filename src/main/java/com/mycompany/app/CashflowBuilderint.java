package com.mycompany.app;

public interface CashflowBuilderint {

    public String getname();
    public String getdate();
    public String gettotalcf();
    public String getfinacingcf();
    public String getinvestingcf();
    public int gettotaloperationalflow();
    public String gettotaloperationalflowsen();
    public CashflowstatementBuilder setoperationalflow(int operationalflowtotal);
    public CashflowstatementBuilder setdepreciation(int depreciations );
    public CashflowstatementBuilder setdecreaserecievables(int DECREASE_IN_AMOUNTS_RECIEVABLE);
    public CashflowstatementBuilder setincreaseinpayables(int INCREASE_IN_ACCOUNTS_PAYABLE);
    public CashflowstatementBuilder setequiptment(int EQUIPTMENT);
    public CashflowstatementBuilder setnotespayable(int NOTESPAYBALE);
}
