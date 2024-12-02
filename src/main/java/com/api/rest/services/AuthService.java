package com.api.rest.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.LoginRequest;
import com.api.rest.RegisterRequest;
import com.api.rest.SolicitudRequest;
import com.api.rest.modelo.Cliente;
import com.api.rest.modelo.Solicitud;
import com.api.rest.modelo.SolicitudRepository;
import com.api.rest.modelo.UsuarioRepository;

@Service
public class AuthService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Autowired
    private SolicitudRepository solicitudRepository;

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
    
    public void solicitud(SolicitudRequest request) {
    	// Crear una nueva instancia de SolicitudRequest
    	Solicitud solicitud = new Solicitud();

    	// Rellenar los campos directamente del objeto `request`
    	solicitud.setFecha(request.getFecha());
    	solicitud.setEstado(request.getEstado());
    	solicitud.setCargo(request.getCargo());
    	solicitud.setCliente_id(20);
    	solicitud.setExperiencia(request.getExperiencia());
    	solicitud.setTipo_de_contrato(request.getTipo_de_contrato());
    	solicitud.setNivel_profesion(request.getNivel_profesion());
    	solicitud.setComentario(request.getComentario());
    	solicitud.setOtros(request.getOtros());

    	// Guardar la solicitud en el repositorio
    	solicitudRepository.save(solicitud);
    }
    
    
}
