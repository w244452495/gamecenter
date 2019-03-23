package com.lx.gamecenter.entity.table;

import java.io.Serializable;

/**
 * @Title:  Table.java   
 * @Package com.lx.gamecenter.entity.table   
 * @Description: 桌子实体类
 * @author: Lixin
 * @date:   2019年3月17日 下午8:29:15   
 * @version V1.0 
 * @Copyright: 2019 www.lixin.com Inc. All rights reserved.
 */
public class Table implements Serializable {
	
	private static final long	serialVersionUID	= 1L;
	
	private Integer				id;
	
	private Integer				gameId;
	
	private String				tableHtmlId;
	
	private Integer				maxSiteNum;
	
	private String				gameStatus;
	
	private String				tableUrl;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getGameId() {
		return gameId;
	}
	
	public void setGameId(Integer gameId) {
		this.gameId = gameId;
	}
	
	public String getTableHtmlId() {
		return tableHtmlId;
	}
	
	public void setTableHtmlId(String tableHtmlId) {
		this.tableHtmlId = tableHtmlId;
	}
	
	public Integer getMaxSiteNum() {
		return maxSiteNum;
	}
	
	public void setMaxSiteNum(Integer maxSiteNum) {
		this.maxSiteNum = maxSiteNum;
	}
	
	public String getGameStatus() {
		return gameStatus;
	}
	
	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}
	
	public String getTableUrl() {
		return tableUrl;
	}
	
	public void setTableUrl(String tableUrl) {
		this.tableUrl = tableUrl;
	}
	
}
