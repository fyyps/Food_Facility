


1.Execute sqls.  

   ```
   scripts/sqls/init.sql : create database and tables
   scripts/sqls/data.sql : import default data
   ```

2.change the config file and change the db config 

   the config in  file "src/main/resources/application.yml" should be changed if your db config is not the same.
   ```
  datasource:
    url: jdbc:mysql://localhost:3306/ysld_test?serverTimezone=UTC&characterEncoding=utf8&useSSL=true
    username: root
    password: root
  ```

3.build and run  

   ```
  build :  in this directory,execute command "mvn clean package"
  run :  find the file "target/Food_Facility-1.0-SNAPSHOT.jar" and Execute the command "java -jar Food_Facility-1.0-SNAPSHOT.jar"
  ```

4.get data by those urls:  

 ```
  http://localhost:8080/food-facility-permit/listAll  
  http://localhost:8080/food-facility-permit/listByPage?pageNum=1&pageSize=10  
  http://localhost:8080/food-facility-permit/detail?id=1733611
 ```







