package msdingfield.flashcards;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Matt on 10/19/2014.
 */
public class CardFragment extends Fragment {

    public static final String WORD = "word";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final String word = this.getArguments().getString(WORD);

        View v = inflater.inflate(R.layout.fragment_card, container, false);
        TextView tv = (TextView) v.findViewById(R.id.card_text);
        if (word != null)
            tv.setText(word);
        return v;
    }

    public static CardFragment newCardFragment(final String word) {
        final CardFragment fragment = new CardFragment();
        final Bundle b = new Bundle();
        b.putString(WORD, word);
        fragment.setArguments(b);
        return fragment;
    }
}
