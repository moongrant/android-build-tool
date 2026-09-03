package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.mp3.Mp3Extractor;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;
import o000O00O.o00O0000;
import o000O00O.o00OO0O0;
import o000OOoO.o000000;
import o000OOoO.o000OOo;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p045Oooooo.o0000O;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;
import p080o000OoO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements OooOOO, o000OOoO.Oooo0, Loader.OooO00o<OooO00o>, Loader.OooO, o00O0O.OooO0OO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final Map<String, String> f7962Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final androidx.media3.common.OooOO0 f7963OoooO00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.OooO0O0.OooO00o f7964OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f7965OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.OooO0OO f7966OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o f7967OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f7968OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo00.OooO00o f7969OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0 f7970OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final p074o000OO0o.o00Oo0 f7971OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final String f7972OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f7974OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Oooo000 f7975OooOOOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f7980OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public IcyHeaders f7981OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f7982OooOo00;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f7985OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f7986OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooO f7987OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o000000 f7989OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f7990OooOooO;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f7992Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f7993Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f7994Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f7995Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f7996Oooo0O0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f7998Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f7999Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f8000Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f8001Oooo0oo;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Loader f7973OooOOO = new Loader("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final oo0o0Oo f7976OooOOOo = new oo0o0Oo();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o000O.o00Ooo f7978OooOOo0 = new o000O.o00Ooo(this, 0);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o000O.oo000o f7977OooOOo = new Runnable() { // from class: o000O.oo000o
        @Override // java.lang.Runnable
        public final void run() {
            androidx.media3.exoplayer.source.Oooo0 oooo0 = this.f33890OooO0Oo;
            if (oooo0.f8001Oooo0oo) {
                return;
            }
            androidx.media3.exoplayer.source.OooOOO.OooO00o oooO00o = oooo0.f7982OooOo00;
            oooO00o.getClass();
            oooO00o.OooO(oooo0);
        }
    };

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Handler f7979OooOOoo = o00.OooOO0o(null);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0o[] f7984OooOo0o = new OooO0o[0];

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00O0O[] f7983OooOo0O = new o00O0O[0];

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public long f7997Oooo0OO = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public long f7988OooOoo = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f7991OooOooo = 1;

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O.oo0o0Oo f8002OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean[] f8003OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean[] f8004OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean[] f8005OooO0Oo;

        public OooO(o000O.oo0o0Oo oo0o0oo, boolean[] zArr) {
            this.f8002OooO00o = oo0o0oo;
            this.f8003OooO0O0 = zArr;
            int i = oo0o0oo.f33893OooO0Oo;
            this.f8004OooO0OO = new boolean[i];
            this.f8005OooO0Oo = new boolean[i];
        }
    }

    public final class OooO00o implements Loader.OooO0o, androidx.media3.exoplayer.source.OooO.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Uri f8008OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000O0O.OooOOOO f8009OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Oooo000 f8010OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final oo0o0Oo f8011OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o000OOoO.Oooo0 f8012OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public volatile boolean f8014OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f8015OooOO0;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public o00O0O f8017OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f8019OooOOO0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o000OOo f8013OooO0oO = new o000OOo();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f8006OooO = true;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f8007OooO00o = o000O.OooOo.f33842OooO0O0.getAndIncrement();

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public DataSpec f8016OooOO0O = OooO0OO(0);

        public OooO00o(Uri uri, androidx.media3.datasource.OooO00o oooO00o, Oooo000 oooo000, o000OOoO.Oooo0 oooo0, oo0o0Oo oo0o0oo) {
            this.f8008OooO0O0 = uri;
            this.f8009OooO0OO = new o000O0O.OooOOOO(oooO00o);
            this.f8010OooO0Oo = oooo000;
            this.f8012OooO0o0 = oooo0;
            this.f8011OooO0o = oo0o0oo;
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0110 */
        @Override // androidx.media3.exoplayer.upstream.Loader.OooO0o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o() throws IOException {
            androidx.media3.datasource.OooO00o oooO;
            int i;
            int iOooO00o = 0;
            while (iOooO00o == 0 && !this.f8014OooO0oo) {
                long j = this.f8013OooO0oO.f34713OooO00o;
                DataSpec dataSpecOooO0OO = OooO0OO(j);
                this.f8016OooOO0O = dataSpecOooO0OO;
                long jOooO00o = this.f8009OooO0OO.OooO00o(dataSpecOooO0OO);
                if (jOooO00o != -1) {
                    jOooO00o += j;
                    final Oooo0 oooo0 = Oooo0.this;
                    oooo0.f7979OooOOoo.post(new Runnable() { // from class: o000O.o00oO0o
                        @Override // java.lang.Runnable
                        public final void run() {
                            oooo0.f7992Oooo0 = true;
                        }
                    });
                }
                long j2 = jOooO00o;
                Oooo0.this.f7981OooOo0 = IcyHeaders.OooO00o(this.f8009OooO0OO.OooO0Oo());
                o000O0O.OooOOOO oooOOOO = this.f8009OooO0OO;
                IcyHeaders icyHeaders = Oooo0.this.f7981OooOo0;
                if (icyHeaders == null || (i = icyHeaders.f8441OooO) == -1) {
                    oooO = oooOOOO;
                } else {
                    oooO = new androidx.media3.exoplayer.source.OooO(oooOOOO, i, this);
                    Oooo0 oooo1 = Oooo0.this;
                    oooo1.getClass();
                    o00O0O o00o0oOooOoOO = oooo1.OooOoOO(new OooO0o(0, true));
                    this.f8017OooOO0o = o00o0oOooOoOO;
                    o00o0oOooOoOO.OooO0O0(Oooo0.f7963OoooO00);
                }
                long jOooO00o2 = j;
                ((o000O.OooO00o) this.f8010OooO0Oo).OooO0O0(oooO, this.f8008OooO0O0, this.f8009OooO0OO.OooO0Oo(), j, j2, this.f8012OooO0o0);
                if (Oooo0.this.f7981OooOo0 != null) {
                    Extractor extractor = ((o000O.OooO00o) this.f8010OooO0Oo).f33830OooO0O0;
                    if (extractor instanceof Mp3Extractor) {
                        ((Mp3Extractor) extractor).f8663OooOOo = true;
                    }
                }
                if (this.f8006OooO) {
                    Oooo000 oooo000 = this.f8010OooO0Oo;
                    long j3 = this.f8015OooOO0;
                    Extractor extractor2 = ((o000O.OooO00o) oooo000).f33830OooO0O0;
                    extractor2.getClass();
                    extractor2.OooO0O0(jOooO00o2, j3);
                    this.f8006OooO = false;
                }
                while (true) {
                    long j4 = jOooO00o2;
                    while (true) {
                        if (iOooO00o != 0 || this.f8014OooO0oo) {
                            break;
                        }
                        try {
                            this.f8011OooO0o.OooO00o();
                            Oooo000 oooo001 = this.f8010OooO0Oo;
                            o000OOo o000ooo2 = this.f8013OooO0oO;
                            o000O.OooO00o oooO00o = (o000O.OooO00o) oooo001;
                            Extractor extractor3 = oooO00o.f33830OooO0O0;
                            extractor3.getClass();
                            o000OOoO.OooOO0O oooOO0O = oooO00o.f33831OooO0OO;
                            oooOO0O.getClass();
                            iOooO00o = extractor3.OooO00o(oooOO0O, o000ooo2);
                            jOooO00o2 = ((o000O.OooO00o) this.f8010OooO0Oo).OooO00o();
                            if (jOooO00o2 > Oooo0.this.f7974OooOOO0 + j4) {
                                this.f8011OooO0o.OooO0O0();
                                Oooo0 oooo2 = Oooo0.this;
                                oooo2.f7979OooOOoo.post(oooo2.f7977OooOOo);
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (iOooO00o == 1) {
                    iOooO00o = 0;
                } else if (((o000O.OooO00o) this.f8010OooO0Oo).OooO00o() != -1) {
                    this.f8013OooO0oO.f34713OooO00o = ((o000O.OooO00o) this.f8010OooO0Oo).OooO00o();
                }
                o000O0O.OooO.OooO00o(this.f8009OooO0OO);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.OooO0o
        public final void OooO0O0() {
            this.f8014OooO0oo = true;
        }

        public final DataSpec OooO0OO(long j) {
            Collections.emptyMap();
            String str = Oooo0.this.f7972OooOO0o;
            Map<String, String> map = Oooo0.f7962Oooo;
            Uri uri = this.f8008OooO0O0;
            p080o000OoO.o00Oo0.OooO0oO(uri, "The uri must be set.");
            return new DataSpec(uri, 0L, 1, null, map, j, -1L, str, 6, null);
        }
    }

    public interface OooO0O0 {
    }

    public final class OooO0OO implements SampleStream {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8020OooO00o;

        public OooO0OO(int i) {
            this.f8020OooO00o = i;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void OooO00o() throws IOException {
            Oooo0 oooo0 = Oooo0.this;
            o00O0O o00o0o2 = oooo0.f7983OooOo0O[this.f8020OooO00o];
            DrmSession drmSession = o00o0o2.f8050OooO0oo;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.DrmSessionException error = o00o0o2.f8050OooO0oo.getError();
                error.getClass();
                throw error;
            }
            int iOooO0O0 = oooo0.f7968OooO0oO.OooO0O0(oooo0.f7991OooOooo);
            Loader loader = oooo0.f7973OooOOO;
            IOException iOException = loader.f8257OooO0OO;
            if (iOException != null) {
                throw iOException;
            }
            Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f8256OooO0O0;
            if (oooO0OO != null) {
                if (iOooO0O0 == Integer.MIN_VALUE) {
                    iOooO0O0 = oooO0OO.f8261OooO0Oo;
                }
                IOException iOException2 = oooO0OO.f8265OooO0oo;
                if (iOException2 != null && oooO0OO.f8260OooO > iOooO0O0) {
                    throw iOException2;
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int OooO0O0(o00O0000 o00o0001, DecoderInputBuffer decoderInputBuffer, int i) {
            int i2;
            Oooo0 oooo0 = Oooo0.this;
            int i3 = this.f8020OooO00o;
            if (oooo0.OooOoo()) {
                return -3;
            }
            oooo0.OooOoO0(i3);
            o00O0O o00o0o2 = oooo0.f7983OooOo0O[i3];
            boolean z = oooo0.f8000Oooo0oO;
            o00o0o2.getClass();
            boolean z2 = (i & 2) != 0;
            o00O0O.OooO00o oooO00o = o00o0o2.f8044OooO0O0;
            synchronized (o00o0o2) {
                decoderInputBuffer.f7086OooO0oO = false;
                int i4 = o00o0o2.f8060OooOOoo;
                if (i4 != o00o0o2.f8057OooOOOo) {
                    androidx.media3.common.OooOO0 oooOO1 = o00o0o2.f8045OooO0OO.OooO00o(o00o0o2.f8059OooOOo0 + i4).f8073OooO00o;
                    if (!z2 && oooOO1 == o00o0o2.f8049OooO0oO) {
                        int iOooOO0O = o00o0o2.OooOO0O(o00o0o2.f8060OooOOoo);
                        if (o00o0o2.OooOOO(iOooOO0O)) {
                            decoderInputBuffer.f33931OooO0Oo = o00o0o2.f8055OooOOO0[iOooOO0O];
                            if (o00o0o2.f8060OooOOoo == o00o0o2.f8057OooOOOo - 1 && (z || o00o0o2.f8065OooOo0o)) {
                                decoderInputBuffer.OooO0o0(536870912);
                            }
                            long j = o00o0o2.f8054OooOOO[iOooOO0O];
                            decoderInputBuffer.f7087OooO0oo = j;
                            if (j < o00o0o2.f8063OooOo00) {
                                decoderInputBuffer.OooO0o0(Integer.MIN_VALUE);
                            }
                            oooO00o.f8070OooO00o = o00o0o2.f8053OooOO0o[iOooOO0O];
                            oooO00o.f8071OooO0O0 = o00o0o2.f8052OooOO0O[iOooOO0O];
                            oooO00o.f8072OooO0OO = o00o0o2.f8056OooOOOO[iOooOO0O];
                            i2 = -4;
                        } else {
                            decoderInputBuffer.f7086OooO0oO = true;
                            i2 = -3;
                        }
                    }
                    o00o0o2.OooOOOO(oooOO1, o00o0001);
                    i2 = -5;
                } else {
                    if (!z && !o00o0o2.f8065OooOo0o) {
                        androidx.media3.common.OooOO0 oooOO2 = o00o0o2.f8066OooOoO;
                        if (oooOO2 == null || (!z2 && oooOO2 == o00o0o2.f8049OooO0oO)) {
                            i2 = -3;
                        } else {
                            o00o0o2.OooOOOO(oooOO2, o00o0001);
                            i2 = -5;
                        }
                    }
                    decoderInputBuffer.f33931OooO0Oo = 4;
                    i2 = -4;
                }
            }
            if (i2 == -4 && !decoderInputBuffer.OooO0o(4)) {
                boolean z3 = (i & 1) != 0;
                if ((i & 4) == 0) {
                    if (z3) {
                        o0OoOo0 o0oooo1 = o00o0o2.f8043OooO00o;
                        o0OoOo0.OooO0o0(o0oooo1.f8093OooO0o0, decoderInputBuffer, o00o0o2.f8044OooO0O0, o0oooo1.f8090OooO0OO);
                    } else {
                        o0OoOo0 o0oooo2 = o00o0o2.f8043OooO00o;
                        o0oooo2.f8093OooO0o0 = o0OoOo0.OooO0o0(o0oooo2.f8093OooO0o0, decoderInputBuffer, o00o0o2.f8044OooO0O0, o0oooo2.f8090OooO0OO);
                    }
                }
                if (!z3) {
                    o00o0o2.f8060OooOOoo++;
                }
            }
            if (i2 == -3) {
                oooo0.OooOoO(i3);
            }
            return i2;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int OooO0OO(long j) {
            Oooo0 oooo0 = Oooo0.this;
            int i = this.f8020OooO00o;
            int i2 = 0;
            if (!oooo0.OooOoo()) {
                oooo0.OooOoO0(i);
                o00O0O o00o0o2 = oooo0.f7983OooOo0O[i];
                boolean z = oooo0.f8000Oooo0oO;
                synchronized (o00o0o2) {
                    int iOooOO0O = o00o0o2.OooOO0O(o00o0o2.f8060OooOOoo);
                    int i3 = o00o0o2.f8060OooOOoo;
                    int i4 = o00o0o2.f8057OooOOOo;
                    if ((i3 != i4) && j >= o00o0o2.f8054OooOOO[iOooOO0O]) {
                        if (j <= o00o0o2.f8064OooOo0O || !z) {
                            int iOooO0oo = o00o0o2.OooO0oo(j, true, iOooOO0O, i4 - i3);
                            if (iOooO0oo != -1) {
                                i2 = iOooO0oo;
                            }
                        } else {
                            i2 = i4 - i3;
                        }
                    }
                }
                o00o0o2.OooOo00(i2);
                if (i2 == 0) {
                    oooo0.OooOoO(i);
                }
            }
            return i2;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean OooO0Oo() {
            Oooo0 oooo0 = Oooo0.this;
            return !oooo0.OooOoo() && oooo0.f7983OooOo0O[this.f8020OooO00o].OooOOO0(oooo0.f8000Oooo0oO);
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8022OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f8023OooO0O0;

        public OooO0o(int i, boolean z) {
            this.f8022OooO00o = i;
            this.f8023OooO0O0 = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f8022OooO00o == oooO0o.f8022OooO00o && this.f8023OooO0O0 == oooO0o.f8023OooO0O0;
        }

        public final int hashCode() {
            return (this.f8022OooO00o * 31) + (this.f8023OooO0O0 ? 1 : 0);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f7962Oooo = Collections.unmodifiableMap(map);
        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
        oooO00o.f6436OooO00o = "icy";
        oooO00o.f6445OooOO0O = "application/x-icy";
        f7963OoooO00 = oooO00o.OooO00o();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [o000O.oo000o] */
    public Oooo0(Uri uri, androidx.media3.datasource.OooO00o oooO00o, o000O.OooO00o oooO00o2, androidx.media3.exoplayer.drm.OooO0OO oooO0OO, androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o3, LoadErrorHandlingPolicy loadErrorHandlingPolicy, OooOo00.OooO00o oooO00o4, OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, @Nullable String str, int i) {
        this.f7965OooO0Oo = uri;
        this.f7967OooO0o0 = oooO00o;
        this.f7966OooO0o = oooO0OO;
        this.f7964OooO = oooO00o3;
        this.f7968OooO0oO = loadErrorHandlingPolicy;
        this.f7969OooO0oo = oooO00o4;
        this.f7970OooOO0 = oooO0O0;
        this.f7971OooOO0O = o00oo1;
        this.f7972OooOO0o = str;
        this.f7974OooOOO0 = i;
        this.f7975OooOOOO = oooO00o2;
    }

    @Override // o000OOoO.Oooo0
    public final void OooO(o000000 o000000Var) {
        this.f7979OooOOoo.post(new o0000O(1, this, o000000Var));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    @Override // androidx.media3.exoplayer.upstream.Loader.OooO00o
    public final Loader.OooO0O0 OooO00o(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
        boolean z;
        Loader.OooO0O0 oooO0O0;
        o000000 o000000Var;
        OooO00o oooO00o = (OooO00o) oooO0o;
        o000O0O.OooOOOO oooOOOO = oooO00o.f8009OooO0OO;
        Uri uri = oooOOOO.f34183OooO0OO;
        o000O.OooOo oooOo = new o000O.OooOo(oooOOOO.f34184OooO0Oo);
        o00.o000oOoO(oooO00o.f8015OooOO0);
        o00.o000oOoO(this.f7988OooOoo);
        LoadErrorHandlingPolicy.OooO00o oooO00o2 = new LoadErrorHandlingPolicy.OooO00o(iOException, i);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f7968OooO0oO;
        long jOooO00o = loadErrorHandlingPolicy.OooO00o(oooO00o2);
        if (jOooO00o == -9223372036854775807L) {
            oooO0O0 = Loader.f8254OooO0o0;
        } else {
            int iOooOo0 = OooOo0();
            int i2 = iOooOo0 > this.f7998Oooo0o ? 1 : 0;
            if (this.f7992Oooo0 || !((o000000Var = this.f7989OooOoo0) == null || o000000Var.OooO() == -9223372036854775807L)) {
                this.f7998Oooo0o = iOooOo0;
            } else {
                if (!this.f7986OooOoO0 || OooOoo()) {
                    this.f7994Oooo00O = this.f7986OooOoO0;
                    this.f7996Oooo0O0 = 0L;
                    this.f7998Oooo0o = 0;
                    for (o00O0O o00o0o2 : this.f7983OooOo0O) {
                        o00o0o2.OooOOOo(false);
                    }
                    oooO00o.f8013OooO0oO.f34713OooO00o = 0L;
                    oooO00o.f8015OooOO0 = 0L;
                    oooO00o.f8006OooO = true;
                    oooO00o.f8019OooOOO0 = false;
                } else {
                    this.f7999Oooo0o0 = true;
                    z = false;
                }
                if (z) {
                    oooO0O0 = new Loader.OooO0O0(i2, jOooO00o);
                } else {
                    oooO0O0 = Loader.f8253OooO0Oo;
                }
            }
            z = true;
            if (z) {
                oooO0O0 = new Loader.OooO0O0(i2, jOooO00o);
            } else {
                oooO0O0 = Loader.f8253OooO0Oo;
            }
        }
        int i3 = oooO0O0.f8258OooO00o;
        boolean z2 = !(i3 == 0 || i3 == 1);
        this.f7969OooO0oo.OooO0Oo(oooOo, null, oooO00o.f8015OooOO0, this.f7988OooOoo, iOException, z2);
        if (z2) {
            loadErrorHandlingPolicy.OooO0OO();
        }
        return oooO0O0;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooO0O0() {
        return OooOOOo();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0OO(long j) {
        boolean z;
        OooOo00();
        boolean[] zArr = this.f7987OooOoOO.f8003OooO0O0;
        if (!this.f7989OooOoo0.OooO0oO()) {
            j = 0;
        }
        this.f7994Oooo00O = false;
        this.f7996Oooo0O0 = j;
        if (OooOo0o()) {
            this.f7997Oooo0OO = j;
            return j;
        }
        if (this.f7991OooOooo != 7) {
            int length = this.f7983OooOo0O.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (!this.f7983OooOo0O[i].OooOOoo(j, false) && (zArr[i] || !this.f7985OooOoO)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                return j;
            }
        }
        this.f7999Oooo0o0 = false;
        this.f7997Oooo0OO = j;
        this.f8000Oooo0oO = false;
        Loader loader = this.f7973OooOOO;
        if (loader.OooO00o()) {
            for (o00O0O o00o0o2 : this.f7983OooOo0O) {
                o00o0o2.OooO0oO();
            }
            Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f8256OooO0O0;
            p080o000OoO.o00Oo0.OooO0o(oooO0OO);
            oooO0OO.OooO00o(false);
        } else {
            loader.f8257OooO0OO = null;
            for (o00O0O o00o0o3 : this.f7983OooOo0O) {
                o00o0o3.OooOOOo(false);
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0Oo(androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        androidx.media3.exoplayer.trackselection.OooO0o oooO0o;
        OooOo00();
        OooO oooO = this.f7987OooOoOO;
        o000O.oo0o0Oo oo0o0oo = oooO.f8002OooO00o;
        int i = this.f7995Oooo00o;
        int i2 = 0;
        while (true) {
            int length = oooO0oArr.length;
            zArr3 = oooO.f8004OooO0OO;
            if (i2 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i2];
            if (sampleStream != null && (oooO0oArr[i2] == null || !zArr[i2])) {
                int i3 = ((OooO0OO) sampleStream).f8020OooO00o;
                p080o000OoO.o00Oo0.OooO0Oo(zArr3[i3]);
                this.f7995Oooo00o--;
                zArr3[i3] = false;
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        boolean z = !this.f7993Oooo000 ? j == 0 : i != 0;
        for (int i4 = 0; i4 < oooO0oArr.length; i4++) {
            if (sampleStreamArr[i4] == null && (oooO0o = oooO0oArr[i4]) != null) {
                p080o000OoO.o00Oo0.OooO0Oo(oooO0o.length() == 1);
                p080o000OoO.o00Oo0.OooO0Oo(oooO0o.OooO0OO(0) == 0);
                int iIndexOf = oo0o0oo.f33895OooO0o0.indexOf(oooO0o.OooO0oo());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                p080o000OoO.o00Oo0.OooO0Oo(!zArr3[iIndexOf]);
                this.f7995Oooo00o++;
                zArr3[iIndexOf] = true;
                sampleStreamArr[i4] = new OooO0OO(iIndexOf);
                zArr2[i4] = true;
                if (!z) {
                    o00O0O o00o0o2 = this.f7983OooOo0O[iIndexOf];
                    z = (o00o0o2.OooOOoo(j, true) || o00o0o2.f8059OooOOo0 + o00o0o2.f8060OooOOoo == 0) ? false : true;
                }
            }
        }
        if (this.f7995Oooo00o == 0) {
            this.f7999Oooo0o0 = false;
            this.f7994Oooo00O = false;
            Loader loader = this.f7973OooOOO;
            if (loader.OooO00o()) {
                for (o00O0O o00o0o3 : this.f7983OooOo0O) {
                    o00o0o3.OooO0oO();
                }
                Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f8256OooO0O0;
                p080o000OoO.o00Oo0.OooO0o(oooO0OO);
                oooO0OO.OooO00o(false);
            } else {
                for (o00O0O o00o0o4 : this.f7983OooOo0O) {
                    o00o0o4.OooOOOo(false);
                }
            }
        } else if (z) {
            j = OooO0OO(j);
            for (int i5 = 0; i5 < sampleStreamArr.length; i5++) {
                if (sampleStreamArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f7993Oooo000 = true;
        return j;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0o() {
        if (!this.f7994Oooo00O) {
            return -9223372036854775807L;
        }
        if (!this.f8000Oooo0oO && OooOo0() <= this.f7998Oooo0o) {
            return -9223372036854775807L;
        }
        this.f7994Oooo00O = false;
        return this.f7996Oooo0O0;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0o0() {
        return this.f7973OooOOO.OooO00o() && this.f7976OooOOOo.OooO0OO();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooO0oO() throws IOException {
        int iOooO0O0 = this.f7968OooO0oO.OooO0O0(this.f7991OooOooo);
        Loader loader = this.f7973OooOOO;
        IOException iOException = loader.f8257OooO0OO;
        if (iOException != null) {
            throw iOException;
        }
        Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f8256OooO0O0;
        if (oooO0OO != null) {
            if (iOooO0O0 == Integer.MIN_VALUE) {
                iOooO0O0 = oooO0OO.f8261OooO0Oo;
            }
            IOException iOException2 = oooO0OO.f8265OooO0oo;
            if (iOException2 != null && oooO0OO.f8260OooO > iOooO0O0) {
                throw iOException2;
            }
        }
        if (this.f8000Oooo0oO && !this.f7986OooOoO0) {
            throw ParserException.OooO00o("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0oo(long j) {
        if (!this.f8000Oooo0oO) {
            Loader loader = this.f7973OooOOO;
            if (!(loader.f8257OooO0OO != null) && !this.f7999Oooo0o0 && (!this.f7986OooOoO0 || this.f7995Oooo00o != 0)) {
                boolean zOooO0Oo = this.f7976OooOOOo.OooO0Oo();
                if (loader.OooO00o()) {
                    return zOooO0Oo;
                }
                OooOoo0();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (java.lang.Math.abs(r7 - r18) <= java.lang.Math.abs(r9 - r18)) goto L34;
     */
    @Override // androidx.media3.exoplayer.source.OooOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long OooOO0(long j, o00OO0O0 o00oo0o1) {
        OooOo00();
        if (!this.f7989OooOoo0.OooO0oO()) {
            return 0L;
        }
        o000000.OooO00o oooO00oOooO0Oo = this.f7989OooOoo0.OooO0Oo(j);
        long j2 = oooO00oOooO0Oo.f34697OooO00o.f34702OooO00o;
        long j3 = oooO00oOooO0Oo.f34698OooO0O0.f34702OooO00o;
        long j4 = o00oo0o1.f34130OooO00o;
        long j5 = o00oo0o1.f34131OooO0O0;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i = o00.f34910OooO00o;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = LongCompanionObject.MAX_VALUE;
        }
        boolean z = j6 <= j2 && j2 <= j7;
        boolean z2 = j6 <= j3 && j3 <= j7;
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

    @Override // o000OOoO.Oooo0
    public final void OooOO0O() {
        this.f7980OooOo = true;
        this.f7979OooOOoo.post(this.f7978OooOOo0);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOO0o(OooOOO.OooO00o oooO00o, long j) {
        this.f7982OooOo00 = oooO00o;
        this.f7976OooOOOo.OooO0Oo();
        OooOoo0();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.OooO00o
    public final void OooOOO(Loader.OooO0o oooO0o, long j, long j2) {
        o000000 o000000Var;
        OooO00o oooO00o = (OooO00o) oooO0o;
        if (this.f7988OooOoo == -9223372036854775807L && (o000000Var = this.f7989OooOoo0) != null) {
            boolean zOooO0oO = o000000Var.OooO0oO();
            long jOooOo0O = OooOo0O(true);
            long j3 = jOooOo0O == Long.MIN_VALUE ? 0L : jOooOo0O + 10000;
            this.f7988OooOoo = j3;
            ((o000oOoO) this.f7970OooOO0).OooOo0(j3, zOooO0oO, this.f7990OooOooO);
        }
        o000O0O.OooOOOO oooOOOO = oooO00o.f8009OooO0OO;
        Uri uri = oooOOOO.f34183OooO0OO;
        o000O.OooOo oooOo = new o000O.OooOo(oooOOOO.f34184OooO0Oo);
        this.f7968OooO0oO.OooO0OO();
        long j4 = oooO00o.f8015OooOO0;
        long j5 = this.f7988OooOoo;
        OooOo00.OooO00o oooO00o2 = this.f7969OooO0oo;
        oooO00o2.getClass();
        oooO00o2.OooO0OO(oooOo, new o000O.Oooo000(1, -1, null, 0, null, o00.o000oOoO(j4), o00.o000oOoO(j5)));
        this.f8000Oooo0oO = true;
        OooOOO.OooO00o oooO00o3 = this.f7982OooOo00;
        oooO00o3.getClass();
        oooO00o3.OooO(this);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final o000O.oo0o0Oo OooOOO0() {
        OooOo00();
        return this.f7987OooOoOO.f8002OooO00o;
    }

    @Override // o000OOoO.Oooo0
    public final TrackOutput OooOOOO(int i, int i2) {
        return OooOoOO(new OooO0o(i, false));
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooOOOo() {
        long jOooOo0O;
        boolean z;
        OooOo00();
        if (this.f8000Oooo0oO || this.f7995Oooo00o == 0) {
            return Long.MIN_VALUE;
        }
        if (OooOo0o()) {
            return this.f7997Oooo0OO;
        }
        if (this.f7985OooOoO) {
            int length = this.f7983OooOo0O.length;
            jOooOo0O = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                OooO oooO = this.f7987OooOoOO;
                if (oooO.f8003OooO0O0[i] && oooO.f8004OooO0OO[i]) {
                    o00O0O o00o0o2 = this.f7983OooOo0O[i];
                    synchronized (o00o0o2) {
                        z = o00o0o2.f8065OooOo0o;
                    }
                    if (!z) {
                        jOooOo0O = Math.min(jOooOo0O, this.f7983OooOo0O[i].OooO());
                    }
                }
            }
        } else {
            jOooOo0O = Long.MAX_VALUE;
        }
        if (jOooOo0O == LongCompanionObject.MAX_VALUE) {
            jOooOo0O = OooOo0O(false);
        }
        return jOooOo0O == Long.MIN_VALUE ? this.f7996Oooo0O0 : jOooOo0O;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final void OooOOo(long j) {
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOOo0(long j, boolean z) {
        long jOooO0o;
        int i;
        OooOo00();
        if (OooOo0o()) {
            return;
        }
        boolean[] zArr = this.f7987OooOoOO.f8004OooO0OO;
        int length = this.f7983OooOo0O.length;
        for (int i2 = 0; i2 < length; i2++) {
            o00O0O o00o0o2 = this.f7983OooOo0O[i2];
            boolean z2 = zArr[i2];
            o0OoOo0 o0oooo1 = o00o0o2.f8043OooO00o;
            synchronized (o00o0o2) {
                int i3 = o00o0o2.f8057OooOOOo;
                if (i3 != 0) {
                    long[] jArr = o00o0o2.f8054OooOOO;
                    int i4 = o00o0o2.f8058OooOOo;
                    if (j >= jArr[i4]) {
                        int iOooO0oo = o00o0o2.OooO0oo(j, z, i4, (!z2 || (i = o00o0o2.f8060OooOOoo) == i3) ? i3 : i + 1);
                        jOooO0o = iOooO0oo == -1 ? -1L : o00o0o2.OooO0o(iOooO0oo);
                    }
                }
            }
            o0oooo1.OooO00o(jOooO0o);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.OooO00o
    public final void OooOOoo(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
        OooO00o oooO00o = (OooO00o) oooO0o;
        o000O0O.OooOOOO oooOOOO = oooO00o.f8009OooO0OO;
        Uri uri = oooOOOO.f34183OooO0OO;
        o000O.OooOo oooOo = new o000O.OooOo(oooOOOO.f34184OooO0Oo);
        this.f7968OooO0oO.OooO0OO();
        long j3 = oooO00o.f8015OooOO0;
        long j4 = this.f7988OooOoo;
        OooOo00.OooO00o oooO00o2 = this.f7969OooO0oo;
        oooO00o2.getClass();
        oooO00o2.OooO0O0(oooOo, new o000O.Oooo000(1, -1, null, 0, null, o00.o000oOoO(j3), o00.o000oOoO(j4)));
        if (z) {
            return;
        }
        for (o00O0O o00o0o2 : this.f7983OooOo0O) {
            o00o0o2.OooOOOo(false);
        }
        if (this.f7995Oooo00o > 0) {
            OooOOO.OooO00o oooO00o3 = this.f7982OooOo00;
            oooO00o3.getClass();
            oooO00o3.OooO(this);
        }
    }

    public final void OooOo() {
        int i;
        androidx.media3.common.OooOO0 oooOO1;
        if (this.f8001Oooo0oo || this.f7986OooOoO0 || !this.f7980OooOo || this.f7989OooOoo0 == null) {
            return;
        }
        for (o00O0O o00o0o2 : this.f7983OooOo0O) {
            synchronized (o00o0o2) {
                oooOO1 = o00o0o2.f8067OooOoO0 ? null : o00o0o2.f8066OooOoO;
            }
            if (oooOO1 == null) {
                return;
            }
        }
        this.f7976OooOOOo.OooO0O0();
        int length = this.f7983OooOo0O.length;
        androidx.media3.common.o000oOoO[] o000ooooArr = new androidx.media3.common.o000oOoO[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            androidx.media3.common.OooOO0 oooOO0OooOO0o = this.f7983OooOo0O[i2].OooOO0o();
            oooOO0OooOO0o.getClass();
            String str = oooOO0OooOO0o.f6412OooOOOO;
            boolean zOooO0oo = o0000oo.OooO0oo(str);
            boolean z = zOooO0oo || o0000oo.OooOO0(str);
            zArr[i2] = z;
            this.f7985OooOoO = z | this.f7985OooOoO;
            IcyHeaders icyHeaders = this.f7981OooOo0;
            if (icyHeaders != null) {
                if (zOooO0oo || this.f7984OooOo0o[i2].f8023OooO0O0) {
                    Metadata metadata = oooOO0OooOO0o.f6411OooOOO0;
                    Metadata metadata2 = metadata == null ? new Metadata(icyHeaders) : metadata.OooO00o(icyHeaders);
                    androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o(oooOO0OooOO0o);
                    oooO00o.f6435OooO = metadata2;
                    oooOO0OooOO0o = new androidx.media3.common.OooOO0(oooO00o);
                }
                if (zOooO0oo && oooOO0OooOO0o.f6401OooO == -1 && oooOO0OooOO0o.f6407OooOO0 == -1 && (i = icyHeaders.f8442OooO0Oo) != -1) {
                    androidx.media3.common.OooOO0.OooO00o oooO00o2 = new androidx.media3.common.OooOO0.OooO00o(oooOO0OooOO0o);
                    oooO00o2.f6440OooO0o = i;
                    oooOO0OooOO0o = new androidx.media3.common.OooOO0(oooO00o2);
                }
            }
            int iOooO0OO = this.f7966OooO0o.OooO0OO(oooOO0OooOO0o);
            androidx.media3.common.OooOO0.OooO00o oooO00oOooO0OO = oooOO0OooOO0o.OooO0OO();
            oooO00oOooO0OO.f6466Oooo000 = iOooO0OO;
            o000ooooArr[i2] = new androidx.media3.common.o000oOoO(Integer.toString(i2), oooO00oOooO0OO.OooO00o());
        }
        this.f7987OooOoOO = new OooO(new o000O.oo0o0Oo(o000ooooArr), zArr);
        this.f7986OooOoO0 = true;
        OooOOO.OooO00o oooO00o3 = this.f7982OooOo00;
        oooO00o3.getClass();
        oooO00o3.OooO00o(this);
    }

    public final int OooOo0() {
        int i = 0;
        for (o00O0O o00o0o2 : this.f7983OooOo0O) {
            i += o00o0o2.f8059OooOOo0 + o00o0o2.f8057OooOOOo;
        }
        return i;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void OooOo00() {
        p080o000OoO.o00Oo0.OooO0Oo(this.f7986OooOoO0);
        this.f7987OooOoOO.getClass();
        this.f7989OooOoo0.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long OooOo0O(boolean z) {
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.f7983OooOo0O.length; i++) {
            if (z) {
                jMax = Math.max(jMax, this.f7983OooOo0O[i].OooO());
            } else {
                OooO oooO = this.f7987OooOoOO;
                oooO.getClass();
                if (oooO.f8004OooO0OO[i]) {
                    jMax = Math.max(jMax, this.f7983OooOo0O[i].OooO());
                }
            }
        }
        return jMax;
    }

    public final boolean OooOo0o() {
        return this.f7997Oooo0OO != -9223372036854775807L;
    }

    public final void OooOoO(int i) {
        OooOo00();
        boolean[] zArr = this.f7987OooOoOO.f8003OooO0O0;
        if (this.f7999Oooo0o0 && zArr[i] && !this.f7983OooOo0O[i].OooOOO0(false)) {
            this.f7997Oooo0OO = 0L;
            this.f7999Oooo0o0 = false;
            this.f7994Oooo00O = true;
            this.f7996Oooo0O0 = 0L;
            this.f7998Oooo0o = 0;
            for (o00O0O o00o0o2 : this.f7983OooOo0O) {
                o00o0o2.OooOOOo(false);
            }
            OooOOO.OooO00o oooO00o = this.f7982OooOo00;
            oooO00o.getClass();
            oooO00o.OooO(this);
        }
    }

    public final void OooOoO0(int i) {
        OooOo00();
        OooO oooO = this.f7987OooOoOO;
        boolean[] zArr = oooO.f8005OooO0Oo;
        if (zArr[i]) {
            return;
        }
        androidx.media3.common.OooOO0 oooOO1 = oooO.f8002OooO00o.OooO0OO(i).f6768OooO0oO[0];
        int iOooO0oO = o0000oo.OooO0oO(oooOO1.f6412OooOOOO);
        long j = this.f7996Oooo0O0;
        OooOo00.OooO00o oooO00o = this.f7969OooO0oo;
        oooO00o.getClass();
        oooO00o.OooO00o(new o000O.Oooo000(1, iOooO0oO, oooOO1, 0, null, o00.o000oOoO(j), -9223372036854775807L));
        zArr[i] = true;
    }

    public final o00O0O OooOoOO(OooO0o oooO0o) {
        int length = this.f7983OooOo0O.length;
        for (int i = 0; i < length; i++) {
            if (oooO0o.equals(this.f7984OooOo0o[i])) {
                return this.f7983OooOo0O[i];
            }
        }
        androidx.media3.exoplayer.drm.OooO0OO oooO0OO = this.f7966OooO0o;
        oooO0OO.getClass();
        androidx.media3.exoplayer.drm.OooO0O0.OooO00o oooO00o = this.f7964OooO;
        oooO00o.getClass();
        o00O0O o00o0o2 = new o00O0O(this.f7971OooOO0O, oooO0OO, oooO00o);
        o00o0o2.f8047OooO0o = this;
        int i2 = length + 1;
        OooO0o[] oooO0oArr = (OooO0o[]) Arrays.copyOf(this.f7984OooOo0o, i2);
        oooO0oArr[length] = oooO0o;
        this.f7984OooOo0o = oooO0oArr;
        o00O0O[] o00o0oArr = (o00O0O[]) Arrays.copyOf(this.f7983OooOo0O, i2);
        o00o0oArr[length] = o00o0o2;
        this.f7983OooOo0O = o00o0oArr;
        return o00o0o2;
    }

    public final boolean OooOoo() {
        return this.f7994Oooo00O || OooOo0o();
    }

    public final void OooOoo0() {
        OooO00o oooO00o = new OooO00o(this.f7965OooO0Oo, this.f7967OooO0o0, this.f7975OooOOOO, this, this.f7976OooOOOo);
        if (this.f7986OooOoO0) {
            p080o000OoO.o00Oo0.OooO0Oo(OooOo0o());
            long j = this.f7988OooOoo;
            if (j != -9223372036854775807L && this.f7997Oooo0OO > j) {
                this.f8000Oooo0oO = true;
                this.f7997Oooo0OO = -9223372036854775807L;
                return;
            }
            o000000 o000000Var = this.f7989OooOoo0;
            o000000Var.getClass();
            long j2 = o000000Var.OooO0Oo(this.f7997Oooo0OO).f34697OooO00o.f34703OooO0O0;
            long j3 = this.f7997Oooo0OO;
            oooO00o.f8013OooO0oO.f34713OooO00o = j2;
            oooO00o.f8015OooOO0 = j3;
            oooO00o.f8006OooO = true;
            oooO00o.f8019OooOOO0 = false;
            for (o00O0O o00o0o2 : this.f7983OooOo0O) {
                o00o0o2.f8063OooOo00 = this.f7997Oooo0OO;
            }
            this.f7997Oooo0OO = -9223372036854775807L;
        }
        this.f7998Oooo0o = OooOo0();
        o000O.OooOo oooOo = new o000O.OooOo(oooO00o.f8007OooO00o, oooO00o.f8016OooOO0O, this.f7973OooOOO.OooO0O0(oooO00o, this, this.f7968OooO0oO.OooO0O0(this.f7991OooOooo)));
        long j4 = oooO00o.f8015OooOO0;
        long j5 = this.f7988OooOoo;
        OooOo00.OooO00o oooO00o2 = this.f7969OooO0oo;
        oooO00o2.getClass();
        oooO00o2.OooO0o(oooOo, new o000O.Oooo000(1, -1, null, 0, null, o00.o000oOoO(j4), o00.o000oOoO(j5)));
    }
}
