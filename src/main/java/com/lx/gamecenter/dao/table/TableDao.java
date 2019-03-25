package com.lx.gamecenter.dao.table;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.lx.gamecenter.entity.table.Table;

@Repository
public interface TableDao {
	
	List<Table> queryTableListByGameId(Map<String, Object> paramMap);
	
	List<Table> queryTableListByGameIdAndGameStatus(Map<String, Object> paramMap);
}
