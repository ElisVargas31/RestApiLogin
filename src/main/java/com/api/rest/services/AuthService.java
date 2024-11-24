package com.api.rest.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.LoginRequest;
import com.api.rest.RegisterRequest;
import com.api.rest.modelo.Cliente;
import com.api.rest.modelo.UsuarioRepository;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void register(RegisterRequest request) {
        Cliente usuario = new Cliente();
        usuario.setNombreORazonSocial(request.getNombreORazonSocial());
        usuario.setApellido(request.getApellido());
        usuario.setCorreoElectronico(request.getCorreoElectronico());
        usuario.setTelefono(request.getTelefono());
        usuario.setNit(request.getNit());
        usuario.setPassword(request.getPassword());
        usuarioRepository.save(usuario);
    }

    public String login(LoginRequest request) {
        Cliente usuario = usuarioRepository.findByCorreoElectronico(request.getEmail())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        if (!usuario.getPassword().equals(request.getPassword())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        return new String("Login exitoso");
    }
}
