package msdingfield.flashcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matt on 11/1/2014.
 */
public class CardDao {

    private final ArrayList<Group> groups = new ArrayList<Group>();
    private final ArrayList<Word> words = new ArrayList<Word>();

    public CardDao() {
        final Group g = new Group();
        g.setColor(0x444444);
        g.setGroupName("default");
        groups.add(g);

        words.add(new Word("Dog"));
        words.add(new Word("Cat"));
        words.add(new Word("Bird"));
        words.add(new Word("Snake"));
    }

    public static class Group {
        private final String groupId;
        private String groupName;
        private int color;

        public Group()
        {
            groupId = java.util.UUID.randomUUID().toString();
        }

        public void setGroupName(final String name) {
            this.groupName = name;
        }

        public String getGroupName() {
            return groupName;
        }

        public void setColor(final int color) {
            this.color = color;
        }

        public int getColor() {
            return color;
        }
    }

    public static class Word {
        private final String wordId;
        private boolean isDeleted = false;
        private String text;

        public Word() {
            wordId = java.util.UUID.randomUUID().toString();
        }

        public Word(final String text) {
            this();
            this.text = text;
        }

        public void setText(final String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void delete() {

        }

        public void undelete() {

        }
    }

    public List<Group> getGroups() {
        return groups;
    }

    public Group createGroup(final String name) {
        return new Group();
    }

    public void deleteGroup(final Group group) {

    }

    public void saveGroup(final Group group) {

    }

    public Word createWord(final String text) {
        return new Word();
    }

    public void deleteWord(final Word word) {

    }

    public void saveWord(final Word word) {

    }

    public void addWordToGroup(final Word word, final Group group) {

    }

    public List<Word> getWordsInGroup(final Group group) {
        return words;
    }

    public void removeWordFromGroup(final Word word, final Group group) {

    }
}
