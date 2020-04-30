package com.ghostbusters.game;

import com.ghostbusters.framework.Game;
import com.ghostbusters.framework.Graphics;
import com.ghostbusters.framework.Screen;
import com.ghostbusters.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
        Assets.down1 = g.newPixmap("down1.png", PixmapFormat.ARGB4444);
        Assets.down2 = g.newPixmap("down2.png", PixmapFormat.ARGB4444);
        Assets.down3 = g.newPixmap("down3.png", PixmapFormat.ARGB4444);
        Assets.ghost = g.newPixmap("ghost.png", PixmapFormat.ARGB4444);
        Assets.left1 = g.newPixmap("left1.png", PixmapFormat.ARGB4444);
        Assets.left2 = g.newPixmap("left2.png", PixmapFormat.ARGB4444);
        Assets.left3 = g.newPixmap("left3.png", PixmapFormat.ARGB4444);
        Assets.pacman = g.newPixmap("pacman.png", PixmapFormat.ARGB4444);
        Assets.right1 = g.newPixmap("right1.png", PixmapFormat.ARGB4444);
        Assets.right2 = g.newPixmap("right2.png", PixmapFormat.ARGB4444);
        Assets.right3 = g.newPixmap("right3.png", PixmapFormat.ARGB4444);
        Assets.up1 = g.newPixmap("up1.png", PixmapFormat.ARGB4444);
        Assets.up2 = g.newPixmap("up2.png", PixmapFormat.ARGB4444);
        Assets.up3 = g.newPixmap("up3.png", PixmapFormat.ARGB4444);

//        Assets.click = game.getAudio().newSound("click.ogg");
//        Assets.eat = game.getAudio().newSound("eat.ogg");
//        Assets.bitten = game.getAudio().newSound("bitten.ogg");
//        Settings.load(game.getFileIO());
        game.setScreen(new GameScreen(game));
    }

    public void present(float deltaTime) {

    }

    public void pause() {

    }

    public void resume() {

    }

    public void dispose() {

    }
}