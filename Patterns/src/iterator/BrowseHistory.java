package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BrowseHistory {
  LinkedList<String> urls = new LinkedList<>();

  public void push(String url) {
    urls.add(url);
  }

  public String pop() {
    var lastIndex = urls.size() - 1;
    return urls.remove(lastIndex);
  }

  public Iterator createIterator() {
    return new LinkedListIterator(this);
  }

  public class LinkedListIterator implements Iterator {
    private BrowseHistory history;
    private int index;

    public LinkedListIterator(BrowseHistory history) {
      this.history = history;
    }

    @Override
    public boolean hasNext() {
      return index < history.urls.size();
    }

    @Override
    public Object current() {
      return history.urls.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }
}
