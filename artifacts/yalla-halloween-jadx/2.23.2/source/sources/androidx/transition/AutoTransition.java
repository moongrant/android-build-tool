package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        Oooo0oo();
    }

    public final void Oooo0oo() {
        Oooo0oO(1);
        Oooo0OO(new Fade(2));
        Oooo0OO(new ChangeBounds());
        Oooo0OO(new Fade(1));
    }

    public AutoTransition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Oooo0oo();
    }
}
