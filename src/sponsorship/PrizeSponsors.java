package sponsorship;
import festival.*;
import personal.*;
public class PrizeSponsors extends EventSponsors
{
    int count=0;
    public void setSpoName(String nam)
    {
	nameofspon=nam;
    }
    public String getSponName()
    {
	return nameofspon;
    }
    public void setAd(String adw,String ct,String st,String pn )
    {
	ad.setadd(adw,ct,st,pn);
    }
    public void setEvent(Event eob)
    {
	evobj[count++]=eob;
    }
    public void disSpon()
    {
	System.out.println("Prizesponsors in event: ");
	for(int a=0;a<count;a++)
	{
		System.out.println(evobj[a].getname());
	}
    }
    public void setMoney(int mon)
    {
	money=mon;
    }
    public int getMoney()
    {
	return money;
    }
    public void setNoOfYears(int no)
    {
	noofyr=no;
    }
    public int getNoOfYears()
    {
	return noofyr;
    }
    public int compareTo(Object obj)
    {
	Sponsors sp=(Sponsors) obj;
	if((this.money)>(sp.money))
	return 1;
	else if((this.money)<(sp.money))
	return -1;
	else
	return 0;
    }
}