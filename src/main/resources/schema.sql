DROP TABLE IF EXISTS INFO;

CREATE TABLE INFO (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age INTEGER NOT NULL
);

INSERT INTO INFO (name, age) VALUES
  ('Kang', 38),
  ('Lee', 21),
  ('Cho', 26);
