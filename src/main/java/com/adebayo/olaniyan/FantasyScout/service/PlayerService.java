package com.adebayo.olaniyan.FantasyScout.service;
import com.adebayo.olaniyan.FantasyScout.dto.PlayerDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface PlayerService {
    Page<PlayerDTO> getPlayersByName(String name, Pageable pageable);
    Page<PlayerDTO> getPlayersByTeamId(Long teamId, Pageable pageable);
    Page<PlayerDTO> getPlayersByPositionId(Long positionId, Pageable pageable);
    Page<PlayerDTO> getAllPlayers(Pageable pageable);


}
