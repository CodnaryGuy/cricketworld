package com.crick.apis.repositories;

import com.crick.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<com.crick.apis.entities.Match,Integer> {

    Optional<Match> findByTeamHeading(String teamHeading);

}
