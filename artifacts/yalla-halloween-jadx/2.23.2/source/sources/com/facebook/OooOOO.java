package com.facebook;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.code.android.util.o0000;
import com.facebook.internal.FeatureManager;
import p557o0oOOooO.oO00o0;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO implements FeatureManager.Callback, oO00o0 {
    @Override // p557o0oOOooO.oO00o0
    public final void OooO00o(Editable editable, int i, int i2) {
        if (editable != null) {
            editable.setSpan(new ForegroundColorSpan(o0000.OooO00o(o0OOO0o.color_1BA1FD)), i, i2, 33);
        }
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookSdk.m4046sdkInitialize$lambda8(z);
    }
}
