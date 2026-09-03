package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p203o00o0o0o.o0O00O;
import p230o00oOoO0.o000O0Oo;
import p247o00oo0oO.o00OO0OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DefaultRenderersFactory implements o0O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f10901OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.google.android.exoplayer2.mediacodec.OooO0O0 f10902OooO0O0 = new com.google.android.exoplayer2.mediacodec.OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f10903OooO0OO;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.f10901OooO00o = context;
    }

    @Override // p203o00o0o0o.o0O00O
    public final Renderer[] OooO00o(Handler handler, OooOOO.OooO0O0 oooO0O0, OooOOO.OooO0O0 oooO0O1, OooOOO.OooO0O0 oooO0O2, OooOOO.OooO0O0 oooO0O3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o00OO0OO(this.f10901OooO00o, this.f10902OooO0O0, this.f10903OooO0OO, handler, oooO0O0));
        DefaultAudioSink.OooO oooO = new DefaultAudioSink.OooO(this.f10901OooO00o);
        oooO.f11518OooO0Oo = false;
        oooO.f11520OooO0o0 = false;
        oooO.f11519OooO0o = 0;
        if (oooO.f11517OooO0OO == null) {
            oooO.f11517OooO0OO = new DefaultAudioSink.OooOO0O(new AudioProcessor[0]);
        }
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(oooO);
        arrayList.add(new com.google.android.exoplayer2.audio.OooOOO(this.f10901OooO00o, this.f10902OooO0O0, this.f10903OooO0OO, handler, oooO0O1, defaultAudioSink));
        arrayList.add(new o000O0Oo(oooO0O2, handler.getLooper()));
        arrayList.add(new com.google.android.exoplayer2.metadata.OooO00o(oooO0O3, handler.getLooper()));
        arrayList.add(new o0O0o.OooO0O0());
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }
}
