package personal;
public class Address
{
    String city,state,pin,adr;
    public Address()
    {
    }
    public Address(String ad,String ct,String st,String pn)
    {
	pin=pn;
	city=ct;
	state=st;
	adr=ad;
    }
    public void setadd(String pi,String st,String ct,String ad)
    {    
	pin=pi;
	city=ct;
	state=st;
	adr=ad;
    } 
    public String getcity()
    {
	return city;
    }

    public String getstate()
    {
	return state;
    }

    public String getpin()
    {
	return pin;
    }

    public String getadd()
    {
	return adr;
    }
}
