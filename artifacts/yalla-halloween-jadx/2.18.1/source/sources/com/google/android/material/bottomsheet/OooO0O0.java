package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public class OooO0O0 extends Oooo0 {
    public final void OooO00o() {
        Dialog dialog = getDialog();
        if (dialog instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) dialog;
            if (oooO00o.f16663OoooO00 == null) {
                oooO00o.OooOO0();
            }
            boolean z = oooO00o.f16663OoooO00.f16628Oooo00O;
        }
    }

    @Override // androidx.fragment.app.OooOo00
    public final void dismiss() {
        OooO00o();
        super.dismiss();
    }

    @Override // androidx.fragment.app.OooOo00
    public final void dismissAllowingStateLoss() {
        OooO00o();
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.Oooo0, androidx.fragment.app.OooOo00
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new OooO00o(getContext(), getTheme());
    }
}
