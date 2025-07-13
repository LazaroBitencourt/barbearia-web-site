package com.github.LazaroBitencourt.barbearia_web_site.usuario.infra;

import com.github.LazaroBitencourt.barbearia_web_site.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioSpringDataJpaRepository extends JpaRepository<Usuario, Long> {
}
