drop table if exists studio;

create table if not exists studio(
	studio_id serial not null primary key,
	name character varying(255),
	last_update timestamp default now()
);

INSERT INTO studio (name) 
VALUES ('AMC Theatres');

INSERT INTO studio (name) 
VALUES ('Regal Cinemas');

INSERT INTO studio (name) 
VALUES ('Cinemark Theatres');

INSERT INTO studio (name) 
VALUES ('Marcus Theatres');

drop table if exists staff;

create table if not exists staff(
	staff_id serial not null primary key,
	name character varying(255),
	contact character varying(13),
	last_update timestamp default now()
);

INSERT INTO staff (name, contact) 
VALUES ('Grace Lee', '0896746722');

INSERT INTO staff (name, contact) 
VALUES ('Megan Davis','08767467223');

INSERT INTO staff (name, contact) 
VALUES ('Robert Johnson','08267347223');

INSERT INTO staff (name, contact) 
VALUES ('Jason Patel', '08145767223');

INSERT INTO staff (name,contact) 
VALUES ('Michael Wilson','08954467223');

INSERT INTO staff (name,contact) 
VALUES ('Olivia Brown', '0853399232');


drop table if exists costumer;

create table if not exists costumer(
	costumer_id serial not null primary key,
	username character varying(255),
	email character varying(255),
	last_update timestamp default now()
);

INSERT INTO costumer (username, email) 
VALUES ('johndoe', 'johndoe@example.com');

INSERT INTO costumer (username, email) 
VALUES ('janedoe', 'janedoe@example.com');

INSERT INTO costumer (username, email) 
VALUES ('bobsmith', 'bobsmith@example.com');

INSERT INTO costumer (username, email) 
VALUES ('alisontaylor', 'alisontaylor@example.com');

INSERT INTO costumer (username, email) 
VALUES ('tomjones', 'tomjones@example.com');

INSERT INTO costumer (username, email) 
VALUES ('sarahbrown', 'sarahbrown@example.com');

INSERT INTO costumer (username, email) 
VALUES ('chriswilson', 'chriswilson@example.com');


drop table if exists film;

create table if not exists film(
	film_id serial not null primary key,
	title text,
	description character varying(255),
	release_date date,
	actors character varying[],
	score_rating numeric(5,2)
);

-- Query 1
INSERT INTO film (title, description, release_date, actors, score_rating) 
VALUES ('The Shawshank Redemption', 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.', '1994-09-14', ARRAY['Tim Robbins', 'Morgan Freeman'], 9.3);

-- Query 2
INSERT INTO film (title, description, release_date, actors, score_rating) 
VALUES ('The Godfather', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', '1972-03-24', ARRAY['Marlon Brando', 'Al Pacino'], 9.2);

-- Query 3
INSERT INTO film (title, description, release_date, actors, score_rating) 
VALUES ('The Dark Knight', 'When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.', '2008-07-18', ARRAY['Christian Bale', 'Heath Ledger'], 9.0);

-- Query 4
INSERT INTO film (title, description, release_date, actors, score_rating) 
VALUES ('The Lord of the Rings: The Return of the King', 'Gandalf and Aragorn lead the World of Men against Saurons army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.', '2003-12-17', ARRAY['Elijah Wood', 'Viggo Mortensen'], 8.9);

-- Query 5
INSERT INTO film (title, description, release_date, actors, score_rating) 
VALUES ('Pulp Fiction', 'The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.', '1994-10-14', ARRAY['John Travolta', 'Samuel L. Jackson'], 8.9);

-- Query 6
INSERT INTO film (title, description, release_date, actors, score_rating) 
VALUES ('Schindlers List', 'In Poland during World War II, Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.', '1993-11-30', ARRAY['Liam Neeson', 'Ben Kingsley'], 8.9);

-- Query 7
INSERT INTO film (title, description, release_date, actors, score_rating) 
VALUES ('Forrest Gump', 'The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other history unfold through the perspective of an Alabama man with an IQ of 75.', '1994-07-06', ARRAY['Tom Hanks', 'Robin Wright'], 8.8);

-- Query 8
INSERT INTO film (title, description, release_date, actors, score_rating) 
VALUES ('The Lord of the Rings: The Fellowship of the Ring', 'A meek hobbit of the Shire and eight companions set out on a journey to Mount Doom to destroy the One Ring and the dark lord Sauron.', '2001-12-19', ARRAY['Elijah Wood', 'Ian McKellen'], 8.8);
