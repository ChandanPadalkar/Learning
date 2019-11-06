import java.io.*; 
import java.util.*; 
  
public class CustomMapObjectExample 
{ 
    public static void main (String[] args) 
    { 
		/*Map<Employee, Integer> empMap = new HashMap<>();
		empMap.put(new Employee("e1",1), 10);
		empMap.put(new Employee("e2",2), 20);
		
        System.out.println(empMap.size()); 
		
		System.out.println(empMap.get(new Employee("e1",1)));
		System.out.println(empMap.get(new Employee("e2",2)));*/
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee("e1",1));
		empSet.add(new Employee("e2",2));
		
        System.out.println(empSet.size()); 
		
		//System.out.println(empSet.get(new Employee("e1",1)));
		//System.out.println(empSet.get(new Employee("e2",2)));
		for(
  
    } 
}

class Employee
{
	String name;
	int id;
	
	public Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public int hashCode()
	{
		System.out.println("inside hashCode"); 
		return this.id;
	}
	
	public boolean equals(Object obj)
	{
		System.out.println("inside equals"); 
		if(!(obj instanceof Employee))
			return false;
		Employee e = (Employee)obj;
		
		if(this.id == e.id && this.name.equals(e.name))
			return true;
		else
			return false;
	//	return true;
	}
}