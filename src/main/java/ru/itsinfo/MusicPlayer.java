package ru.itsinfo;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;

    private int volume;

    public MusicPlayer(List<Music> music) {
        this.musicList = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(List<Music> music) {
        this.musicList = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
