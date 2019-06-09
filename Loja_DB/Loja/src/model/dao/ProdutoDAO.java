package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cliente;

public class ProdutoDAO {

    public void create(Cliente c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cliente (CPF_Cliente,nome,rua,bairro,cidade) VALUES (?,?,?,?,?)");
            stmt.setInt(1, c.getCPF_Cliente());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getRua());
            stmt.setString(4, c.getBairro());
            stmt.setString(5, c.getCidade());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Cliente> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;
        List<Cliente> cliente = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCPF_Cliente(rs.getInt("CPF_Cliente"));
                c.setNome(rs.getString("nome"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));

                cliente.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }
    public List<Cliente> readForName(String Nome) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;
        List<Cliente> cliente = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE Nome LIKE ?");
            stmt.setString(1, "%"+Nome+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCPF_Cliente(rs.getInt("CPF_Cliente"));
                c.setNome(rs.getString("nome"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                    
                cliente.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }
    
    public List<Cliente> readForCidade(String Cidade) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;
        List<Cliente> cliente = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE Cidade LIKE ?");
            stmt.setString(1, "%"+Cidade+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCPF_Cliente(rs.getInt("CPF_Cliente"));
                c.setNome(rs.getString("nome"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                    
                cliente.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }
    
    
    
    public List<Cliente> readForCPF(String CPF_Cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        ResultSet rs = null;
        List<Cliente> cliente = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE CPF_Cliente LIKE ?");
            stmt.setString(1, "%"+CPF_Cliente+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCPF_Cliente(rs.getInt("CPF_Cliente"));
                c.setNome(rs.getString("nome"));
                c.setRua(rs.getString("rua"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                    
                cliente.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }

    public void update(Cliente c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET nome = ?,rua = ?,bairro = ?,cidade = ? WHERE CPF_Cliente = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getRua());
            stmt.setString(3, c.getBairro());
            stmt.setString(4, c.getCidade());
            stmt.setInt(5, c.getCPF_Cliente());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }    
    public void delete(Cliente c){

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE CPF_Cliente = ?");
            stmt.setInt(1, c.getCPF_Cliente());
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    

}

