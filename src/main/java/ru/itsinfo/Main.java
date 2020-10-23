package ru.itsinfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("playerBean", MusicPlayer.class);
        player.playMusic();

        context.close();
    }
}
