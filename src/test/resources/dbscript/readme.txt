数据库的备份和还原相关命令

1、备份单个数据库，包含存储过程和函数[压缩]
mysqldump -hlocalhost -uroot -pMysql@123456 --databases damon --add-drop-database --single-transaction --routines --events >damon.backup.sql
mysqldump -hlocalhost -uroot -pMysql@123456 --databases damon --add-drop-database --single-transaction --routines --events |gzip>damon.backup.sql.gz
# 不包含数据
mysqldump -hlocalhost -uroot -pMysql@123456 --databases damon --add-drop-database --single-transaction --routines --events --no-data >damon-no-data.backup.sql


2、还原数据库
# 创建数据库
CREATE DATABASE damon DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci
# 还原数据库
mysql -hlocalhost -uroot -pMysql@123456 damon < damon.backup.sql
gunzip<damon.backup.sql.gz | mysql -uroot -pMysql@123456 damon



3、数据库备份脚本
damon.backup.sh

#!/bin/bash
echo "备份本地文件-----> `date '+%Y-%m-%d %H:%M:%S'`"
backupip=localhost
rm -f damon.backup.sql
mv damon.backup.sql damon.backup.sql.bak
echo "数据库迁移开始----> `date '+%Y-%m-%d %H:%M:%S'`"
mysqldump -h$backupip -uroot -pMysql@123456 --databases damon --add-drop-database --single-transaction --routines --events >damon.backup.sql
echo "数据库备份完成----> `date '+%Y-%m-%d %H:%M:%S'`"


4、数据库还原脚本
damon.restore.sh

#!/bin/bash
echo "删除数据库-----> `date '+%Y-%m-%d %H:%M:%S'`"
restoreip=localhost
echo "创建空的数据库-->`date '+%Y-%m-%d %H:%M:%S'`"
mysql -h$restoreip  -P3306  -uroot -pMysql@123456 -e "CREATE DATABASE damon DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci" --default-character-set=UTF8
echo "开始还原数据库-->`date '+%Y-%m-%d %H:%M:%S'`"
mysql -hlocalhost -uroot -pMysql@123456 damon < damon.backup.sql
echo "数据库还原完成-->`date '+%Y-%m-%d %H:%M:%S'`"

# echo "创建用户-->`date '+%Y-%m-%d %H:%M:%S'`"
# mysql -h$restoreip  -P3306  -uroot -pMysql@123456 -e "grant all privileges on *.* to 'zs'@'%' identified by 'Mysql@123456' with grant option" --default-character-set=UTF8