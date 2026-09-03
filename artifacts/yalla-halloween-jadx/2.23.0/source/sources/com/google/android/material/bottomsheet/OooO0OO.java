package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public class OooO0OO extends o0O0O00 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f16531OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16532OooO0Oo;

    public class OooO00o extends BottomSheetBehavior.OooO0OO {
        public OooO00o() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0O0(@NonNull View view) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0OO
        public final void OooO0OO(int i, @NonNull View view) {
            if (i == 5) {
                int i2 = OooO0OO.f16531OooO0o0;
                OooO0OO.this.OooO0O0();
            }
        }
    }

    public final void OooO0O0() {
        if (this.f16532OooO0Oo) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    public final boolean OooO0OO(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) dialog;
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorOooO0oo = oooO0O0.OooO0oo();
        if (!bottomSheetBehaviorOooO0oo.f16463Oooo0 || !oooO0O0.f16519OooOO0) {
            return false;
        }
        this.f16532OooO0Oo = z;
        if (bottomSheetBehaviorOooO0oo.f16470Oooo0o0 == 5) {
            OooO0O0();
            return true;
        }
        if (getDialog() instanceof OooO0O0) {
            OooO0O0 oooO0O1 = (OooO0O0) getDialog();
            oooO0O1.f16516OooO0o.f16479OoooOOo.remove(oooO0O1.f16525OooOOOo);
        }
        bottomSheetBehaviorOooO0oo.OooOo00(new OooO00o());
        bottomSheetBehaviorOooO0oo.Oooo0O0(5);
        return true;
    }

    @Override // androidx.fragment.app.OooOo
    public final void dismiss() {
        if (OooO0OO(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.OooOo
    public final void dismissAllowingStateLoss() {
        if (OooO0OO(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.o0O0O00, androidx.fragment.app.OooOo
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new OooO0O0(getContext(), getTheme());
    }
}
