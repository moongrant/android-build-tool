package com.facebook;

import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements FeatureManager.Callback, o0O0O0Oo.OooOO0O, o0O0o0o0.OooO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOOO f12692OooO0Oo = new OooOOO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOOO f12694OooO0o0 = new OooOOO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ OooOOO f12693OooO0o = new OooOOO();

    @Override // o0O0o0o0.OooO.OooO00o
    public final boolean OooO00o(int i, int i2, int i3, int i4, int i5) {
        OooOOO oooOOO = Mp3Extractor.f13898OooOo0;
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Override // o0O0O0Oo.OooOO0O
    public final void OooO0O0(Exception exc) {
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        FacebookSdk.m98sdkInitialize$lambda7(z);
    }
}
