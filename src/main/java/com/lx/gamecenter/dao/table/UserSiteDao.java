package com.lx.gamecenter.dao.table;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.lx.gamecenter.entity.table.UserSite;

@Repository
public interface UserSiteDao {
	
	List<UserSite> queryUserSiteListByGameIdAndGameStatus(Map<String, Object> paramMap);

}
