package com.adebayo.olaniyan.FantasyScout.service;

import com.adebayo.olaniyan.FantasyScout.dto.PlayerDTO;
import com.adebayo.olaniyan.FantasyScout.entity.Player;
import com.adebayo.olaniyan.FantasyScout.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Page<PlayerDTO> getAllPlayers(Pageable pageable) {
        return playerRepository.findAllByOrderByPprFantasyPointsDesc(pageable)
                .map(this::mapToDTO);
    }


    @Override
    public Page<PlayerDTO> getPlayersByName(String name, Pageable pageable) {
        Page<Player> page = playerRepository.findByPlayerNameContainingIgnoreCase(name, pageable);
        return page.map(this::mapToDTO);
    }


    @Override
    public Page<PlayerDTO> getPlayersByTeamId(Long teamId, Pageable pageable) {
        return playerRepository.findByTeam_TeamIdOrderByPprFantasyPointsDesc(teamId, pageable)
                .map(this::mapToDTO);
    }

    @Override
    public Page<PlayerDTO> getPlayersByPositionId(Long positionId, Pageable pageable) {
        return playerRepository.findByPosition_PositionIdOrderByPprFantasyPointsDesc(positionId, pageable)
                .map(this::mapToDTO);
    }


    private PlayerDTO mapToDTO(Player player) {
        return new PlayerDTO(
                player.getPlayerName(),
                player.getTeam().getAbbreviation(),
                player.getPosition().getAbbreviation(),
                player.getCollegeTeam(),
                player.getAge(),
                player.getHeightInches(),
                player.getWeightLbs(),
                player.getPprFantasyPoints(),
                player.getHalfPprFantasyPoints(),
                player.getStandardFantasyPoints()
        );
    }
}
