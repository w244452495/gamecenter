package com.lx.gamecenter.entity.game;

import java.io.Serializable;

public class Game implements Serializable {
	
	private static final long	serialVersionUID	= 1L;
	
	private Integer				id;
	
	private String				gameName;
	
	private String				gameUrl;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getGameName() {
		return gameName;
	}
	
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	public String getGameUrl() {
		return gameUrl;
	}
	
	public void setGameUrl(String gameUrl) {
		this.gameUrl = gameUrl;
	}
	
}
