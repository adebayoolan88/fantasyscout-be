package com.adebayo.olaniyan.FantasyScout.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @Column(name = "player_id")
    private Long playerId;

    private String playerName;
    private Integer age;
    private Integer heightInches;
    private Integer weightLbs;
    private String collegeTeam;
    private Integer gamesPlayed;

    private Integer passYrds;
    private Integer passTds;
    private Integer passInts;

    private Integer rushYrds;
    private Integer rushTds;
    private Integer fumbles;

    private Integer recYrds;
    private Integer recTds;
    private Integer receptions;

    private Double pprFantasyPoints;
    private Double halfPprFantasyPoints;
    private Double standardFantasyPoints;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    public Player() {
    }

    public Player(Long playerId, String playerName, Integer age, Integer heightInches, Integer weightLbs, String collegeTeam, Integer gamesPlayed, Integer passYrds, Integer passTds, Integer passInts, Integer rushYrds, Integer rushTds, Integer fumbles, Integer recYrds, Integer recTds, Integer receptions, Double pprFantasyPoints, Double halfPprFantasyPoints, Double standardFantasyPoints, Team team, Position position) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.age = age;
        this.heightInches = heightInches;
        this.weightLbs = weightLbs;
        this.collegeTeam = collegeTeam;
        this.gamesPlayed = gamesPlayed;
        this.passYrds = passYrds;
        this.passTds = passTds;
        this.passInts = passInts;
        this.rushYrds = rushYrds;
        this.rushTds = rushTds;
        this.fumbles = fumbles;
        this.recYrds = recYrds;
        this.recTds = recTds;
        this.receptions = receptions;
        this.pprFantasyPoints = pprFantasyPoints;
        this.halfPprFantasyPoints = halfPprFantasyPoints;
        this.standardFantasyPoints = standardFantasyPoints;
        this.team = team;
        this.position = position;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(Integer heightInches) {
        this.heightInches = heightInches;
    }

    public Integer getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(Integer weightLbs) {
        this.weightLbs = weightLbs;
    }

    public String getCollegeTeam() {
        return collegeTeam;
    }

    public void setCollegeTeam(String collegeTeam) {
        this.collegeTeam = collegeTeam;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getPassYrds() {
        return passYrds;
    }

    public void setPassYrds(Integer passYrds) {
        this.passYrds = passYrds;
    }

    public Integer getPassTds() {
        return passTds;
    }

    public void setPassTds(Integer passTds) {
        this.passTds = passTds;
    }

    public Integer getPassInts() {
        return passInts;
    }

    public void setPassInts(Integer passInts) {
        this.passInts = passInts;
    }

    public Integer getRushYrds() {
        return rushYrds;
    }

    public void setRushYrds(Integer rushYrds) {
        this.rushYrds = rushYrds;
    }

    public Integer getRushTds() {
        return rushTds;
    }

    public void setRushTds(Integer rushTds) {
        this.rushTds = rushTds;
    }

    public Integer getFumbles() {
        return fumbles;
    }

    public void setFumbles(Integer fumbles) {
        this.fumbles = fumbles;
    }

    public Integer getRecYrds() {
        return recYrds;
    }

    public void setRecYrds(Integer recYrds) {
        this.recYrds = recYrds;
    }

    public Integer getRecTds() {
        return recTds;
    }

    public void setRecTds(Integer recTds) {
        this.recTds = recTds;
    }

    public Integer getReceptions() {
        return receptions;
    }

    public void setReceptions(Integer receptions) {
        this.receptions = receptions;
    }

    public Double getPprFantasyPoints() {
        return pprFantasyPoints;
    }

    public void setPprFantasyPoints(Double pprFantasyPoints) {
        this.pprFantasyPoints = pprFantasyPoints;
    }

    public Double getHalfPprFantasyPoints() {
        return halfPprFantasyPoints;
    }

    public void setHalfPprFantasyPoints(Double halfPprFantasyPoints) {
        this.halfPprFantasyPoints = halfPprFantasyPoints;
    }

    public Double getStandardFantasyPoints() {
        return standardFantasyPoints;
    }

    public void setStandardFantasyPoints(Double standardFantasyPoints) {
        this.standardFantasyPoints = standardFantasyPoints;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(playerId, player.playerId) && Objects.equals(playerName, player.playerName) && Objects.equals(age, player.age) && Objects.equals(heightInches, player.heightInches) && Objects.equals(weightLbs, player.weightLbs) && Objects.equals(collegeTeam, player.collegeTeam) && Objects.equals(gamesPlayed, player.gamesPlayed) && Objects.equals(passYrds, player.passYrds) && Objects.equals(passTds, player.passTds) && Objects.equals(passInts, player.passInts) && Objects.equals(rushYrds, player.rushYrds) && Objects.equals(rushTds, player.rushTds) && Objects.equals(fumbles, player.fumbles) && Objects.equals(recYrds, player.recYrds) && Objects.equals(recTds, player.recTds) && Objects.equals(receptions, player.receptions) && Objects.equals(pprFantasyPoints, player.pprFantasyPoints) && Objects.equals(halfPprFantasyPoints, player.halfPprFantasyPoints) && Objects.equals(standardFantasyPoints, player.standardFantasyPoints) && Objects.equals(team, player.team) && Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, playerName, age, heightInches, weightLbs, collegeTeam, gamesPlayed, passYrds, passTds, passInts, rushYrds, rushTds, fumbles, recYrds, recTds, receptions, pprFantasyPoints, halfPprFantasyPoints, standardFantasyPoints, team, position);
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", age=" + age +
                ", heightInches=" + heightInches +
                ", weightLbs=" + weightLbs +
                ", collegeTeam='" + collegeTeam + '\'' +
                ", gamesPlayed=" + gamesPlayed +
                ", passYrds=" + passYrds +
                ", passTds=" + passTds +
                ", passInts=" + passInts +
                ", rushYrds=" + rushYrds +
                ", rushTds=" + rushTds +
                ", fumbles=" + fumbles +
                ", recYrds=" + recYrds +
                ", recTds=" + recTds +
                ", receptions=" + receptions +
                ", pprFantasyPoints=" + pprFantasyPoints +
                ", halfPprFantasyPoints=" + halfPprFantasyPoints +
                ", standardFantasyPoints=" + standardFantasyPoints +
                ", team=" + team +
                ", position=" + position +
                '}';
    }
}
