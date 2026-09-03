package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o000 extends ViewCompat.OooO0O0<CharSequence> {
    public o000(int i) {
        super(i, CharSequence.class, 8, 28);
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    @RequiresApi(28)
    public final CharSequence OooO0O0(View view) {
        return ViewCompat.Oooo000.OooO0O0(view);
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    @RequiresApi(28)
    public final void OooO0OO(View view, CharSequence charSequence) {
        ViewCompat.Oooo000.OooO0oo(view, charSequence);
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    public final boolean OooO0o(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
