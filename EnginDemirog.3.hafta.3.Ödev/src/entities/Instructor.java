package entities;

public class Instructor{
	
	private int instructorId;
	private String instructorName;
	private String instrucktorLastName;
	
	
	public Instructor(int instructorId, String instructorName, String instrucktorLastName) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.instrucktorLastName = instrucktorLastName;
	}


	public int getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}


	public String getInstructorName() {
		return instructorName;
	}


	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}


	public String getInstrucktorLastName() {
		return instrucktorLastName;
	}


	public void setInstrucktorLastName(String instrucktorLastName) {
		this.instrucktorLastName = instrucktorLastName;
	}
	
	
	
	
}
