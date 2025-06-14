package com.adebayo.olaniyan.FantasyScout.repository;
import com.adebayo.olaniyan.FantasyScout.entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PlayerRepository extends JpaRepository<Player, Long> {
    Page<Player> findByPlayerNameContainingIgnoreCase(String name, Pageable pageable);
    Page<Player> findByTeam_TeamIdOrderByPprFantasyPointsDesc(Long teamId, Pageable pageable);
    Page<Player> findByPosition_PositionIdOrderByPprFantasyPointsDesc(Long positionId, Pageable pageable);
    Page<Player> findAllByOrderByPprFantasyPointsDesc(Pageable pageable);




}
