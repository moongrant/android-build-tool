package androidx.core.view;

import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends ViewCompat.OooO0O0<Boolean> {
    public o000OO(int i) {
        super(i, Boolean.class, 0, 28);
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    @RequiresApi(28)
    public final Boolean OooO0O0(View view) {
        return Boolean.valueOf(ViewCompat.Oooo000.OooO0OO(view));
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    @RequiresApi(28)
    public final void OooO0OO(View view, Boolean bool) {
        ViewCompat.Oooo000.OooO0oO(view, bool.booleanValue());
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    public final boolean OooO0o(Boolean bool, Boolean bool2) {
        return !ViewCompat.OooO0O0.OooO00o(bool, bool2);
    }
}
