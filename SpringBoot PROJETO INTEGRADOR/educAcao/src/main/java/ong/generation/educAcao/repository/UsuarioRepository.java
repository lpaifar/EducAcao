package ong.generation.educAcao.repository;

import java.util.List;

import ong.generation.educAcao.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	
<<<<<<< HEAD
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase( String nome_Completo);
=======
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase( String nomeCompleto);
>>>>>>> 1a9ede4aededa6ebc69f1cc7c84eab44cc88fb87
}
