CREATE TABLE
    gc_user
    (
        id INT NOT NULL AUTO_INCREMENT COMMENT 'id',
        user_name VARCHAR(32) COMMENT '用户名',
        password VARCHAR(32) COMMENT '密码',
        nickname VARCHAR(32) COMMENT '昵称',
        registerTime DATETIME COMMENT '注册时间',
        lastLoginTime DATETIME COMMENT '上次登录时间',
        lastRequestUrl VARCHAR(512) COMMENT '上次请求url',
        admin_flag VARCHAR(4) DEFAULT '0' COMMENT '管理员标识',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
INSERT INTO gc_user (id, user_name, password, nickname, registerTime, lastLoginTime, lastRequestUrl, admin_flag) VALUES (1, 'admin', '123456', '管理员', '2019-03-10 22:00:00', '2019-03-10 22:00:00', null, '1');


CREATE TABLE
    gc_game
    (
        id INT NOT NULL AUTO_INCREMENT COMMENT 'id',
        game_name VARCHAR(100) COMMENT '游戏名称',
		game_url VARCHAR(256) COMMENT '游戏url',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
INSERT INTO gc_game (id, game_name, game_url) VALUES (1, '斗地主', 'table/landlord');
INSERT INTO gc_game (id, game_name, game_url) VALUES (2, '德州扑克', 'javascript;');

	
CREATE TABLE
    gc_table
    (
        id INT NOT NULL AUTO_INCREMENT COMMENT 'id',
        game_id INT COMMENT '游戏id',
		max_site_num INT COMMENT '座位数',
		game_status VARCHAR(2) COMMENT '游戏状态，0-未开始，1-进行中',
		table_url VARCHAR(256) COMMENT '桌子url',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
INSERT INTO gc_table (id, game_id, max_site_num, game_status, table_url) VALUES (1, 1, 3, '0', 'landlord');
INSERT INTO gc_table (id, game_id, max_site_num, game_status, table_url) VALUES (2, 1, 3, '0', 'landlord');

	
CREATE TABLE
    gc_user_site
    (
        id INT NOT NULL AUTO_INCREMENT COMMENT 'id',
		user_id INT COMMENT '用户id',
		user_name VARCHAR(32) COMMENT '用户名',
        game_id INT COMMENT '游戏id',
        table_id INT COMMENT '桌子id',
        site_id INT COMMENT '座位id',
        site_html_id VARCHAR(100) COMMENT 'HTML id',
		game_status VARCHAR(2) COMMENT '游戏状态，0-未开始，1-进行中，2-准备',
		user_poker VARCHAR(1024) COMMENT '手牌',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
    
INSERT INTO gc_user_site (id, user_id, user_name, game_id, table_id, site_id, site_html_id, game_status, user_poker) VALUES (1, 1, 'admin', 1, 1, 1, '#SITE_010101', '0', null);

	
CREATE TABLE
    gc_user_point
    (
        id INT NOT NULL AUTO_INCREMENT COMMENT 'id',
		user_id INT COMMENT '用户id',
        game_id INT COMMENT '游戏id',
		point INT COMMENT '积分',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;

