package com.brentaureli.flappybird.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by Brent on 6/25/2015.
 */
public class GameStateManager {
   private Deque<State> states;

   public GameStateManager() {

      states = new ArrayDeque<State>();
   }

   public void push(State state) {
      states.push(state);
   }

//   public void pop() {
//      states.pop();
//   }

   public void set(State state) {
      states.pop();
      states.push(state);
   }

   public void update(float dt) {
      states.peek().update(dt);
   }

   public void render(SpriteBatch sb) {
      states.peek().render(sb);
   }
}
