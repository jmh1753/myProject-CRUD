DROP TABLE IF EXISTS freeboard;
CREATE TABLE freeboard (
id INT AUTO_INCREMENT PRIMARY KEY,
userid VARCHAR(20) NOT NULL,
title VARCHAR(50) NOT NULL,
content VARCHAR(1000) NOT NULL,
regdate VARCHAR(50) NOT NULL
)DEFAULT CHARSET=utf8;

commit;