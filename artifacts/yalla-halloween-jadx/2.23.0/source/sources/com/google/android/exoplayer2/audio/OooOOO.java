package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.audio.OooO0o;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.o00Ooo;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p022Oooo00O.o0O0O0o0;
import p037OoooOo0.o00oOoo;
import p045Oooooo.o000oOoO;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o00O00OO;
import p203o00o0o0o.o00OOO0O;
import p203o00o0o0o.o0O00O0o;
import p203o00o0o0o.o0OoO00O;
import p205o00o0oO0.o000O000;
import p206o00o0oOO.o0;
import p245o00oo0o.o00OO00O;
import p245o00oo0o.o00OO0O0;
import p245o00oo0o.o00OO0OO;
import p550o0oOOo.o0OOO00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOO extends MediaCodecRenderer implements o00OO00O {

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public long f11621o0000;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final Context f11622o00000O;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public final OooO0o.OooO00o f11623o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public final AudioSink f11624o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public int f11625o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.OooOo f11626o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.OooOo f11627o00000oo;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    @Nullable
    public Renderer.OooO00o f11628o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public boolean f11629o0000O00;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public boolean f11630o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public boolean f11631o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public boolean f11632o0000oo;

    @RequiresApi(23)
    public static final class OooO00o {
        @DoNotInline
        public static void OooO00o(AudioSink audioSink, @Nullable Object obj) {
            audioSink.OooO0o((AudioDeviceInfo) obj);
        }
    }

    public final class OooO0O0 implements AudioSink.OooO00o {
        public OooO0O0() {
        }

        public final void OooO00o(Exception exc) {
            Log.OooO0Oo("MediaCodecAudioRenderer", "Audio sink error", exc);
            OooO0o.OooO00o oooO00o = OooOOO.this.f11623o00000OO;
            Handler handler = oooO00o.f11610OooO00o;
            if (handler != null) {
                handler.post(new o00oOoo(oooO00o, exc, 1));
            }
        }
    }

    public OooOOO(Context context, com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, boolean z, @Nullable Handler handler, @Nullable com.google.android.exoplayer2.OooOOO.OooO0O0 oooO0O1, DefaultAudioSink defaultAudioSink) {
        super(1, oooO0O0, z, 44100.0f);
        this.f11622o00000O = context.getApplicationContext();
        this.f11624o00000Oo = defaultAudioSink;
        this.f11623o00000OO = new OooO0o.OooO00o(handler, oooO0O1);
        defaultAudioSink.f11473OooOOo = new OooO0O0();
    }

    public static o0O00 o0O0O00(com.google.android.exoplayer2.mediacodec.OooO oooO, com.google.android.exoplayer2.OooOo oooOo, boolean z, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        List<com.google.android.exoplayer2.mediacodec.OooO0o> listOooO00o;
        if (oooOo.f11211OooOOOO == null) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            return o0O00.f19536OooO0oo;
        }
        if (audioSink.OooO0OO(oooOo)) {
            List<com.google.android.exoplayer2.mediacodec.OooO0o> listOooO0o0 = MediaCodecUtil.OooO0o0("audio/raw", false, false);
            com.google.android.exoplayer2.mediacodec.OooO0o oooO0o = listOooO0o0.isEmpty() ? null : listOooO0o0.get(0);
            if (oooO0o != null) {
                return ImmutableList.OooOOOo(oooO0o);
            }
        }
        Pattern pattern = MediaCodecUtil.f12497OooO00o;
        List<com.google.android.exoplayer2.mediacodec.OooO0o> listOooO00o2 = oooO.OooO00o(oooOo.f11211OooOOOO, z, false);
        String strOooO0O0 = MediaCodecUtil.OooO0O0(oooOo);
        if (strOooO0O0 == null) {
            ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f19157OooO0o0;
            listOooO00o = o0O00.f19536OooO0oo;
        } else {
            listOooO00o = oooO.OooO00o(strOooO0O0, z, false);
        }
        ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f19157OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        oooO00o.OooO0o(listOooO00o2);
        oooO00o.OooO0o(listOooO00o);
        return oooO00o.OooO0oo();
    }

    @Override // p245o00oo0o.o00OO00O
    public final o00Ooo OooO00o() {
        return this.f11624o00000Oo.OooO00o();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return this.f11624o00000Oo.OooO0oO() || super.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return this.f12479o0OO00O && this.f11624o00000Oo.OooO0Oo();
    }

    @Override // p245o00oo0o.o00OO00O
    public final void OooO0o0(o00Ooo o00ooo2) {
        this.f11624o00000Oo.OooO0o0(o00ooo2);
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.oo000o.OooO0O0
    public final void OooOO0O(int i, @Nullable Object obj) throws ExoPlaybackException {
        AudioSink audioSink = this.f11624o00000Oo;
        if (i == 2) {
            audioSink.OooOOOo(((Float) obj).floatValue());
        }
        if (i == 3) {
            audioSink.OooOO0o((com.google.android.exoplayer2.audio.OooO00o) obj);
            return;
        }
        if (i == 6) {
            audioSink.OooOo0((o000O000) obj);
            return;
        }
        switch (i) {
            case 9:
                audioSink.OooOo0O(((Boolean) obj).booleanValue());
                break;
            case 10:
                audioSink.OooO0oo(((Integer) obj).intValue());
                break;
            case 11:
                this.f11628o0000O0 = (Renderer.OooO00o) obj;
                break;
            case 12:
                if (p245o00oo0o.o0O00.f40595OooO00o >= 23) {
                    OooO00o.OooO00o(audioSink, obj);
                }
                break;
        }
    }

    @Override // p245o00oo0o.o00OO00O
    public final long OooOOo0() {
        if (this.f11047OooOO0 == 2) {
            o000OOo();
        }
        return this.f11621o0000;
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    @Nullable
    public final o00OO00O OooOo() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        OooO0o.OooO00o oooO00o = this.f11623o00000OO;
        this.f11631o0000oO = true;
        this.f11626o00000oO = null;
        try {
            this.f11624o00000Oo.flush();
            try {
                super.OooOoOO();
            } finally {
                oooO00o.OooO00o(this.f12466o000000);
            }
        } catch (Throwable th) {
            try {
                super.OooOoOO();
                throw th;
            } finally {
                oooO00o.OooO00o(this.f12466o000000);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) throws ExoPlaybackException {
        super.OooOoo(j, z);
        this.f11624o00000Oo.flush();
        this.f11621o0000 = j;
        this.f11629o0000O00 = true;
        this.f11632o0000oo = true;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo0(boolean z, boolean z2) throws ExoPlaybackException {
        final o0 o0Var = new o0();
        this.f12466o000000 = o0Var;
        final OooO0o.OooO00o oooO00o = this.f11623o00000OO;
        Handler handler = oooO00o.f11610OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o00o0oO0.o0000O0O
                @Override // java.lang.Runnable
                public final void run() {
                    OooO0o.OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    int i = p245o00oo0o.o0O00.f40595OooO00o;
                    oooO00o2.f11611OooO0O0.OooOOo(o0Var);
                }
            });
        }
        o0O00O0o o0o00o0o = this.f11045OooO0oO;
        o0o00o0o.getClass();
        boolean z3 = o0o00o0o.f39281OooO00o;
        AudioSink audioSink = this.f11624o00000Oo;
        if (z3) {
            audioSink.OooOo00();
        } else {
            audioSink.OooOO0();
        }
        o0O0OOO0 o0o0ooo0 = this.f11041OooO;
        o0o0ooo0.getClass();
        audioSink.OooOO0O(o0o0ooo0);
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOooO() {
        this.f11624o00000Oo.release();
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOooo() {
        AudioSink audioSink = this.f11624o00000Oo;
        try {
            try {
                Oooo0o();
                o00Ooo();
                DrmSession drmSession = this.f12438Oooo00O;
                if (drmSession != null) {
                    drmSession.OooO0O0(null);
                }
                this.f12438Oooo00O = null;
                if (this.f11631o0000oO) {
                    this.f11631o0000oO = false;
                    audioSink.reset();
                }
            } catch (Throwable th) {
                DrmSession drmSession2 = this.f12438Oooo00O;
                if (drmSession2 != null) {
                    drmSession2.OooO0O0(null);
                }
                this.f12438Oooo00O = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.f11631o0000oO) {
                this.f11631o0000oO = false;
                audioSink.reset();
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo000() {
        this.f11624o00000Oo.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo00O() {
        o000OOo();
        this.f11624o00000Oo.pause();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation Oooo0OO(com.google.android.exoplayer2.mediacodec.OooO0o oooO0o, com.google.android.exoplayer2.OooOo oooOo, com.google.android.exoplayer2.OooOo oooOo2) {
        DecoderReuseEvaluation decoderReuseEvaluationOooO0O0 = oooO0o.OooO0O0(oooOo, oooOo2);
        boolean z = this.f12438Oooo00O == null && o0ooOOo(oooOo2);
        int i = decoderReuseEvaluationOooO0O0.f11684OooO0o0;
        if (z) {
            i |= ShareRequest.THUMB_DATA_SIZE_LIMIT;
        }
        if (oo0o0Oo(oooOo2, oooO0o) > this.f11625o00000o0) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(oooO0o.f12519OooO00o, oooOo, oooOo2, i2 == 0 ? decoderReuseEvaluationOooO0O0.f11683OooO0Oo : 0, i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float OoooOO0(float f, com.google.android.exoplayer2.OooOo[] oooOoArr) {
        int iMax = -1;
        for (com.google.android.exoplayer2.OooOo oooOo : oooOoArr) {
            int i = oooOo.f11224OooOoo;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final com.google.android.exoplayer2.mediacodec.OooO0OO.OooO00o OoooOOO(com.google.android.exoplayer2.mediacodec.OooO0o oooO0o, com.google.android.exoplayer2.OooOo oooOo, @Nullable MediaCrypto mediaCrypto, float f) {
        boolean z;
        boolean z2;
        com.google.android.exoplayer2.OooOo[] oooOoArr = this.f11049OooOO0o;
        oooOoArr.getClass();
        int iOo0o0Oo = oo0o0Oo(oooOo, oooO0o);
        boolean z3 = false;
        if (oooOoArr.length != 1) {
            for (com.google.android.exoplayer2.OooOo oooOo2 : oooOoArr) {
                if (oooO0o.OooO0O0(oooOo, oooOo2).f11683OooO0Oo != 0) {
                    iOo0o0Oo = Math.max(iOo0o0Oo, oo0o0Oo(oooOo2, oooO0o));
                }
            }
        }
        this.f11625o00000o0 = iOo0o0Oo;
        int i = p245o00oo0o.o0O00.f40595OooO00o;
        if (i < 24 && "OMX.SEC.aac.dec".equals(oooO0o.f12519OooO00o) && "samsung".equals(p245o00oo0o.o0O00.f40597OooO0OO)) {
            String str = p245o00oo0o.o0O00.f40596OooO0O0;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f11630o0000Ooo = z;
        int i2 = this.f11625o00000o0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", oooO0o.f12521OooO0OO);
        mediaFormat.setInteger("channel-count", oooOo.f11225OooOoo0);
        int i3 = oooOo.f11224OooOoo;
        mediaFormat.setInteger("sample-rate", i3);
        o00OO0O0.OooO0O0(mediaFormat, oooOo.f11214OooOOo0);
        o00OO0O0.OooO00o(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str2 = p245o00oo0o.o0O00.f40598OooO0Oo;
                    if ("ZTE B2017G".equals(str2) || "AXON 7 mini".equals(str2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        String str3 = oooOo.f11211OooOOOO;
        if (i <= 28 && "audio/ac4".equals(str3)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
            oooO00o.f11244OooOO0O = "audio/raw";
            oooO00o.f11253OooOo = oooOo.f11225OooOoo0;
            oooO00o.f11259OooOoO0 = i3;
            oooO00o.f11258OooOoO = 4;
            if (this.f11624o00000Oo.OooOOOO(oooO00o.OooO00o()) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if ("audio/raw".equals(oooO0o.f12520OooO0O0) && !"audio/raw".equals(str3)) {
            z3 = true;
        }
        this.f11627o00000oo = z3 ? oooOo : null;
        return new com.google.android.exoplayer2.mediacodec.OooO0OO.OooO00o(oooO0o, mediaFormat, oooOo, null, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Ooooo00(Exception exc) {
        Log.OooO0Oo("MediaCodecAudioRenderer", "Audio codec error", exc);
        OooO0o.OooO00o oooO00o = this.f11623o00000OO;
        Handler handler = oooO00o.f11610OooO00o;
        if (handler != null) {
            handler.post(new o00O00OO(1, oooO00o, exc));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Ooooo0o(final String str, final long j, final long j2) {
        final OooO0o.OooO00o oooO00o = this.f11623o00000OO;
        Handler handler = oooO00o.f11610OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o00o0oO0.o000OO
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    OooO0o oooO0o = oooO00o.f11611OooO0O0;
                    int i = p245o00oo0o.o0O00.f40595OooO00o;
                    oooO0o.OooOO0o(j3, j4, str2);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OooooO0(String str) {
        OooO0o.OooO00o oooO00o = this.f11623o00000OO;
        Handler handler = oooO00o.f11610OooO00o;
        if (handler != null) {
            handler.post(new o0O0O0o0(1, oooO00o, str));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @Nullable
    public final DecoderReuseEvaluation OooooOO(o00OOO0O o00ooo0o) throws ExoPlaybackException {
        com.google.android.exoplayer2.OooOo oooOo = o00ooo0o.f39211OooO0O0;
        oooOo.getClass();
        this.f11626o00000oO = oooOo;
        DecoderReuseEvaluation decoderReuseEvaluationOooooOO = super.OooooOO(o00ooo0o);
        com.google.android.exoplayer2.OooOo oooOo2 = this.f11626o00000oO;
        OooO0o.OooO00o oooO00o = this.f11623o00000OO;
        Handler handler = oooO00o.f11610OooO00o;
        if (handler != null) {
            handler.post(new com.facebook.internal.OooO(oooO00o, oooOo2, decoderReuseEvaluationOooooOO));
        }
        return decoderReuseEvaluationOooooOO;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OooooOo(com.google.android.exoplayer2.OooOo oooOo, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int iOooOo00;
        int i;
        com.google.android.exoplayer2.OooOo oooOo2 = this.f11627o00000oo;
        int[] iArr = null;
        if (oooOo2 != null) {
            oooOo = oooOo2;
        } else if (this.f12442Oooo0o != null) {
            if ("audio/raw".equals(oooOo.f11211OooOOOO)) {
                iOooOo00 = oooOo.f11226OooOooO;
            } else if (p245o00oo0o.o0O00.f40595OooO00o < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iOooOo00 = mediaFormat.containsKey("v-bits-per-sample") ? p245o00oo0o.o0O00.OooOo00(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iOooOo00 = mediaFormat.getInteger("pcm-encoding");
            }
            com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
            oooO00o.f11244OooOO0O = "audio/raw";
            oooO00o.f11258OooOoO = iOooOo00;
            oooO00o.f11260OooOoOO = oooOo.f11227OooOooo;
            oooO00o.f11262OooOoo0 = oooOo.f11229Oooo000;
            oooO00o.f11253OooOo = mediaFormat.getInteger("channel-count");
            oooO00o.f11259OooOoO0 = mediaFormat.getInteger("sample-rate");
            com.google.android.exoplayer2.OooOo oooOo3 = new com.google.android.exoplayer2.OooOo(oooO00o);
            if (this.f11630o0000Ooo && oooOo3.f11225OooOoo0 == 6 && (i = oooOo.f11225OooOoo0) < 6) {
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr2[i2] = i2;
                }
                iArr = iArr2;
            }
            oooOo = oooOo3;
        }
        try {
            this.f11624o00000Oo.OooO(oooOo, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw OooOoO0(5001, e.f11448OooO0Oo, e, false);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooooo0(long j) {
        this.f11624o00000Oo.OooOOO();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OoooooO() {
        this.f11624o00000Oo.OooOOoo();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Ooooooo(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f11629o0000O00 || decoderInputBuffer.OooO0oO()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f11677OooO0oo - this.f11621o0000) > 500000) {
            this.f11621o0000 = decoderInputBuffer.f11677OooO0oo;
        }
        this.f11629o0000O00 = false;
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    public final void o000OOo() {
        long jOooOOo = this.f11624o00000Oo.OooOOo(OooO0Oo());
        if (jOooOOo != Long.MIN_VALUE) {
            if (!this.f11632o0000oo) {
                jOooOOo = Math.max(this.f11621o0000, jOooOOo);
            }
            this.f11621o0000 = jOooOOo;
            this.f11632o0000oo = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final ArrayList o000oOoO(com.google.android.exoplayer2.mediacodec.OooO oooO, com.google.android.exoplayer2.OooOo oooOo, boolean z) throws MediaCodecUtil.DecoderQueryException {
        o0O00 o0o00O0O0O00 = o0O0O00(oooO, oooOo, z, this.f11624o00000Oo);
        Pattern pattern = MediaCodecUtil.f12497OooO00o;
        ArrayList arrayList = new ArrayList(o0o00O0O0O00);
        Collections.sort(arrayList, new o0OOO00(new o000oOoO(oooOo)));
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean o00O0O(long j, long j2, @Nullable com.google.android.exoplayer2.mediacodec.OooO0OO oooO0OO, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.google.android.exoplayer2.OooOo oooOo) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f11627o00000oo != null && (i2 & 2) != 0) {
            oooO0OO.getClass();
            oooO0OO.OooOOO0(i, false);
            return true;
        }
        AudioSink audioSink = this.f11624o00000Oo;
        if (z) {
            if (oooO0OO != null) {
                oooO0OO.OooOOO0(i, false);
            }
            this.f12466o000000.f39403OooO0o += i3;
            audioSink.OooOOoo();
            return true;
        }
        try {
            if (!audioSink.OooOOO0(byteBuffer, j3, i3)) {
                return false;
            }
            if (oooO0OO != null) {
                oooO0OO.OooOOO0(i, false);
            }
            this.f12466o000000.f39404OooO0o0 += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw OooOoO0(5001, this.f11626o00000oO, e, e.f11450OooO0o0);
        } catch (AudioSink.WriteException e2) {
            throw OooOoO0(5002, oooOo, e2, e2.f11453OooO0o0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void o00o0O() throws ExoPlaybackException {
        try {
            this.f11624o00000Oo.OooOOo0();
        } catch (AudioSink.WriteException e) {
            throw OooOoO0(5002, e.f11452OooO0o, e, e.f11453OooO0o0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean o0ooOOo(com.google.android.exoplayer2.OooOo oooOo) {
        return this.f11624o00000Oo.OooO0OO(oooOo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0ooOoO(com.google.android.exoplayer2.mediacodec.OooO oooO, com.google.android.exoplayer2.OooOo oooOo) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        if (!o00OO0OO.OooOO0(oooOo.f11211OooOOOO)) {
            return o0OoO00O.OooO00o(0, 0, 0);
        }
        int i = p245o00oo0o.o0O00.f40595OooO00o >= 21 ? 32 : 0;
        boolean z2 = true;
        int i2 = oooOo.f11232Oooo0O0;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        AudioSink audioSink = this.f11624o00000Oo;
        if (z4 && audioSink.OooO0OO(oooOo)) {
            if (z3) {
                List<com.google.android.exoplayer2.mediacodec.OooO0o> listOooO0o0 = MediaCodecUtil.OooO0o0("audio/raw", false, false);
            }
            return o0OoO00O.OooO00o(4, 8, i);
        }
        if ("audio/raw".equals(oooOo.f11211OooOOOO) && !audioSink.OooO0OO(oooOo)) {
            return o0OoO00O.OooO00o(1, 0, 0);
        }
        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
        oooO00o.f11244OooOO0O = "audio/raw";
        oooO00o.f11253OooOo = oooOo.f11225OooOoo0;
        oooO00o.f11259OooOoO0 = oooOo.f11224OooOoo;
        oooO00o.f11258OooOoO = 2;
        if (!audioSink.OooO0OO(oooO00o.OooO00o())) {
            return o0OoO00O.OooO00o(1, 0, 0);
        }
        o0O00 o0o00O0O0O00 = o0O0O00(oooO, oooOo, false, audioSink);
        if (o0o00O0O0O00.isEmpty()) {
            return o0OoO00O.OooO00o(1, 0, 0);
        }
        if (!z4) {
            return o0OoO00O.OooO00o(2, 0, 0);
        }
        com.google.android.exoplayer2.mediacodec.OooO0o oooO0o = (com.google.android.exoplayer2.mediacodec.OooO0o) o0o00O0O0O00.get(0);
        boolean zOooO0Oo = oooO0o.OooO0Oo(oooOo);
        if (!zOooO0Oo) {
            int i4 = 1;
            while (true) {
                if (i4 >= o0o00O0O0O00.f19538OooO0oO) {
                    z = true;
                    z2 = zOooO0Oo;
                    break;
                }
                com.google.android.exoplayer2.mediacodec.OooO0o oooO0o2 = (com.google.android.exoplayer2.mediacodec.OooO0o) o0o00O0O0O00.get(i4);
                if (oooO0o2.OooO0Oo(oooOo)) {
                    z = false;
                    oooO0o = oooO0o2;
                    break;
                }
                i4++;
            }
        } else {
            z = true;
            z2 = zOooO0Oo;
            break;
        }
        int i5 = z2 ? 4 : 3;
        if (z2 && oooO0o.OooO0o0(oooOo)) {
            i3 = 16;
        }
        return i5 | i3 | i | (oooO0o.f12525OooO0oO ? 64 : 0) | (z ? 128 : 0);
    }

    public final int oo0o0Oo(com.google.android.exoplayer2.OooOo oooOo, com.google.android.exoplayer2.mediacodec.OooO0o oooO0o) {
        int i;
        if (!"OMX.google.raw.decoder".equals(oooO0o.f12519OooO00o) || (i = p245o00oo0o.o0O00.f40595OooO00o) >= 24 || (i == 23 && p245o00oo0o.o0O00.Oooo0(this.f11622o00000O))) {
            return oooOo.f11212OooOOOo;
        }
        return -1;
    }
}
