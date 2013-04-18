package sponsorship;
import festival.*;
import personal.*;
public abstract class EventSponsors extends Sponsors
{
    Event evobj[]=new Event[100];
    public abstract void setEvent(Event eob);
    public abstract void disSpon();
}