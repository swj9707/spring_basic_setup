LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES ('c534eb3e-be15-4619-a7b2-ff4379cc6b55','2023-02-24 16:33:09.373161','2023-02-24 16:33:09.373161',NULL,NULL,'1234','email@email.com','testuser');
UNLOCK TABLES;

LOCK TABLES `category` WRITE;
INSERT INTO `category` VALUES (1,'치킨','치킨'),(2,'피자','피자'),(3,'양념 바른 치킨','치킨'),(4,'오리지널피자','피자');
UNLOCK TABLES;

LOCK TABLES `product` WRITE;
INSERT INTO `product` VALUES (1,'쿠쿠섬치킨','쿠쿠섬치킨',18000,'쿠쿠섬치킨'),(2,'쿠쿠섬피자','쿠쿠섬피자',18000,'쿠쿠섬피자'),(3,'쿠쿠섬양념치킨','쿠쿠섬양념치킨',18000,'쿠쿠섬양념치킨'),(4,'쿠쿠섬간장치킨','쿠쿠섬간장치킨',18000,'쿠쿠섬간장치킨'),(5,'쿠쿠섬불고기피자','쿠쿠섬불고기피자',18000,'쿠쿠섬불고기피자'),(6,'쿠쿠섬페퍼로니피자','쿠쿠섬페퍼로니피자',18000,'쿠쿠섬페퍼로니피자');
UNLOCK TABLES;

LOCK TABLES `product_category` WRITE;
INSERT INTO `product_category` VALUES (1,1,1),(2,2,2),(3,1,3),(4,1,4),(5,2,5),(6,2,6),(7,3,3),(8,3,4),(9,4,6);
UNLOCK TABLES;
