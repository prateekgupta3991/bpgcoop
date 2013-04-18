package personal;
import festival.*;
import java.util.*;
public class Student extends Person implements Comparable
{
	float age;
	public int compareTo(Object ob)
	{
		Participant obj=(Participant) ob;
		if((this.age)>(obj.age))
		return 1;
		else if((this.age)<(obj.age))
		return -1;
		else
		return 0;
	}
}
