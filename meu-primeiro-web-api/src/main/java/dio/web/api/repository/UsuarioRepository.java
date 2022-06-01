package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE");
        else
            System.out.println("UPDATE");
        System.out.println(usuario);
    }

    public void deleteByID(Integer id){
        System.out.println(String.format("DELETE/id - id: %d", id));
        System.out.print(id);
    }

    public Usuario findAll(){
        System.out.print("LISTA DE USUÁRIOS DO SISTEMA");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario( "leket", "321"));
        usuarios.add(new Usuario("shayder","123"));
        return (Usuario) usuarios;
    }

    public Usuario findById(Integer id){
        System.out.print(String.format("FIND/id - id: %d", id));
        return new Usuario("shayder","123");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - username: %s", username));
        return new Usuario("shayder", "123");
    }
}
