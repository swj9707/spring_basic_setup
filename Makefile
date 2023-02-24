up:
	docker-compose up -d

down:
	docker-compose down -v

pull:
	docker-compose pull

recreate:
	docker-compose up --force-recreate --build -d