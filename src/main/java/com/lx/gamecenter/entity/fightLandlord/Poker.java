package com.lx.gamecenter.entity.fightLandlord;

public class Poker {

	private Integer pokerId = null;

	private Integer pokerValue = null;

	private String pokerDesc = null;

	public Poker(Integer pokerId, Integer pokerValue, String pokerDesc) {
		super();
		this.pokerId = pokerId;
		this.pokerValue = pokerValue;
		this.pokerDesc = pokerDesc;
	}

	public Integer getPokerId() {
		return pokerId;
	}

	public void setPokerId(Integer pokerId) {
		this.pokerId = pokerId;
	}

	public Integer getPokerValue() {
		return pokerValue;
	}

	public void setPokerValue(Integer pokerValue) {
		this.pokerValue = pokerValue;
	}

	public String getPokerDesc() {
		return pokerDesc;
	}

	public void setPokerDesc(String pokerDesc) {
		this.pokerDesc = pokerDesc;
	}

}
