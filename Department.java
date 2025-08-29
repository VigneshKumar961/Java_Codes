// You are using Java

import java.sql.*;

class Department{
    
    public static void main(String[] args){
        
        try{
            
        // Class.forName("com.mysql.jdbc.driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");

		Statement stmt  = con.createStatement();
		
        String sql = "select lower(department_name) as department_name from  department";
		
		ResultSet rs = stmt.executeQuery(sql);
		
// 		System.out.println("Connected");
		
// 		System.out.println("department_id \t department_name");
		
		
		while(rs.next()){
		    
		   System.out.println(rs.getString(1));
		   
		   
		    
		}
		
		con.close();
		    
		    
		}catch(Exception e){
        
        System.out.println (e);
        
    }
    
    }
    
}

