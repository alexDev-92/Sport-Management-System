package edu.depaul.cdm.se.sportmanagementsystem.model;

import java.io.Serializable;
import java.sql.Date;
import java.time.Year;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "game_schedule")
@Data
public class GameSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private Long id;

    // home team
    @Column(name = "home_team")
    private String homeTeam;

    // away team
    @Column(name = "away_team")
    private String awayTeam;

    @Column(name = "game_date")
    private Date gameDate;

    @Column(name = "season")
    private int season;
}