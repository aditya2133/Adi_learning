USE sakila;
SELECT * FROM actor;

SELECT first_name FROM actor;
SELECT first_name, last_name FROM actor WHERE last_name LIKE '%en';

SELECT DISTINCT last_name FROM actor;

SELECT * FROM film;
SELECT title, `description` FROM film WHERE rental_duration >= 5;

SELECT * FROM film WHERE title LIKE 'les%';

SELECT * FROM rental;
SELECT * FROM payment;
SELECT rental_id AS unique_id FROM rental;

SELECT rental_id AS unique_id FROM rental ORDER BY inventory_id DESC;
SELECT * FROM rental ORDER BY inventory_id DESC LIMIT 20;

SELECT actor_id, CONCAT(first_name," ", last_name) AS actor_name, last_update FROM actor;