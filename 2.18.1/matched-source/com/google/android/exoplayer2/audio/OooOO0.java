package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.appevents.o000oOoO;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.audio.OooO00o;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p168o00Ooo0.Oooo000;
import p192o00o0O0.o00000O0;
import p293o0O0Oo0O.OooOo00;
import p293o0O0Oo0O.o00Ooo;
import p294o0O0Oo0o.o0O0O00;
import p301o0O0Oooo.o00;
import p318o0O0oOo.o0000O0O;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o000O00;
import p466o0OooO0.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends MediaCodecRenderer implements o0000O0O {

    /* JADX INFO: renamed from: o000O0, reason: collision with root package name */
    @Nullable
    public Format f13595o000O0;

    /* JADX INFO: renamed from: o000O00, reason: collision with root package name */
    public boolean f13596o000O00;

    /* JADX INFO: renamed from: o000O00O, reason: collision with root package name */
    public boolean f13597o000O00O;

    /* JADX INFO: renamed from: o000O0O, reason: collision with root package name */
    public final AudioSink f13598o000O0O;

    /* JADX INFO: renamed from: o000O0O0, reason: collision with root package name */
    public boolean f13599o000O0O0;

    /* JADX INFO: renamed from: o000O0Oo, reason: collision with root package name */
    public long f13600o000O0Oo;

    /* JADX INFO: renamed from: o000O0o, reason: collision with root package name */
    public final Context f13601o000O0o;

    /* JADX INFO: renamed from: o000O0o0, reason: collision with root package name */
    @Nullable
    public Renderer.OooO00o f13602o000O0o0;

    /* JADX INFO: renamed from: o000OO0O, reason: collision with root package name */
    public boolean f13603o000OO0O;
    public int o000Oo0;

    /* JADX INFO: renamed from: o000Ooo, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o f13604o000Ooo;

    public final class OooO00o implements AudioSink.OooO00o {
        public OooO00o() {
        }
    }

    public OooOO0(Context context, com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, @Nullable Handler handler, @Nullable com.google.android.exoplayer2.audio.OooO00o oooO00o, AudioSink audioSink) {
        super(1, oooO0O0, 44100.0f);
        this.f13601o000O0o = context.getApplicationContext();
        this.f13598o000O0O = audioSink;
        this.f13604o000Ooo = new com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o(handler, oooO00o);
        ((DefaultAudioSink) audioSink).f13490OooOOO = new OooO00o();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return this.f13598o000O0O.OooO() || super.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return this.f14394o0000o0o && this.f13598o000O0O.OooO0Oo();
    }

    @Override // p318o0O0oOo.o0000O0O
    public final void OooO0o0(o000O00 o000o01) {
        this.f13598o000O0O.OooO0o0(o000o01);
    }

    @Override // p318o0O0oOo.o0000O0O
    public final o000O00 OooO0oO() {
        return this.f13598o000O0O.OooO0oO();
    }

    @Override // p318o0O0oOo.o0000O0O
    public final long OooOOO0() {
        if (this.f13206OoooO00 == 2) {
            o0O0O00();
        }
        return this.f13600o000O0Oo;
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.OooOo.OooO0O0
    public final void OooOOOo(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f13598o000O0O.OooOOOo(((Float) obj).floatValue());
        }
        if (i == 3) {
            this.f13598o000O0O.OooOO0((p293o0O0Oo0O.OooOOO0) obj);
            return;
        }
        if (i == 5) {
            this.f13598o000O0O.OooOOo((o00Ooo) obj);
            return;
        }
        switch (i) {
            case 101:
                this.f13598o000O0O.OooOo0(((Boolean) obj).booleanValue());
                break;
            case 102:
                this.f13598o000O0O.OooOO0O(((Integer) obj).intValue());
                break;
            case 103:
                this.f13602o000O0o0 = (Renderer.OooO00o) obj;
                break;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    @Nullable
    public final o0000O0O OooOo0o() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        try {
            this.f13598o000O0O.flush();
            try {
                super.OooOoOO();
            } finally {
                this.f13604o000Ooo.OooO00o(this.f14400o0000oo0);
            }
        } catch (Throwable th) {
            try {
                super.OooOoOO();
                throw th;
            } finally {
                this.f13604o000Ooo.OooO00o(this.f14400o0000oo0);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) throws ExoPlaybackException {
        super.OooOoo(j, z);
        this.f13598o000O0O.flush();
        this.f13600o000O0Oo = j;
        this.f13603o000OO0O = true;
        this.f13599o000O0O0 = true;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo0(boolean z) throws ExoPlaybackException {
        o0O0O00 o0o0o00 = new o0O0O00();
        this.f14400o0000oo0 = o0o0o00;
        com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = this.f13604o000Ooo;
        Handler handler = c0096OooO00o.f13552OooO00o;
        if (handler != null) {
            handler.post(new o000oOoO(c0096OooO00o, o0o0o00, 1));
        }
        o000O0Oo o000o0oo2 = this.f13203Oooo0oo;
        Objects.requireNonNull(o000o0oo2);
        int i = o000o0oo2.f40538OooO00o;
        if (i != 0) {
            this.f13598o000O0O.OooOOo0(i);
        } else {
            this.f13598o000O0O.OooOOO();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOooO() {
        try {
            try {
                Oooo0o();
                o00O0O();
                o00oO0o(null);
                this.f13598o000O0O.OooO00o();
            } catch (Throwable th) {
                o00oO0o(null);
                throw th;
            }
        } catch (Throwable th2) {
            this.f13598o000O0O.OooO00o();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOooo() {
        this.f13598o000O0O.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo000() {
        o0O0O00();
        this.f13598o000O0O.pause();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int Oooo0O0(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, Format format, Format format2) {
        if (oo0o0Oo(oooO00o, format2) > this.o000Oo0) {
            return 0;
        }
        if (oooO00o.OooO0o(format, format2, true)) {
            return 3;
        }
        return o000OOo0.OooO00o(format.f13131OoooOOo, format2.f13131OoooOOo) && format.f13150o0OoOo0 == format2.f13150o0OoOo0 && format.f13152ooOO == format2.f13152ooOO && format.f13145o00O0O == format2.f13145o00O0O && format.OooO0O0(format2) && !"audio/opus".equals(format.f13131OoooOOo) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooo0OO(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, p303o0O0o00o.OooOOOO oooOOOO, Format format, @Nullable MediaCrypto mediaCrypto, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        Format[] formatArr = this.f13207OoooO0O;
        Objects.requireNonNull(formatArr);
        int iOo0o0Oo = oo0o0Oo(oooO00o, format);
        boolean z4 = false;
        if (formatArr.length != 1) {
            for (Format format2 : formatArr) {
                if (oooO00o.OooO0o(format, format2, false)) {
                    iOo0o0Oo = Math.max(iOo0o0Oo, oo0o0Oo(oooO00o, format2));
                }
            }
        }
        this.o000Oo0 = iOo0o0Oo;
        String str = oooO00o.f14435OooO00o;
        int i = o000OOo0.f36740OooO00o;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(o000OOo0.f36742OooO0OO)) {
            String str2 = o000OOo0.f36741OooO0O0;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f13596o000O00 = z;
        String str3 = oooO00o.f14435OooO00o;
        if (i < 21 && "OMX.SEC.mp3.dec".equals(str3) && "samsung".equals(o000OOo0.f36742OooO0OO)) {
            String str4 = o000OOo0.f36741OooO0O0;
            if (str4.startsWith("baffin") || str4.startsWith("grand") || str4.startsWith("fortuna") || str4.startsWith("gprimelte") || str4.startsWith("j2y18lte") || str4.startsWith("ms01")) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.f13597o000O00O = z2;
        String str5 = oooO00o.f14437OooO0OO;
        int i2 = this.o000Oo0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str5);
        mediaFormat.setInteger("channel-count", format.f13150o0OoOo0);
        mediaFormat.setInteger("sample-rate", format.f13152ooOO);
        Oooo000.OooO0O0(mediaFormat, format.f13133OoooOoO);
        Oooo000.OooO00o(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str6 = o000OOo0.f36743OooO0Oo;
                    if ("ZTE B2017G".equals(str6) || "AXON 7 mini".equals(str6)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                if (!z3) {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        if (i <= 28 && "audio/ac4".equals(format.f13131OoooOOo)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            AudioSink audioSink = this.f13598o000O0O;
            int i3 = format.f13150o0OoOo0;
            int i4 = format.f13152ooOO;
            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
            oooO0O0.f13163OooOO0O = "audio/raw";
            oooO0O0.f13172OooOo = i3;
            oooO0O0.f13178OooOoO0 = i4;
            oooO0O0.f13177OooOoO = 4;
            if (audioSink.OooOo00(new Format(oooO0O0)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        oooOOOO.OooO0Oo(mediaFormat, null, mediaCrypto);
        if ("audio/raw".equals(oooO00o.f14436OooO0O0) && !"audio/raw".equals(format.f13131OoooOOo)) {
            z4 = true;
        }
        if (!z4) {
            format = null;
        }
        this.f13595o000O0 = format;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final List<com.google.android.exoplayer2.mediacodec.OooO00o> OoooOOO(com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        com.google.android.exoplayer2.mediacodec.OooO00o oooO00oOooO0o;
        String str = format.f13131OoooOOo;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f13598o000O0O.OooO0OO(format) && (oooO00oOooO0o = MediaCodecUtil.OooO0o()) != null) {
            return Collections.singletonList(oooO00oOooO0o);
        }
        List<com.google.android.exoplayer2.mediacodec.OooO00o> listOooO00o = oooO0O0.OooO00o(str, z, false);
        Pattern pattern = MediaCodecUtil.f14427OooO00o;
        ArrayList arrayList = new ArrayList(listOooO00o);
        MediaCodecUtil.OooOO0(arrayList, new o00000O0(format));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(oooO0O0.OooO00o("audio/eac3", z, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Ooooo0o(final String str, final long j, final long j2) {
        final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = this.f13604o000Ooo;
        Handler handler = c0096OooO00o.f13552OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o0O0Oo0O.o0OoOo0
                @Override // java.lang.Runnable
                public final void run() {
                    OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    OooO00o oooO00o = c0096OooO00o2.f13553OooO0O0;
                    int i = o000OOo0.f36740OooO00o;
                    oooO00o.OooOo00(str2, j3, j4);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OooooO0(p466o0OooO0.o0000O0O o0000o0o2) throws ExoPlaybackException {
        super.OooooO0(o0000o0o2);
        com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = this.f13604o000Ooo;
        Format format = o0000o0o2.f40508OooO0O0;
        Handler handler = c0096OooO00o.f13552OooO00o;
        if (handler != null) {
            handler.post(new OooOo00(c0096OooO00o, format, 0));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OooooOO(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int iOooOOoo;
        int i;
        Format format2 = this.f13595o000O0;
        int[] iArr = null;
        if (format2 == null) {
            if (this.f14420oo000o == null) {
                format2 = format;
            } else {
                if ("audio/raw".equals(format.f13131OoooOOo)) {
                    iOooOOoo = format.f13145o00O0O;
                } else if (o000OOo0.f36740OooO00o >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                    iOooOOoo = mediaFormat.getInteger("pcm-encoding");
                } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                    iOooOOoo = o000OOo0.OooOOoo(mediaFormat.getInteger("v-bits-per-sample"));
                } else {
                    iOooOOoo = "audio/raw".equals(format.f13131OoooOOo) ? format.f13145o00O0O : 2;
                }
                Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                oooO0O0.f13163OooOO0O = "audio/raw";
                oooO0O0.f13177OooOoO = iOooOOoo;
                oooO0O0.f13179OooOoOO = format.f13146o00Oo0;
                oooO0O0.f13181OooOoo0 = format.f13147o00Ooo;
                oooO0O0.f13172OooOo = mediaFormat.getInteger("channel-count");
                oooO0O0.f13178OooOoO0 = mediaFormat.getInteger("sample-rate");
                format2 = new Format(oooO0O0);
                if (this.f13596o000O00 && format2.f13150o0OoOo0 == 6 && (i = format.f13150o0OoOo0) < 6) {
                    iArr = new int[i];
                    for (int i2 = 0; i2 < format.f13150o0OoOo0; i2++) {
                        iArr[i2] = i2;
                    }
                }
            }
        }
        try {
            this.f13598o000O0O.OooOO0o(format2, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw OooOoO0(e, format);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooooo(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f13603o000OO0O || decoderInputBuffer.isDecodeOnly()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f13640Oooo - this.f13600o000O0Oo) > 500000) {
            this.f13600o000O0Oo = decoderInputBuffer.f13640Oooo;
        }
        this.f13603o000OO0O = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooooo0() {
        this.f13598o000O0O.OooOOOO();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean Ooooooo(long j, long j2, @Nullable MediaCodec mediaCodec, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        Objects.requireNonNull(byteBuffer);
        if (mediaCodec != null && this.f13597o000O00O && j3 == 0 && (i2 & 4) != 0) {
            long j4 = this.f14389o0000OoO;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
        }
        if (this.f13595o000O0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(mediaCodec);
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (mediaCodec != null) {
                mediaCodec.releaseOutputBuffer(i, false);
            }
            Objects.requireNonNull(this.f14400o0000oo0);
            this.f13598o000O0O.OooOOOO();
            return true;
        }
        try {
            if (!this.f13598o000O0O.OooOOoo(byteBuffer, j3, i3)) {
                return false;
            }
            if (mediaCodec != null) {
                mediaCodec.releaseOutputBuffer(i, false);
            }
            Objects.requireNonNull(this.f14400o0000oo0);
            return true;
        } catch (AudioSink.InitializationException | AudioSink.WriteException e) {
            throw OooOoO0(e, format);
        }
    }

    @Override // com.google.android.exoplayer2.Renderer, com.google.android.exoplayer2.RendererCapabilities
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float o000oOoO(float f, Format[] formatArr) {
        int iMax = -1;
        for (Format format : formatArr) {
            int i = format.f13152ooOO;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void o00Oo0() throws ExoPlaybackException {
        try {
            this.f13598o000O0O.OooO0oo();
        } catch (AudioSink.WriteException e) {
            Format format = this.f14416o0OoOo0;
            if (format == null) {
                format = this.f14365Ooooooo;
            }
            throw OooOoO0(e, format);
        }
    }

    public final void o0O0O00() {
        long jOooOOO0 = this.f13598o000O0O.OooOOO0(OooO0Oo());
        if (jOooOOO0 != Long.MIN_VALUE) {
            if (!this.f13599o000O0O0) {
                jOooOOO0 = Math.max(this.f13600o000O0Oo, jOooOOO0);
            }
            this.f13600o000O0Oo = jOooOOO0;
            this.f13599o000O0O0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean o0ooOOo(Format format) {
        return this.f13598o000O0O.OooO0OO(format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int o0ooOoO(com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, Format format) throws MediaCodecUtil.DecoderQueryException {
        if (!o000OO.OooO0oO(format.f13131OoooOOo)) {
            return 0;
        }
        int i = o000OOo0.f36740OooO00o >= 21 ? 32 : 0;
        Class<? extends p301o0O0Oooo.o000OOo0> cls = format.f13149o00ooo;
        boolean z = cls != null;
        boolean z2 = cls == null || o00.class.equals(cls);
        if (z2 && this.f13598o000O0O.OooO0OO(format) && (!z || MediaCodecUtil.OooO0o() != null)) {
            return 12 | i;
        }
        if ("audio/raw".equals(format.f13131OoooOOo) && !this.f13598o000O0O.OooO0OO(format)) {
            return 1;
        }
        AudioSink audioSink = this.f13598o000O0O;
        int i2 = format.f13150o0OoOo0;
        int i3 = format.f13152ooOO;
        Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
        oooO0O1.f13163OooOO0O = "audio/raw";
        oooO0O1.f13172OooOo = i2;
        oooO0O1.f13178OooOoO0 = i3;
        oooO0O1.f13177OooOoO = 2;
        if (!audioSink.OooO0OO(oooO0O1.OooO00o())) {
            return 1;
        }
        List<com.google.android.exoplayer2.mediacodec.OooO00o> listOoooOOO = OoooOOO(oooO0O0, format, false);
        if (listOoooOOO.isEmpty()) {
            return 1;
        }
        if (!z2) {
            return 2;
        }
        com.google.android.exoplayer2.mediacodec.OooO00o oooO00o = listOoooOOO.get(0);
        boolean zOooO0Oo = oooO00o.OooO0Oo(format);
        return ((zOooO0Oo && oooO00o.OooO0o0(format)) ? 16 : 8) | (zOooO0Oo ? 4 : 3) | i;
    }

    public final int oo0o0Oo(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, Format format) {
        int i;
        if (!"OMX.google.raw.decoder".equals(oooO00o.f14435OooO00o) || (i = o000OOo0.f36740OooO00o) >= 24 || (i == 23 && o000OOo0.OooOoOO(this.f13601o000O0o))) {
            return format.f13132OoooOo0;
        }
        return -1;
    }
}
