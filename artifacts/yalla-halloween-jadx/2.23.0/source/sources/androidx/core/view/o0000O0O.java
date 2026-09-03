package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O extends ViewCompat.OooO0O0<CharSequence> {
    public o0000O0O(int i) {
        super(i, CharSequence.class, 64, 30);
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    @RequiresApi(30)
    public final CharSequence OooO0O0(View view) {
        return ViewCompat.o000oOoO.OooO00o(view);
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    @RequiresApi(30)
    public final void OooO0OO(View view, CharSequence charSequence) {
        ViewCompat.o000oOoO.OooO0OO(view, charSequence);
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    public final boolean OooO0o(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
