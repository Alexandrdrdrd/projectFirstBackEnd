CREATE TABLE if not exists persons (
                                id  SERIAL PRIMARY KEY,
                                name VARCHAR(30),
                                surname VARCHAR(30),
                                patronymic VARCHAR(30),
                                agreement bool,
                                code INT
) ;