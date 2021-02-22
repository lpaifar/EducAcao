package ong.generation.educAcao.repository;

import java.util.List;

import ong.generation.educAcao.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Postagem, Long>{
	public List<Postagem> findAllByNome_CompletoContainingIgnoreCase( String nome_Completo);
}
