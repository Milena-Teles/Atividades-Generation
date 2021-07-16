package com.MinhaLojaDeGames.MinhaLojaDeGames.SEGURANCA;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.Usuario;
import com.MinhaLojaDeGames.MinhaLojaDeGames.REPOSITORY.UsuarioRepository;


@Service
public class UserDetailsServiceImp implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario = usuarioRepository.findByEmail(email);
		
		if(usuario.isPresent()) {
			return new UserDetailsImp(usuario.get());
		}
		else {
			throw new UsernameNotFoundException(email + " inexistente!");
		}
		
	}
}
