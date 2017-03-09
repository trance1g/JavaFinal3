public class Employee {
	private String name;
	private String idNumber;
	private String department;
	private String position;
	
	public Employee(String name, String idNumber, String department, String position) {
		// TODO Auto-generated constructor stub
		setName(name);
		setIdNumber(idNumber);
		setDepartment(department);
		setPosition(position);
		
		
	}
	public Employee(String name, String idNumber) {
		// TODO Auto-generated constructor stub
		setName(name);
		setIdNumber(idNumber);
		setDepartment("null");
		setPosition("null");
		
		
	}
	public Employee() {
		// TODO Auto-generated constructor stub
		setName("null");
		setIdNumber("0");
		setDepartment("null");
		setPosition("null");
		
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
