package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        Oooo();
    }

    public final void Oooo() {
        Oooo0oo(1);
        Oooo0o0(new Fade(2));
        Oooo0o0(new ChangeBounds());
        Oooo0o0(new Fade(1));
    }

    public AutoTransition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Oooo();
    }
}
