USE movielens;

SELECT * FROM movies m
JOIN genres_movies gm ON m.id = gm.movie_id
JOIN genres g ON g.id = gm.genre_id
JOIN ratings r ON m.id = r.movie_id
JOIN users u ON u.id = r.user_id
JOIN occupations o ON o.id = u.occupation_id;