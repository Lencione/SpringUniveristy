package br.edu.faj.aulajdbc.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@Repository
public class PessoaDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Pessoa incluir(Pessoa p) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "aluno", "aluno");

            Statement stmt = con.createStatement();
            stmt.executeUpdate(String.format("INSERT INTO PESSOA (nome,endereco,telefone) VALUES %s %s %s",p.getNome(),p.getEndereco(),p.getTelefone()));
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return p;
    }
}
