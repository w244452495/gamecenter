package com.lx.gamecenter.service.game.intf;

import java.util.List;
import java.util.Map;
import com.lx.gamecenter.entity.game.Game;

public interface GameService {
	
	List<Game> queryGameList();
	
	String queryGameNameById(Map<String, Object> paramMap);
	
}
