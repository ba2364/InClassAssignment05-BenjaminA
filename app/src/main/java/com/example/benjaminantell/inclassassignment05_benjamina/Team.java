package com.example.benjaminantell.inclassassignment05_benjamina;

import java.io.Serializable;

public class Team implements Serializable
{
    private String city;
    private String nickname;
    private int champs;
    private boolean playing;

    public Team(String city, String nickname, int champs, boolean playing)
    {
        this.city = city;
        this.nickname = nickname;
        this.champs = champs;
        this.playing = playing;
    }

    public String getCity()
    {
        return city;
    }

    public String getNickname()
    {
        return nickname;
    }

    public int getChamps()
    {
        return champs;
    }

    public boolean isPlaying()
    {
        return playing;
    }
}