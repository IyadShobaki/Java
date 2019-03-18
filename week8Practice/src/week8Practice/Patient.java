package week8Practice;

public class Patient {
		private String lastName;
		
		private int patientID;
		  
		    public void setLastName(String lname)
		    {
		    	lastName = lname;
		    }
		    
		    public String getLastName()
		    {
		        return lastName;
		    }
		    
		    public void setpatientID(int initPatientID)
		    {
		    	patientID = initPatientID;
		    }
		    
		    public int getPatientID()
		    {
		        return patientID;
		    }
		    public Patient(String initlastName, int initpatientID) {
				lastName = initlastName;
				patientID = initpatientID;
			}
			  
	
}
