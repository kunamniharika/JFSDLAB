package klu.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class CourseManager {
public String saveCourse(Courses C)throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jfsd17","root","admin123");
	PreparedStatement ps=con.prepareStatement("insert into courses values(?,?,?)");
	ps.setString(1, C.coursecode);
	ps.setString(2,C.coursecode);
	ps.setString(3,C.credits);
	return "new course has been added";	
	
}
}
