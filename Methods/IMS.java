class Stud
{
	int StudID;
	String StudName;
	int attendanceCount = 0;
	static String InstituteName= "Cyber Success";
	void SetStudInfo(int StudID, String StudName)
	{
		this.StudID = StudID;
		this.StudName = StudName;
		System.out.println("Successfully set stud info");
	}
	void getStudInfo()
	{
		System.out.println("StudID : " +StudID + " StudName : " + StudName+ " Institute Name "  +InstituteName);
	}
	void markAttendance() 
	{
        attendanceCount++ ;
        System.out.println("Attendance marked: " + StudName);
    }
    static void attendance() 
	{
        System.out.println("attendance method for all students: " + InstituteName);
    }
}
class IMS
{
	public static void main(String args[])
	{
		Stud Stud1 = new Stud();
		Stud1.SetStudInfo(101, "Ram");
		Stud1.markAttendance();
		Stud1.getStudInfo();	
		Stud Stud2 = new Stud();
		Stud2.SetStudInfo(102, "Sham");
		Stud2.markAttendance();
		Stud2.getStudInfo();
		
		Stud.attendance();
	}
	
}