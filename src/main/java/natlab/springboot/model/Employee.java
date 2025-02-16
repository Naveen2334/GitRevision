package natlab.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "department")
	private String department;
	@Column(name = "position")
	private String position;
	@Column(name = "salary")
	private String salary;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPostion() {
		return position;
	}

	public void setPostion(String postion) {
		this.position = postion;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Employee() {
		
	}
	

	public Employee(long id, String firstName, String dept, String postion, String salary) {
		super();
		this.id = id;
		this.name = firstName;
		this.department = dept;
		this.position = postion;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return name;
	}
	public void setFirstName(String firstName) {
		this.name = firstName;
	}
	
}
