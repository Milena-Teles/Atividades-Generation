package com.MinhaLojaDeGames.MinhaLojaDeGames.SERVICE;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.Usuario;
import com.MinhaLojaDeGames.MinhaLojaDeGames.MODEL.UsuarioLogin;
import com.MinhaLojaDeGames.MinhaLojaDeGames.REPOSITORY.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Optional<Object> cadastrar(Usuario novoUsuario) {
		return usuarioRepository.findByEmail(novoUsuario.getEmail()).map(usuarioExistente -> {
			return Optional.empty();
		}).orElseGet(() -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			String senhaCriptografada = encoder.encode(novoUsuario.getSenha());
			novoUsuario.setSenha(senhaCriptografada);
			return Optional.ofNullable(usuarioRepository.save(novoUsuario));
		});
	}

	public Optional<?> logar(UsuarioLogin usuarioLogin) {
		return usuarioRepository.findByEmail(usuarioLogin.getEmail()).map(usuarioExistente -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(usuarioLogin.getSenha(), usuarioExistente.getSenha())) {
				String estruturaBasic = usuarioLogin.getEmail() + ":" + usuarioLogin.getSenha();
				byte[] autorizacaoBase64 = Base64.encodeBase64(estruturaBasic.getBytes(Charset.forName("US-ASCII")));
				;
				String autorizacaoHeader = "Basic " + new String(autorizacaoBase64);

				usuarioLogin.setToken(autorizacaoHeader);
				usuarioLogin.setEmail(usuarioExistente.getEmail());
				usuarioLogin.setSenha(usuarioExistente.getSenha());

				return Optional.ofNullable(usuarioLogin);
			} else {
				return Optional.empty();
			}

		}).orElse(Optional.empty());

	}
}
