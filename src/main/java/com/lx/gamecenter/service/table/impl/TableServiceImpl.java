package com.lx.gamecenter.service.table.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lx.gamecenter.dao.table.TableDao;
import com.lx.gamecenter.entity.table.Table;
import com.lx.gamecenter.service.table.intf.TableService;

@Service
public class TableServiceImpl implements TableService {
	
	@Autowired
	private TableDao tableDao;
	
	@Override
	public List<Table> queryTableListByGameId(Map<String, Object> paramMap) {
		return this.tableDao.queryTableListByGameId(paramMap);
	}
	
}
