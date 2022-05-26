use sakila;

SELECT * FROM film_actor;
SELECT * FROM actor;
SELECT * FROM film_category;
SELECT * FROM film_text;
SELECT * FROM film;
SELECT * FROM category;

SELECT actor.first_name, actor.last_name, film_actor.film_id FROM actor 
	JOIN film_actor ON actor.actor_id = film_actor.actor_id;
    
SELECT actor.first_name, actor.last_name, film_actor.film_id, film.title, film.`description` 
	FROM actor 
	JOIN film_actor ON actor.actor_id = film_actor.actor_id
    JOIN film ON film_actor.film_id = film.film_id;

SELECT actor.first_name, actor.last_name, film_actor.film_id FROM actor 
	LEFT OUTER JOIN film_actor ON actor.actor_id = film_actor.actor_id;

SELECT actor.first_name, actor.last_name, film_actor.film_id FROM actor 
	RIGHT OUTER JOIN film_actor ON actor.actor_id = film_actor.actor_id;

SELECT actor.first_name, actor.last_name, film_actor.film_id, film.title, film.`description` 
	FROM actor 
	JOIN film_actor ON actor.actor_id = film_actor.actor_id
    RIGHT OUTER JOIN film ON film_actor.film_id = film.film_id;
    
   SELECT a.first_name, a.last_name, fa.film_id, f.title, f.`description` 
	FROM actor a
	JOIN film_actor fa ON a.actor_id = fa.actor_id
    JOIN film f ON fa.film_id = f.film_id; 