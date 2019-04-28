
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public interface IDAO<T> {
    void insert(T nome) throws SQLException;
    void update(T t)throws SQLException;
    void remove(T old)throws SQLException;
    void select()throws SQLException;
    
}
