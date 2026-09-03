package com.facebook;

import android.net.Uri;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements FeatureManager.Callback, p296o0O0OoO0.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOOOO f12696OooO0Oo = new OooOOOO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOOOO f12697OooO0o0 = new OooOOOO();

    public final Extractor[] OooO00o() {
        return new Extractor[]{new Mp3Extractor(0)};
    }

    @Override // p296o0O0OoO0.o00O0O
    public final Extractor[] OooO0O0(Uri uri, Map map) {
        return OooO00o();
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookSdk.m97sdkInitialize$lambda6(z);
    }
}
