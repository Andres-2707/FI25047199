package PP2;

    import java.util.ArrayList;

public class MyStackCharacter implements MyStackInterface<Character> {

    private ArrayList<Character> myList = new ArrayList<>();

    @Override
    public void push(Character item) {
        myList.add(item);
    }

    @Override
    public Character pop() {
        if (empty()) {
            return null;
        }
        return myList.remove(myList.size() - 1);
    }

    @Override
    public Character peek() {
        if (empty()) {
            return null;
        }
        return myList.get(myList.size() - 1);
    }

    @Override
    public boolean empty() {
        return myList.isEmpty();
    }

    @Override
    public int size() {
        return myList.size();
    }
}

