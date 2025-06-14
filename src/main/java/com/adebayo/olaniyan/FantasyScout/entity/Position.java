package com.adebayo.olaniyan.FantasyScout.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "positions")
public class Position {

    @Id
    @Column(name = "position_id")
    private Long positionId;

    private String positionName;

    private String abbreviation;

    public Position() {
    }

    public Position(Long positionId, String positionName, String abbreviation) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.abbreviation = abbreviation;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
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
        Position position = (Position) o;
        return Objects.equals(positionId, position.positionId) && Objects.equals(positionName, position.positionName) && Objects.equals(abbreviation, position.abbreviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionId, positionName, abbreviation);
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId=" + positionId +
                ", positionName='" + positionName + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}