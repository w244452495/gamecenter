package com.lx.gamecenter.service.table.intf;

import java.util.List;
import java.util.Map;
import com.lx.gamecenter.entity.table.Table;

public interface TableService {
	
	List<Table> queryTableListByGameId(Map<String, Object> paramMap);
	
}
