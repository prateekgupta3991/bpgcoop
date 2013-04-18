package festival;

import personal.*;
public class Participant
{
    String name,idno,mobno,emerno;
    char gen;
    public int age;
    Event eve=new Event();
    College col= new College();
    Address add=new Address("354354","253435","354543","645436");
    int count=0;
    Event pobj[]=new Event[100];
    public Participant()
    {
	}
    public Participant(College coll)
    {
	col.setcollege(coll.getcolname(),coll.getuniversity());
    }
    public Participant(String na,String id,College coll)
    {
	col.setcollege(coll.getcolname(),coll.getuniversity());
	name = na;
	idno = id;
    }
    public Participant(String na,String id,char gnd,int ag,College coll,String mon,String emern,Address ad)
    {
	col.setcollege(coll.getcolname(),coll.getuniversity());
	name = na;
	idno = id;
	gen = gnd;
	age = ag;
	mobno = mon;
	emerno = emern;
	add.setadd(ad.getadd(),ad.getcity(),ad.getstate(),ad.getpin());
    }
    public Participant(String nam,String id,char ge,int ag,College coll,String mon,String emern,Address ad,Event e)
    {
	col.setcollege(coll.getcolname(),coll.getuniversity());
	name = nam;
	idno = id;
	gen = ge;
	age = ag;
	mobno = mon;
	emerno = emern;
	add.setadd(ad.getadd(),ad.getcity(),ad.getstate(),ad.getpin());
	eve.setevent(e.getno(),e.getname(),e.getpos());
	addparticipant(e);
    }
    public void addparticipant(Event eojj)
    {
	pobj[count]=eojj;
	count++;
	eve.addparticipanttoevent(this);
    }
    public String getname()
    {
	return name;
    }

    public String getidno()
    {
	return idno;
    }

    public String getmono()
    {
	return mobno;
    }
    
    public char getgender()
    {
	return gen;
    }

    public int getage()
    {
	return age;
    }

    public String getemno()
    {
	return emerno;
    }
    
    public String getaddress()
    {
	return ("Address: "+add.getadd()+","+add.getcity()+","+add.getstate()+"-"+add.getpin());
    }

    public String getcollege()
    {
	return ("College: "+col.getcolname() + " University: " + col.getuniversity());
    }
    public String toString()
    {
	return ("Participant is "+name+" College: "+col.getcolname()+" address: "+getaddress());
    }
    public void dis()
    {	
	int p=0;
	System.out.println("Events for participant "+this.getname()+" are: ");
	for( ;p<count;p++)
	    {
		System.out.println(pobj[p].getname());
	    }
	System.out.println();
    }
}
