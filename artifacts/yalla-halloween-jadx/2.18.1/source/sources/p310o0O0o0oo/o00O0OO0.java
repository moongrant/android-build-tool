package p310o0O0o0oo;

import android.media.MediaCodec;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.OooO0OO;
import com.google.android.exoplayer2.upstream.OooOO0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.ByteCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p296o0O0OoO0.o00O0O;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000Ooo;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o0000O0O;
import p466o0OooO0.o000O0O0;
import p709oo0oOOo.OooOO0O;
import p709oo0oOOo.Oooo0;
import p709oo0oOOo.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO0 implements o00O00, o0OoOo0, Loader.OooO00o<OooO00o>, Loader.OooO, o00O0OOO.OooO0O0 {

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public static final Format f36363o0OO00O;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public static final Map<String, String> f36364o0Oo0oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Oooo000 f36365Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Uri f36366Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o f36367Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0O0 f36368Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final p709oo0oOOo.OooO0OO f36369OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o f36370OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final o00O0O00.OooO00o f36371OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooO0O0 f36372OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public final String f36373OoooOO0;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final o000O0 f36375OoooOOo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final Handler f36379Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public o00O00.OooO00o f36380Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public IcyHeaders f36381OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public o00O0OOO[] f36382OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public OooO0o[] f36383OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f36384Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f36385Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f36386OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public OooO f36387Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final long f36388o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f36389o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f36390o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f36391o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f36392o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public long f36393o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public long f36394o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f36395o00ooo;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public boolean f36396o0OOO0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public oo0o0Oo f36397o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f36398o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f36399o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public boolean f36400o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public long f36401oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public long f36402ooOO;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Loader f36374OoooOOO = new Loader();

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final o0000Ooo f36376OoooOo0 = new o0000Ooo();

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final OooOO0.OooO f36377OoooOoO = new OooOO0.OooO(this, 3);

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final o00O0O0O f36378OoooOoo = new o00O0O0O(this, 0);

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackGroupArray f36403OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f36404OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean[] f36405OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean[] f36406OooO0Oo;

        public OooO(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f36403OooO00o = trackGroupArray;
            this.f36404OooO0O0 = zArr;
            int i = trackGroupArray.f14605Oooo0o;
            this.f36405OooO0OO = new boolean[i];
            this.f36406OooO0Oo = new boolean[i];
        }
    }

    public final class OooO00o implements Loader.OooO0o, o00.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Uri f36409OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Oooo0 f36410OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000O0 f36411OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o0000Ooo f36412OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0OoOo0 f36413OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile boolean f36415OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f36416OooOO0;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f36419OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public TrackOutput f36420OooOOO0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o0OO00O f36414OooO0oO = new o0OO00O();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f36407OooO = true;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public long f36418OooOO0o = -1;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f36408OooO00o = o00O0000.f36320OooO0OO.getAndIncrement();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public DataSpec f36417OooOO0O = OooO00o(0);

        public OooO00o(Uri uri, com.google.android.exoplayer2.upstream.OooO00o oooO00o, o000O0 o000o0, o0OoOo0 o0oooo1, o0000Ooo o0000ooo) {
            this.f36409OooO0O0 = uri;
            this.f36410OooO0OO = new Oooo0(oooO00o);
            this.f36411OooO0Oo = o000o0;
            this.f36413OooO0o0 = o0oooo1;
            this.f36412OooO0o = o0000ooo;
        }

        public final DataSpec OooO00o(long j) {
            Collections.emptyMap();
            Uri uri = this.f36409OooO0O0;
            String str = o00O0OO0.this.f36373OoooOO0;
            Map<String, String> map = o00O0OO0.f36364o0Oo0oo;
            o00000O0.OooO0oO(uri, "The uri must be set.");
            return new DataSpec(uri, 0L, 1, null, map, j, -1L, str, 6, null, null);
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x010c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0O0() throws IOException {
            OooOO0O o00Var;
            int i;
            int iOooO0o0 = 0;
            while (iOooO0o0 == 0 && !this.f36415OooO0oo) {
                long j = this.f36414OooO0oO.f35929OooO00o;
                DataSpec dataSpecOooO00o = OooO00o(j);
                this.f36417OooOO0O = dataSpecOooO00o;
                long jOooO0o = this.f36410OooO0OO.OooO0o(dataSpecOooO00o);
                this.f36418OooOO0o = jOooO0o;
                if (jOooO0o != -1) {
                    this.f36418OooOO0o = jOooO0o + j;
                }
                o00O0OO0.this.f36381OooooO0 = IcyHeaders.OooO00o(this.f36410OooO0OO.OooO0oo());
                Oooo0 oooo0 = this.f36410OooO0OO;
                IcyHeaders icyHeaders = o00O0OO0.this.f36381OooooO0;
                if (icyHeaders == null || (i = icyHeaders.f14478OoooO0) == -1) {
                    o00Var = oooo0;
                } else {
                    o00Var = new o00(oooo0, i, this);
                    o00O0OO0 o00o0oo1 = o00O0OO0.this;
                    Objects.requireNonNull(o00o0oo1);
                    TrackOutput trackOutputOooOoo = o00o0oo1.OooOoo(new OooO0o(0, true));
                    this.f36420OooOOO0 = trackOutputOooOoo;
                    ((o00O0OOO) trackOutputOooOoo).OooO0o0(o00O0OO0.f36363o0OO00O);
                }
                long jOooO00o = j;
                this.f36411OooO0Oo.OooO0O0(o00Var, this.f36409OooO0O0, this.f36410OooO0OO.OooO0oo(), j, this.f36418OooOO0o, this.f36413OooO0o0);
                if (o00O0OO0.this.f36381OooooO0 != null) {
                    Extractor extractor = this.f36411OooO0Oo.f36266OooO0O0;
                    if (extractor instanceof Mp3Extractor) {
                        ((Mp3Extractor) extractor).f13915OooOOo = true;
                    }
                }
                if (this.f36407OooO) {
                    o000O0 o000o0 = this.f36411OooO0Oo;
                    long j2 = this.f36416OooOO0;
                    Extractor extractor2 = o000o0.f36266OooO0O0;
                    Objects.requireNonNull(extractor2);
                    extractor2.OooO0Oo(jOooO00o, j2);
                    this.f36407OooO = false;
                }
                while (true) {
                    long j3 = jOooO00o;
                    while (true) {
                        if (iOooO0o0 != 0 || this.f36415OooO0oo) {
                            break;
                        }
                        try {
                            o0000Ooo o0000ooo = this.f36412OooO0o;
                            synchronized (o0000ooo) {
                                while (!o0000ooo.f36704OooO00o) {
                                    try {
                                        o0000ooo.wait();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            o000O0 o000o1 = this.f36411OooO0Oo;
                            o0OO00O o0oo00o2 = this.f36414OooO0oO;
                            Extractor extractor3 = o000o1.f36266OooO0O0;
                            Objects.requireNonNull(extractor3);
                            p296o0O0OoO0.Oooo000 oooo000 = o000o1.f36267OooO0OO;
                            Objects.requireNonNull(oooo000);
                            iOooO0o0 = extractor3.OooO0o0(oooo000, o0oo00o2);
                            jOooO00o = this.f36411OooO0Oo.OooO00o();
                            if (jOooO00o > o00O0OO0.this.f36388o000oOoO + j3) {
                                this.f36412OooO0o.OooO00o();
                                o00O0OO0 o00o0oo2 = o00O0OO0.this;
                                o00o0oo2.f36379Ooooo00.post(o00o0oo2.f36378OoooOoo);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (iOooO0o0 == 1) {
                    iOooO0o0 = 0;
                } else if (this.f36411OooO0Oo.OooO00o() != -1) {
                    this.f36414OooO0oO.f35929OooO00o = this.f36411OooO0Oo.OooO00o();
                }
                Oooo0 oooo1 = this.f36410OooO0OO;
                if (oooo1 != null) {
                    try {
                        oooo1.close();
                    } catch (IOException unused2) {
                    }
                }
            }
            return;
            throw th;
        }
    }

    public interface OooO0O0 {
    }

    public final class OooO0OO implements SampleStream {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36422OooO00o;

        public OooO0OO(int i) {
            this.f36422OooO00o = i;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void OooO00o() throws IOException {
            o00O0OO0 o00o0oo1 = o00O0OO0.this;
            o00O0OOO o00o0ooo2 = o00o0oo1.f36382OooooOO[this.f36422OooO00o];
            DrmSession drmSession = o00o0ooo2.f36434OooO0oo;
            if (drmSession == null || drmSession.getState() != 1) {
                o00o0oo1.OooOoo0();
            } else {
                DrmSession.DrmSessionException drmSessionExceptionOooO0o0 = o00o0ooo2.f36434OooO0oo.OooO0o0();
                Objects.requireNonNull(drmSessionExceptionOooO0o0);
                throw drmSessionExceptionOooO0o0;
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean OooO0O0() {
            o00O0OO0 o00o0oo1 = o00O0OO0.this;
            return !o00o0oo1.OooOooo() && o00o0oo1.f36382OooooOO[this.f36422OooO00o].OooOO0o(o00o0oo1.f36400o0ooOoO);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooO0OO(long j) {
            int iOooO0oo;
            o00O0OO0 o00o0oo1 = o00O0OO0.this;
            int i = this.f36422OooO00o;
            boolean z = false;
            if (o00o0oo1.OooOooo()) {
                return 0;
            }
            o00o0oo1.OooOoO(i);
            o00O0OOO o00o0ooo2 = o00o0oo1.f36382OooooOO[i];
            boolean z2 = o00o0oo1.f36400o0ooOoO;
            synchronized (o00o0ooo2) {
                int iOooOO0 = o00o0ooo2.OooOO0(o00o0ooo2.f36447OooOo00);
                if (o00o0ooo2.OooOO0O() && j >= o00o0ooo2.f36438OooOOO[iOooOO0]) {
                    if (j <= o00o0ooo2.f36449OooOo0o || !z2) {
                        iOooO0oo = o00o0ooo2.OooO0oo(iOooOO0, o00o0ooo2.f36443OooOOo0 - o00o0ooo2.f36447OooOo00, j, true);
                        if (iOooO0oo == -1) {
                        }
                    } else {
                        iOooO0oo = o00o0ooo2.f36443OooOOo0 - o00o0ooo2.f36447OooOo00;
                    }
                }
                iOooO0oo = 0;
            }
            synchronized (o00o0ooo2) {
                if (iOooO0oo >= 0) {
                    if (o00o0ooo2.f36447OooOo00 + iOooO0oo <= o00o0ooo2.f36443OooOOo0) {
                        z = true;
                    }
                }
                o00000O0.OooO00o(z);
                o00o0ooo2.f36447OooOo00 += iOooO0oo;
            }
            if (iOooO0oo == 0) {
                o00o0oo1.OooOoOO(i);
            }
            return iOooO0oo;
        }

        /* JADX WARN: Code duplicated, block: B:111:0x0235  */
        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooO0Oo(o0000O0O o0000o0o2, DecoderInputBuffer decoderInputBuffer, boolean z) {
            int i;
            int i2;
            int iOooOo0O;
            o00O0OO0 o00o0oo1 = o00O0OO0.this;
            int i3 = this.f36422OooO00o;
            if (o00o0oo1.OooOooo()) {
                return -3;
            }
            o00o0oo1.OooOoO(i3);
            o00O0OOO o00o0ooo2 = o00o0oo1.f36382OooooOO[i3];
            boolean z2 = o00o0oo1.f36400o0ooOoO;
            o00O0OOO.OooO00o oooO00o = o00o0ooo2.f36428OooO0O0;
            synchronized (o00o0ooo2) {
                decoderInputBuffer.f13643Oooo0oo = false;
                i = -5;
                if (o00o0ooo2.OooOO0O()) {
                    int iOooOO0 = o00o0ooo2.OooOO0(o00o0ooo2.f36447OooOo00);
                    if (!z && o00o0ooo2.f36441OooOOOo[iOooOO0] == o00o0ooo2.f36433OooO0oO) {
                        if (o00o0ooo2.OooOOO0(iOooOO0)) {
                            decoderInputBuffer.setFlags(o00o0ooo2.f36439OooOOO0[iOooOO0]);
                            long j = o00o0ooo2.f36438OooOOO[iOooOO0];
                            decoderInputBuffer.f13640Oooo = j;
                            if (j < o00o0ooo2.f36446OooOo0) {
                                decoderInputBuffer.addFlag(Integer.MIN_VALUE);
                            }
                            if (!(decoderInputBuffer.f13642Oooo0oO == null && decoderInputBuffer.f13644OoooO0 == 0)) {
                                oooO00o.f36456OooO00o = o00o0ooo2.f36437OooOO0o[iOooOO0];
                                oooO00o.f36457OooO0O0 = o00o0ooo2.f36436OooOO0O[iOooOO0];
                                oooO00o.f36458OooO0OO = o00o0ooo2.f36440OooOOOO[iOooOO0];
                                o00o0ooo2.f36447OooOo00++;
                            }
                            i2 = -4;
                            i = -4;
                        } else {
                            decoderInputBuffer.f13643Oooo0oo = true;
                            i2 = -4;
                            i = -3;
                        }
                    }
                    o00o0ooo2.OooOOO(o00o0ooo2.f36441OooOOOo[iOooOO0], o0000o0o2);
                    i2 = -4;
                } else {
                    if (!z2 && !o00o0ooo2.f36445OooOo) {
                        Format format = o00o0ooo2.f36452OooOoOO;
                        if (format == null || (!z && format == o00o0ooo2.f36433OooO0oO)) {
                            i2 = -4;
                            i = -3;
                        } else {
                            o00o0ooo2.OooOOO(format, o0000o0o2);
                            i2 = -4;
                        }
                    }
                    decoderInputBuffer.setFlags(4);
                    i2 = -4;
                    i = -4;
                }
            }
            if (i != i2 || decoderInputBuffer.isEndOfStream()) {
                o00o0oo1 = o00o0oo1;
                i3 = i3;
            } else if (decoderInputBuffer.f13642Oooo0oO == null && decoderInputBuffer.f13644OoooO0 == 0) {
                o00o0oo1 = o00o0oo1;
                i3 = i3;
            } else {
                o00O0OO o00o0oo2 = o00o0ooo2.f36427OooO00o;
                o00O0OOO.OooO00o oooO00o2 = o00o0ooo2.f36428OooO0O0;
                Objects.requireNonNull(o00o0oo2);
                if (decoderInputBuffer.OooO()) {
                    long j2 = oooO00o2.f36457OooO0O0;
                    o00o0oo2.f36353OooO0OO.OooOo(1);
                    o00o0oo2.OooO0Oo(j2, o00o0oo2.f36353OooO0OO.f36661OooO00o, 1);
                    long j3 = j2 + 1;
                    byte b = o00o0oo2.f36353OooO0OO.f36661OooO00o[0];
                    boolean z3 = (b & ByteCompanionObject.MIN_VALUE) != 0;
                    int i4 = b & ByteCompanionObject.MAX_VALUE;
                    p294o0O0Oo0o.o0OO00O o0oo00o2 = decoderInputBuffer.f13641Oooo0o;
                    byte[] bArr = o0oo00o2.f35838OooO00o;
                    if (bArr == null) {
                        o0oo00o2.f35838OooO00o = new byte[16];
                    } else {
                        Arrays.fill(bArr, (byte) 0);
                    }
                    o00o0oo2.OooO0Oo(j3, o0oo00o2.f35838OooO00o, i4);
                    long j4 = j3 + ((long) i4);
                    if (z3) {
                        o00o0oo2.f36353OooO0OO.OooOo(2);
                        o00o0oo2.OooO0Oo(j4, o00o0oo2.f36353OooO0OO.f36661OooO00o, 2);
                        j4 += 2;
                        iOooOo0O = o00o0oo2.f36353OooO0OO.OooOo0O();
                    } else {
                        iOooOo0O = 1;
                    }
                    int[] iArr = o0oo00o2.f35841OooO0Oo;
                    if (iArr == null || iArr.length < iOooOo0O) {
                        iArr = new int[iOooOo0O];
                    }
                    int[] iArr2 = o0oo00o2.f35843OooO0o0;
                    if (iArr2 == null || iArr2.length < iOooOo0O) {
                        iArr2 = new int[iOooOo0O];
                    }
                    int[] iArr3 = iArr2;
                    if (z3) {
                        int i5 = iOooOo0O * 6;
                        o00o0oo2.f36353OooO0OO.OooOo(i5);
                        o00o0oo2.OooO0Oo(j4, o00o0oo2.f36353OooO0OO.f36661OooO00o, i5);
                        j4 += (long) i5;
                        o00o0oo2.f36353OooO0OO.OooOoOO(0);
                        for (int i6 = 0; i6 < iOooOo0O; i6++) {
                            iArr[i6] = o00o0oo2.f36353OooO0OO.OooOo0O();
                            iArr3[i6] = o00o0oo2.f36353OooO0OO.OooOo00();
                        }
                    } else {
                        iArr[0] = 0;
                        iArr3[0] = oooO00o2.f36456OooO00o - ((int) (j4 - oooO00o2.f36457OooO0O0));
                    }
                    TrackOutput.OooO00o oooO00o3 = oooO00o2.f36458OooO0OO;
                    int i7 = o000OOo0.f36740OooO00o;
                    byte[] bArr2 = oooO00o3.f13736OooO0O0;
                    byte[] bArr3 = o0oo00o2.f35838OooO00o;
                    int i8 = oooO00o3.f13735OooO00o;
                    int i9 = oooO00o3.f13737OooO0OO;
                    int i10 = oooO00o3.f13738OooO0Oo;
                    o0oo00o2.f35842OooO0o = iOooOo0O;
                    o0oo00o2.f35841OooO0Oo = iArr;
                    o0oo00o2.f35843OooO0o0 = iArr3;
                    o0oo00o2.f35839OooO0O0 = bArr2;
                    o0oo00o2.f35838OooO00o = bArr3;
                    o0oo00o2.f35840OooO0OO = i8;
                    o0oo00o2.f35844OooO0oO = i9;
                    o0oo00o2.f35845OooO0oo = i10;
                    MediaCodec.CryptoInfo cryptoInfo = o0oo00o2.f35837OooO;
                    cryptoInfo.numSubSamples = iOooOo0O;
                    cryptoInfo.numBytesOfClearData = iArr;
                    cryptoInfo.numBytesOfEncryptedData = iArr3;
                    cryptoInfo.key = bArr2;
                    cryptoInfo.iv = bArr3;
                    cryptoInfo.mode = i8;
                    if (o000OOo0.f36740OooO00o >= 24) {
                        o0O0Oo0o.o0OO00O.OooO00o oooO00o4 = o0oo00o2.f35846OooOO0;
                        Objects.requireNonNull(oooO00o4);
                        o0O0Oo0o.o0OO00O.OooO00o.OooO00o(oooO00o4, i9, i10);
                    }
                    long j5 = oooO00o2.f36457OooO0O0;
                    int i11 = (int) (j4 - j5);
                    oooO00o2.f36457OooO0O0 = j5 + ((long) i11);
                    oooO00o2.f36456OooO00o -= i11;
                } else {
                    o00o0oo1 = o00o0oo1;
                    i3 = i3;
                }
                if (decoderInputBuffer.hasSupplementalData()) {
                    o00o0oo2.f36353OooO0OO.OooOo(4);
                    o00o0oo2.OooO0Oo(oooO00o2.f36457OooO0O0, o00o0oo2.f36353OooO0OO.f36661OooO00o, 4);
                    int iOooOo00 = o00o0oo2.f36353OooO0OO.OooOo00();
                    oooO00o2.f36457OooO0O0 += 4;
                    oooO00o2.f36456OooO00o -= 4;
                    decoderInputBuffer.OooO0oO(iOooOo00);
                    o00o0oo2.OooO0OO(oooO00o2.f36457OooO0O0, decoderInputBuffer.f13642Oooo0oO, iOooOo00);
                    oooO00o2.f36457OooO0O0 += (long) iOooOo00;
                    int i12 = oooO00o2.f36456OooO00o - iOooOo00;
                    oooO00o2.f36456OooO00o = i12;
                    ByteBuffer byteBuffer = decoderInputBuffer.f13645OoooO00;
                    if (byteBuffer == null || byteBuffer.capacity() < i12) {
                        decoderInputBuffer.f13645OoooO00 = ByteBuffer.allocate(i12);
                    } else {
                        decoderInputBuffer.f13645OoooO00.clear();
                    }
                    o00o0oo2.OooO0OO(oooO00o2.f36457OooO0O0, decoderInputBuffer.f13645OoooO00, oooO00o2.f36456OooO00o);
                } else {
                    decoderInputBuffer.OooO0oO(oooO00o2.f36456OooO00o);
                    o00o0oo2.OooO0OO(oooO00o2.f36457OooO0O0, decoderInputBuffer.f13642Oooo0oO, oooO00o2.f36456OooO00o);
                }
            }
            if (i == -3) {
                o00o0oo1.OooOoOO(i3);
            }
            return i;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36424OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f36425OooO0O0;

        public OooO0o(int i, boolean z) {
            this.f36424OooO00o = i;
            this.f36425OooO0O0 = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f36424OooO00o == oooO0o.f36424OooO00o && this.f36425OooO0O0 == oooO0o.f36425OooO0O0;
        }

        public final int hashCode() {
            return (this.f36424OooO00o * 31) + (this.f36425OooO0O0 ? 1 : 0);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f36364o0Oo0oo = Collections.unmodifiableMap(map);
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13154OooO00o = "icy";
        oooO0O0.f13163OooOO0O = "application/x-icy";
        f36363o0OO00O = oooO0O0.OooO00o();
    }

    public o00O0OO0(Uri uri, com.google.android.exoplayer2.upstream.OooO00o oooO00o, o00O0O o00o0o2, com.google.android.exoplayer2.drm.OooO0O0 oooO0O0, com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o, Oooo000 oooo000, o00O0O00.OooO00o oooO00o2, OooO0O0 oooO0O1, p709oo0oOOo.OooO0OO oooO0OO, @Nullable String str, int i) {
        this.f36366Oooo0o = uri;
        this.f36367Oooo0oO = oooO00o;
        this.f36368Oooo0oo = oooO0O0;
        this.f36370OoooO0 = c0097OooO00o;
        this.f36365Oooo = oooo000;
        this.f36371OoooO00 = oooO00o2;
        this.f36372OoooO0O = oooO0O1;
        this.f36369OoooO = oooO0OO;
        this.f36373OoooOO0 = str;
        this.f36388o000oOoO = i;
        this.f36375OoooOOo = new o000O0(o00o0o2);
        int i2 = o000OOo0.f36740OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        o00000O0.OooO0o(looperMyLooper);
        this.f36379Ooooo00 = new Handler(looperMyLooper, null);
        this.f36383OooooOo = new OooO0o[0];
        this.f36382OooooOO = new o00O0OOO[0];
        this.f36393o00oO0O = -9223372036854775807L;
        this.f36401oo000o = -1L;
        this.f36402ooOO = -9223372036854775807L;
        this.f36390o00Oo0 = 1;
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO(long j) {
        boolean z;
        OooOo00();
        boolean[] zArr = this.f36387Ooooooo.f36404OooO0O0;
        if (!this.f36397o0OoOo0.OooO0O0()) {
            j = 0;
        }
        this.f36392o00o0O = false;
        this.f36394o00oO0o = j;
        if (OooOo()) {
            this.f36393o00oO0O = j;
            return j;
        }
        if (this.f36390o00Oo0 != 7) {
            int length = this.f36382OooooOO.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (!this.f36382OooooOO[i].OooOOo0(j, false) && (zArr[i] || !this.f36386OoooooO)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                return j;
            }
        }
        this.f36398o0ooOO0 = false;
        this.f36393o00oO0O = j;
        this.f36400o0ooOoO = false;
        if (this.f36374OoooOOO.OooO00o()) {
            Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = this.f36374OoooOOO.f14822OooO0O0;
            o00000O0.OooO0o(oooO0OO);
            oooO0OO.OooO00o(false);
        } else {
            this.f36374OoooOOO.f14823OooO0OO = null;
            for (o00O0OOO o00o0ooo2 : this.f36382OooooOO) {
                o00o0ooo2.OooOOOO(false);
            }
        }
        return j;
    }

    @Override // p296o0O0OoO0.o0OoOo0
    public final TrackOutput OooO00o(int i) {
        return OooOoo(new OooO0o(i, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (java.lang.Math.abs(r7 - r20) <= java.lang.Math.abs(r9 - r20)) goto L36;
     */
    @Override // p310o0O0o0oo.o00O00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long OooO0O0(long j, o000O0O0 o000o0o1) {
        OooOo00();
        if (!this.f36397o0OoOo0.OooO0O0()) {
            return 0L;
        }
        oo0o0Oo.OooO00o oooO00oOooO0oO = this.f36397o0OoOo0.OooO0oO(j);
        long j2 = oooO00oOooO0oO.f35941OooO00o.f35927OooO00o;
        long j3 = oooO00oOooO0oO.f35942OooO0O0.f35927OooO00o;
        long j4 = o000o0o1.f40535OooO00o;
        if (j4 == 0 && o000o0o1.f40536OooO0O0 == 0) {
            return j;
        }
        int i = o000OOo0.f36740OooO00o;
        long j5 = j - j4;
        long j6 = ((j4 ^ j) & (j ^ j5)) >= 0 ? j5 : Long.MIN_VALUE;
        long j7 = o000o0o1.f40536OooO0O0;
        long j8 = j + j7;
        long j9 = ((j7 ^ j8) & (j ^ j8)) >= 0 ? j8 : Long.MAX_VALUE;
        boolean z = j6 <= j2 && j2 <= j9;
        boolean z2 = j6 <= j3 && j3 <= j9;
        if (!z || !z2) {
            if (!z) {
                if (!z2) {
                    return j6;
                }
                return j3;
            }
            return j2;
        }
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooO0OO(o00O00.OooO00o oooO00o, long j) {
        this.f36380Ooooo0o = oooO00o;
        this.f36376OoooOo0.OooO0O0();
        OooOooO();
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO0Oo(com.google.android.exoplayer2.trackselection.OooO0OO[] oooO0OOArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        OooOo00();
        OooO oooO = this.f36387Ooooooo;
        TrackGroupArray trackGroupArray = oooO.f36403OooO00o;
        boolean[] zArr3 = oooO.f36405OooO0OO;
        int i = this.f36395o00ooo;
        for (int i2 = 0; i2 < oooO0OOArr.length; i2++) {
            if (sampleStreamArr[i2] != null && (oooO0OOArr[i2] == null || !zArr[i2])) {
                int i3 = ((OooO0OO) sampleStreamArr[i2]).f36422OooO00o;
                o00000O0.OooO0Oo(zArr3[i3]);
                this.f36395o00ooo--;
                zArr3[i3] = false;
                sampleStreamArr[i2] = null;
            }
        }
        boolean z = !this.f36391o00Ooo ? j == 0 : i != 0;
        for (int i4 = 0; i4 < oooO0OOArr.length; i4++) {
            if (sampleStreamArr[i4] == null && oooO0OOArr[i4] != null) {
                com.google.android.exoplayer2.trackselection.OooO0OO oooO0OO = oooO0OOArr[i4];
                o00000O0.OooO0Oo(oooO0OO.length() == 1);
                o00000O0.OooO0Oo(oooO0OO.OooO0oO(0) == 0);
                TrackGroup trackGroupOooO00o = oooO0OO.OooO00o();
                int i5 = 0;
                while (true) {
                    if (i5 >= trackGroupArray.f14605Oooo0o) {
                        i5 = -1;
                        break;
                    }
                    if (trackGroupArray.f14606Oooo0oO[i5] == trackGroupOooO00o) {
                        break;
                    }
                    i5++;
                }
                o00000O0.OooO0Oo(!zArr3[i5]);
                this.f36395o00ooo++;
                zArr3[i5] = true;
                sampleStreamArr[i4] = new OooO0OO(i5);
                zArr2[i4] = true;
                if (!z) {
                    o00O0OOO o00o0ooo2 = this.f36382OooooOO[i5];
                    z = (o00o0ooo2.OooOOo0(j, true) || o00o0ooo2.f36442OooOOo + o00o0ooo2.f36447OooOo00 == 0) ? false : true;
                }
            }
        }
        if (this.f36395o00ooo == 0) {
            this.f36398o0ooOO0 = false;
            this.f36392o00o0O = false;
            if (this.f36374OoooOOO.OooO00o()) {
                for (o00O0OOO o00o0ooo3 : this.f36382OooooOO) {
                    o00o0ooo3.OooO0oO();
                }
                Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO2 = this.f36374OoooOOO.f14822OooO0O0;
                o00000O0.OooO0o(oooO0OO2);
                oooO0OO2.OooO00o(false);
            } else {
                for (o00O0OOO o00o0ooo4 : this.f36382OooooOO) {
                    o00o0ooo4.OooOOOO(false);
                }
            }
        } else if (z) {
            j = OooO(j);
            for (int i6 = 0; i6 < sampleStreamArr.length; i6++) {
                if (sampleStreamArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.f36391o00Ooo = true;
        return j;
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO0o() {
        if (this.f36395o00ooo == 0) {
            return Long.MIN_VALUE;
        }
        return OooOOo0();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final void OooO0o0(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
        OooO00o oooO00o = (OooO00o) oooO0o;
        Oooo0 oooo0 = oooO00o.f36410OooO0OO;
        Uri uri = oooo0.f53420OooO0OO;
        o00O0000 o00o0001 = new o00O0000(oooo0.f53421OooO0Oo, j2);
        Objects.requireNonNull(this.f36365Oooo);
        o00O0O00.OooO00o oooO00o2 = this.f36371OoooO00;
        oooO00o2.OooO0OO(o00o0001, new o00O000o(1, -1, null, 0, null, oooO00o2.OooO00o(oooO00o.f36416OooOO0), oooO00o2.OooO00o(this.f36402ooOO)));
        if (z) {
            return;
        }
        OooOo0(oooO00o);
        for (o00O0OOO o00o0ooo2 : this.f36382OooooOO) {
            o00o0ooo2.OooOOOO(false);
        }
        if (this.f36395o00ooo > 0) {
            o00O00.OooO00o oooO00o3 = this.f36380Ooooo0o;
            Objects.requireNonNull(oooO00o3);
            oooO00o3.OooO0o0(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final void OooO0oO(Loader.OooO0o oooO0o, long j, long j2) {
        oo0o0Oo oo0o0oo;
        OooO00o oooO00o = (OooO00o) oooO0o;
        if (this.f36402ooOO == -9223372036854775807L && (oo0o0oo = this.f36397o0OoOo0) != null) {
            boolean zOooO0O0 = oo0o0oo.OooO0O0();
            long jOooOo0o = OooOo0o();
            long j3 = jOooOo0o == Long.MIN_VALUE ? 0L : jOooOo0o + 10000;
            this.f36402ooOO = j3;
            ((oo0o0O0) this.f36372OoooO0O).OooOo00(j3, zOooO0O0, this.f36389o00O0O);
        }
        Oooo0 oooo0 = oooO00o.f36410OooO0OO;
        Uri uri = oooo0.f53420OooO0OO;
        o00O0000 o00o0001 = new o00O0000(oooo0.f53421OooO0Oo, j2);
        Objects.requireNonNull(this.f36365Oooo);
        o00O0O00.OooO00o oooO00o2 = this.f36371OoooO00;
        oooO00o2.OooO0Oo(o00o0001, new o00O000o(1, -1, null, 0, null, oooO00o2.OooO00o(oooO00o.f36416OooOO0), oooO00o2.OooO00o(this.f36402ooOO)));
        OooOo0(oooO00o);
        this.f36400o0ooOoO = true;
        o00O00.OooO00o oooO00o3 = this.f36380Ooooo0o;
        Objects.requireNonNull(oooO00o3);
        oooO00o3.OooO0o0(this);
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooO0oo() throws IOException {
        OooOoo0();
        if (this.f36400o0ooOoO && !this.f36384Oooooo) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // p310o0O0o0oo.o00O00
    public final boolean OooOO0(long j) {
        if (!this.f36400o0ooOoO) {
            if (!(this.f36374OoooOOO.f14823OooO0OO != null) && !this.f36398o0ooOO0 && (!this.f36384Oooooo || this.f36395o00ooo != 0)) {
                boolean zOooO0O0 = this.f36376OoooOo0.OooO0O0();
                if (this.f36374OoooOOO.OooO00o()) {
                    return zOooO0O0;
                }
                OooOooO();
                return true;
            }
        }
        return false;
    }

    @Override // p296o0O0OoO0.o0OoOo0
    public final void OooOO0O(oo0o0Oo oo0o0oo) {
        this.f36379Ooooo00.post(new OooOOO.OooO00o(this, oo0o0oo, 1));
    }

    @Override // p310o0O0o0oo.o00O00
    public final boolean OooOO0o() {
        boolean z;
        if (this.f36374OoooOOO.OooO00o()) {
            o0000Ooo o0000ooo = this.f36376OoooOo0;
            synchronized (o0000ooo) {
                z = o0000ooo.f36704OooO00o;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooOOO() {
        if (!this.f36392o00o0O) {
            return -9223372036854775807L;
        }
        if (!this.f36400o0ooOoO && OooOo0O() <= this.f36399o0ooOOo) {
            return -9223372036854775807L;
        }
        this.f36392o00o0O = false;
        return this.f36394o00oO0o;
    }

    @Override // p296o0O0OoO0.o0OoOo0
    public final void OooOOO0() {
        this.f36385Oooooo0 = true;
        this.f36379Ooooo00.post(this.f36377OoooOoO);
    }

    @Override // p310o0O0o0oo.o00O00
    public final TrackGroupArray OooOOOO() {
        OooOo00();
        return this.f36387Ooooooo.f36403OooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final Loader.OooO0O0 OooOOOo(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
        boolean z;
        Loader.OooO0O0 oooO0O0;
        oo0o0Oo oo0o0oo;
        OooO00o oooO00o = (OooO00o) oooO0o;
        OooOo0(oooO00o);
        Oooo0 oooo0 = oooO00o.f36410OooO0OO;
        Uri uri = oooo0.f53420OooO0OO;
        o00O0000 o00o0001 = new o00O0000(oooo0.f53421OooO0Oo, j2);
        C.OooO0O0(oooO00o.f36416OooOO0);
        C.OooO0O0(this.f36402ooOO);
        long jMin = ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof Loader.UnexpectedLoaderException)) ? -9223372036854775807L : Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            oooO0O0 = Loader.f14820OooO0o0;
        } else {
            int iOooOo0O = OooOo0O();
            int i2 = iOooOo0O > this.f36399o0ooOOo ? 1 : 0;
            if (this.f36401oo000o == -1 && ((oo0o0oo = this.f36397o0OoOo0) == null || oo0o0oo.OooO0oo() == -9223372036854775807L)) {
                if (!this.f36384Oooooo || OooOooo()) {
                    this.f36392o00o0O = this.f36384Oooooo;
                    this.f36394o00oO0o = 0L;
                    this.f36399o0ooOOo = 0;
                    for (o00O0OOO o00o0ooo2 : this.f36382OooooOO) {
                        o00o0ooo2.OooOOOO(false);
                    }
                    oooO00o.f36414OooO0oO.f35929OooO00o = 0L;
                    oooO00o.f36416OooOO0 = 0L;
                    oooO00o.f36407OooO = true;
                    oooO00o.f36419OooOOO = false;
                } else {
                    this.f36398o0ooOO0 = true;
                    z = false;
                }
                if (z) {
                    oooO0O0 = new Loader.OooO0O0(i2, jMin);
                } else {
                    oooO0O0 = Loader.f14819OooO0Oo;
                }
            } else {
                this.f36399o0ooOOo = iOooOo0O;
            }
            z = true;
            if (z) {
                oooO0O0 = new Loader.OooO0O0(i2, jMin);
            } else {
                oooO0O0 = Loader.f14819OooO0Oo;
            }
        }
        int i3 = oooO0O0.f14824OooO00o;
        boolean z2 = !(i3 == 0 || i3 == 1);
        o00O0O00.OooO00o oooO00o2 = this.f36371OoooO00;
        oooO00o2.OooO0o0(o00o0001, new o00O000o(1, -1, null, 0, null, oooO00o2.OooO00o(oooO00o.f36416OooOO0), oooO00o2.OooO00o(this.f36402ooOO)), iOException, z2);
        if (z2) {
            Objects.requireNonNull(this.f36365Oooo);
        }
        return oooO0O0;
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooOOo(long j, boolean z) {
        long jOooO0o;
        int i;
        OooOo00();
        if (OooOo()) {
            return;
        }
        boolean[] zArr = this.f36387Ooooooo.f36405OooO0OO;
        int length = this.f36382OooooOO.length;
        for (int i2 = 0; i2 < length; i2++) {
            o00O0OOO o00o0ooo2 = this.f36382OooooOO[i2];
            boolean z2 = zArr[i2];
            o00O0OO o00o0oo2 = o00o0ooo2.f36427OooO00o;
            synchronized (o00o0ooo2) {
                int i3 = o00o0ooo2.f36443OooOOo0;
                jOooO0o = -1;
                if (i3 != 0) {
                    long[] jArr = o00o0ooo2.f36438OooOOO;
                    int i4 = o00o0ooo2.f36444OooOOoo;
                    if (j >= jArr[i4]) {
                        int iOooO0oo = o00o0ooo2.OooO0oo(i4, (!z2 || (i = o00o0ooo2.f36447OooOo00) == i3) ? i3 : i + 1, j, z);
                        if (iOooO0oo != -1) {
                            jOooO0o = o00o0ooo2.OooO0o(iOooO0oo);
                        }
                    }
                }
            }
            o00o0oo2.OooO00o(jOooO0o);
        }
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooOOo0() {
        long jOooOo0o;
        boolean z;
        long j;
        OooOo00();
        boolean[] zArr = this.f36387Ooooooo.f36404OooO0O0;
        if (this.f36400o0ooOoO) {
            return Long.MIN_VALUE;
        }
        if (OooOo()) {
            return this.f36393o00oO0O;
        }
        if (this.f36386OoooooO) {
            int length = this.f36382OooooOO.length;
            jOooOo0o = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    o00O0OOO o00o0ooo2 = this.f36382OooooOO[i];
                    synchronized (o00o0ooo2) {
                        z = o00o0ooo2.f36445OooOo;
                    }
                    if (z) {
                        continue;
                    } else {
                        o00O0OOO o00o0ooo3 = this.f36382OooooOO[i];
                        synchronized (o00o0ooo3) {
                            j = o00o0ooo3.f36449OooOo0o;
                        }
                        jOooOo0o = Math.min(jOooOo0o, j);
                    }
                }
            }
        } else {
            jOooOo0o = Long.MAX_VALUE;
        }
        if (jOooOo0o == Long.MAX_VALUE) {
            jOooOo0o = OooOo0o();
        }
        return jOooOo0o == Long.MIN_VALUE ? this.f36394o00oO0o : jOooOo0o;
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooOOoo(long j) {
    }

    public final boolean OooOo() {
        return this.f36393o00oO0O != -9223372036854775807L;
    }

    public final void OooOo0(OooO00o oooO00o) {
        if (this.f36401oo000o == -1) {
            this.f36401oo000o = oooO00o.f36418OooOO0o;
        }
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void OooOo00() {
        o00000O0.OooO0Oo(this.f36384Oooooo);
        Objects.requireNonNull(this.f36387Ooooooo);
        Objects.requireNonNull(this.f36397o0OoOo0);
    }

    public final int OooOo0O() {
        int i = 0;
        for (o00O0OOO o00o0ooo2 : this.f36382OooooOO) {
            i += o00o0ooo2.f36442OooOOo + o00o0ooo2.f36443OooOOo0;
        }
        return i;
    }

    public final long OooOo0o() {
        long j;
        long jMax = Long.MIN_VALUE;
        for (o00O0OOO o00o0ooo2 : this.f36382OooooOO) {
            synchronized (o00o0ooo2) {
                j = o00o0ooo2.f36449OooOo0o;
            }
            jMax = Math.max(jMax, j);
        }
        return jMax;
    }

    public final void OooOoO(int i) {
        OooOo00();
        OooO oooO = this.f36387Ooooooo;
        boolean[] zArr = oooO.f36406OooO0Oo;
        if (zArr[i]) {
            return;
        }
        Format format = oooO.f36403OooO00o.f14606Oooo0oO[i].f14602Oooo0oO[0];
        o00O0O00.OooO00o oooO00o = this.f36371OoooO00;
        oooO00o.OooO0O0(new o00O000o(1, o000OO.OooO0o(format.f13131OoooOOo), format, 0, null, oooO00o.OooO00o(this.f36394o00oO0o), -9223372036854775807L));
        zArr[i] = true;
    }

    public final void OooOoO0() {
        Format formatOooO00o;
        if (this.f36396o0OOO0o || this.f36384Oooooo || !this.f36385Oooooo0 || this.f36397o0OoOo0 == null) {
            return;
        }
        o00O0OOO[] o00o0oooArr = this.f36382OooooOO;
        int length = o00o0oooArr.length;
        int i = 0;
        while (true) {
            Format format = null;
            if (i >= length) {
                this.f36376OoooOo0.OooO00o();
                int length2 = this.f36382OooooOO.length;
                TrackGroup[] trackGroupArr = new TrackGroup[length2];
                boolean[] zArr = new boolean[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    o00O0OOO o00o0ooo2 = this.f36382OooooOO[i2];
                    synchronized (o00o0ooo2) {
                        formatOooO00o = o00o0ooo2.f36450OooOoO ? null : o00o0ooo2.f36452OooOoOO;
                    }
                    Objects.requireNonNull(formatOooO00o);
                    String str = formatOooO00o.f13131OoooOOo;
                    boolean zOooO0oO = o000OO.OooO0oO(str);
                    boolean z = zOooO0oO || o000OO.OooO(str);
                    zArr[i2] = z;
                    this.f36386OoooooO = z | this.f36386OoooooO;
                    IcyHeaders icyHeaders = this.f36381OooooO0;
                    if (icyHeaders != null) {
                        if (zOooO0oO || this.f36383OooooOo[i2].f36425OooO0O0) {
                            Metadata metadata = formatOooO00o.f13144o000oOoO;
                            Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.OooO00o(icyHeaders);
                            Format.OooO0O0 oooO0O0OooO00o = formatOooO00o.OooO00o();
                            oooO0O0OooO00o.f13153OooO = metadata2;
                            formatOooO00o = oooO0O0OooO00o.OooO00o();
                        }
                        if (zOooO0oO && formatOooO00o.f13126OoooO0 == -1 && formatOooO00o.f13128OoooO0O == -1 && icyHeaders.f14475Oooo0o != -1) {
                            Format.OooO0O0 oooO0O0OooO00o2 = formatOooO00o.OooO00o();
                            oooO0O0OooO00o2.f13158OooO0o = icyHeaders.f14475Oooo0o;
                            formatOooO00o = oooO0O0OooO00o2.OooO00o();
                        }
                    }
                    Class<? extends p301o0O0Oooo.o000OOo0> clsOooO0OO = this.f36368Oooo0oo.OooO0OO(formatOooO00o);
                    Format.OooO0O0 oooO0O0OooO00o3 = formatOooO00o.OooO00o();
                    oooO0O0OooO00o3.f13182OooOooO = clsOooO0OO;
                    trackGroupArr[i2] = new TrackGroup(oooO0O0OooO00o3.OooO00o());
                }
                this.f36387Ooooooo = new OooO(new TrackGroupArray(trackGroupArr), zArr);
                this.f36384Oooooo = true;
                o00O00.OooO00o oooO00o = this.f36380Ooooo0o;
                Objects.requireNonNull(oooO00o);
                oooO00o.OooO00o(this);
                return;
            }
            o00O0OOO o00o0ooo3 = o00o0oooArr[i];
            synchronized (o00o0ooo3) {
                if (!o00o0ooo3.f36450OooOoO) {
                    format = o00o0ooo3.f36452OooOoOO;
                }
            }
            if (format == null) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void OooOoOO(int i) {
        OooOo00();
        boolean[] zArr = this.f36387Ooooooo.f36404OooO0O0;
        if (this.f36398o0ooOO0 && zArr[i] && !this.f36382OooooOO[i].OooOO0o(false)) {
            this.f36393o00oO0O = 0L;
            this.f36398o0ooOO0 = false;
            this.f36392o00o0O = true;
            this.f36394o00oO0o = 0L;
            this.f36399o0ooOOo = 0;
            for (o00O0OOO o00o0ooo2 : this.f36382OooooOO) {
                o00o0ooo2.OooOOOO(false);
            }
            o00O00.OooO00o oooO00o = this.f36380Ooooo0o;
            Objects.requireNonNull(oooO00o);
            oooO00o.OooO0o0(this);
        }
    }

    public final TrackOutput OooOoo(OooO0o oooO0o) {
        int length = this.f36382OooooOO.length;
        for (int i = 0; i < length; i++) {
            if (oooO0o.equals(this.f36383OooooOo[i])) {
                return this.f36382OooooOO[i];
            }
        }
        o00O0OOO o00o0ooo2 = new o00O0OOO(this.f36369OoooO, this.f36379Ooooo00.getLooper(), this.f36368Oooo0oo, this.f36370OoooO0);
        o00o0ooo2.f36431OooO0o = this;
        int i2 = length + 1;
        OooO0o[] oooO0oArr = (OooO0o[]) Arrays.copyOf(this.f36383OooooOo, i2);
        oooO0oArr[length] = oooO0o;
        int i3 = o000OOo0.f36740OooO00o;
        this.f36383OooooOo = oooO0oArr;
        o00O0OOO[] o00o0oooArr = (o00O0OOO[]) Arrays.copyOf(this.f36382OooooOO, i2);
        o00o0oooArr[length] = o00o0ooo2;
        this.f36382OooooOO = o00o0oooArr;
        return o00o0ooo2;
    }

    public final void OooOoo0() throws IOException {
        Loader loader = this.f36374OoooOOO;
        int iOooO00o = ((OooOO0) this.f36365Oooo).OooO00o(this.f36390o00Oo0);
        IOException iOException = loader.f14823OooO0OO;
        if (iOException != null) {
            throw iOException;
        }
        Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f14822OooO0O0;
        if (oooO0OO != null) {
            if (iOooO00o == Integer.MIN_VALUE) {
                iOooO00o = oooO0OO.f14827Oooo0o;
            }
            IOException iOException2 = oooO0OO.f14832OoooO00;
            if (iOException2 != null && oooO0OO.f14831OoooO0 > iOooO00o) {
                throw iOException2;
            }
        }
    }

    public final void OooOooO() {
        OooO00o oooO00o = new OooO00o(this.f36366Oooo0o, this.f36367Oooo0oO, this.f36375OoooOOo, this, this.f36376OoooOo0);
        if (this.f36384Oooooo) {
            o00000O0.OooO0Oo(OooOo());
            long j = this.f36402ooOO;
            if (j != -9223372036854775807L && this.f36393o00oO0O > j) {
                this.f36400o0ooOoO = true;
                this.f36393o00oO0O = -9223372036854775807L;
                return;
            }
            oo0o0Oo oo0o0oo = this.f36397o0OoOo0;
            Objects.requireNonNull(oo0o0oo);
            long j2 = oo0o0oo.OooO0oO(this.f36393o00oO0O).f35941OooO00o.f35928OooO0O0;
            long j3 = this.f36393o00oO0O;
            oooO00o.f36414OooO0oO.f35929OooO00o = j2;
            oooO00o.f36416OooOO0 = j3;
            oooO00o.f36407OooO = true;
            oooO00o.f36419OooOOO = false;
            for (o00O0OOO o00o0ooo2 : this.f36382OooooOO) {
                o00o0ooo2.f36446OooOo0 = this.f36393o00oO0O;
            }
            this.f36393o00oO0O = -9223372036854775807L;
        }
        this.f36399o0ooOOo = OooOo0O();
        Loader loader = this.f36374OoooOOO;
        int iOooO00o = ((OooOO0) this.f36365Oooo).OooO00o(this.f36390o00Oo0);
        Objects.requireNonNull(loader);
        Looper looperMyLooper = Looper.myLooper();
        o00000O0.OooO0o(looperMyLooper);
        loader.f14823OooO0OO = null;
        loader.new OooO0OO(looperMyLooper, oooO00o, this, iOooO00o, SystemClock.elapsedRealtime()).OooO0O0(0L);
        DataSpec dataSpec = oooO00o.f36417OooOO0O;
        o00O0O00.OooO00o oooO00o2 = this.f36371OoooO00;
        Uri uri = dataSpec.f14801OooO00o;
        oooO00o2.OooO0o(new o00O0000(Collections.emptyMap(), 0L), new o00O000o(1, -1, null, 0, null, oooO00o2.OooO00o(oooO00o.f36416OooOO0), oooO00o2.OooO00o(this.f36402ooOO)));
    }

    public final boolean OooOooo() {
        return this.f36392o00o0O || OooOo();
    }
}
