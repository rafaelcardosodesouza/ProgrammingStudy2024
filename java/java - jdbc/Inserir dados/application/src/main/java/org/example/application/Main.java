package org.example.application;

import org.example.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
           /* st = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                    "VALUES (?, ?, ?, ?,?)"); */
            st = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                    "VALUES (?, ?, ?, ?,?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Rafael Cardoso");
            st.setString(2, "rafael9638527410@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("19/11/1998").getTime()));
            st.setDouble(4, 2500.00);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate();

            if(rowsAffected > 0){
                ResultSet rs= st.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Pronto, id = " + id);
                }
            }else{
                System.out.println("Nenhuma linha alterada");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}