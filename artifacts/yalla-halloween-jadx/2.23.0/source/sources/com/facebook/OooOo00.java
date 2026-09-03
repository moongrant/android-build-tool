package com.facebook;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.facebook.internal.FeatureManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements FeatureManager.Callback {
    public static Modifier OooO00o(float f, Modifier.Companion companion, Composer composer, int i) {
        Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(f));
        composer.startReplaceableGroup(i);
        return modifierM523size3ABfNKs;
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        FacebookSdk.m4042sdkInitialize$lambda6(z);
    }
}
