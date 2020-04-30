package com.ghostbusters.game;

import com.ghostbusters.framework.Game;
import com.ghostbusters.framework.Screen;
import com.ghostbusters.game.Structures.GameState;

public class GameScreen extends Screen {
    private final GameGraphics gameGraphics;
    GameState state = GameState.Menu;
    World world;

    public GameScreen(Game game) {
        super(game);

        this.world = new World();
        //TODO: Add config handling.
        //this.world.Initialize(config);
        this.state = com.ghostbusters.game.Structures.GameState.Game;
        this.gameGraphics = new GameGraphics(game);
    }

    @Override
    public void update(float deltaTime) {
        GameController gameControllerInput = InputWrapper.GetGameControllerInput(game.getInput());
        world.ProcessInput(gameControllerInput);
        world.Update();

        if (world.isGameOver) {
            state = com.ghostbusters.game.Structures.GameState.Exit;
        }
    }

    @Override
    public void present(float deltaTime) {
        gameGraphics.drawImage(Assets.background, 0, 0);
        world.Repaint(gameGraphics);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    public com.ghostbusters.game.Structures.GameState GetState() {
        return this.state;
    }
}