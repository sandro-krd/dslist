package com.example.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	/*
	 * // Custom query to find games by title
	 * 
	 * @Query("SELECT g FROM Game g WHERE g.title LIKE %:title%") List<Game>
	 * findByTitle(@Param("title") String title);
	 * 
	 * // Custom query to find games by genre
	 * 
	 * @Query("SELECT g FROM Game g WHERE g.genre = :genre") List<Game>
	 * findByGenre(@Param("genre") String genre);
	 * 
	 * // Custom query to find games by platform
	 * 
	 * @Query("SELECT g FROM Game g WHERE g.platforms LIKE %:platform%") List<Game>
	 * findByPlatform(@Param("platform") String platform);
	 */
}
