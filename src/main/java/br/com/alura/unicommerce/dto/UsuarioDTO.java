package br.com.alura.unicommerce.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.alura.unicommerce.modelo.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank(message = "Campo obrigatório")
	@Email(message = "Favor entrar um email válido")
	private String login;

	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String login) {
		this.id = id;
		this.login = login;
	}

	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		login = entity.getLogin();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

}