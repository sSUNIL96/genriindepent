package hashmapUseCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestHM {
	
	static HashMap<KeyforEmp, Employee> myhm = new HashMap<>();
	
	public static Employee getEmployee (int id , int uid){	
		
		KeyforEmp key = new KeyforEmp(id, uid);	
		
		
		return myhm.get(key);
		
	}

	public static void main(String[] args) {	
		
		//Q .  we have a list of objects of employee having n no of parameters , if user passses 2 unique parameters a emp
		//object should be retrieved.	
		
		
		
		List <Employee> emplist = new ArrayList<>();
		
		emplist.add(new Employee(1, 530, "Ninad", "pune"));
		emplist.add(new Employee(2, 534, "Konark", "surat"));
		emplist.add(new Employee(3, 536, "Dinesh", "Akola"));
		emplist.add(new Employee(4, 537, "Yogesh", "Latur"));
		emplist.add(new Employee(5, 539, "Parth", "saswad"));
		
		for (int z = 0 ; z<=emplist.size()-1 ; z++){
          myhm.put(new KeyforEmp(emplist.get(z).getEmpId(), emplist.get(z).getEmpUID()), emplist.get(z));	
		}
		
		Employee e = TestHM.getEmployee(1, 530);
		
		System.out.println(e);

	}

}
