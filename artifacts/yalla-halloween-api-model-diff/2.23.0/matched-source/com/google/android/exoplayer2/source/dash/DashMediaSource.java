package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOOO;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Log;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.LongCompanionObject;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o00OOO0;
import p207o00o0oOo.o0O00O0o;
import p226o00oOo00.o0000;
import p226o00oOo00.o000OOo;
import p227o00oOo0O.OooOo;
import p227o00oOo0O.OooOo00;
import p227o00oOo0O.Oooo000;
import p227o00oOo0O.o0OoOo0;
import p228o00oOo0o.o00000;
import p228o00oOo0o.o00O0O;
import p228o00oOo0o.o00Ooo;
import p228o00oOo0o.o0OOO0o;
import p228o00oOo0o.o0ooOOo;
import p228o00oOo0o.oo000o;
import p235o00oOooO.o00OO0OO;
import p244o00oo0Oo.o000OO0O;
import p244o00oo0Oo.o000OOo0;
import p244o00oo0Oo.o00O0O0;
import p244o00oo0Oo.o00O0OO0;
import p244o00oo0Oo.o00oOoo;
import p244o00oo0Oo.oo00o;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p245o00oo0o.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class DashMediaSource extends com.google.android.exoplayer2.source.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final /* synthetic */ int f13189Oooo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f13190OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000oOoO f13191OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13192OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.dash.OooO00o.InterfaceC0210OooO00o f13193OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o000OOo f13194OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f13195OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0OO f13196OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooOo00 f13197OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final long f13198OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooOO0.OooO00o<? extends o00Ooo> f13199OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.OooOo00.OooO00o f13200OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final OooO f13201OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0OO f13202OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final SparseArray<DashMediaPeriod> f13203OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Object f13204OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final OooOo f13205OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final p075o000OOo.OooO0O0 f13206OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public com.google.android.exoplayer2.upstream.OooO00o f13207OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oo00o f13208OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Loader f13209OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public DashManifestStaleException f13210OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public o00O0OO0 f13211OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Handler f13212OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public o000oOoO.OooOO0 f13213OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f13214Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Uri f13215Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Uri f13216Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public o00Ooo f13217Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public long f13218Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public long f13219Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f13220Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public long f13221Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f13222Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f13223Oooo0oo;

    public static final class Factory implements OooOOOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.dash.OooO00o.InterfaceC0210OooO00o f13224OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13225OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o0O00O0o f13226OooO0OO = new com.google.android.exoplayer2.drm.OooO00o();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public LoadErrorHandlingPolicy f13229OooO0o0 = new com.google.android.exoplayer2.upstream.OooO();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f13228OooO0o = 30000;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000OOo f13227OooO0Oo = new o000OOo();

        public Factory(com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o) {
            this.f13224OooO00o = new com.google.android.exoplayer2.source.dash.OooO0O0.OooO00o(interfaceC0215OooO00o);
            this.f13225OooO0O0 = interfaceC0215OooO00o;
        }

        @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
        public final OooOOOO OooO00o(o000oOoO o000oooo2) {
            o000oooo2.f12670OooO0o0.getClass();
            oo000o oo000oVar = new oo000o();
            List<StreamKey> list = o000oooo2.f12670OooO0o0.f12763OooO0oo;
            return new DashMediaSource(o000oooo2, this.f13225OooO0O0, !list.isEmpty() ? new p224o00oOOoO.oo00o(oo000oVar, list) : oo000oVar, this.f13224OooO00o, this.f13227OooO0Oo, this.f13226OooO0OO.OooO00o(o000oooo2), this.f13229OooO0o0, this.f13228OooO0o);
        }

        @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
        @CanIgnoreReturnValue
        public final OooOOOO.OooO00o OooO0O0(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f13229OooO0o0 = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
        public final OooOOOO.OooO00o OooO0OO(o000OOo0 o000ooo1) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.OooOOOO.OooO00o
        @CanIgnoreReturnValue
        public final OooOOOO.OooO00o OooO0Oo(o0O00O0o o0o00o0o) {
            if (o0o00o0o == null) {
                throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            }
            this.f13226OooO0OO = o0o00o0o;
            return this;
        }
    }

    public final class OooO implements Loader.OooO00o<com.google.android.exoplayer2.upstream.OooOO0<o00Ooo>> {
        public OooO() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final void OooO0Oo(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
            DashMediaSource.this.OooOo0O((com.google.android.exoplayer2.upstream.OooOO0) oooO0o, j, j2);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d7  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final void OooO0o(Loader.OooO0o oooO0o, long j, long j2) {
            boolean z;
            int i;
            com.google.android.exoplayer2.upstream.OooOO0 oooOO1 = (com.google.android.exoplayer2.upstream.OooOO0) oooO0o;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j3 = oooOO1.f14246OooO00o;
            o00O0O0 o00o0o0 = oooOO1.f14249OooO0Oo;
            Uri uri = o00o0o0.f40517OooO0OO;
            o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
            dashMediaSource.f13195OooOOO.OooO0Oo();
            dashMediaSource.f13200OooOOo0.OooO0o0(o0000Var, oooOO1.f14248OooO0OO, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            o00Ooo o00ooo2 = (o00Ooo) oooOO1.f14250OooO0o;
            o00Ooo o00ooo3 = dashMediaSource.f13217Oooo00o;
            int iOooO0OO = o00ooo3 == null ? 0 : o00ooo3.OooO0OO();
            long j4 = o00ooo2.OooO0O0(0).f39977OooO0O0;
            int i2 = 0;
            while (i2 < iOooO0OO && dashMediaSource.f13217Oooo00o.OooO0O0(i2).f39977OooO0O0 < j4) {
                i2++;
            }
            if (o00ooo2.f39943OooO0Oo) {
                if (iOooO0OO - i2 > o00ooo2.OooO0OO()) {
                    Log.OooO0o("DashMediaSource", "Loaded out of sync manifest");
                } else {
                    long j5 = dashMediaSource.f13222Oooo0oO;
                    if (j5 == -9223372036854775807L || o00ooo2.f39947OooO0oo * 1000 > j5) {
                        z = false;
                    } else {
                        Log.OooO0o("DashMediaSource", "Loaded stale dynamic manifest: " + o00ooo2.f39947OooO0oo + ", " + dashMediaSource.f13222Oooo0oO);
                    }
                    if (z) {
                        i = dashMediaSource.f13220Oooo0o;
                        dashMediaSource.f13220Oooo0o = i + 1;
                        if (i < dashMediaSource.f13195OooOOO.OooO0O0(oooOO1.f14248OooO0OO)) {
                            dashMediaSource.f13212OooOooO.postDelayed(dashMediaSource.f13205OooOo0O, Math.min((dashMediaSource.f13220Oooo0o - 1) * 1000, 5000));
                            return;
                        } else {
                            dashMediaSource.f13210OooOoo = new DashManifestStaleException();
                            return;
                        }
                    }
                    dashMediaSource.f13220Oooo0o = 0;
                }
                z = true;
                if (z) {
                    i = dashMediaSource.f13220Oooo0o;
                    dashMediaSource.f13220Oooo0o = i + 1;
                    if (i < dashMediaSource.f13195OooOOO.OooO0O0(oooOO1.f14248OooO0OO)) {
                        dashMediaSource.f13212OooOooO.postDelayed(dashMediaSource.f13205OooOo0O, Math.min((dashMediaSource.f13220Oooo0o - 1) * 1000, 5000));
                        return;
                    } else {
                        dashMediaSource.f13210OooOoo = new DashManifestStaleException();
                        return;
                    }
                }
                dashMediaSource.f13220Oooo0o = 0;
            }
            dashMediaSource.f13217Oooo00o = o00ooo2;
            dashMediaSource.f13214Oooo0 = o00ooo2.f39943OooO0Oo & dashMediaSource.f13214Oooo0;
            dashMediaSource.f13218Oooo0O0 = j - j2;
            dashMediaSource.f13219Oooo0OO = j;
            synchronized (dashMediaSource.f13204OooOo00) {
                if (oooOO1.f14247OooO0O0.f14161OooO00o == dashMediaSource.f13215Oooo000) {
                    Uri uri2 = dashMediaSource.f13217Oooo00o.f39949OooOO0O;
                    if (uri2 == null) {
                        uri2 = oooOO1.f14249OooO0Oo.f40517OooO0OO;
                    }
                    dashMediaSource.f13215Oooo000 = uri2;
                }
            }
            if (iOooO0OO != 0) {
                dashMediaSource.f13223Oooo0oo += i2;
                dashMediaSource.OooOo0o(true);
                return;
            }
            o00Ooo o00ooo4 = dashMediaSource.f13217Oooo00o;
            if (!o00ooo4.f39943OooO0Oo) {
                dashMediaSource.OooOo0o(true);
                return;
            }
            o00000 o00000Var = o00ooo4.f39939OooO;
            if (o00000Var == null) {
                dashMediaSource.OooOo0();
                return;
            }
            String str = o00000Var.f39917OooO00o;
            if (o0O00.OooO00o(str, "urn:mpeg:dash:utc:direct:2014") || o0O00.OooO00o(str, "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    dashMediaSource.f13221Oooo0o0 = o0O00.Oooo0o(o00000Var.f39918OooO0O0) - dashMediaSource.f13219Oooo0OO;
                    dashMediaSource.OooOo0o(true);
                    return;
                } catch (ParserException e) {
                    Log.OooO0Oo("DashMediaSource", "Failed to resolve time offset.", e);
                    dashMediaSource.OooOo0o(true);
                    return;
                }
            }
            if (o0O00.OooO00o(str, "urn:mpeg:dash:utc:http-iso:2014") || o0O00.OooO00o(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                dashMediaSource.OooOo(new com.google.android.exoplayer2.upstream.OooOO0(dashMediaSource.f13207OooOoO, Uri.parse(o00000Var.f39918OooO0O0), 5, new OooO0o()), dashMediaSource.new OooOO0O(), 1);
                return;
            }
            if (o0O00.OooO00o(str, "urn:mpeg:dash:utc:http-xsdate:2014") || o0O00.OooO00o(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                dashMediaSource.OooOo(new com.google.android.exoplayer2.upstream.OooOO0(dashMediaSource.f13207OooOoO, Uri.parse(o00000Var.f39918OooO0O0), 5, new OooOOO0()), dashMediaSource.new OooOO0O(), 1);
            } else if (o0O00.OooO00o(str, "urn:mpeg:dash:utc:ntp:2014") || o0O00.OooO00o(str, "urn:mpeg:dash:utc:ntp:2012")) {
                dashMediaSource.OooOo0();
            } else {
                Log.OooO0Oo("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                dashMediaSource.OooOo0o(true);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final Loader.OooO0O0 OooOO0o(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
            com.google.android.exoplayer2.upstream.OooOO0 oooOO1 = (com.google.android.exoplayer2.upstream.OooOO0) oooO0o;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j3 = oooOO1.f14246OooO00o;
            o00O0O0 o00o0o0 = oooOO1.f14249OooO0Oo;
            Uri uri = o00o0o0.f40517OooO0OO;
            o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
            int i2 = oooOO1.f14248OooO0OO;
            LoadErrorHandlingPolicy.OooO0OO oooO0OO = new LoadErrorHandlingPolicy.OooO0OO(iOException, i);
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = dashMediaSource.f13195OooOOO;
            long jOooO00o = loadErrorHandlingPolicy.OooO00o(oooO0OO);
            Loader.OooO0O0 oooO0O0 = jOooO00o == -9223372036854775807L ? Loader.f14193OooO0o0 : new Loader.OooO0O0(0, jOooO00o);
            int i3 = oooO0O0.f14197OooO00o;
            boolean z = !(i3 == 0 || i3 == 1);
            dashMediaSource.f13200OooOOo0.OooO0oO(o0000Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
            if (z) {
                loadErrorHandlingPolicy.OooO0Oo();
            }
            return oooO0O0;
        }
    }

    public class OooO00o implements oo00oO.OooO00o {
        public OooO00o() {
        }

        public final void OooO00o() {
            long j;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            synchronized (oo00oO.f40636OooO0O0) {
                j = oo00oO.f40637OooO0OO ? oo00oO.f40638OooO0Oo : -9223372036854775807L;
            }
            dashMediaSource.f13221Oooo0o0 = j;
            dashMediaSource.OooOo0o(true);
        }
    }

    public static final class OooO0O0 extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f13232OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final long f13233OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f13234OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f13235OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final long f13236OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final long f13237OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final long f13238OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final o00Ooo f13239OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final o000oOoO f13240OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public final o000oOoO.OooOO0 f13241OooOOo0;

        public OooO0O0(long j, long j2, long j3, int i, long j4, long j5, long j6, o00Ooo o00ooo2, o000oOoO o000oooo2, @Nullable o000oOoO.OooOO0 oooOO1) {
            o00O000o.OooO0Oo(o00ooo2.f39943OooO0Oo == (oooOO1 != null));
            this.f13233OooO0oo = j;
            this.f13232OooO = j2;
            this.f13234OooOO0 = j3;
            this.f13235OooOO0O = i;
            this.f13236OooOO0o = j4;
            this.f13238OooOOO0 = j5;
            this.f13237OooOOO = j6;
            this.f13239OooOOOO = o00ooo2;
            this.f13240OooOOOo = o000oooo2;
            this.f13241OooOOo0 = oooOO1;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooO() {
            return this.f13239OooOOOO.OooO0OO();
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooO0O0(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f13235OooOO0O) >= 0 && iIntValue < OooO()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0O0 OooO0oO(int i, oo0o0Oo.OooO0O0 oooO0O0, boolean z) {
            o00O000o.OooO0OO(i, OooO());
            o00Ooo o00ooo2 = this.f13239OooOOOO;
            String str = z ? o00ooo2.OooO0O0(i).f39976OooO00o : null;
            Integer numValueOf = z ? Integer.valueOf(this.f13235OooOO0O + i) : null;
            long jOooO0o0 = o00ooo2.OooO0o0(i);
            long jOooo0O0 = o0O00.Oooo0O0(o00ooo2.OooO0O0(i).f39977OooO0O0 - o00ooo2.OooO0O0(0).f39977OooO0O0) - this.f13236OooOO0o;
            oooO0O0.getClass();
            oooO0O0.OooOO0(str, numValueOf, 0, jOooO0o0, jOooo0O0, AdPlaybackState.f13125OooOO0, false);
            return oooO0O0;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final Object OooOOO0(int i) {
            o00O000o.OooO0OO(i, OooO());
            return Integer.valueOf(this.f13235OooOO0O + i);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0028 A[PHI: r8
          0x0028: PHI (r8v5 long) = (r8v0 long), (r8v1 long), (r8v1 long), (r8v1 long) binds: [B:11:0x0026, B:31:0x007a, B:34:0x0091, B:36:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r8
          0x003c: PHI (r8v1 long) = (r8v0 long), (r8v2 long) binds: [B:14:0x002f, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x0066  */
        /* JADX WARN: Code duplicated, block: B:29:0x0074 A[LOOP:1: B:25:0x0064->B:29:0x0074, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:51:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x007a A[EDGE_INSN: B:52:0x007a->B:31:0x007a BREAK  A[LOOP:1: B:25:0x0064->B:29:0x0074], SYNTHETIC] */
        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0OO OooOOOO(int i, oo0o0Oo.OooO0OO oooO0OO, long j) {
            long j2;
            long jOooO0o0;
            int i2;
            List<o00O0O> list;
            int size;
            int i3;
            Oooo000 oooo000OooOO0o;
            long jOooO00o;
            o00O000o.OooO0OO(i, 1);
            o00Ooo o00ooo2 = this.f13239OooOOOO;
            boolean z = o00ooo2.f39943OooO0Oo && o00ooo2.f39945OooO0o0 != -9223372036854775807L && o00ooo2.f39941OooO0O0 == -9223372036854775807L;
            long j3 = this.f13237OooOOO;
            if (!z) {
                jOooO00o = j3;
            } else if (j > 0) {
                j3 += j;
                if (j3 > this.f13238OooOOO0) {
                    jOooO00o = -9223372036854775807L;
                } else {
                    j2 = this.f13236OooOO0o + j3;
                    jOooO0o0 = o00ooo2.OooO0o0(0);
                    i2 = 0;
                    while (i2 < o00ooo2.OooO0OO() - 1 && j2 >= jOooO0o0) {
                        j2 -= jOooO0o0;
                        i2++;
                        jOooO0o0 = o00ooo2.OooO0o0(i2);
                    }
                    o0OOO0o o0ooo0oOooO0O0 = o00ooo2.OooO0O0(i2);
                    list = o0ooo0oOooO0O0.f39978OooO0OO;
                    size = list.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            i3 = -1;
                            break;
                        }
                        if (list.get(i3).f39930OooO0O0 == 2) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1 || (oooo000OooOO0o = o0ooo0oOooO0O0.f39978OooO0OO.get(i3).f39931OooO0OO.get(0).OooOO0o()) == null || oooo000OooOO0o.OooO0oO(jOooO0o0) == 0) {
                        jOooO00o = j3;
                    } else {
                        jOooO00o = (oooo000OooOO0o.OooO00o(oooo000OooOO0o.OooO0o(j2, jOooO0o0)) + j3) - j2;
                    }
                }
            } else {
                j2 = this.f13236OooOO0o + j3;
                jOooO0o0 = o00ooo2.OooO0o0(0);
                i2 = 0;
                while (i2 < o00ooo2.OooO0OO() - 1) {
                    j2 -= jOooO0o0;
                    i2++;
                    jOooO0o0 = o00ooo2.OooO0o0(i2);
                }
                o0OOO0o o0ooo0oOooO0O1 = o00ooo2.OooO0O0(i2);
                list = o0ooo0oOooO0O1.f39978OooO0OO;
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        i3 = -1;
                        break;
                    }
                    if (list.get(i3).f39930OooO0O0 == 2) {
                        break;
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    jOooO00o = j3;
                } else {
                    jOooO00o = (oooo000OooOO0o.OooO00o(oooo000OooOO0o.OooO0o(j2, jOooO0o0)) + j3) - j2;
                }
            }
            oooO0OO.OooO0O0(oo0o0Oo.OooO0OO.f12912OooOo0, this.f13240OooOOOo, o00ooo2, this.f13233OooO0oo, this.f13232OooO, this.f13234OooOO0, true, o00ooo2.f39943OooO0Oo && o00ooo2.f39945OooO0o0 != -9223372036854775807L && o00ooo2.f39941OooO0O0 == -9223372036854775807L, this.f13241OooOOo0, jOooO00o, this.f13238OooOOO0, 0, OooO() - 1, this.f13236OooOO0o);
            return oooO0OO;
        }

        @Override // com.google.android.exoplayer2.oo0o0Oo
        public final int OooOOOo() {
            return 1;
        }
    }

    public final class OooO0OO implements com.google.android.exoplayer2.source.dash.OooO0OO.OooO0O0 {
        public OooO0OO() {
        }
    }

    public static final class OooO0o implements com.google.android.exoplayer2.upstream.OooOO0.OooO00o<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Pattern f13243OooO0Oo = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.google.android.exoplayer2.upstream.OooOO0.OooO00o
        public final Object OooO00o(Uri uri, o00oOoo o00oooo2) throws IOException {
            String line = new BufferedReader(new InputStreamReader(o00oooo2, com.google.common.base.OooO.f19059OooO0OO)).readLine();
            try {
                Matcher matcher = f13243OooO0Oo.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.OooO0O0("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= ((((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000) * j;
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw ParserException.OooO0O0(null, e);
            }
        }
    }

    public final class OooOO0 implements oo00o {
        public OooOO0() {
        }

        @Override // p244o00oo0Oo.oo00o
        public final void OooO00o() throws IOException {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.f13209OooOoOO.OooO00o();
            DashManifestStaleException dashManifestStaleException = dashMediaSource.f13210OooOoo;
            if (dashManifestStaleException != null) {
                throw dashManifestStaleException;
            }
        }
    }

    public final class OooOO0O implements Loader.OooO00o<com.google.android.exoplayer2.upstream.OooOO0<Long>> {
        public OooOO0O() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final void OooO0Oo(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
            DashMediaSource.this.OooOo0O((com.google.android.exoplayer2.upstream.OooOO0) oooO0o, j, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final void OooO0o(Loader.OooO0o oooO0o, long j, long j2) {
            com.google.android.exoplayer2.upstream.OooOO0 oooOO1 = (com.google.android.exoplayer2.upstream.OooOO0) oooO0o;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j3 = oooOO1.f14246OooO00o;
            o00O0O0 o00o0o0 = oooOO1.f14249OooO0Oo;
            Uri uri = o00o0o0.f40517OooO0OO;
            o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
            dashMediaSource.f13195OooOOO.OooO0Oo();
            dashMediaSource.f13200OooOOo0.OooO0o0(o0000Var, oooOO1.f14248OooO0OO, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
            dashMediaSource.f13221Oooo0o0 = ((Long) oooOO1.f14250OooO0o).longValue() - j;
            dashMediaSource.OooOo0o(true);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final Loader.OooO0O0 OooOO0o(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
            com.google.android.exoplayer2.upstream.OooOO0 oooOO1 = (com.google.android.exoplayer2.upstream.OooOO0) oooO0o;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j3 = oooOO1.f14246OooO00o;
            o00O0O0 o00o0o0 = oooOO1.f14249OooO0Oo;
            Uri uri = o00o0o0.f40517OooO0OO;
            dashMediaSource.f13200OooOOo0.OooO0oO(new o0000(o00o0o0.f40518OooO0Oo), oooOO1.f14248OooO0OO, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
            dashMediaSource.f13195OooOOO.OooO0Oo();
            Log.OooO0Oo("DashMediaSource", "Failed to resolve time offset.", iOException);
            dashMediaSource.OooOo0o(true);
            return Loader.f14192OooO0Oo;
        }
    }

    public static final class OooOOO0 implements com.google.android.exoplayer2.upstream.OooOO0.OooO00o<Long> {
        @Override // com.google.android.exoplayer2.upstream.OooOO0.OooO00o
        public final Object OooO00o(Uri uri, o00oOoo o00oooo2) throws IOException {
            return Long.valueOf(o0O00.Oooo0o(new BufferedReader(new InputStreamReader(o00oooo2)).readLine()));
        }
    }

    static {
        o00OOO0.OooO00o("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [o00oOo0O.OooOo] */
    public DashMediaSource(o000oOoO o000oooo2, com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o, com.google.android.exoplayer2.upstream.OooOO0.OooO00o oooO00o, com.google.android.exoplayer2.source.dash.OooO00o.InterfaceC0210OooO00o interfaceC0210OooO00o, o000OOo o000ooo2, com.google.android.exoplayer2.drm.OooO0OO oooO0OO, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
        this.f13191OooO0oo = o000oooo2;
        this.f13213OooOooo = o000oooo2.f12669OooO0o;
        o000oOoO.OooOO0O oooOO0O = o000oooo2.f12670OooO0o0;
        oooOO0O.getClass();
        Uri uri = oooOO0O.f12759OooO0Oo;
        this.f13215Oooo000 = uri;
        this.f13216Oooo00O = uri;
        this.f13217Oooo00o = null;
        this.f13192OooOO0 = interfaceC0215OooO00o;
        this.f13199OooOOo = oooO00o;
        this.f13193OooOO0O = interfaceC0210OooO00o;
        this.f13196OooOOO0 = oooO0OO;
        this.f13195OooOOO = loadErrorHandlingPolicy;
        this.f13198OooOOOo = j;
        this.f13194OooOO0o = o000ooo2;
        this.f13197OooOOOO = new OooOo00();
        this.f13190OooO = false;
        this.f13200OooOOo0 = new com.google.android.exoplayer2.source.OooOo00.OooO00o(this.f12975OooO0OO.f13060OooO0OO, 0, null);
        this.f13204OooOo00 = new Object();
        this.f13203OooOo0 = new SparseArray<>();
        this.f13202OooOo = new OooO0OO();
        this.f13222Oooo0oO = -9223372036854775807L;
        this.f13221Oooo0o0 = -9223372036854775807L;
        this.f13201OooOOoo = new OooO();
        this.f13208OooOoO0 = new OooOO0();
        this.f13205OooOo0O = new Runnable() { // from class: o00oOo0O.OooOo
            @Override // java.lang.Runnable
            public final void run() {
                this.f39902OooO0Oo.OooOoO0();
            }
        };
        this.f13206OooOo0o = new p075o000OOo.OooO0O0(this, 2);
    }

    public static boolean OooOo00(o0OOO0o o0ooo0o2) {
        int i = 0;
        while (true) {
            List<o00O0O> list = o0ooo0o2.f39978OooO0OO;
            if (i >= list.size()) {
                return false;
            }
            int i2 = list.get(i).f39930OooO0O0;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final o000oOoO OooO0Oo() {
        return this.f13191OooO0oo;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0o0(OooOOO oooOOO) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) oooOOO;
        com.google.android.exoplayer2.source.dash.OooO0OO oooO0OO = dashMediaPeriod.f13170OooOOOo;
        oooO0OO.f13275OooOO0o = true;
        oooO0OO.f13271OooO0oO.removeCallbacksAndMessages(null);
        for (o00OO0OO<com.google.android.exoplayer2.source.dash.OooO00o> o00oo0oo : dashMediaPeriod.f13177OooOo0O) {
            o00oo0oo.f40280OooOo0 = dashMediaPeriod;
            com.google.android.exoplayer2.source.o00O0O o00o0o2 = o00oo0oo.f40275OooOOOo;
            o00o0o2.OooO0oo();
            DrmSession drmSession = o00o0o2.f13308OooO0oo;
            if (drmSession != null) {
                drmSession.OooO0O0(o00o0o2.f13306OooO0o0);
                o00o0o2.f13308OooO0oo = null;
                o00o0o2.f13307OooO0oO = null;
            }
            for (com.google.android.exoplayer2.source.o00O0O o00o0o3 : o00oo0oo.f40277OooOOo0) {
                o00o0o3.OooO0oo();
                DrmSession drmSession2 = o00o0o3.f13308OooO0oo;
                if (drmSession2 != null) {
                    drmSession2.OooO0O0(o00o0o3.f13306OooO0o0);
                    o00o0o3.f13308OooO0oo = null;
                    o00o0o3.f13307OooO0oO = null;
                }
            }
            o00oo0oo.f40271OooOO0o.OooO0OO(o00oo0oo);
        }
        dashMediaPeriod.f13175OooOo0 = null;
        this.f13203OooOo0.remove(dashMediaPeriod.f13159OooO0Oo);
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final OooOOO OooO0oo(OooOOOO.OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j) {
        int iIntValue = ((Integer) oooO0O0.f39859OooO00o).intValue() - this.f13223Oooo0oo;
        long j2 = this.f13217Oooo00o.OooO0O0(iIntValue).f39977OooO0O0;
        com.google.android.exoplayer2.source.OooOo00.OooO00o oooO00o = new com.google.android.exoplayer2.source.OooOo00.OooO00o(this.f12975OooO0OO.f13060OooO0OO, 0, oooO0O0);
        com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o2 = new com.google.android.exoplayer2.drm.OooO0O0.OooO00o(this.f12976OooO0Oo.f11771OooO0OO, 0, oooO0O0);
        int i = this.f13223Oooo0oo + iIntValue;
        o00Ooo o00ooo2 = this.f13217Oooo00o;
        OooOo00 oooOo00 = this.f13197OooOOOO;
        com.google.android.exoplayer2.source.dash.OooO00o.InterfaceC0210OooO00o interfaceC0210OooO00o = this.f13193OooOO0O;
        o00O0OO0 o00o0oo1 = this.f13211OooOoo0;
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO = this.f13196OooOOO0;
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f13195OooOOO;
        long j3 = this.f13221Oooo0o0;
        oo00o oo00oVar = this.f13208OooOoO0;
        o000OOo o000ooo2 = this.f13194OooOO0o;
        OooO0OO oooO0OO2 = this.f13202OooOo;
        o0O0OOO0 o0o0ooo0 = this.f12979OooO0oO;
        o00O000o.OooO0o0(o0o0ooo0);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(i, o00ooo2, oooOo00, iIntValue, interfaceC0210OooO00o, o00o0oo1, oooO0OO, oooO00o2, loadErrorHandlingPolicy, oooO00o, j3, oo00oVar, o000oo0o2, o000ooo2, oooO0OO2, o0o0ooo0);
        this.f13203OooOo0.put(i, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooOO0o() throws IOException {
        this.f13208OooOoO0.OooO00o();
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    public final void OooOOo0(@Nullable o00O0OO0 o00o0oo1) {
        this.f13211OooOoo0 = o00o0oo1;
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO = this.f13196OooOOO0;
        oooO0OO.OooO0OO();
        Looper looperMyLooper = Looper.myLooper();
        o0O0OOO0 o0o0ooo0 = this.f12979OooO0oO;
        o00O000o.OooO0o0(o0o0ooo0);
        oooO0OO.OooO0o0(looperMyLooper, o0o0ooo0);
        if (this.f13190OooO) {
            OooOo0o(false);
            return;
        }
        this.f13207OooOoO = this.f13192OooOO0.OooO00o();
        this.f13209OooOoOO = new Loader("DashMediaSource");
        this.f13212OooOooO = o0O00.OooOO0O(null);
        OooOoO0();
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    public final void OooOOoo() {
        this.f13214Oooo0 = false;
        this.f13207OooOoO = null;
        Loader loader = this.f13209OooOoOO;
        if (loader != null) {
            loader.OooO0OO(null);
            this.f13209OooOoOO = null;
        }
        this.f13218Oooo0O0 = 0L;
        this.f13219Oooo0OO = 0L;
        this.f13217Oooo00o = this.f13190OooO ? this.f13217Oooo00o : null;
        this.f13215Oooo000 = this.f13216Oooo00O;
        this.f13210OooOoo = null;
        Handler handler = this.f13212OooOooO;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f13212OooOooO = null;
        }
        this.f13221Oooo0o0 = -9223372036854775807L;
        this.f13220Oooo0o = 0;
        this.f13222Oooo0oO = -9223372036854775807L;
        this.f13223Oooo0oo = 0;
        this.f13203OooOo0.clear();
        OooOo00 oooOo00 = this.f13197OooOOOO;
        oooOo00.f39903OooO00o.clear();
        oooOo00.f39904OooO0O0.clear();
        oooOo00.f39905OooO0OO.clear();
        this.f13196OooOOO0.release();
    }

    public final <T> void OooOo(com.google.android.exoplayer2.upstream.OooOO0<T> oooOO1, Loader.OooO00o<com.google.android.exoplayer2.upstream.OooOO0<T>> oooO00o, int i) {
        this.f13200OooOOo0.OooO(new o0000(oooOO1.f14246OooO00o, oooOO1.f14247OooO0O0, this.f13209OooOoOO.OooO0Oo(oooOO1, oooO00o, i)), oooOO1.f14248OooO0OO, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void OooOo0() {
        boolean z;
        Loader loader = this.f13209OooOoOO;
        OooO00o oooO00o = new OooO00o();
        synchronized (oo00oO.f40636OooO0O0) {
            z = oo00oO.f40637OooO0OO;
        }
        if (z) {
            oooO00o.OooO00o();
            return;
        }
        if (loader == null) {
            loader = new Loader("SntpClient");
        }
        loader.OooO0Oo(new oo00oO.OooO0OO(), new oo00oO.OooO0O0(oooO00o), 1);
    }

    public final void OooOo0O(com.google.android.exoplayer2.upstream.OooOO0<?> oooOO1, long j, long j2) {
        long j3 = oooOO1.f14246OooO00o;
        o00O0O0 o00o0o0 = oooOO1.f14249OooO0Oo;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        this.f13195OooOOO.OooO0Oo();
        this.f13200OooOOo0.OooO0OO(o0000Var, oooOO1.f14248OooO0OO, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:115:0x0260  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:237:0x048e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0204  */
    public final void OooOo0o(boolean z) {
        long j;
        List<o00O0O> list;
        boolean z2;
        o0OOO0o o0ooo0o2;
        long j2;
        long j3;
        Oooo000 oooo000OooOO0o;
        long jMin;
        float f;
        float f2;
        p228o00oOo0o.o000OOo o000ooo2;
        boolean z3;
        long j4;
        long j5;
        long j6;
        int i = 0;
        while (true) {
            SparseArray<DashMediaPeriod> sparseArray = this.f13203OooOo0;
            if (i >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i);
            if (iKeyAt >= this.f13223Oooo0oo) {
                DashMediaPeriod dashMediaPeriodValueAt = sparseArray.valueAt(i);
                o00Ooo o00ooo2 = this.f13217Oooo00o;
                int i2 = iKeyAt - this.f13223Oooo0oo;
                dashMediaPeriodValueAt.f13180OooOoO0 = o00ooo2;
                dashMediaPeriodValueAt.f13179OooOoO = i2;
                com.google.android.exoplayer2.source.dash.OooO0OO oooO0OO = dashMediaPeriodValueAt.f13170OooOOOo;
                oooO0OO.f13274OooOO0O = false;
                oooO0OO.f13267OooO = o00ooo2;
                Iterator<Map.Entry<Long, Long>> it = oooO0OO.f13272OooO0oo.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getKey().longValue() < oooO0OO.f13267OooO.f39947OooO0oo) {
                        it.remove();
                    }
                }
                o00OO0OO<com.google.android.exoplayer2.source.dash.OooO00o>[] o00oo0ooArr = dashMediaPeriodValueAt.f13177OooOo0O;
                if (o00oo0ooArr != null) {
                    for (o00OO0OO<com.google.android.exoplayer2.source.dash.OooO00o> o00oo0oo : o00oo0ooArr) {
                        ((com.google.android.exoplayer2.source.dash.OooO00o) o00oo0oo.f40268OooO0oo).OooO0oO(o00ooo2, i2);
                    }
                    dashMediaPeriodValueAt.f13175OooOo0.OooO00o(dashMediaPeriodValueAt);
                }
                dashMediaPeriodValueAt.f13181OooOoOO = o00ooo2.OooO0O0(i2).f39979OooO0Oo;
                for (o0OoOo0 o0oooo0 : dashMediaPeriodValueAt.f13178OooOo0o) {
                    for (o0ooOOo o0ooooo : dashMediaPeriodValueAt.f13181OooOoOO) {
                        if (o0ooooo.OooO00o().equals(o0oooo0.f39914OooO0oo.OooO00o())) {
                            o0oooo0.OooO0Oo(o0ooooo, o00ooo2.f39943OooO0Oo && i2 == o00ooo2.OooO0OO() - 1);
                            break;
                        }
                    }
                }
            }
            i++;
        }
        o0OOO0o o0ooo0oOooO0O0 = this.f13217Oooo00o.OooO0O0(0);
        int iOooO0OO = this.f13217Oooo00o.OooO0OO() - 1;
        o0OOO0o o0ooo0oOooO0O1 = this.f13217Oooo00o.OooO0O0(iOooO0OO);
        long jOooO0o0 = this.f13217Oooo00o.OooO0o0(iOooO0OO);
        long jOooo0O0 = o0O00.Oooo0O0(o0O00.OooOOoo(this.f13221Oooo0o0));
        long jOooO0o1 = this.f13217Oooo00o.OooO0o0(0);
        long jOooo0O1 = o0O00.Oooo0O0(o0ooo0oOooO0O0.f39977OooO0O0);
        boolean zOooOo00 = OooOo00(o0ooo0oOooO0O0);
        int i3 = 0;
        long jMax = jOooo0O1;
        while (true) {
            List<o00O0O> list2 = o0ooo0oOooO0O0.f39978OooO0OO;
            long j7 = jMax;
            j = jOooO0o0;
            if (i3 >= list2.size()) {
                jOooo0O1 = j7;
                break;
            }
            o00O0O o00o0o2 = list2.get(i3);
            List<p228o00oOo0o.oo0o0Oo> list3 = o00o0o2.f39931OooO0OO;
            int i4 = o00o0o2.f39930OooO0O0;
            boolean z4 = (i4 == 1 || i4 == 2) ? false : true;
            if ((zOooOo00 && z4) || list3.isEmpty()) {
                jMax = j7;
            } else {
                Oooo000 oooo000OooOO0o2 = list3.get(0).OooOO0o();
                if (oooo000OooOO0o2 == null || oooo000OooOO0o2.OooOO0(jOooO0o1, jOooo0O0) == 0) {
                    break;
                } else {
                    jMax = Math.max(j7, oooo000OooOO0o2.OooO00o(oooo000OooOO0o2.OooO0OO(jOooO0o1, jOooo0O0)) + jOooo0O1);
                }
            }
            i3++;
            jOooO0o0 = j;
            jOooO0o1 = jOooO0o1;
        }
        long jOooo0O2 = o0O00.Oooo0O0(o0ooo0oOooO0O1.f39977OooO0O0);
        boolean zOooOo01 = OooOo00(o0ooo0oOooO0O1);
        long jMin2 = LongCompanionObject.MAX_VALUE;
        int i5 = 0;
        while (true) {
            list = o0ooo0oOooO0O1.f39978OooO0OO;
            if (i5 >= list.size()) {
                break;
            }
            o00O0O o00o0o3 = list.get(i5);
            List<p228o00oOo0o.oo0o0Oo> list4 = o00o0o3.f39931OooO0OO;
            int i6 = o00o0o3.f39930OooO0O0;
            o0OOO0o o0ooo0o3 = o0ooo0oOooO0O1;
            boolean z5 = (i6 == 1 || i6 == 2) ? false : true;
            if ((!zOooOo01 || !z5) && !list4.isEmpty()) {
                Oooo000 oooo000OooOO0o3 = list4.get(0).OooOO0o();
                if (oooo000OooOO0o3 == null) {
                    j4 = jOooo0O2 + j;
                } else {
                    j5 = jOooo0O2;
                    j6 = j;
                    long jOooOO0 = oooo000OooOO0o3.OooOO0(j6, jOooo0O0);
                    if (jOooOO0 == 0) {
                        j4 = j5;
                    } else {
                        long jOooO0OO = (oooo000OooOO0o3.OooO0OO(j6, jOooo0O0) + jOooOO0) - 1;
                        jMin2 = Math.min(jMin2, oooo000OooOO0o3.OooO0O0(jOooO0OO, j6) + oooo000OooOO0o3.OooO00o(jOooO0OO) + j5);
                    }
                }
                jMin2 = j4;
                break;
            }
            j5 = jOooo0O2;
            j6 = j;
            i5++;
            j = j6;
            jOooo0O2 = j5;
            o0ooo0oOooO0O1 = o0ooo0o3;
        }
        if (this.f13217Oooo00o.f39943OooO0Oo) {
            int i7 = 0;
            while (true) {
                if (i7 >= list.size()) {
                    z3 = false;
                    break;
                }
                Oooo000 oooo000OooOO0o4 = list.get(i7).f39931OooO0OO.get(0).OooOO0o();
                if (oooo000OooOO0o4 == null || oooo000OooOO0o4.OooO0oo()) {
                    z3 = true;
                    break;
                }
                i7++;
            }
            if (z3) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            long j8 = this.f13217Oooo00o.f39944OooO0o;
            if (j8 != -9223372036854775807L) {
                jOooo0O1 = Math.max(jOooo0O1, jMin2 - o0O00.Oooo0O0(j8));
            }
        }
        long j9 = jMin2 - jOooo0O1;
        o00Ooo o00ooo3 = this.f13217Oooo00o;
        if (o00ooo3.f39943OooO0Oo) {
            o00O000o.OooO0Oo(o00ooo3.f39940OooO00o != -9223372036854775807L);
            long jOooo0O3 = (jOooo0O0 - o0O00.Oooo0O0(this.f13217Oooo00o.f39940OooO00o)) - jOooo0O1;
            long jOoooOO0 = o0O00.OoooOO0(jOooo0O3);
            o000oOoO o000oooo2 = this.f13191OooO0oo;
            long j10 = o000oooo2.f12669OooO0o.f12741OooO0o;
            if (j10 != -9223372036854775807L) {
                jMin = Math.min(jOoooOO0, j10);
            } else {
                p228o00oOo0o.o000OOo o000ooo3 = this.f13217Oooo00o.f39948OooOO0;
                if (o000ooo3 != null) {
                    long j11 = o000ooo3.f39926OooO0OO;
                    if (j11 != -9223372036854775807L) {
                        jMin = Math.min(jOoooOO0, j11);
                    } else {
                        jMin = jOoooOO0;
                    }
                } else {
                    jMin = jOoooOO0;
                }
            }
            long jOoooOO1 = o0O00.OoooOO0(jOooo0O3 - j9);
            if (jOoooOO1 < 0 && jMin > 0) {
                jOoooOO1 = 0;
            }
            long j12 = this.f13217Oooo00o.f39942OooO0OO;
            long jMin3 = j12 != -9223372036854775807L ? Math.min(jOoooOO1 + j12, jOoooOO0) : jOoooOO1;
            o000oOoO.OooOO0 oooOO1 = o000oooo2.f12669OooO0o;
            long j13 = oooOO1.f12742OooO0o0;
            if (j13 != -9223372036854775807L) {
                jMin3 = o0O00.OooOO0(j13, jMin3, jOoooOO0);
            } else {
                p228o00oOo0o.o000OOo o000ooo4 = this.f13217Oooo00o.f39948OooOO0;
                if (o000ooo4 != null) {
                    long j14 = o000ooo4.f39925OooO0O0;
                    if (j14 != -9223372036854775807L) {
                        jMin3 = o0O00.OooOO0(j14, jMin3, jOoooOO0);
                    }
                }
            }
            long j15 = jMin3;
            long j16 = j15 > jMin ? j15 : jMin;
            long jOooOO1 = this.f13213OooOooo.f12740OooO0Oo;
            if (jOooOO1 == -9223372036854775807L) {
                o00Ooo o00ooo4 = this.f13217Oooo00o;
                p228o00oOo0o.o000OOo o000ooo5 = o00ooo4.f39948OooOO0;
                if (o000ooo5 != null) {
                    jOooOO1 = o000ooo5.f39924OooO00o;
                    if (jOooOO1 == -9223372036854775807L) {
                        jOooOO1 = o00ooo4.f39946OooO0oO;
                        if (jOooOO1 == -9223372036854775807L) {
                            jOooOO1 = this.f13198OooOOOo;
                        }
                    }
                } else {
                    jOooOO1 = o00ooo4.f39946OooO0oO;
                    if (jOooOO1 == -9223372036854775807L) {
                        jOooOO1 = this.f13198OooOOOo;
                    }
                }
            }
            if (jOooOO1 < j15) {
                jOooOO1 = j15;
            }
            if (jOooOO1 > j16) {
                jOooOO1 = o0O00.OooOO0(o0O00.OoooOO0(jOooo0O3 - Math.min(5000000L, j9 / 2)), j15, j16);
            }
            long j17 = jOooOO1;
            float f3 = oooOO1.f12743OooO0oO;
            if (f3 == -3.4028235E38f) {
                p228o00oOo0o.o000OOo o000ooo6 = this.f13217Oooo00o.f39948OooOO0;
                f3 = o000ooo6 != null ? o000ooo6.f39927OooO0Oo : -3.4028235E38f;
            }
            float f4 = oooOO1.f12744OooO0oo;
            if (f4 == -3.4028235E38f) {
                p228o00oOo0o.o000OOo o000ooo7 = this.f13217Oooo00o.f39948OooOO0;
                f4 = o000ooo7 != null ? o000ooo7.f39928OooO0o0 : -3.4028235E38f;
            }
            if (f3 == -3.4028235E38f && f4 == -3.4028235E38f && ((o000ooo2 = this.f13217Oooo00o.f39948OooOO0) == null || o000ooo2.f39924OooO00o == -9223372036854775807L)) {
                f2 = 1.0f;
                f = 1.0f;
            } else {
                f = f4;
                f2 = f3;
            }
            this.f13213OooOooo = new o000oOoO.OooOO0(j17, j15, j16, f2, f);
            long jOoooOO2 = o0O00.OoooOO0(jOooo0O1) + this.f13217Oooo00o.f39940OooO00o;
            long jOooo0O4 = jOooo0O3 - o0O00.Oooo0O0(this.f13213OooOooo.f12740OooO0Oo);
            long jMin4 = Math.min(5000000L, j9 / 2);
            if (jOooo0O4 >= jMin4) {
                jMin4 = jOooo0O4;
            }
            j3 = jMin4;
            j2 = jOoooOO2;
            o0ooo0o2 = o0ooo0oOooO0O0;
        } else {
            z2 = z2;
            o0ooo0o2 = o0ooo0oOooO0O0;
            j2 = -9223372036854775807L;
            j3 = 0;
        }
        long jOooo0O5 = jOooo0O1 - o0O00.Oooo0O0(o0ooo0o2.f39977OooO0O0);
        o00Ooo o00ooo5 = this.f13217Oooo00o;
        OooOOo(new OooO0O0(o00ooo5.f39940OooO00o, j2, this.f13221Oooo0o0, this.f13223Oooo0oo, jOooo0O5, j9, j3, o00ooo5, this.f13191OooO0oo, o00ooo5.f39943OooO0Oo ? this.f13213OooOooo : null));
        if (this.f13190OooO) {
            return;
        }
        Handler handler = this.f13212OooOooO;
        p075o000OOo.OooO0O0 oooO0O0 = this.f13206OooOo0o;
        handler.removeCallbacks(oooO0O0);
        if (z2) {
            Handler handler2 = this.f13212OooOooO;
            o00Ooo o00ooo6 = this.f13217Oooo00o;
            long jOooOOoo = o0O00.OooOOoo(this.f13221Oooo0o0);
            int iOooO0OO2 = o00ooo6.OooO0OO() - 1;
            o0OOO0o o0ooo0oOooO0O2 = o00ooo6.OooO0O0(iOooO0OO2);
            long jOooo0O6 = o0O00.Oooo0O0(o0ooo0oOooO0O2.f39977OooO0O0);
            long jOooO0o2 = o00ooo6.OooO0o0(iOooO0OO2);
            long jOooo0O7 = o0O00.Oooo0O0(jOooOOoo);
            long jOooo0O8 = o0O00.Oooo0O0(o00ooo6.f39940OooO00o);
            long jOooo0O9 = o0O00.Oooo0O0(5000L);
            int i8 = 0;
            while (true) {
                List<o00O0O> list5 = o0ooo0oOooO0O2.f39978OooO0OO;
                if (i8 >= list5.size()) {
                    break;
                }
                List<p228o00oOo0o.oo0o0Oo> list6 = list5.get(i8).f39931OooO0OO;
                if (!list6.isEmpty() && (oooo000OooOO0o = list6.get(0).OooOO0o()) != null) {
                    long jOooO0Oo = (oooo000OooOO0o.OooO0Oo(jOooO0o2, jOooo0O7) + (jOooo0O8 + jOooo0O6)) - jOooo0O7;
                    if (jOooO0Oo < jOooo0O9 - 100000 || (jOooO0Oo > jOooo0O9 && jOooO0Oo < jOooo0O9 + 100000)) {
                        jOooo0O9 = jOooO0Oo;
                    }
                }
                i8++;
            }
            boolean z6 = false;
            RoundingMode roundingMode = RoundingMode.CEILING;
            roundingMode.getClass();
            long j18 = jOooo0O9 / 1000;
            long j19 = jOooo0O9 - (j18 * 1000);
            if (j19 != 0) {
                int i9 = ((int) ((jOooo0O9 ^ 1000) >> 63)) | 1;
                switch (com.google.common.math.OooO0OO.OooO00o.f19736OooO00o[roundingMode.ordinal()]) {
                    case 1:
                        if (!(j19 == 0)) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        if (z6) {
                            j18 += (long) i9;
                        }
                        break;
                    case 2:
                        if (z6) {
                            j18 += (long) i9;
                        }
                        break;
                    case 3:
                        if (i9 < 0) {
                            z6 = true;
                        }
                        if (z6) {
                            j18 += (long) i9;
                        }
                        break;
                    case 4:
                        z6 = true;
                        if (z6) {
                            j18 += (long) i9;
                        }
                        break;
                    case 5:
                        if (i9 > 0) {
                            z6 = true;
                        }
                        if (z6) {
                            j18 += (long) i9;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        long jAbs = Math.abs(j19);
                        long jAbs2 = jAbs - (Math.abs(1000L) - jAbs);
                        if (jAbs2 == 0) {
                            if (roundingMode == RoundingMode.HALF_UP) {
                                z6 = true;
                            } else if (roundingMode == RoundingMode.HALF_EVEN && (j18 & 1) != 0) {
                                z6 = true;
                            }
                        } else if (jAbs2 > 0) {
                            z6 = true;
                        }
                        if (z6) {
                            j18 += (long) i9;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            handler2.postDelayed(oooO0O0, j18);
        }
        if (this.f13214Oooo0) {
            OooOoO0();
            return;
        }
        if (z) {
            o00Ooo o00ooo7 = this.f13217Oooo00o;
            if (o00ooo7.f39943OooO0Oo) {
                long j20 = o00ooo7.f39945OooO0o0;
                if (j20 != -9223372036854775807L) {
                    this.f13212OooOooO.postDelayed(this.f13205OooOo0O, Math.max(0L, (this.f13218Oooo0O0 + (j20 == 0 ? 5000L : j20)) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void OooOoO0() {
        Uri uri;
        this.f13212OooOooO.removeCallbacks(this.f13205OooOo0O);
        Loader loader = this.f13209OooOoOO;
        if (loader.f14196OooO0OO != null) {
            return;
        }
        if (loader.OooO0O0()) {
            this.f13214Oooo0 = true;
            return;
        }
        synchronized (this.f13204OooOo00) {
            uri = this.f13215Oooo000;
        }
        this.f13214Oooo0 = false;
        OooOo(new com.google.android.exoplayer2.upstream.OooOO0(this.f13207OooOoO, uri, 4, this.f13199OooOOo), this.f13201OooOOoo, this.f13195OooOOO.OooO0O0(4));
    }
}
