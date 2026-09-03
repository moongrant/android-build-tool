package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class o0O0O00 extends androidx.fragment.app.Oooo0 {
    @Override // androidx.fragment.app.Oooo0
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new oo0o0Oo(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setupDialog(@NonNull Dialog dialog, int i) {
        if (!(dialog instanceof oo0o0Oo)) {
            super.setupDialog(dialog, i);
            return;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        oo0o0oo.OooO0o0().OooOo0(1);
    }
}
