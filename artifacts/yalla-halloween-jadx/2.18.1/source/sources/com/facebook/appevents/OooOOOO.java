package com.facebook.appevents;

import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements FeatureManager.Callback, MediaCodecUtil.OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOOOO f12723OooO0Oo = new OooOOOO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOOOO f12724OooO0o0 = new OooOOOO();

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO
    public final int OooO00o(Object obj) {
        Pattern pattern = MediaCodecUtil.f14427OooO00o;
        return ((com.google.android.exoplayer2.mediacodec.OooO00o) obj).f14435OooO00o.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m122onSuccess$lambda3(z);
    }
}
