# Docker Man
Running this in docker is rather simple. The dockerfile and docker-compose are already set up. You just need to change your root and password, and you schema name, to match what you have in MySQL.

Then, run:

mvn clean package

Make sure your docker desktop is running, and run

docker build -t docker_qap:latest .

and finally,

docker compose up

Your project is now running in docker, and you should be able to interact with the api via something like Postman.

## API Reference

#### Searching

You can search for specific names or tournaments via their id (api/members/id/{id#}, or their name (api/tournaments/name/{namehere}


```http
  GET /api/member,
  GET /api/member/name/{name},
  GET /api/member/id/{id},
  GET /api/tournament,
  GET /api/tournament/name/{name},
  GET /api/tournament/id/{id},
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name` | `string` | **Required**. Name of member or tournament to find 

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `id` | `int` | **Required**. Id of member or tournament to find 

