package com.facebook.appevents;

import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.regex.Pattern;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements FeatureManager.Callback, MediaCodecUtil.OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooOo00 f12727OooO0Oo = new OooOo00();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooOo00 f12728OooO0o0 = new OooOo00();

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO
    public final int OooO00o(Object obj) {
        Pattern pattern = MediaCodecUtil.f14427OooO00o;
        String str = ((com.google.android.exoplayer2.mediacodec.OooO00o) obj).f14435OooO00o;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (o000OOo0.f36740OooO00o >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        AppEventsManager.AnonymousClass1.m121onSuccess$lambda2(z);
    }
}
