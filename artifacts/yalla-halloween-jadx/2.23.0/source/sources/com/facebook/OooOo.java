package com.facebook;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.internal.FeatureManager;
import p245o00oo0o.o00O;
import p245o00oo0o.o00O0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo implements FeatureManager.Callback, o00O.OooO0O0 {
    public static Modifier OooO0O0(float f, Modifier modifier) {
        return ClipKt.clip(modifier, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f)));
    }

    @Override // o00oo0o.o00O.OooO0O0
    public void OooO00o(Object obj, o00O0OO o00o0oo2) {
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        FacebookSdk.m4043sdkInitialize$lambda7(z);
    }
}
