package hashmapUseCase;

public class Employee {

	private int empId;
	private int empUID;
	private String empName;
	private String empAddress;
	
	public Employee(int empId, int empUID, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empUID = empUID;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpUID() {
		return empUID;
	}

	public void setEmpUID(int empUID) {
		this.empUID = empUID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empUID=" + empUID + ", empName=" + empName + ", empAddress=" + empAddress
				+ "]";
	}
	
	
	
	
	
	
	
}
