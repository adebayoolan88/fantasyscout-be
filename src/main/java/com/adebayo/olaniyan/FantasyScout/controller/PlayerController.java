package com.adebayo.olaniyan.FantasyScout.controller;

import com.adebayo.olaniyan.FantasyScout.dto.PlayerDTO;
import com.adebayo.olaniyan.FantasyScout.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public Page<PlayerDTO> getAllPlayers(Pageable pageable) {
        return playerService.getAllPlayers(pageable);
    }



    @GetMapping("/search")
    public Page<PlayerDTO> getPlayersByName(@RequestParam String name, Pageable pageable) {
        return playerService.getPlayersByName(name, pageable);
    }


    @GetMapping("/team/{teamId}")
    public Page<PlayerDTO> getPlayersByTeamId(@PathVariable Long teamId, Pageable pageable) {
        return playerService.getPlayersByTeamId(teamId, pageable);
    }

    @GetMapping("/position/{positionId}")
    public Page<PlayerDTO> getPlayersByPosition(@PathVariable Long positionId, Pageable pageable) {
        return playerService.getPlayersByPositionId(positionId, pageable);
    }



}

