package festival;
    
import personal.*;
public class Event
{
    int eventno;
    String name;
    int pos;
    int coun=0;
    public Participant eobj[]=new Participant[100];
    public void addparticipanttoevent(Participant eoj)
    {
	eobj[coun]=eoj;
	coun++;
    }
    public Event()
    {
	eventno=111;
	name="skichamp";
	pos=1;
    }
    public Event(int et,String nam,int po)
    {
	eventno=et;
	name=nam;
	pos=po;
    }
    public String getname()
    {
	return name;
    }
    public int getno()
    {
	return eventno;
    }
    public int getpos()
    {
	return pos;
    }
    public void setevent(int evno,String nam,int po)
    {
	eventno = evno;
	name = nam;
	pos = po;
    }
    public String toString()
    {
	return name;
    }
    public void disp()
    {
	int t=0;
	System.out.println("Participants for event "+this+" are :");
	for(;t<coun;t++)
	    {
		System.out.println(eobj[t].getname());
	    }	
	System.out.println();
    }
}
