import java.sql.*;

/**
 *
 * @author ROYALCOMPUTERSCARE
 */
class database {
    Connection con;
    public database()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/gate_entry","root","");
            System.out.println("connection created");
        }
            catch(Exception d){}
        
    }

    
    boolean input(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
        
            try
            {
                PreparedStatement ps=con.prepareStatement("insert into visitor values(?,?,?,?,?,?,?,?)");
                ps.setString(1,s1);
                ps.setString(2,s2);
                ps.setString(3,s3);
                ps.setString(4,s4);
                ps.setString(5,s5);
                ps.setString(6,s6);
                ps.setString(7,s7);
                ps.setString(8,s8);
                ps.executeUpdate();
                return true;
            }
            catch(Exception t){}
            return false;
            }
            
    
 public boolean input1(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
        
            try
            {
                PreparedStatement ps=con.prepareStatement("insert into transport values(?,?,?,?,?,?,?,?)");
                ps.setString(1,s1);
                ps.setString(2,s2);
                ps.setString(3,s3);
                ps.setString(4,s4);
                ps.setString(5,s5);
                ps.setString(6,s6);
                ps.setString(7,s7);
                ps.setString(8,s8);
                ps.executeUpdate();
                return true;
            }
            catch(Exception t){}
            return false;
            }

    public boolean Delete(String s1) {
       try
       {
           PreparedStatement ps=con.prepareStatement("delete from visitor where id_no=?");
           ps.setString(1,s1);
           int m=ps.executeUpdate();
           if(m>0)
           {
               return true;
           }else
           {
               return false;
           }
       }
       catch(Exception a){}
       return false;
       
    }

    boolean delete1(String s1) {
               try
       {
           PreparedStatement ps=con.prepareStatement("delete from transport where id_no=?");
           ps.setString(1,s1);
           int m=ps.executeUpdate();
           if(m>0)
           {
               return true;
           }else
           {
               return false;
           }
       }
       catch(Exception a){}
       return false;
    }
 

 public boolean update(String s2, String s3, String s4, String s5, String s6, String s7,String s8,String s1)
{
try{
PreparedStatement ps=con.prepareStatement("update visitor set Name=?,Address=?,Time=?,Id_proof=?,Gender=?,Contact_no=?,Purpose=? where id_no=?");
ps.setString(1,s2);
ps.setString(2,s3);
ps.setString(3,s4);
ps.setString(4,s5);
ps.setString(5,s6);
ps.setString(6,s7);
ps.setString(7,s8);
ps.setString(8,s1);
ps.executeUpdate();
return true;
}
catch(Exception c){}
return false;

}

    boolean update1(String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s1) {
      try{
PreparedStatement ps=con.prepareStatement("update transport set Name=?,Address=?,Vehicle_no=?,Id_proof=?,Gender=?,Contact_no=?,Purpose=? where id_no=?");
ps.setString(1,s2);
ps.setString(2,s3);
ps.setString(3,s4);
ps.setString(4,s5);
ps.setString(5,s6);
ps.setString(6,s7);
ps.setString(7,s8);
ps.setString(8,s1);
ps.executeUpdate();
return true;
}
catch(Exception c){}
return false;  
    }
}
