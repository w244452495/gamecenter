package com.lx.gamecenter.service.game.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lx.gamecenter.dao.game.GameDao;
import com.lx.gamecenter.entity.game.Game;
import com.lx.gamecenter.service.game.intf.GameService;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameDao gameDao;
	
	@Override
	public List<Game> queryGameList() {
		return this.gameDao.queryGameList();
	}

	@Override
	public String queryGameNameById(Map<String, Object> paramMap) {
		return this.gameDao.queryGameNameById(paramMap);
	}
	
}
