package com.adebayo.olaniyan.FantasyScout.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @Column(name = "team_id")
    private Long teamId;

    private String teamName;
    private String abbreviation;

    public Team() {
    }

    public Team(Long teamId, String teamName, String abbreviation) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.abbreviation = abbreviation;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(teamId, team.teamId) && Objects.equals(teamName, team.teamName) && Objects.equals(abbreviation, team.abbreviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, teamName, abbreviation);
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", teamName='" + teamName + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
