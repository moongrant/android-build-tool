package com.facebook.appevents;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.internal.FeatureManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements FeatureManager.Callback {
    public static void OooO00o(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static boolean OooO0O0(Composer composer) {
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return ComposerKt.isTraceInProgress();
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m4067onSuccess$lambda1(z);
    }
}
