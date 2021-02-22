package ong.generation.educAcao.repository;

import java.util.List;

import ong.generation.educAcao.model.Postagem;
import ong.generation.educAcao.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	
	public List<Usuario> findAllByNome_CompletoContainingIgnoreCase( String nome_Completo);
}
