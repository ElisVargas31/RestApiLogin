package com.api.rest.modelo;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<Cliente,Integer> {
    Optional<Cliente> findByCorreoElectronico(String correoElectronico);
}
