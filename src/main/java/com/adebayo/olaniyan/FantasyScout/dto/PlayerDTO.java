package com.adebayo.olaniyan.FantasyScout.dto;

public record PlayerDTO(
        String playerName,
        String teamAbbreviation,
        String positionAbbreviation,
        String collegeTeam,
        Integer age,
        Integer heightInches,
        Integer weightLbs,
        Double pprFantasyPoints,
        Double halfPprFantasyPoints,
        Double standardFantasyPoints
) {}
