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
import p042Ooooo0o.o000O0O0;
import p193o00o0O0.o00000O0;
import p294o0O0Oo0O.OooOo00;
import p294o0O0Oo0O.o00Ooo;
import p295o0O0Oo0o.o0O0O00;
import p302o0O0Oooo.o000OO00;
import p302o0O0Oooo.o000OOo0;
import p319o0O0oOo.o00;
import p319o0O0oOo.o0000O;
import p319o0O0oOo.o000OO;
import p468o0OooO0.o0000O0O;
import p468o0OooO0.o000O00;
import p468o0OooO0.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends MediaCodecRenderer implements o000OO {

    /* JADX INFO: renamed from: o000O, reason: collision with root package name */
    @Nullable
    public Renderer.OooO00o f13612o000O;

    /* JADX INFO: renamed from: o000O0, reason: collision with root package name */
    public int f13613o000O0;

    /* JADX INFO: renamed from: o000O00, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o f13614o000O00;

    /* JADX INFO: renamed from: o000O00O, reason: collision with root package name */
    public final AudioSink f13615o000O00O;

    /* JADX INFO: renamed from: o000O0O0, reason: collision with root package name */
    @Nullable
    public Format f13616o000O0O0;

    /* JADX INFO: renamed from: o000O0Oo, reason: collision with root package name */
    public boolean f13617o000O0Oo;

    /* JADX INFO: renamed from: o000O0o0, reason: collision with root package name */
    public long f13618o000O0o0;

    /* JADX INFO: renamed from: o000O0oO, reason: collision with root package name */
    public boolean f13619o000O0oO;

    /* JADX INFO: renamed from: o000O0oo, reason: collision with root package name */
    public boolean f13620o000O0oo;

    /* JADX INFO: renamed from: o000OO0O, reason: collision with root package name */
    public boolean f13621o000OO0O;

    /* JADX INFO: renamed from: o000Oo0, reason: collision with root package name */
    public final Context f13622o000Oo0;

    public final class OooO00o implements AudioSink.OooO00o {
        public OooO00o() {
        }
    }

    public OooOO0(Context context, com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, @Nullable Handler handler, @Nullable com.google.android.exoplayer2.audio.OooO00o oooO00o, AudioSink audioSink) {
        super(1, oooO0O0, 44100.0f);
        this.f13622o000Oo0 = context.getApplicationContext();
        this.f13615o000O00O = audioSink;
        this.f13614o000O00 = new com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o(handler, oooO00o);
        ((DefaultAudioSink) audioSink).f13507OooOOO = new OooO00o();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final boolean OooO0O0() {
        return this.f13615o000O00O.OooO() || super.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public final boolean OooO0Oo() {
        return this.f14412o0000oOO && this.f13615o000O00O.OooO0Oo();
    }

    @Override // p319o0O0oOo.o000OO
    public final void OooO0o0(o000O00 o000o01) {
        this.f13615o000O00O.OooO0o0(o000o01);
    }

    @Override // p319o0O0oOo.o000OO
    public final o000O00 OooO0oO() {
        return this.f13615o000O00O.OooO0oO();
    }

    @Override // p319o0O0oOo.o000OO
    public final long OooOOO0() {
        if (this.f13218OoooO == 2) {
            o0O0O00();
        }
        return this.f13618o000O0o0;
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.OooOo.OooO0O0
    public final void OooOOOo(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f13615o000O00O.OooOOOo(((Float) obj).floatValue());
        }
        if (i == 3) {
            this.f13615o000O00O.OooOO0((p294o0O0Oo0O.OooOOO0) obj);
            return;
        }
        if (i == 5) {
            this.f13615o000O00O.OooOOo((o00Ooo) obj);
            return;
        }
        switch (i) {
            case 101:
                this.f13615o000O00O.OooOo0(((Boolean) obj).booleanValue());
                break;
            case 102:
                this.f13615o000O00O.OooOO0O(((Integer) obj).intValue());
                break;
            case 103:
                this.f13612o000O = (Renderer.OooO00o) obj;
                break;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o, com.google.android.exoplayer2.Renderer
    @Nullable
    public final o000OO OooOo0o() {
        return this;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOoOO() {
        try {
            this.f13615o000O00O.flush();
            try {
                super.OooOoOO();
            } finally {
                this.f13614o000O00.OooO00o(this.f14417o000O000);
            }
        } catch (Throwable th) {
            try {
                super.OooOoOO();
                throw th;
            } finally {
                this.f13614o000O00.OooO00o(this.f14417o000O000);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOoo(long j, boolean z) throws ExoPlaybackException {
        super.OooOoo(j, z);
        this.f13615o000O00O.flush();
        this.f13618o000O0o0 = j;
        this.f13619o000O0oO = true;
        this.f13620o000O0oo = true;
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOoo0(boolean z) throws ExoPlaybackException {
        o0O0O00 o0o0o00 = new o0O0O00();
        this.f14417o000O000 = o0o0o00;
        com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = this.f13614o000O00;
        Handler handler = c0096OooO00o.f13569OooO00o;
        if (handler != null) {
            handler.post(new o000oOoO(c0096OooO00o, o0o0o00, 1));
        }
        o000O0Oo o000o0oo2 = this.f13219OoooO0;
        Objects.requireNonNull(o000o0oo2);
        int i = o000o0oo2.f40557OooO00o;
        if (i != 0) {
            this.f13615o000O00O.OooOOo0(i);
        } else {
            this.f13615o000O00O.OooOOO();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.OooO0o
    public final void OooOooO() {
        try {
            try {
                Oooo0o();
                o00O0O();
                o00oO0o(null);
                this.f13615o000O00O.OooO00o();
            } catch (Throwable th) {
                o00oO0o(null);
                throw th;
            }
        } catch (Throwable th2) {
            this.f13615o000O00O.OooO00o();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void OooOooo() {
        this.f13615o000O00O.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.OooO0o
    public final void Oooo000() {
        o0O0O00();
        this.f13615o000O00O.pause();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int Oooo0O0(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, Format format, Format format2) {
        if (oo0o0Oo(oooO00o, format2) > this.f13613o000O0) {
            return 0;
        }
        if (oooO00o.OooO0o(format, format2, true)) {
            return 3;
        }
        return o00.OooO00o(format.f13148OoooOoo, format2.f13148OoooOoo) && format.f13160o00Oo0 == format2.f13160o00Oo0 && format.f13161o00Ooo == format2.f13161o00Ooo && format.f13162o00o0O == format2.f13162o00o0O && format.OooO0O0(format2) && !"audio/opus".equals(format.f13148OoooOoo) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooo0OO(com.google.android.exoplayer2.mediacodec.OooO00o oooO00o, p304o0O0o00o.OooOOOO oooOOOO, Format format, @Nullable MediaCrypto mediaCrypto, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        Format[] formatArr = this.f13227o000oOoO;
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
        this.f13613o000O0 = iOo0o0Oo;
        String str = oooO00o.f14453OooO00o;
        int i = o00.f36680OooO00o;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(o00.f36682OooO0OO)) {
            String str2 = o00.f36681OooO0O0;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f13617o000O0Oo = z;
        String str3 = oooO00o.f14453OooO00o;
        if (i < 21 && "OMX.SEC.mp3.dec".equals(str3) && "samsung".equals(o00.f36682OooO0OO)) {
            String str4 = o00.f36681OooO0O0;
            if (str4.startsWith("baffin") || str4.startsWith("grand") || str4.startsWith("fortuna") || str4.startsWith("gprimelte") || str4.startsWith("j2y18lte") || str4.startsWith("ms01")) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.f13621o000OO0O = z2;
        String str5 = oooO00o.f14455OooO0OO;
        int i2 = this.f13613o000O0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str5);
        mediaFormat.setInteger("channel-count", format.f13160o00Oo0);
        mediaFormat.setInteger("sample-rate", format.f13161o00Ooo);
        o000O0O0.OooO0o0(mediaFormat, format.f13150Ooooo0o);
        o000O0O0.OooO0Oo(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str6 = o00.f36683OooO0Oo;
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
        if (i <= 28 && "audio/ac4".equals(format.f13148OoooOoo)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            AudioSink audioSink = this.f13615o000O00O;
            int i3 = format.f13160o00Oo0;
            int i4 = format.f13161o00Ooo;
            Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
            oooO0O0.f13180OooOO0O = "audio/raw";
            oooO0O0.f13189OooOo = i3;
            oooO0O0.f13195OooOoO0 = i4;
            oooO0O0.f13194OooOoO = 4;
            if (audioSink.OooOo00(new Format(oooO0O0)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        oooOOOO.OooO0Oo(mediaFormat, null, mediaCrypto);
        if ("audio/raw".equals(oooO00o.f14454OooO0O0) && !"audio/raw".equals(format.f13148OoooOoo)) {
            z4 = true;
        }
        if (!z4) {
            format = null;
        }
        this.f13616o000O0O0 = format;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final List<com.google.android.exoplayer2.mediacodec.OooO00o> OoooOOO(com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        com.google.android.exoplayer2.mediacodec.OooO00o oooO00oOooO0o;
        String str = format.f13148OoooOoo;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f13615o000O00O.OooO0OO(format) && (oooO00oOooO0o = MediaCodecUtil.OooO0o()) != null) {
            return Collections.singletonList(oooO00oOooO0o);
        }
        List<com.google.android.exoplayer2.mediacodec.OooO00o> listOooO00o = oooO0O0.OooO00o(str, z, false);
        Pattern pattern = MediaCodecUtil.f14445OooO00o;
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
        final com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = this.f13614o000O00;
        Handler handler = c0096OooO00o.f13569OooO00o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: o0O0Oo0O.o0OoOo0
                @Override // java.lang.Runnable
                public final void run() {
                    OooO00o.C0096OooO00o c0096OooO00o2 = c0096OooO00o;
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    OooO00o oooO00o = c0096OooO00o2.f13570OooO0O0;
                    int i = o00.f36680OooO00o;
                    oooO00o.OooOo00(str2, j3, j4);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OooooO0(o0000O0O o0000o0o2) throws ExoPlaybackException {
        super.OooooO0(o0000o0o2);
        com.google.android.exoplayer2.audio.OooO00o.C0096OooO00o c0096OooO00o = this.f13614o000O00;
        Format format = o0000o0o2.f40527OooO0O0;
        Handler handler = c0096OooO00o.f13569OooO00o;
        if (handler != null) {
            handler.post(new OooOo00(c0096OooO00o, format, 0));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void OooooOO(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
        int iOooOOoo;
        int i;
        Format format2 = this.f13616o000O0O0;
        int[] iArr = null;
        if (format2 == null) {
            if (this.f14435o0ooOO0 == null) {
                format2 = format;
            } else {
                if ("audio/raw".equals(format.f13148OoooOoo)) {
                    iOooOOoo = format.f13162o00o0O;
                } else if (o00.f36680OooO00o >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                    iOooOOoo = mediaFormat.getInteger("pcm-encoding");
                } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                    iOooOOoo = o00.OooOOoo(mediaFormat.getInteger("v-bits-per-sample"));
                } else {
                    iOooOOoo = "audio/raw".equals(format.f13148OoooOoo) ? format.f13162o00o0O : 2;
                }
                Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
                oooO0O0.f13180OooOO0O = "audio/raw";
                oooO0O0.f13194OooOoO = iOooOOoo;
                oooO0O0.f13196OooOoOO = format.f13165o00ooo;
                oooO0O0.f13198OooOoo0 = format.f13168oo000o;
                oooO0O0.f13189OooOo = mediaFormat.getInteger("channel-count");
                oooO0O0.f13195OooOoO0 = mediaFormat.getInteger("sample-rate");
                format2 = new Format(oooO0O0);
                if (this.f13617o000O0Oo && format2.f13160o00Oo0 == 6 && (i = format.f13160o00Oo0) < 6) {
                    iArr = new int[i];
                    for (int i2 = 0; i2 < format.f13160o00Oo0; i2++) {
                        iArr[i2] = i2;
                    }
                }
            }
        }
        try {
            this.f13615o000O00O.OooOO0o(format2, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw OooOoO0(e, format);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooooo(DecoderInputBuffer decoderInputBuffer) {
        if (!this.f13619o000O0oO || decoderInputBuffer.isDecodeOnly()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f13662OoooO0O - this.f13618o000O0o0) > 500000) {
            this.f13618o000O0o0 = decoderInputBuffer.f13662OoooO0O;
        }
        this.f13619o000O0oO = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Oooooo0() {
        this.f13615o000O00O.OooOOOO();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean Ooooooo(long j, long j2, @Nullable MediaCodec mediaCodec, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        Objects.requireNonNull(byteBuffer);
        if (mediaCodec != null && this.f13621o000OO0O && j3 == 0 && (i2 & 4) != 0) {
            long j4 = this.f14409o0000o0o;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
        }
        if (this.f13616o000O0O0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(mediaCodec);
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            if (mediaCodec != null) {
                mediaCodec.releaseOutputBuffer(i, false);
            }
            Objects.requireNonNull(this.f14417o000O000);
            this.f13615o000O00O.OooOOOO();
            return true;
        }
        try {
            if (!this.f13615o000O00O.OooOOoo(byteBuffer, j3, i3)) {
                return false;
            }
            if (mediaCodec != null) {
                mediaCodec.releaseOutputBuffer(i, false);
            }
            Objects.requireNonNull(this.f14417o000O000);
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
            int i = format.f13161o00Ooo;
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
            this.f13615o000O00O.OooO0oo();
        } catch (AudioSink.WriteException e) {
            Format format = this.f14424o00Oo0;
            if (format == null) {
                format = this.f14423o00O0O;
            }
            throw OooOoO0(e, format);
        }
    }

    public final void o0O0O00() {
        long jOooOOO0 = this.f13615o000O00O.OooOOO0(OooO0Oo());
        if (jOooOOO0 != Long.MIN_VALUE) {
            if (!this.f13620o000O0oo) {
                jOooOOO0 = Math.max(this.f13618o000O0o0, jOooOOO0);
            }
            this.f13618o000O0o0 = jOooOOO0;
            this.f13620o000O0oo = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean o0ooOOo(Format format) {
        return this.f13615o000O00O.OooO0OO(format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final int o0ooOoO(com.google.android.exoplayer2.mediacodec.OooO0O0 oooO0O0, Format format) throws MediaCodecUtil.DecoderQueryException {
        if (!o0000O.OooO0oO(format.f13148OoooOoo)) {
            return 0;
        }
        int i = o00.f36680OooO00o >= 21 ? 32 : 0;
        Class<? extends o000OO00> cls = format.f13163o00oO0O;
        boolean z = cls != null;
        boolean z2 = cls == null || o000OOo0.class.equals(cls);
        if (z2 && this.f13615o000O00O.OooO0OO(format) && (!z || MediaCodecUtil.OooO0o() != null)) {
            return 12 | i;
        }
        if ("audio/raw".equals(format.f13148OoooOoo) && !this.f13615o000O00O.OooO0OO(format)) {
            return 1;
        }
        AudioSink audioSink = this.f13615o000O00O;
        int i2 = format.f13160o00Oo0;
        int i3 = format.f13161o00Ooo;
        Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
        oooO0O1.f13180OooOO0O = "audio/raw";
        oooO0O1.f13189OooOo = i2;
        oooO0O1.f13195OooOoO0 = i3;
        oooO0O1.f13194OooOoO = 2;
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
        if (!"OMX.google.raw.decoder".equals(oooO00o.f14453OooO00o) || (i = o00.f36680OooO00o) >= 24 || (i == 23 && o00.OooOoOO(this.f13622o000Oo0))) {
            return format.f13149Ooooo00;
        }
        return -1;
    }
}
