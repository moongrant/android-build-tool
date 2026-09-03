package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p045Oooooo.o000O000;
import p203o00o0o0o.o00OOO0O;
import p203o00o0o0o.o0O00OO;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p226o00oOo00.o000;
import p226o00oOo00.o0000;
import p226o00oOo00.o000O0;
import p226o00oOo00.o000O00O;
import p226o00oOo00.o0OO00O;
import p244o00oo0Oo.o000OO0O;
import p244o00oo0Oo.o00O000;
import p245o00oo0o.o00O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo0 implements OooOOO, o00O0O0, Loader.OooO00o<OooO00o>, Loader.OooO, o00O0O.OooO0OO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final Map<String, String> f13063Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final com.google.android.exoplayer2.OooOo f13064OoooO00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0O0.OooO00o f13065OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f13066OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0OO f13067OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o f13068OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f13069OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo00.OooO00o f13070OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0 f13071OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o000OO0O f13072OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final String f13073OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f13075OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Oooo000 f13076OooOOOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f13081OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public IcyHeaders f13082OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f13083OooOo00;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f13086OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f13087OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooO f13088OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o00OO0OO f13090OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f13091OooOooO;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f13093Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f13094Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f13095Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f13096Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f13097Oooo0O0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f13099Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f13100Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f13101Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f13102Oooo0oo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Loader f13074OooOOO = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o00O0 f13077OooOOOo = new o00O0();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o000 f13079OooOOo0 = new o000(this, 0);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final com.facebook.appevents.OooO0o f13078OooOOo = new com.facebook.appevents.OooO0o(this, 1);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Handler f13080OooOOoo = o0O00.OooOO0O(null);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0o[] f13085OooOo0o = new OooO0o[0];

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00O0O[] f13084OooOo0O = new o00O0O[0];

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public long f13098Oooo0OO = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f13089OooOoo = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f13092OooOooo = 1;

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O0 f13103OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f13104OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean[] f13105OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean[] f13106OooO0Oo;

        public OooO(o000O0 o000o0, boolean[] zArr) {
            this.f13103OooO00o = o000o0;
            this.f13104OooO0O0 = zArr;
            int i = o000o0.f39866OooO0Oo;
            this.f13105OooO0OO = new boolean[i];
            this.f13106OooO0Oo = new boolean[i];
        }
    }

    public final class OooO00o implements Loader.OooO0o, com.google.android.exoplayer2.source.OooO.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Uri f13109OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final p244o00oo0Oo.o00O0O0 f13110OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Oooo000 f13111OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o00O0 f13112OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00O0O0 f13113OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile boolean f13115OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f13116OooOO0;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public o00O0O f13118OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f13120OooOOO0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o00OO0O0 f13114OooO0oO = new o00OO0O0();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f13107OooO = true;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f13108OooO00o = o0000.f39822OooO0O0.getAndIncrement();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public DataSpec f13117OooOO0O = OooO0OO(0);

        public OooO00o(Uri uri, com.google.android.exoplayer2.upstream.OooO00o oooO00o, Oooo000 oooo000, o00O0O0 o00o0o0, o00O0 o00o1) {
            this.f13109OooO0O0 = uri;
            this.f13110OooO0OO = new p244o00oo0Oo.o00O0O0(oooO00o);
            this.f13111OooO0Oo = oooo000;
            this.f13113OooO0o0 = o00o0o0;
            this.f13112OooO0o = o00o1;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x011a */
        @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o() throws IOException {
            com.google.android.exoplayer2.upstream.OooO00o oooO;
            int i;
            int iOooO0oO = 0;
            while (iOooO0oO == 0 && !this.f13115OooO0oo) {
                long j = this.f13114OooO0oO.f39548OooO00o;
                DataSpec dataSpecOooO0OO = OooO0OO(j);
                this.f13117OooOO0O = dataSpecOooO0OO;
                long jOooO00o = this.f13110OooO0OO.OooO00o(dataSpecOooO0OO);
                if (jOooO00o != -1) {
                    jOooO00o += j;
                    final Oooo0 oooo0 = Oooo0.this;
                    oooo0.f13080OooOOoo.post(new Runnable() { // from class: o00oOo00.o000O000
                        @Override // java.lang.Runnable
                        public final void run() {
                            oooo0.f13093Oooo0 = true;
                        }
                    });
                }
                long j2 = jOooO00o;
                Oooo0.this.f13082OooOo0 = IcyHeaders.OooO00o(this.f13110OooO0OO.OooO0o0());
                p244o00oo0Oo.o00O0O0 o00o0o0 = this.f13110OooO0OO;
                IcyHeaders icyHeaders = Oooo0.this.f13082OooOo0;
                if (icyHeaders == null || (i = icyHeaders.f12562OooO) == -1) {
                    oooO = o00o0o0;
                } else {
                    oooO = new com.google.android.exoplayer2.source.OooO(o00o0o0, i, this);
                    Oooo0 oooo1 = Oooo0.this;
                    oooo1.getClass();
                    o00O0O o00o0oOooOoo0 = oooo1.OooOoo0(new OooO0o(0, true));
                    this.f13118OooOO0o = o00o0oOooOoo0;
                    o00o0oOooOoo0.OooO0OO(Oooo0.f13064OoooO00);
                }
                long jOooO00o2 = j;
                ((o0OO00O) this.f13111OooO0Oo).OooO0O0(oooO, this.f13109OooO0O0, this.f13110OooO0OO.OooO0o0(), j, j2, this.f13113OooO0o0);
                if (Oooo0.this.f13082OooOo0 != null) {
                    Extractor extractor = ((o0OO00O) this.f13111OooO0Oo).f39898OooO0O0;
                    if (extractor instanceof Mp3Extractor) {
                        ((Mp3Extractor) extractor).f11970OooOOo = true;
                    }
                }
                if (this.f13107OooO) {
                    Oooo000 oooo000 = this.f13111OooO0Oo;
                    long j3 = this.f13116OooOO0;
                    Extractor extractor2 = ((o0OO00O) oooo000).f39898OooO0O0;
                    extractor2.getClass();
                    extractor2.OooO0O0(jOooO00o2, j3);
                    this.f13107OooO = false;
                }
                while (true) {
                    long j4 = jOooO00o2;
                    while (true) {
                        if (iOooO0oO != 0 || this.f13115OooO0oo) {
                            break;
                        }
                        try {
                            o00O0 o00o1 = this.f13112OooO0o;
                            synchronized (o00o1) {
                                while (!o00o1.f40556OooO00o) {
                                    try {
                                        o00o1.wait();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            Oooo000 oooo001 = this.f13111OooO0Oo;
                            o00OO0O0 o00oo0o1 = this.f13114OooO0oO;
                            o0OO00O o0oo00o2 = (o0OO00O) oooo001;
                            Extractor extractor3 = o0oo00o2.f39898OooO0O0;
                            extractor3.getClass();
                            o00O00o0 o00o00o1 = o0oo00o2.f39899OooO0OO;
                            o00o00o1.getClass();
                            iOooO0oO = extractor3.OooO0oO(o00o00o1, o00oo0o1);
                            jOooO00o2 = ((o0OO00O) this.f13111OooO0Oo).OooO00o();
                            if (jOooO00o2 > Oooo0.this.f13075OooOOO0 + j4) {
                                this.f13112OooO0o.OooO00o();
                                Oooo0 oooo2 = Oooo0.this;
                                oooo2.f13080OooOOoo.post(oooo2.f13078OooOOo);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (iOooO0oO == 1) {
                    iOooO0oO = 0;
                } else if (((o0OO00O) this.f13111OooO0Oo).OooO00o() != -1) {
                    this.f13114OooO0oO.f39548OooO00o = ((o0OO00O) this.f13111OooO0Oo).OooO00o();
                }
                o00O000.OooO00o(this.f13110OooO0OO);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
        public final void OooO0O0() {
            this.f13115OooO0oo = true;
        }

        public final DataSpec OooO0OO(long j) {
            Collections.emptyMap();
            String str = Oooo0.this.f13073OooOO0o;
            Map<String, String> map = Oooo0.f13063Oooo;
            Uri uri = this.f13109OooO0O0;
            o00O000o.OooO0o(uri, "The uri must be set.");
            return new DataSpec(uri, 0L, 1, null, map, j, -1L, str, 6, null);
        }
    }

    public interface OooO0O0 {
    }

    public final class OooO0OO implements SampleStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13121OooO0Oo;

        public OooO0OO(int i) {
            this.f13121OooO0Oo = i;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void OooO00o() throws IOException {
            Oooo0 oooo0 = Oooo0.this;
            o00O0O o00o0o2 = oooo0.f13084OooOo0O[this.f13121OooO0Oo];
            DrmSession drmSession = o00o0o2.f13308OooO0oo;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.DrmSessionException error = o00o0o2.f13308OooO0oo.getError();
                error.getClass();
                throw error;
            }
            int iOooO0O0 = oooo0.f13069OooO0oO.OooO0O0(oooo0.f13092OooOooo);
            Loader loader = oooo0.f13074OooOOO;
            IOException iOException = loader.f14196OooO0OO;
            if (iOException != null) {
                throw iOException;
            }
            Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f14195OooO0O0;
            if (oooO0OO != null) {
                if (iOooO0O0 == Integer.MIN_VALUE) {
                    iOooO0O0 = oooO0OO.f14200OooO0Oo;
                }
                IOException iOException2 = oooO0OO.f14204OooO0oo;
                if (iOException2 != null && oooO0OO.f14199OooO > iOooO0O0) {
                    throw iOException2;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean OooO0O0() {
            Oooo0 oooo0 = Oooo0.this;
            return !oooo0.OooOooO() && oooo0.f13084OooOo0O[this.f13121OooO0Oo].OooOOo0(oooo0.f13101Oooo0oO);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOO(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i) {
            Oooo0 oooo0 = Oooo0.this;
            if (oooo0.OooOooO()) {
                return -3;
            }
            int i2 = this.f13121OooO0Oo;
            oooo0.OooOoO(i2);
            int iOooOo00 = oooo0.f13084OooOo0O[i2].OooOo00(o00ooo0o, decoderInputBuffer, i, oooo0.f13101Oooo0oO);
            if (iOooOo00 == -3) {
                oooo0.OooOoOO(i2);
            }
            return iOooOo00;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOOo(long j) {
            Oooo0 oooo0 = Oooo0.this;
            if (oooo0.OooOooO()) {
                return 0;
            }
            int i = this.f13121OooO0Oo;
            oooo0.OooOoO(i);
            o00O0O o00o0o2 = oooo0.f13084OooOo0O[i];
            int iOooOOOO = o00o0o2.OooOOOO(j, oooo0.f13101Oooo0oO);
            o00o0o2.OooOoO0(iOooOOOO);
            if (iOooOOOO != 0) {
                return iOooOOOO;
            }
            oooo0.OooOoOO(i);
            return iOooOOOO;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13123OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f13124OooO0O0;

        public OooO0o(int i, boolean z) {
            this.f13123OooO00o = i;
            this.f13124OooO0O0 = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f13123OooO00o == oooO0o.f13123OooO00o && this.f13124OooO0O0 == oooO0o.f13124OooO0O0;
        }

        public final int hashCode() {
            return (this.f13123OooO00o * 31) + (this.f13124OooO0O0 ? 1 : 0);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f13063Oooo = Collections.unmodifiableMap(map);
        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
        oooO00o.f11235OooO00o = "icy";
        oooO00o.f11244OooOO0O = "application/x-icy";
        f13064OoooO00 = oooO00o.OooO00o();
    }

    public Oooo0(Uri uri, com.google.android.exoplayer2.upstream.OooO00o oooO00o, o0OO00O o0oo00o2, com.google.android.exoplayer2.drm.OooO0OO oooO0OO, com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, OooOo00.OooO00o oooO00o3, OooO0O0 oooO0O0, o000OO0O o000oo0o2, @Nullable String str, int i) {
        this.f13066OooO0Oo = uri;
        this.f13068OooO0o0 = oooO00o;
        this.f13067OooO0o = oooO0OO;
        this.f13065OooO = oooO00o2;
        this.f13069OooO0oO = loadErrorHandlingPolicy;
        this.f13070OooO0oo = oooO00o3;
        this.f13071OooOO0 = oooO0O0;
        this.f13072OooOO0O = o000oo0o2;
        this.f13073OooOO0o = str;
        this.f13075OooOOO0 = i;
        this.f13076OooOOOO = o0oo00o2;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO() {
        if (!this.f13095Oooo00O) {
            return -9223372036854775807L;
        }
        if (!this.f13101Oooo0oO && OooOo0O() <= this.f13099Oooo0o) {
            return -9223372036854775807L;
        }
        this.f13095Oooo00O = false;
        return this.f13097Oooo0O0;
    }

    @Override // p209o00o0oo0.o00O0O0
    public final void OooO00o() {
        this.f13081OooOo = true;
        this.f13080OooOOoo.post(this.f13079OooOOo0);
    }

    @Override // p209o00o0oo0.o00O0O0
    public final void OooO0O0(o00OO0OO o00oo0oo) {
        this.f13080OooOOoo.post(new o000O000(2, this, o00oo0oo));
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0OO(long j, o0O00OO o0o00oo2) {
        OooOOOo();
        if (!this.f13090OooOoo0.OooO0o()) {
            return 0L;
        }
        o00OO0OO.OooO00o oooO00oOooO0OO = this.f13090OooOoo0.OooO0OO(j);
        return o0o00oo2.OooO00o(j, oooO00oOooO0OO.f39549OooO00o.f39575OooO00o, oooO00oOooO0OO.f39550OooO0O0.f39575OooO00o);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final void OooO0Oo(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
        OooO00o oooO00o = (OooO00o) oooO0o;
        p244o00oo0Oo.o00O0O0 o00o0o0 = oooO00o.f13110OooO0OO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        this.f13069OooO0oO.OooO0Oo();
        this.f13070OooO0oo.OooO0OO(o0000Var, 1, -1, null, 0, null, oooO00o.f13116OooOO0, this.f13089OooOoo);
        if (z) {
            return;
        }
        for (o00O0O o00o0o2 : this.f13084OooOo0O) {
            o00o0o2.OooOo0(false);
        }
        if (this.f13096Oooo00o > 0) {
            OooOOO.OooO00o oooO00o2 = this.f13083OooOo00;
            oooO00o2.getClass();
            oooO00o2.OooO00o(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final void OooO0o(Loader.OooO0o oooO0o, long j, long j2) {
        o00OO0OO o00oo0oo;
        OooO00o oooO00o = (OooO00o) oooO0o;
        if (this.f13089OooOoo == -9223372036854775807L && (o00oo0oo = this.f13090OooOoo0) != null) {
            boolean zOooO0o = o00oo0oo.OooO0o();
            long jOooOo0o = OooOo0o(true);
            long j3 = jOooOo0o == Long.MIN_VALUE ? 0L : jOooOo0o + 10000;
            this.f13089OooOoo = j3;
            ((o000oOoO) this.f13071OooOO0).OooOo0(j3, zOooO0o, this.f13091OooOooO);
        }
        p244o00oo0Oo.o00O0O0 o00o0o0 = oooO00o.f13110OooO0OO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        this.f13069OooO0oO.OooO0Oo();
        this.f13070OooO0oo.OooO0o0(o0000Var, 1, -1, null, 0, null, oooO00o.f13116OooOO0, this.f13089OooOoo);
        this.f13101Oooo0oO = true;
        OooOOO.OooO00o oooO00o2 = this.f13083OooOo00;
        oooO00o2.getClass();
        oooO00o2.OooO00o(this);
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooO0o0() {
        return OooOOoo();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0oO(long j) {
        boolean z;
        OooOOOo();
        boolean[] zArr = this.f13088OooOoOO.f13104OooO0O0;
        if (!this.f13090OooOoo0.OooO0o()) {
            j = 0;
        }
        this.f13095Oooo00O = false;
        this.f13097Oooo0O0 = j;
        if (OooOo()) {
            this.f13098Oooo0OO = j;
            return j;
        }
        if (this.f13092OooOooo != 7) {
            int length = this.f13084OooOo0O.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (!this.f13084OooOo0O[i].OooOo(j, false) && (zArr[i] || !this.f13086OooOoO)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                return j;
            }
        }
        this.f13100Oooo0o0 = false;
        this.f13098Oooo0OO = j;
        this.f13101Oooo0oO = false;
        Loader loader = this.f13074OooOOO;
        if (loader.OooO0O0()) {
            for (o00O0O o00o0o2 : this.f13084OooOo0O) {
                o00o0o2.OooO0oo();
            }
            Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f14195OooO0O0;
            o00O000o.OooO0o0(oooO0OO);
            oooO0OO.OooO00o(false);
        } else {
            loader.f14196OooO0OO = null;
            for (o00O0O o00o0o3 : this.f13084OooOo0O) {
                o00o0o3.OooOo0(false);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooO0oo() {
        boolean z;
        if (this.f13074OooOOO.OooO0O0()) {
            o00O0 o00o1 = this.f13077OooOOOo;
            synchronized (o00o1) {
                z = o00o1.f40556OooO00o;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOO0(OooOOO.OooO00o oooO00o, long j) {
        this.f13083OooOo00 = oooO00o;
        this.f13077OooOOOo.OooO0O0();
        OooOoo();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooOO0O(com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        com.google.android.exoplayer2.trackselection.OooO0o oooO0o;
        OooOOOo();
        OooO oooO = this.f13088OooOoOO;
        o000O0 o000o0 = oooO.f13103OooO00o;
        int i = this.f13096Oooo00o;
        int i2 = 0;
        while (true) {
            int length = oooO0oArr.length;
            zArr3 = oooO.f13105OooO0OO;
            if (i2 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i2];
            if (sampleStream != null && (oooO0oArr[i2] == null || !zArr[i2])) {
                int i3 = ((OooO0OO) sampleStream).f13121OooO0Oo;
                o00O000o.OooO0Oo(zArr3[i3]);
                this.f13096Oooo00o--;
                zArr3[i3] = false;
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        boolean z = !this.f13094Oooo000 ? j == 0 : i != 0;
        for (int i4 = 0; i4 < oooO0oArr.length; i4++) {
            if (sampleStreamArr[i4] == null && (oooO0o = oooO0oArr[i4]) != null) {
                o00O000o.OooO0Oo(oooO0o.length() == 1);
                o00O000o.OooO0Oo(oooO0o.OooO0OO(0) == 0);
                int iIndexOf = o000o0.f39868OooO0o0.indexOf(oooO0o.OooOO0());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                o00O000o.OooO0Oo(!zArr3[iIndexOf]);
                this.f13096Oooo00o++;
                zArr3[iIndexOf] = true;
                sampleStreamArr[i4] = new OooO0OO(iIndexOf);
                zArr2[i4] = true;
                if (!z) {
                    o00O0O o00o0o2 = this.f13084OooOo0O[iIndexOf];
                    z = (o00o0o2.OooOo(j, true) || o00o0o2.f13317OooOOo0 + o00o0o2.f13318OooOOoo == 0) ? false : true;
                }
            }
        }
        if (this.f13096Oooo00o == 0) {
            this.f13100Oooo0o0 = false;
            this.f13095Oooo00O = false;
            Loader loader = this.f13074OooOOO;
            if (loader.OooO0O0()) {
                for (o00O0O o00o0o3 : this.f13084OooOo0O) {
                    o00o0o3.OooO0oo();
                }
                Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f14195OooO0O0;
                o00O000o.OooO0o0(oooO0OO);
                oooO0OO.OooO00o(false);
            } else {
                for (o00O0O o00o0o4 : this.f13084OooOo0O) {
                    o00o0o4.OooOo0(false);
                }
            }
        } else if (z) {
            j = OooO0oO(j);
            for (int i5 = 0; i5 < sampleStreamArr.length; i5++) {
                if (sampleStreamArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f13094Oooo000 = true;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final Loader.OooO0O0 OooOO0o(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
        boolean z;
        Loader.OooO0O0 oooO0O0;
        o00OO0OO o00oo0oo;
        OooO00o oooO00o = (OooO00o) oooO0o;
        p244o00oo0Oo.o00O0O0 o00o0o0 = oooO00o.f13110OooO0OO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        o0O00.OoooOO0(oooO00o.f13116OooOO0);
        o0O00.OoooOO0(this.f13089OooOoo);
        LoadErrorHandlingPolicy.OooO0OO oooO0OO = new LoadErrorHandlingPolicy.OooO0OO(iOException, i);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f13069OooO0oO;
        long jOooO00o = loadErrorHandlingPolicy.OooO00o(oooO0OO);
        if (jOooO00o == -9223372036854775807L) {
            oooO0O0 = Loader.f14193OooO0o0;
        } else {
            int iOooOo0O = OooOo0O();
            int i2 = iOooOo0O > this.f13099Oooo0o ? 1 : 0;
            if (this.f13093Oooo0 || !((o00oo0oo = this.f13090OooOoo0) == null || o00oo0oo.OooO() == -9223372036854775807L)) {
                this.f13099Oooo0o = iOooOo0O;
            } else {
                if (!this.f13087OooOoO0 || OooOooO()) {
                    this.f13095Oooo00O = this.f13087OooOoO0;
                    this.f13097Oooo0O0 = 0L;
                    this.f13099Oooo0o = 0;
                    for (o00O0O o00o0o2 : this.f13084OooOo0O) {
                        o00o0o2.OooOo0(false);
                    }
                    oooO00o.f13114OooO0oO.f39548OooO00o = 0L;
                    oooO00o.f13116OooOO0 = 0L;
                    oooO00o.f13107OooO = true;
                    oooO00o.f13120OooOOO0 = false;
                } else {
                    this.f13100Oooo0o0 = true;
                    z = false;
                }
                if (z) {
                    oooO0O0 = new Loader.OooO0O0(i2, jOooO00o);
                } else {
                    oooO0O0 = Loader.f14192OooO0Oo;
                }
            }
            z = true;
            if (z) {
                oooO0O0 = new Loader.OooO0O0(i2, jOooO00o);
            } else {
                oooO0O0 = Loader.f14192OooO0Oo;
            }
        }
        int i3 = oooO0O0.f14197OooO00o;
        boolean z2 = !(i3 == 0 || i3 == 1);
        this.f13070OooO0oo.OooO0oO(o0000Var, 1, -1, null, 0, null, oooO00o.f13116OooOO0, this.f13089OooOoo, iOException, z2);
        if (z2) {
            loadErrorHandlingPolicy.OooO0Oo();
        }
        return oooO0O0;
    }

    @Override // p209o00o0oo0.o00O0O0
    public final TrackOutput OooOOO(int i, int i2) {
        return OooOoo0(new OooO0o(i, false));
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO
    public final void OooOOO0() {
        for (o00O0O o00o0o2 : this.f13084OooOo0O) {
            o00o0o2.OooOo0(true);
            DrmSession drmSession = o00o0o2.f13308OooO0oo;
            if (drmSession != null) {
                drmSession.OooO0O0(o00o0o2.f13306OooO0o0);
                o00o0o2.f13308OooO0oo = null;
                o00o0o2.f13307OooO0oO = null;
            }
        }
        o0OO00O o0oo00o2 = (o0OO00O) this.f13076OooOOOO;
        Extractor extractor = o0oo00o2.f39898OooO0O0;
        if (extractor != null) {
            extractor.release();
            o0oo00o2.f39898OooO0O0 = null;
        }
        o0oo00o2.f39899OooO0OO = null;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOOOO() throws IOException {
        int iOooO0O0 = this.f13069OooO0oO.OooO0O0(this.f13092OooOooo);
        Loader loader = this.f13074OooOOO;
        IOException iOException = loader.f14196OooO0OO;
        if (iOException != null) {
            throw iOException;
        }
        Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f14195OooO0O0;
        if (oooO0OO != null) {
            if (iOooO0O0 == Integer.MIN_VALUE) {
                iOooO0O0 = oooO0OO.f14200OooO0Oo;
            }
            IOException iOException2 = oooO0OO.f14204OooO0oo;
            if (iOException2 != null && oooO0OO.f14199OooO > iOooO0O0) {
                throw iOException2;
            }
        }
        if (this.f13101Oooo0oO && !this.f13087OooOoO0) {
            throw ParserException.OooO00o("Loading finished before preparation is complete.", null);
        }
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void OooOOOo() {
        o00O000o.OooO0Oo(this.f13087OooOoO0);
        this.f13088OooOoOO.getClass();
        this.f13090OooOoo0.getClass();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final o000O0 OooOOo() {
        OooOOOo();
        return this.f13088OooOoOO.f13103OooO00o;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooOOo0(long j) {
        if (!this.f13101Oooo0oO) {
            Loader loader = this.f13074OooOOO;
            if (!(loader.f14196OooO0OO != null) && !this.f13100Oooo0o0 && (!this.f13087OooOoO0 || this.f13096Oooo00o != 0)) {
                boolean zOooO0O0 = this.f13077OooOOOo.OooO0O0();
                if (loader.OooO0O0()) {
                    return zOooO0O0;
                }
                OooOoo();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooOOoo() {
        long jOooOo0o;
        boolean z;
        OooOOOo();
        if (this.f13101Oooo0oO || this.f13096Oooo00o == 0) {
            return Long.MIN_VALUE;
        }
        if (OooOo()) {
            return this.f13098Oooo0OO;
        }
        if (this.f13086OooOoO) {
            int length = this.f13084OooOo0O.length;
            jOooOo0o = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                OooO oooO = this.f13088OooOoOO;
                if (oooO.f13104OooO0O0[i] && oooO.f13105OooO0OO[i]) {
                    o00O0O o00o0o2 = this.f13084OooOo0O[i];
                    synchronized (o00o0o2) {
                        z = o00o0o2.f13323OooOo0o;
                    }
                    if (!z) {
                        jOooOo0o = Math.min(jOooOo0o, this.f13084OooOo0O[i].OooOO0o());
                    }
                }
            }
        } else {
            jOooOo0o = Long.MAX_VALUE;
        }
        if (jOooOo0o == LongCompanionObject.MAX_VALUE) {
            jOooOo0o = OooOo0o(false);
        }
        return jOooOo0o == Long.MIN_VALUE ? this.f13097Oooo0O0 : jOooOo0o;
    }

    public final boolean OooOo() {
        return this.f13098Oooo0OO != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final void OooOo0(long j) {
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOo00(long j, boolean z) {
        OooOOOo();
        if (OooOo()) {
            return;
        }
        boolean[] zArr = this.f13088OooOoOO.f13105OooO0OO;
        int length = this.f13084OooOo0O.length;
        for (int i = 0; i < length; i++) {
            this.f13084OooOo0O[i].OooO0oO(j, z, zArr[i]);
        }
    }

    public final int OooOo0O() {
        int i = 0;
        for (o00O0O o00o0o2 : this.f13084OooOo0O) {
            i += o00o0o2.f13317OooOOo0 + o00o0o2.f13315OooOOOo;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long OooOo0o(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f13084OooOo0O.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.f13084OooOo0O[i].OooOO0o());
            } else {
                OooO oooO = this.f13088OooOoOO;
                oooO.getClass();
                if (oooO.f13105OooO0OO[i]) {
                    jMax = Math.max(jMax, this.f13084OooOo0O[i].OooOO0o());
                }
            }
        }
        return jMax;
    }

    public final void OooOoO(int i) {
        OooOOOo();
        OooO oooO = this.f13088OooOoOO;
        boolean[] zArr = oooO.f13106OooO0Oo;
        if (zArr[i]) {
            return;
        }
        com.google.android.exoplayer2.OooOo oooOo = oooO.f13103OooO00o.OooO00o(i).f39876OooO0oO[0];
        this.f13070OooO0oo.OooO00o(p245o00oo0o.o00OO0OO.OooO0oo(oooOo.f11211OooOOOO), oooOo, 0, null, this.f13097Oooo0O0);
        zArr[i] = true;
    }

    public final void OooOoO0() {
        int i;
        com.google.android.exoplayer2.OooOo oooOo;
        if (this.f13102Oooo0oo || this.f13087OooOoO0 || !this.f13081OooOo || this.f13090OooOoo0 == null) {
            return;
        }
        for (o00O0O o00o0o2 : this.f13084OooOo0O) {
            synchronized (o00o0o2) {
                oooOo = o00o0o2.f13325OooOoO0 ? null : o00o0o2.f13328OooOoo0;
            }
            if (oooOo == null) {
                return;
            }
        }
        this.f13077OooOOOo.OooO00o();
        int length = this.f13084OooOo0O.length;
        o000O00O[] o000o00oArr = new o000O00O[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            com.google.android.exoplayer2.OooOo oooOoOooOOOo = this.f13084OooOo0O[i2].OooOOOo();
            oooOoOooOOOo.getClass();
            String str = oooOoOooOOOo.f11211OooOOOO;
            boolean zOooOO0 = p245o00oo0o.o00OO0OO.OooOO0(str);
            boolean z = zOooOO0 || p245o00oo0o.o00OO0OO.OooOO0o(str);
            zArr[i2] = z;
            this.f13086OooOoO = z | this.f13086OooOoO;
            IcyHeaders icyHeaders = this.f13082OooOo0;
            if (icyHeaders != null) {
                if (zOooOO0 || this.f13085OooOo0o[i2].f13124OooO0O0) {
                    Metadata metadata = oooOoOooOOOo.f11210OooOOO0;
                    Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.OooO00o(icyHeaders);
                    com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o(oooOoOooOOOo);
                    oooO00o.f11234OooO = metadata2;
                    oooOoOooOOOo = new com.google.android.exoplayer2.OooOo(oooO00o);
                }
                if (zOooOO0 && oooOoOooOOOo.f11200OooO == -1 && oooOoOooOOOo.f11206OooOO0 == -1 && (i = icyHeaders.f12563OooO0Oo) != -1) {
                    com.google.android.exoplayer2.OooOo.OooO00o oooO00o2 = new com.google.android.exoplayer2.OooOo.OooO00o(oooOoOooOOOo);
                    oooO00o2.f11239OooO0o = i;
                    oooOoOooOOOo = new com.google.android.exoplayer2.OooOo(oooO00o2);
                }
            }
            int iOooO00o = this.f13067OooO0o.OooO00o(oooOoOooOOOo);
            com.google.android.exoplayer2.OooOo.OooO00o OooO00o2 = oooOoOooOOOo.OooO00o();
            OooO00o2.f11265Oooo000 = iOooO00o;
            o000o00oArr[i2] = new o000O00O(Integer.toString(i2), OooO00o2.OooO00o());
        }
        this.f13088OooOoOO = new OooO(new o000O0(o000o00oArr), zArr);
        this.f13087OooOoO0 = true;
        OooOOO.OooO00o oooO00o3 = this.f13083OooOo00;
        oooO00o3.getClass();
        oooO00o3.OooO0O0(this);
    }

    public final void OooOoOO(int i) {
        OooOOOo();
        boolean[] zArr = this.f13088OooOoOO.f13104OooO0O0;
        if (this.f13100Oooo0o0 && zArr[i] && !this.f13084OooOo0O[i].OooOOo0(false)) {
            this.f13098Oooo0OO = 0L;
            this.f13100Oooo0o0 = false;
            this.f13095Oooo00O = true;
            this.f13097Oooo0O0 = 0L;
            this.f13099Oooo0o = 0;
            for (o00O0O o00o0o2 : this.f13084OooOo0O) {
                o00o0o2.OooOo0(false);
            }
            OooOOO.OooO00o oooO00o = this.f13083OooOo00;
            oooO00o.getClass();
            oooO00o.OooO00o(this);
        }
    }

    public final void OooOoo() {
        OooO00o oooO00o = new OooO00o(this.f13066OooO0Oo, this.f13068OooO0o0, this.f13076OooOOOO, this, this.f13077OooOOOo);
        if (this.f13087OooOoO0) {
            o00O000o.OooO0Oo(OooOo());
            long j = this.f13089OooOoo;
            if (j != -9223372036854775807L && this.f13098Oooo0OO > j) {
                this.f13101Oooo0oO = true;
                this.f13098Oooo0OO = -9223372036854775807L;
                return;
            }
            o00OO0OO o00oo0oo = this.f13090OooOoo0;
            o00oo0oo.getClass();
            long j2 = o00oo0oo.OooO0OO(this.f13098Oooo0OO).f39549OooO00o.f39576OooO0O0;
            long j3 = this.f13098Oooo0OO;
            oooO00o.f13114OooO0oO.f39548OooO00o = j2;
            oooO00o.f13116OooOO0 = j3;
            oooO00o.f13107OooO = true;
            oooO00o.f13120OooOOO0 = false;
            for (o00O0O o00o0o2 : this.f13084OooOo0O) {
                o00o0o2.f13321OooOo00 = this.f13098Oooo0OO;
            }
            this.f13098Oooo0OO = -9223372036854775807L;
        }
        this.f13099Oooo0o = OooOo0O();
        this.f13070OooO0oo.OooO(new o0000(oooO00o.f13108OooO00o, oooO00o.f13117OooOO0O, this.f13074OooOOO.OooO0Oo(oooO00o, this, this.f13069OooO0oO.OooO0O0(this.f13092OooOooo))), 1, -1, null, 0, null, oooO00o.f13116OooOO0, this.f13089OooOoo);
    }

    public final o00O0O OooOoo0(OooO0o oooO0o) {
        int length = this.f13084OooOo0O.length;
        for (int i = 0; i < length; i++) {
            if (oooO0o.equals(this.f13085OooOo0o[i])) {
                return this.f13084OooOo0O[i];
            }
        }
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO = this.f13067OooO0o;
        oooO0OO.getClass();
        com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o = this.f13065OooO;
        oooO00o.getClass();
        o00O0O o00o0o2 = new o00O0O(this.f13072OooOO0O, oooO0OO, oooO00o);
        o00o0o2.f13305OooO0o = this;
        int i2 = length + 1;
        OooO0o[] oooO0oArr = (OooO0o[]) Arrays.copyOf(this.f13085OooOo0o, i2);
        oooO0oArr[length] = oooO0o;
        this.f13085OooOo0o = oooO0oArr;
        o00O0O[] o00o0oArr = (o00O0O[]) Arrays.copyOf(this.f13084OooOo0O, i2);
        o00o0oArr[length] = o00o0o2;
        this.f13084OooOo0O = o00o0oArr;
        return o00o0o2;
    }

    public final boolean OooOooO() {
        return this.f13095Oooo00O || OooOo();
    }
}
