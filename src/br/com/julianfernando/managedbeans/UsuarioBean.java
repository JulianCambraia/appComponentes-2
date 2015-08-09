package br.com.julianfernando.managedbeans;

import javax.faces.bean.ManagedBean;

import br.com.julianfernando.entities.Usuario;

@ManagedBean
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
