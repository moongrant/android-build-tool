package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends ViewCompat.OooO0O0<Boolean> {
    public o0000OO0(int i) {
        super(i, Boolean.class, 0, 28);
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    @RequiresApi(28)
    public final Boolean OooO0O0(@NonNull View view) {
        return Boolean.valueOf(ViewCompat.Oooo000.OooO0Oo(view));
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    @RequiresApi(28)
    public final void OooO0OO(@NonNull View view, Boolean bool) {
        ViewCompat.Oooo000.OooOO0(view, bool.booleanValue());
    }

    @Override // androidx.core.view.ViewCompat.OooO0O0
    public final boolean OooO0o(Boolean bool, Boolean bool2) {
        return !ViewCompat.OooO0O0.OooO00o(bool, bool2);
    }
}
