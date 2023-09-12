package memento;

import java.util.Stack;

public class History {
  private Stack<State> states = new Stack<>();

  public void push(State state) {
    states.push(state);
  }

  public State pop() {
    return states.pop();
  }
}
