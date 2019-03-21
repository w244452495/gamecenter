package com.lx.gamecenter.dao.game;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.lx.gamecenter.entity.game.Game;

@Repository
public interface GameDao {
	
	List<Game> queryGameList();
	
	Game queryGameNameById(Map<String, Object> paramMap);
	
}
