package sponsorship;
import festival.*;
import personal.*;
public abstract class Sponsors implements Comparable,NoOfYears
{
    String nameofspon;
    int money;
    int noofyr;
    Address ad=new Address();
    public abstract void setSpoName(String nam);
    public abstract String getSponName();
    public abstract void setAd(String ad,String ct,String st,String pn);
    public abstract void setMoney(int mon);
    public abstract int getMoney();
    public abstract void setNoOfYears(int no);
}