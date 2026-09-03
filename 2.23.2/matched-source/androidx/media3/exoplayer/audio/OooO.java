package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.OooOO0;
import androidx.media3.common.OooOOOO;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import o000O0.o0oOO;
import o000O00O.OooOo;
import o000O00O.o00O;
import o000O00O.o00O000;
import o000O00O.o00O0000;
import o000O00O.o00OO000;
import o000O0O0.Oooo0;
import o000O0O0.o0OoOo0;
import p023Oooo00o.oO00O0o;
import p023Oooo00o.oO00O0o0;
import p023Oooo00o.oO0Oo0oo;
import p069o0000ooO.o0000oo;
import p069o0000ooO.o000OOo;
import p080o000OoO.o00;
import p080o000OoO.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO extends MediaCodecRenderer implements o00O000 {

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public long f7503o0000;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public final Context f7504o00000O;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public final androidx.media3.exoplayer.audio.OooO0O0.OooO00o f7505o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public final AudioSink f7506o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public int f7507o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    @Nullable
    public OooOO0 f7508o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    @Nullable
    public OooOO0 f7509o00000oo;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    @Nullable
    public Renderer.OooO00o f7510o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public boolean f7511o0000O00;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public boolean f7512o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public boolean f7513o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public boolean f7514o0000oo;

    @RequiresApi(23)
    public static final class OooO00o {
        @DoNotInline
        public static void OooO00o(AudioSink audioSink, @Nullable Object obj) {
            audioSink.OooO0oO((AudioDeviceInfo) obj);
        }
    }

    public final class OooO0O0 implements AudioSink.OooO00o {
        public OooO0O0() {
        }

        public final void OooO00o(Exception exc) {
            Log.OooO0Oo("MediaCodecAudioRenderer", "Audio sink error", exc);
            androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = OooO.this.f7505o00000OO;
            Handler handler = oooO00o.f7529OooO00o;
            if (handler != null) {
                handler.post(new oO00O0o0(1, oooO00o, exc));
            }
        }
    }

    public OooO(Context context, androidx.media3.exoplayer.mediacodec.OooO0O0 oooO0O0, boolean z, @Nullable Handler handler, @Nullable androidx.media3.exoplayer.OooO.OooO0O0 oooO0O1, DefaultAudioSink defaultAudioSink) {
        super(1, oooO0O0, z, 44100.0f);
        this.f7504o00000O = context.getApplicationContext();
        this.f7506o00000Oo = defaultAudioSink;
        this.f7505o00000OO = new androidx.media3.exoplayer.audio.OooO0O0.OooO00o(handler, oooO0O1);
        defaultAudioSink.f7429OooOOo = new OooO0O0();
    }

    public static o0O00 o0O0O00(androidx.media3.exoplayer.mediacodec.OooO oooO, OooOO0 oooOO1, boolean z, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        List<androidx.media3.exoplayer.mediacodec.OooO0o> listOooO00o;
        if (oooOO1.f6412OooOOOO == null) {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
            return o0O00.f19060OooO0oo;
        }
        if (audioSink.OooO0OO(oooOO1)) {
            List<androidx.media3.exoplayer.mediacodec.OooO0o> listOooO0o0 = MediaCodecUtil.OooO0o0("audio/raw", false, false);
            androidx.media3.exoplayer.mediacodec.OooO0o oooO0o = listOooO0o0.isEmpty() ? null : listOooO0o0.get(0);
            if (oooO0o != null) {
                return ImmutableList.OooOOOo(oooO0o);
            }
        }
        Pattern pattern = MediaCodecUtil.f7732OooO00o;
        List<androidx.media3.exoplayer.mediacodec.OooO0o> listOooO00o2 = oooO.OooO00o(oooOO1.f6412OooOOOO, z, false);
        String strOooO0O0 = MediaCodecUtil.OooO0O0(oooOO1);
        if (strOooO0O0 == null) {
            ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f18681OooO0o0;
            listOooO00o = o0O00.f19060OooO0oo;
        } else {
            listOooO00o = oooO.OooO00o(strOooO0O0, z, false);
        }
        ImmutableList.OooO0O0 oooO0O2 = ImmutableList.f18681OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        oooO00o.OooO0o(listOooO00o2);
        oooO00o.OooO0o(listOooO00o);
        return oooO00o.OooO0oo();
    }

    @Override // o000O00O.o00O000
    public final void OooO00o(OooOOOO oooOOOO) {
        this.f7506o00000Oo.OooO00o(oooOOOO);
    }

    @Override // o000O00O.o00O000
    public final OooOOOO OooO0O0() {
        return this.f7506o00000Oo.OooO0O0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final boolean OooO0Oo() {
        return this.f7506o00000Oo.OooO0oo() || super.OooO0Oo();
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.Renderer
    public final boolean OooO0o0() {
        return this.f7714o0OO00O && this.f7506o00000Oo.OooO0o0();
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.OooOOO.OooO0O0
    public final void OooOO0o(int i, @Nullable Object obj) throws ExoPlaybackException {
        AudioSink audioSink = this.f7506o00000Oo;
        if (i == 2) {
            audioSink.OooOOo(((Float) obj).floatValue());
        }
        if (i == 3) {
            audioSink.OooO0o((androidx.media3.common.OooO00o) obj);
            return;
        }
        if (i == 6) {
            audioSink.OooOo0((o000OOo) obj);
            return;
        }
        switch (i) {
            case 9:
                audioSink.OooOo0O(((Boolean) obj).booleanValue());
                break;
            case 10:
                audioSink.OooO(((Integer) obj).intValue());
                break;
            case 11:
                this.f7510o0000O0 = (Renderer.OooO00o) obj;
                break;
            case 12:
                if (o00.f34910OooO00o >= 23) {
                    OooO00o.OooO00o(audioSink, obj);
                }
                break;
        }
    }

    @Override // o000O00O.o00O000
    public final long OooOOo0() {
        if (this.f7201OooOO0 == 2) {
            o000OOo();
        }
        return this.f7503o0000;
    }

    @Override // androidx.media3.exoplayer.OooO0O0, androidx.media3.exoplayer.Renderer
    @Nullable
    public final o00O000 OooOo() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.OooO0O0
    public final void OooOoOO() {
        androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = this.f7505o00000OO;
        this.f7513o0000oO = true;
        this.f7508o00000oO = null;
        try {
            this.f7506o00000Oo.flush();
            try {
                super.OooOoOO();
            } finally {
                oooO00o.OooO00o(this.f7701o000000);
            }
        } catch (Throwable th) {
            try {
                super.OooOoOO();
                throw th;
            } finally {
                oooO00o.OooO00o(this.f7701o000000);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.OooO0O0
    public final void OooOoo(long j, boolean z) throws ExoPlaybackException {
        super.OooOoo(j, z);
        this.f7506o00000Oo.flush();
        this.f7503o0000 = j;
        this.f7511o0000O00 = true;
        this.f7514o0000oo = true;
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOoo0(boolean z, boolean z2) throws ExoPlaybackException {
        OooOo oooOo = new OooOo();
        this.f7701o000000 = oooOo;
        androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = this.f7505o00000OO;
        Handler handler = oooO00o.f7529OooO00o;
        if (handler != null) {
            handler.post(new OooOOOO.OooO0o(2, oooO00o, oooOo));
        }
        o00OO000 o00oo001 = this.f7199OooO0oO;
        o00oo001.getClass();
        boolean z3 = o00oo001.f34128OooO00o;
        AudioSink audioSink = this.f7506o00000Oo;
        if (z3) {
            audioSink.OooOOoo();
        } else {
            audioSink.OooOO0();
        }
        o0oOO o0ooo2 = this.f7195OooO;
        o0ooo2.getClass();
        audioSink.OooOO0O(o0ooo2);
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOooO() {
        this.f7506o00000Oo.release();
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void OooOooo() {
        AudioSink audioSink = this.f7506o00000Oo;
        try {
            try {
                Oooo0o();
                o00Ooo();
                DrmSession drmSession = this.f7673Oooo00O;
                if (drmSession != null) {
                    drmSession.OooO0o0(null);
                }
                this.f7673Oooo00O = null;
                if (this.f7513o0000oO) {
                    this.f7513o0000oO = false;
                    audioSink.reset();
                }
            } catch (Throwable th) {
                DrmSession drmSession2 = this.f7673Oooo00O;
                if (drmSession2 != null) {
                    drmSession2.OooO0o0(null);
                }
                this.f7673Oooo00O = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.f7513o0000oO) {
                this.f7513o0000oO = false;
                audioSink.reset();
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void Oooo000() {
        this.f7506o00000Oo.OooO0Oo();
    }

    @Override // androidx.media3.exoplayer.OooO0O0
    public final void Oooo00O() {
        o000OOo();
        this.f7506o00000Oo.pause();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation Oooo0OO(androidx.media3.exoplayer.mediacodec.OooO0o oooO0o, OooOO0 oooOO1, OooOO0 oooOO2) {
        DecoderReuseEvaluation decoderReuseEvaluationOooO0O0 = oooO0o.OooO0O0(oooOO1, oooOO2);
        boolean z = this.f7673Oooo00O == null && o0ooOOo(oooOO2);
        int i = decoderReuseEvaluationOooO0O0.f7104OooO0o0;
        if (z) {
            i |= ShareRequest.THUMB_DATA_SIZE_LIMIT;
        }
        if (oo0o0Oo(oooOO2, oooO0o) > this.f7507o00000o0) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(oooO0o.f7754OooO00o, oooOO1, oooOO2, i2 == 0 ? decoderReuseEvaluationOooO0O0.f7103OooO0Oo : 0, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float OoooOO0(float f, OooOO0[] oooOO0Arr) {
        int iMax = -1;
        for (OooOO0 oooOO1 : oooOO0Arr) {
            int i = oooOO1.f6425OooOoo;
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
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final androidx.media3.exoplayer.mediacodec.OooO0OO.OooO00o OoooOOO(androidx.media3.exoplayer.mediacodec.OooO0o oooO0o, OooOO0 oooOO1, @Nullable MediaCrypto mediaCrypto, float f) {
        boolean z;
        boolean z2;
        OooOO0[] oooOO0Arr = this.f7203OooOO0o;
        oooOO0Arr.getClass();
        int iOo0o0Oo = oo0o0Oo(oooOO1, oooO0o);
        boolean z3 = false;
        if (oooOO0Arr.length != 1) {
            for (OooOO0 oooOO2 : oooOO0Arr) {
                if (oooO0o.OooO0O0(oooOO1, oooOO2).f7103OooO0Oo != 0) {
                    iOo0o0Oo = Math.max(iOo0o0Oo, oo0o0Oo(oooOO2, oooO0o));
                }
            }
        }
        this.f7507o00000o0 = iOo0o0Oo;
        int i = o00.f34910OooO00o;
        if (i < 24 && "OMX.SEC.aac.dec".equals(oooO0o.f7754OooO00o) && "samsung".equals(o00.f34912OooO0OO)) {
            String str = o00.f34911OooO0O0;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f7512o0000Ooo = z;
        int i2 = this.f7507o00000o0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", oooO0o.f7756OooO0OO);
        mediaFormat.setInteger("channel-count", oooOO1.f6426OooOoo0);
        int i3 = oooOO1.f6425OooOoo;
        mediaFormat.setInteger("sample-rate", i3);
        o00000OO.OooO0O0(mediaFormat, oooOO1.f6415OooOOo0);
        o00000OO.OooO00o(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str2 = o00.f34913OooO0Oo;
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
        String str3 = oooOO1.f6412OooOOOO;
        if (i <= 28 && "audio/ac4".equals(str3)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
            oooO00o.f6445OooOO0O = "audio/raw";
            oooO00o.f6454OooOo = oooOO1.f6426OooOoo0;
            oooO00o.f6460OooOoO0 = i3;
            oooO00o.f6459OooOoO = 4;
            if (this.f7506o00000Oo.OooOo00(oooO00o.OooO00o()) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if ("audio/raw".equals(oooO0o.f7755OooO0O0) && !"audio/raw".equals(str3)) {
            z3 = true;
        }
        this.f7509o00000oo = z3 ? oooOO1 : null;
        return new androidx.media3.exoplayer.mediacodec.OooO0OO.OooO00o(oooO0o, mediaFormat, oooOO1, null, mediaCrypto);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Ooooo00(Exception exc) {
        Log.OooO0Oo("MediaCodecAudioRenderer", "Audio codec error", exc);
        androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = this.f7505o00000OO;
        Handler handler = oooO00o.f7529OooO00o;
        if (handler != null) {
            handler.post(new oO0Oo0oo(2, oooO00o, exc));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Ooooo0o(final String str, final long j, final long j2) {
        final androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = this.f7505o00000OO;
        Handler handler = oooO00o.f7529OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o000O0Oo.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    androidx.media3.exoplayer.audio.OooO0O0 oooO0O0 = oooO00o.f7530OooO0O0;
                    int i = o00.f34910OooO00o;
                    oooO0O0.OooOOO(j3, j4, str2);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void OooooO0(String str) {
        androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = this.f7505o00000OO;
        Handler handler = oooO00o.f7529OooO00o;
        if (handler != null) {
            handler.post(new oO00O0o(1, oooO00o, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    public final DecoderReuseEvaluation OooooOO(o00O0000 o00o0001) throws ExoPlaybackException {
        OooOO0 oooOO1 = o00o0001.f34055OooO0O0;
        oooOO1.getClass();
        this.f7508o00000oO = oooOO1;
        final DecoderReuseEvaluation decoderReuseEvaluationOooooOO = super.OooooOO(o00o0001);
        final OooOO0 oooOO2 = this.f7508o00000oO;
        final androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o = this.f7505o00000OO;
        Handler handler = oooO00o.f7529OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o000O0Oo.OooO
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.exoplayer.audio.OooO0O0.OooO00o oooO00o2 = oooO00o;
                    oooO00o2.getClass();
                    int i = o00.f34910OooO00o;
                    androidx.media3.exoplayer.audio.OooO0O0 oooO0O0 = oooO00o2.f7530OooO0O0;
                    oooO0O0.OooOO0O();
                    oooO0O0.OooO0oO(oooOO2, decoderReuseEvaluationOooooOO);
                }
            });
        }
        return decoderReuseEvaluationOooooOO;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void OooooOo(OooOO0 oooOO1, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int iOooOo0;
        int i;
        OooOO0 oooOO2 = this.f7509o00000oo;
        int[] iArr = null;
        if (oooOO2 != null) {
            oooOO1 = oooOO2;
        } else if (this.f7677Oooo0o != null) {
            if ("audio/raw".equals(oooOO1.f6412OooOOOO)) {
                iOooOo0 = oooOO1.f6427OooOooO;
            } else if (o00.f34910OooO00o < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iOooOo0 = mediaFormat.containsKey("v-bits-per-sample") ? o00.OooOo0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iOooOo0 = mediaFormat.getInteger("pcm-encoding");
            }
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
            oooO00o.f6445OooOO0O = "audio/raw";
            oooO00o.f6459OooOoO = iOooOo0;
            oooO00o.f6461OooOoOO = oooOO1.f6428OooOooo;
            oooO00o.f6463OooOoo0 = oooOO1.f6430Oooo000;
            oooO00o.f6454OooOo = mediaFormat.getInteger("channel-count");
            oooO00o.f6460OooOoO0 = mediaFormat.getInteger("sample-rate");
            OooOO0 oooOO3 = new OooOO0(oooO00o);
            if (this.f7512o0000Ooo && oooOO3.f6426OooOoo0 == 6 && (i = oooOO1.f6426OooOoo0) < 6) {
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr2[i2] = i2;
                }
                iArr = iArr2;
            }
            oooOO1 = oooOO3;
        }
        try {
            this.f7506o00000Oo.OooOOOo(oooOO1, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw OooOoO0(5001, e.f7404OooO0Oo, e, false);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Oooooo0(long j) {
        this.f7506o00000Oo.OooOOO0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void OoooooO() {
        this.f7506o00000Oo.OooOOo0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void Ooooooo(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f7511o0000O00 || decoderInputBuffer.OooO0oO()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f7087OooO0oo - this.f7503o0000) > 500000) {
            this.f7503o0000 = decoderInputBuffer.f7087OooO0oo;
        }
        this.f7511o0000O00 = false;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    public final void o000OOo() {
        long jOooOOOO = this.f7506o00000Oo.OooOOOO(OooO0o0());
        if (jOooOOOO != Long.MIN_VALUE) {
            if (!this.f7514o0000oo) {
                jOooOOOO = Math.max(this.f7503o0000, jOooOOOO);
            }
            this.f7503o0000 = jOooOOOO;
            this.f7514o0000oo = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList o000oOoO(androidx.media3.exoplayer.mediacodec.OooO oooO, OooOO0 oooOO1, boolean z) throws MediaCodecUtil.DecoderQueryException {
        o0O00 o0o00O0O0O00 = o0O0O00(oooO, oooOO1, z, this.f7506o00000Oo);
        Pattern pattern = MediaCodecUtil.f7732OooO00o;
        ArrayList arrayList = new ArrayList(o0o00O0O0O00);
        Collections.sort(arrayList, new o0OoOo0(new Oooo0(oooOO1, 0)));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean o00O0O(long j, long j2, @Nullable androidx.media3.exoplayer.mediacodec.OooO0OO oooO0OO, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, OooOO0 oooOO1) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f7509o00000oo != null && (i2 & 2) != 0) {
            oooO0OO.getClass();
            oooO0OO.OooOOO0(i, false);
            return true;
        }
        AudioSink audioSink = this.f7506o00000Oo;
        if (z) {
            if (oooO0OO != null) {
                oooO0OO.OooOOO0(i, false);
            }
            this.f7701o000000.f33963OooO0o += i3;
            audioSink.OooOOo0();
            return true;
        }
        try {
            if (!audioSink.OooOO0o(byteBuffer, j3, i3)) {
                return false;
            }
            if (oooO0OO != null) {
                oooO0OO.OooOOO0(i, false);
            }
            this.f7701o000000.f33964OooO0o0 += i3;
            return true;
        } catch (AudioSink.InitializationException e) {
            throw OooOoO0(5001, this.f7508o00000oO, e, e.f7406OooO0o0);
        } catch (AudioSink.WriteException e2) {
            throw OooOoO0(5002, oooOO1, e2, e2.f7409OooO0o0);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void o00o0O() throws ExoPlaybackException {
        try {
            this.f7506o00000Oo.OooOOO();
        } catch (AudioSink.WriteException e) {
            throw OooOoO0(5002, e.f7408OooO0o, e, e.f7409OooO0o0);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean o0ooOOo(OooOO0 oooOO1) {
        return this.f7506o00000Oo.OooO0OO(oooOO1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L30;
     */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0ooOoO(androidx.media3.exoplayer.mediacodec.OooO oooO, OooOO0 oooOO1) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        if (!o0000oo.OooO0oo(oooOO1.f6412OooOOOO)) {
            return o00O.OooO00o(0, 0, 0);
        }
        int i = o00.f34910OooO00o >= 21 ? 32 : 0;
        boolean z2 = true;
        int i2 = oooOO1.f6433Oooo0O0;
        boolean z3 = i2 != 0;
        boolean z4 = i2 == 0 || i2 == 2;
        int i3 = 8;
        AudioSink audioSink = this.f7506o00000Oo;
        if (z4 && audioSink.OooO0OO(oooOO1)) {
            if (z3) {
                List<androidx.media3.exoplayer.mediacodec.OooO0o> listOooO0o0 = MediaCodecUtil.OooO0o0("audio/raw", false, false);
            }
            return o00O.OooO00o(4, 8, i);
        }
        if ("audio/raw".equals(oooOO1.f6412OooOOOO) && !audioSink.OooO0OO(oooOO1)) {
            return o00O.OooO00o(1, 0, 0);
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
        oooO00o.f6445OooOO0O = "audio/raw";
        oooO00o.f6454OooOo = oooOO1.f6426OooOoo0;
        oooO00o.f6460OooOoO0 = oooOO1.f6425OooOoo;
        oooO00o.f6459OooOoO = 2;
        if (!audioSink.OooO0OO(oooO00o.OooO00o())) {
            return o00O.OooO00o(1, 0, 0);
        }
        o0O00 o0o00O0O0O00 = o0O0O00(oooO, oooOO1, false, audioSink);
        if (o0o00O0O0O00.isEmpty()) {
            return o00O.OooO00o(1, 0, 0);
        }
        if (!z4) {
            return o00O.OooO00o(2, 0, 0);
        }
        androidx.media3.exoplayer.mediacodec.OooO0o oooO0o = (androidx.media3.exoplayer.mediacodec.OooO0o) o0o00O0O0O00.get(0);
        boolean zOooO0Oo = oooO0o.OooO0Oo(oooOO1);
        if (!zOooO0Oo) {
            int i4 = 1;
            while (true) {
                if (i4 >= o0o00O0O0O00.f19062OooO0oO) {
                    z = true;
                    z2 = zOooO0Oo;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.OooO0o oooO0o2 = (androidx.media3.exoplayer.mediacodec.OooO0o) o0o00O0O0O00.get(i4);
                if (oooO0o2.OooO0Oo(oooOO1)) {
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
        if (z2 && oooO0o.OooO0o0(oooOO1)) {
            i3 = 16;
        }
        return i5 | i3 | i | (oooO0o.f7760OooO0oO ? 64 : 0) | (z ? 128 : 0);
    }

    public final int oo0o0Oo(OooOO0 oooOO1, androidx.media3.exoplayer.mediacodec.OooO0o oooO0o) {
        int i;
        if (!"OMX.google.raw.decoder".equals(oooO0o.f7754OooO00o) || (i = o00.f34910OooO00o) >= 24 || (i == 23 && o00.Oooo0O0(this.f7504o00000O))) {
            return oooOO1.f6413OooOOOo;
        }
        return -1;
    }
}
