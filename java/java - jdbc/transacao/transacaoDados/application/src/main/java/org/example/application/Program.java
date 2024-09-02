package org.example.application;

import org.example.db.DB;
import org.example.db.DbException;
import org.example.db.DbIntegrityException;

import java.sql.*;


public class Program {

    public static void main(String[] args) throws DbIntegrityException {

        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();
            st = conn.createStatement();

            //desativa a atualização do banco de dados
            conn.setAutoCommit(false);
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 20090 where DepartmentId = 1");
            //forçando um erro
            int x = 1;
            if ( x < 2){
                throw new SQLException("Fake error");
            }

            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 where DepartmentId = 2");

            //permite o envio da atualização do banco de dados
            conn.setAutoCommit(true);
            System.out.println("rows1: " + rows1);
            System.out.println("rows2: " + rows2);

        } catch (SQLException e) {
            try {
                //desfaz a operação caso dar erro S
                conn.rollback();
                throw new DbException("rollback error: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("erro no rollback: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}