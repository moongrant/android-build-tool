package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class Oooo0 extends androidx.fragment.app.OooOo00 {
    @Override // androidx.fragment.app.OooOo00
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new Oooo000(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.OooOo00
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setupDialog(@NonNull Dialog dialog, int i) {
        if (!(dialog instanceof Oooo000)) {
            super.setupDialog(dialog, i);
            return;
        }
        Oooo000 oooo000 = (Oooo000) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        oooo000.OooO();
    }
}
