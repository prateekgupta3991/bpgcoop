import festival.*;
import personal.*;
import sponsorship.*;
import java.util.Scanner;
import java.io.*;
public class UseParticipant
{
    public static void main(String[] args) throws IOException
    {
	College col1=new College();
	College col2=new College();
	College col3=new College();
	col1.setcollege("BITS Pilani Goa","BITS");
	col2.setcollege("BITS Pilani Pilani","BITS");
	col3.setcollege("BITS Pilani Hyderabad","BITS");
	Event ev1=new Event(101,"Dance",2);
	Event ev2=new Event(204,"Karate",1);
	Event ev3=new Event(223,"Robocop",4);
	Address add1=new Address("hjchsdbc","kanpur","UP","208001");
	Address add2=new Address("hjchsdbc","Bhopal","MP","288001");
	Address add3=new Address("hjchsdbc","Ahmedabad","Gujarat","308008");
	Participant par1=new Participant(col1);
	Participant par2=new Participant("Sourabh Maheshwari","2011A7PS013P",col2);
	Participant par3=new Participant("Prateek Gupta","2011A7PS125G",'M',19,col1,"65454353","2445146",add1);
	Participant par4=new Participant("Shail Shah","2011A7PS125H",'M',19,col3,"543545","454135",add2,ev2);
	par2.addparticipant(ev3);
	par2.addparticipant(ev1);
	par3.addparticipant(ev3);
	par4.addparticipant(ev1);
	par3.addparticipant(ev2);
	ev3.addparticipanttoevent(par2);
	ev1.addparticipanttoevent(par2);
	ev1.addparticipanttoevent(par3);
	ev2.addparticipanttoevent(par4);
	ev2.addparticipanttoevent(par3);
	par3.dis();
	par2.dis();
	par4.dis();
	ev1.disp();
	ev2.disp();
	ev3.disp();
	System.out.println(par2);
	System.out.println(par3);
	System.out.println(par4);
	Sponsors sp[]=new Sponsors[3];
	sp[0]=new GoldSponsors();
	sp[1]=new SilverSponsors();
	sp[2]=new TitleSponsors();
	sp[0].setSpoName("verma traders");
	sp[0].setMoney(500000);
	sp[0].setNoOfYears(2);
	sp[1].setSpoName("Bamway");
	sp[1].setMoney(150000);
	sp[1].setNoOfYears(3);
	sp[2].setSpoName("shah traders");
	sp[2].setMoney(780000);
	sp[2].setNoOfYears(1);
	Sponsors temp;
        for(int i=0; i < 3; i++)
	{
	        for(int j=i+1;j<3;j++)
		{
	                if((sp[i].compareTo(sp[j]))>0)
 		        {
              	          temp=sp[i];
               	          sp[i] = sp[j];
                          sp[j] = temp;
                        }
		  	else if((sp[i].compareTo(sp[j]))==0)
			{
			   if(sp[i].getNoOfYears()>sp[j].getNoOfYears())
			   {
				temp=sp[i];
               	          	sp[i] = sp[j];
                          	sp[j] = temp;
			   }			   	
			}
                }
        }
	System.out.println();
	PrintWriter in = new PrintWriter(new BufferedWriter (new FileWriter ("Sponsorrecord.txt")));
	for(int b=0;b<3;b++)
	{
	try
	{
		in.println("NAME: "+sp[b].getSponName()+" MONEY: "+sp[b].getMoney()+" No.of years: "+sp[b].getNoOfYears());
		in.flush();
	}
	catch(Exception e)
	{
		System.out.println("Error message: "+e.getMessage());
	}
	}
	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("MoneyRecord.txt")));;
	try {
		for(int c=0;c<3;c++)
		{
			pw.println(sp[c].getMoney());
			pw.flush();
		}
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
	Scanner scan=new Scanner(new FileReader("MoneyRecord.txt"));
	scan.useDelimiter("\n");
	Integer num[]=new Integer[3];
	for(int a=0;a<3;a++)
	{	
        num[a]=scan.nextInt();
		System.out.println(num[a]);
	}
	}
}