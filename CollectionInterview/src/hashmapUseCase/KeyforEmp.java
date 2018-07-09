package hashmapUseCase;

public class KeyforEmp {

	
	int id;
	int uid;
	
	public KeyforEmp(int id, int uid) {
		super();
		this.id = id;
		this.uid = uid;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + uid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyforEmp other = (KeyforEmp) obj;
		if (id != other.id)
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	*/
	
	
}
