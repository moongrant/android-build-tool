package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.oo000o;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o00O0O00;
import p203o00o0o0o.o00OO;
import p203o00o0o0o.o00OOOO0;
import p203o00o0o0o.o00OOOOo;
import p203o00o0o0o.o0O000o0;
import p203o00o0o0o.o0O00O0o;
import p203o00o0o0o.o0O00OO;
import p203o00o0o0o.o0o0Oo;
import p226o00oOo00.o000O0;
import p230o00oOoO0.o000O0Oo;
import p241o00oo0O.o00O000;
import p241o00oo0O.o00oOoo;
import p244o00oo0Oo.o000O;
import p244o00oo0Oo.o00O00O;
import p245o00oo0o.o0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00O00OO;
import p245o00oo0o.o00O0OOO;
import p245o00oo0o.o00OO00O;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O000;
import p245o00oo0o.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOo00 implements Handler.Callback, com.google.android.exoplayer2.source.OooOOO.OooO00o, o00oOoo.OooO00o, o00O0O.OooO0o, com.google.android.exoplayer2.OooOO0O.OooO00o, oo000o.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0o0Oo f11266OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Renderer[] f11267OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final RendererCapabilities[] f11268OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Set<Renderer> f11269OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00oOoo f11270OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O000 f11271OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000O f11272OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00O0OOO f11273OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final HandlerThread f11274OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final oo0o0Oo.OooO0OO f11275OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Looper f11276OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final oo0o0Oo.OooO0O0 f11277OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final long f11278OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final com.google.android.exoplayer2.OooOO0O f11279OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f11280OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final ArrayList<OooO0OO> f11281OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Oooo0 f11282OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooO f11283OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o00O00OO f11284OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o0OoOo0 f11285OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o00O0O f11286OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o0O00OO f11287OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long f11288OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o0O000o0 f11289OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f11290OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO0o f11291OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f11292OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f11293OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f11294Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f11295Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f11296Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f11297Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f11298Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f11299Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f11300Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f11301Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f11302Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public OooOO0O f11303Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f11304Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public ExoPlaybackException f11305OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f11306OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f11307OoooO0O = -9223372036854775807L;

    public interface OooO {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<o00O0O.OooO0OO> f11308OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.o00Ooo f11309OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f11310OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f11311OooO0Oo;

        public OooO00o(ArrayList arrayList, com.google.android.exoplayer2.source.o00Ooo o00ooo2, int i, long j) {
            this.f11308OooO00o = arrayList;
            this.f11309OooO0O0 = o00ooo2;
            this.f11310OooO0OO = i;
            this.f11311OooO0Oo = j;
        }
    }

    public static class OooO0O0 {
    }

    public static final class OooO0OO implements Comparable<OooO0OO> {
        public OooO0OO() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO0OO oooO0OO) {
            oooO0OO.getClass();
            return 0;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f11312OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o0O000o0 f11313OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f11314OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f11315OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f11316OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f11317OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f11318OooO0oO;

        public OooO0o(o0O000o0 o0o000o1) {
            this.f11313OooO0O0 = o0o000o1;
        }

        public final void OooO00o(int i) {
            this.f11312OooO00o |= i > 0;
            this.f11314OooO0OO += i;
        }
    }

    public static final class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.OooOOOO.OooO0O0 f11319OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f11320OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f11321OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f11322OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f11323OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f11324OooO0o0;

        public OooOO0(com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f11319OooO00o = oooO0O0;
            this.f11320OooO0O0 = j;
            this.f11321OooO0OO = j2;
            this.f11322OooO0Oo = z;
            this.f11324OooO0o0 = z2;
            this.f11323OooO0o = z3;
        }
    }

    public static final class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo0o0Oo f11325OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f11326OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f11327OooO0OO;

        public OooOO0O(oo0o0Oo oo0o0oo, int i, long j) {
            this.f11325OooO00o = oo0o0oo;
            this.f11326OooO0O0 = i;
            this.f11327OooO0OO = j;
        }
    }

    public OooOo00(Renderer[] rendererArr, o00oOoo o00oooo2, o00O000 o00o001, o0o0Oo o0o0oo, o000O o000o, int i, boolean z, p200o00o0o.o00O0O o00o0o2, o0O00OO o0o00oo2, com.google.android.exoplayer2.OooOO0 oooOO1, long j, boolean z2, Looper looper, o00O00OO o00o00oo2, o00O0O00 o00o0o01, o0O0OOO0 o0o0ooo0) {
        this.f11283OooOo0 = o00o0o01;
        this.f11267OooO0Oo = rendererArr;
        this.f11270OooO0oO = o00oooo2;
        this.f11271OooO0oo = o00o001;
        this.f11266OooO = o0o0oo;
        this.f11272OooOO0 = o000o;
        this.f11298Oooo00o = i;
        this.f11295Oooo0 = z;
        this.f11287OooOoO = o0o00oo2;
        this.f11282OooOo = oooOO1;
        this.f11288OooOoO0 = j;
        this.f11292OooOooO = z2;
        this.f11284OooOo00 = o00o00oo2;
        this.f11278OooOOOo = o0o0oo.OooO0OO();
        this.f11280OooOOo0 = o0o0oo.OooO0O0();
        o0O000o0 o0o000o0OooO = o0O000o0.OooO(o00o001);
        this.f11289OooOoOO = o0o000o0OooO;
        this.f11291OooOoo0 = new OooO0o(o0o000o0OooO);
        this.f11268OooO0o = new RendererCapabilities[rendererArr.length];
        RendererCapabilities.OooO00o oooO00oOooO0O0 = o00oooo2.OooO0O0();
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].OooOO0(i2, o0o0ooo0);
            this.f11268OooO0o[i2] = rendererArr[i2].OooOOOo();
            if (oooO00oOooO0O0 != null) {
                com.google.android.exoplayer2.OooO0o oooO0o = (com.google.android.exoplayer2.OooO0o) this.f11268OooO0o[i2];
                synchronized (oooO0o.f11042OooO0Oo) {
                    oooO0o.f11054OooOOo0 = oooO00oOooO0O0;
                }
            }
        }
        this.f11279OooOOo = new com.google.android.exoplayer2.OooOO0O(this, o00o00oo2);
        this.f11281OooOOoo = new ArrayList<>();
        this.f11269OooO0o0 = Collections.newSetFromMap(new IdentityHashMap());
        this.f11275OooOOO = new oo0o0Oo.OooO0OO();
        this.f11277OooOOOO = new oo0o0Oo.OooO0O0();
        o00oooo2.f40407OooO00o = this;
        o00oooo2.f40408OooO0O0 = o000o;
        this.f11306OoooO00 = true;
        o0 o0VarOooO0O0 = o00o00oo2.OooO0O0(looper, null);
        this.f11285OooOo0O = new o0OoOo0(o00o0o2, o0VarOooO0O0);
        this.f11286OooOo0o = new o00O0O(this, o00o0o2, o0VarOooO0O0, o0o0ooo0);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f11274OooOO0o = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f11276OooOOO0 = looper2;
        this.f11273OooOO0O = o00o00oo2.OooO0O0(looper2, this);
    }

    public static boolean OooOOo(Renderer renderer) {
        return renderer.getState() != 0;
    }

    @Nullable
    public static Object Oooo0(oo0o0Oo.OooO0OO oooO0OO, oo0o0Oo.OooO0O0 oooO0O0, int i, boolean z, Object obj, oo0o0Oo oo0o0oo, oo0o0Oo oo0o0oo2) {
        int iOooO0O0 = oo0o0oo.OooO0O0(obj);
        int iOooO = oo0o0oo.OooO();
        int iOooO0Oo = iOooO0O0;
        int iOooO0O1 = -1;
        for (int i2 = 0; i2 < iOooO && iOooO0O1 == -1; i2++) {
            iOooO0Oo = oo0o0oo.OooO0Oo(iOooO0Oo, oooO0O0, oooO0OO, i, z);
            if (iOooO0Oo == -1) {
                break;
            }
            iOooO0O1 = oo0o0oo2.OooO0O0(oo0o0oo.OooOOO0(iOooO0Oo));
        }
        if (iOooO0O1 == -1) {
            return null;
        }
        return oo0o0oo2.OooOOO0(iOooO0O1);
    }

    @Nullable
    public static Pair<Object, Long> Oooo00o(oo0o0Oo oo0o0oo, OooOO0O oooOO0O, boolean z, int i, boolean z2, oo0o0Oo.OooO0OO oooO0OO, oo0o0Oo.OooO0O0 oooO0O0) {
        Object objOooo0;
        oo0o0Oo oo0o0oo2 = oooOO0O.f11325OooO00o;
        if (oo0o0oo.OooOOo0()) {
            return null;
        }
        oo0o0Oo oo0o0oo3 = oo0o0oo2.OooOOo0() ? oo0o0oo : oo0o0oo2;
        try {
            Pair<Object, Long> pairOooOO0 = oo0o0oo3.OooOO0(oooO0OO, oooO0O0, oooOO0O.f11326OooO0O0, oooOO0O.f11327OooO0OO);
            if (oo0o0oo.equals(oo0o0oo3)) {
                return pairOooOO0;
            }
            if (oo0o0oo.OooO0O0(pairOooOO0.first) != -1) {
                return (oo0o0oo3.OooO0oo(pairOooOO0.first, oooO0O0).f12904OooO && oo0o0oo3.OooOOO(oooO0O0.f12906OooO0o, oooO0OO).f12940OooOOo == oo0o0oo3.OooO0O0(pairOooOO0.first)) ? oo0o0oo.OooOO0(oooO0OO, oooO0O0, oo0o0oo.OooO0oo(pairOooOO0.first, oooO0O0).f12906OooO0o, oooOO0O.f11327OooO0OO) : pairOooOO0;
            }
            if (z && (objOooo0 = Oooo0(oooO0OO, oooO0O0, i, z2, pairOooOO0.first, oo0o0oo3, oo0o0oo)) != null) {
                return oo0o0oo.OooOO0(oooO0OO, oooO0O0, oo0o0oo.OooO0oo(objOooo0, oooO0O0).f12906OooO0o, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static void Oooo0oo(Renderer renderer, long j) {
        renderer.OooO0oo();
        if (renderer instanceof o000O0Oo) {
            o000O0Oo o000o0oo2 = (o000O0Oo) renderer;
            o00O000o.OooO0Oo(o000o0oo2.f11052OooOOOO);
            o000o0oo2.f40133Oooo000 = j;
        }
    }

    public final Pair<com.google.android.exoplayer2.source.OooOOOO.OooO0O0, Long> OooO(oo0o0Oo oo0o0oo) {
        if (oo0o0oo.OooOOo0()) {
            return Pair.create(o0O000o0.f39260OooOo00, 0L);
        }
        Pair<Object, Long> pairOooOO0 = oo0o0oo.OooOO0(this.f11275OooOOO, this.f11277OooOOOO, oo0o0oo.OooO00o(this.f11295Oooo0), -9223372036854775807L);
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0OooOOO = this.f11285OooOo0O.OooOOO(oo0o0oo, pairOooOO0.first, 0L);
        long jLongValue = ((Long) pairOooOO0.second).longValue();
        if (oooO0O0OooOOO.OooO00o()) {
            Object obj = oooO0O0OooOOO.f39859OooO00o;
            oo0o0Oo.OooO0O0 oooO0O0 = this.f11277OooOOOO;
            oo0o0oo.OooO0oo(obj, oooO0O0);
            jLongValue = oooO0O0OooOOO.f39861OooO0OO == oooO0O0.OooO0o(oooO0O0OooOOO.f39860OooO0O0) ? oooO0O0.f12910OooOO0.f13134OooO0o : 0L;
        }
        return Pair.create(oooO0O0OooOOO, Long.valueOf(jLongValue));
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0.OooO00o
    public final void OooO00o(com.google.android.exoplayer2.source.o00Oo0 o00oo1) {
        this.f11273OooOO0O.OooO0o0(9, (com.google.android.exoplayer2.source.OooOOO) o00oo1).OooO00o();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO.OooO00o
    public final void OooO0O0(com.google.android.exoplayer2.source.OooOOO oooOOO) {
        this.f11273OooOO0O.OooO0o0(8, oooOOO).OooO00o();
    }

    public final void OooO0OO(OooO00o oooO00o, int i) throws ExoPlaybackException {
        this.f11291OooOoo0.OooO00o(1);
        o00O0O o00o0o2 = this.f11286OooOo0o;
        if (i == -1) {
            i = o00o0o2.f12801OooO0O0.size();
        }
        OooOOO0(o00o0o2.OooO00o(i, oooO00o.f11308OooO00o, oooO00o.f11309OooO0O0), false);
    }

    public final void OooO0Oo(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() != 0) {
            com.google.android.exoplayer2.OooOO0O oooOO0O = this.f11279OooOOo;
            if (renderer == oooOO0O.f11072OooO0o) {
                oooOO0O.f11074OooO0oO = null;
                oooOO0O.f11072OooO0o = null;
                oooOO0O.f11075OooO0oo = true;
            }
            if (renderer.getState() == 2) {
                renderer.stop();
            }
            renderer.OooO0o();
            this.f11301Oooo0o--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    public final void OooO0o(boolean[] zArr) throws ExoPlaybackException {
        Renderer[] rendererArr;
        Set<Renderer> set;
        Renderer[] rendererArr2;
        o00OO00O o00oo00o;
        o0OoOo0 o0oooo0 = this.f11285OooOo0O;
        o00OOOO0 o00oooo1 = o0oooo0.f12854OooO;
        o00O000 o00o001 = o00oooo1.f39224OooOOO;
        int i = 0;
        while (true) {
            rendererArr = this.f11267OooO0Oo;
            int length = rendererArr.length;
            set = this.f11269OooO0o0;
            if (i >= length) {
                break;
            }
            if (!o00o001.OooO0O0(i) && set.remove(rendererArr[i])) {
                rendererArr[i].reset();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < rendererArr.length) {
            if (o00o001.OooO0O0(i2)) {
                boolean z = zArr[i2];
                Renderer renderer = rendererArr[i2];
                if (OooOOo(renderer)) {
                    rendererArr2 = rendererArr;
                } else {
                    o00OOOO0 o00oooo2 = o0oooo0.f12854OooO;
                    boolean z2 = o00oooo2 == o0oooo0.f12862OooO0oo;
                    o00O000 o00o002 = o00oooo2.f39224OooOOO;
                    o0O00O0o o0o00o0o = o00o002.f40403OooO0O0[i2];
                    com.google.android.exoplayer2.trackselection.OooO0o oooO0o = o00o002.f40404OooO0OO[i2];
                    int length2 = oooO0o != null ? oooO0o.length() : 0;
                    OooOo[] oooOoArr = new OooOo[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        oooOoArr[i3] = oooO0o.OooO0O0(i3);
                    }
                    boolean z3 = OoooOoO() && this.f11289OooOoOO.f39267OooO0o0 == 3;
                    boolean z4 = !z && z3;
                    this.f11301Oooo0o++;
                    set.add(renderer);
                    rendererArr2 = rendererArr;
                    renderer.OooO(o0o00o0o, oooOoArr, o00oooo2.f39215OooO0OO[i2], this.f11304Oooo0oo, z4, z2, o00oooo2.OooO0o0(), o00oooo2.f39226OooOOOO);
                    renderer.OooOO0O(11, new OooOOOO(this));
                    com.google.android.exoplayer2.OooOO0O oooOO0O = this.f11279OooOOo;
                    oooOO0O.getClass();
                    o00OO00O o00oo00oOooOo = renderer.OooOo();
                    if (o00oo00oOooOo != null && o00oo00oOooOo != (o00oo00o = oooOO0O.f11074OooO0oO)) {
                        if (o00oo00o != null) {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        oooOO0O.f11074OooO0oO = o00oo00oOooOo;
                        oooOO0O.f11072OooO0o = renderer;
                        o00oo00oOooOo.OooO0o0(oooOO0O.f11071OooO0Oo.f40630OooO0oo);
                    }
                    if (z3) {
                        renderer.start();
                    }
                }
            } else {
                rendererArr2 = rendererArr;
            }
            i2++;
            rendererArr = rendererArr2;
        }
        o00oooo1.f39219OooO0oO = true;
    }

    /* JADX WARN: Code duplicated, block: B:231:0x0372  */
    /* JADX WARN: Code duplicated, block: B:312:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:400:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    public final void OooO0o0() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean zOooOOoo;
        boolean z5;
        int i2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        o00OOOO0 o00oooo1;
        o00OOOO0 o00oooo2;
        Renderer[] rendererArr;
        boolean z10;
        long jOooO00o = this.f11284OooOo00.OooO00o();
        this.f11273OooOO0O.OooOO0o(2);
        if (this.f11289OooOoOO.f39262OooO00o.OooOOo0() || !this.f11286OooOo0o.f12809OooOO0O) {
            z = true;
        } else {
            o0OoOo0 o0oooo0 = this.f11285OooOo0O;
            long j = this.f11304Oooo0oo;
            o00OOOO0 o00oooo3 = o0oooo0.f12863OooOO0;
            if (o00oooo3 != null) {
                o00O000o.OooO0Oo(o00oooo3.f39223OooOO0o == null);
                if (o00oooo3.f39216OooO0Oo) {
                    o00oooo3.f39213OooO00o.OooOo0(j - o00oooo3.f39226OooOOOO);
                }
            }
            o0OoOo0 o0oooo1 = this.f11285OooOo0O;
            o00OOOO0 o00oooo4 = o0oooo1.f12863OooOO0;
            if (o00oooo4 == null) {
                z6 = true;
            } else {
                if (!o00oooo4.f39217OooO0o.f39227OooO) {
                    if ((o00oooo4.f39216OooO0Oo && (!o00oooo4.f39218OooO0o0 || o00oooo4.f39213OooO00o.OooOOoo() == Long.MIN_VALUE)) && o0oooo1.f12863OooOO0.f39217OooO0o.f39233OooO0o0 != -9223372036854775807L && o0oooo1.f12864OooOO0O < 100) {
                        z6 = true;
                    }
                }
                z6 = false;
            }
            if (z6) {
                o0OoOo0 o0oooo2 = this.f11285OooOo0O;
                long j2 = this.f11304Oooo0oo;
                o0O000o0 o0o000o1 = this.f11289OooOoOO;
                o00OOOO0 o00oooo5 = o0oooo2.f12863OooOO0;
                o00OOOOo o00oooooOooO0o0 = o00oooo5 == null ? o0oooo2.OooO0o0(o0o000o1.f39262OooO00o, o0o000o1.f39263OooO0O0, o0o000o1.f39264OooO0OO, o0o000o1.f39277OooOOo) : o0oooo2.OooO0Oo(o0o000o1.f39262OooO00o, o00oooo5, j2);
                if (o00oooooOooO0o0 != null) {
                    o0OoOo0 o0oooo3 = this.f11285OooOo0O;
                    RendererCapabilities[] rendererCapabilitiesArr = this.f11268OooO0o;
                    o00oOoo o00oooo6 = this.f11270OooO0oO;
                    p244o00oo0Oo.o00O000o o00o000oOooO0o0 = this.f11266OooO.OooO0o0();
                    o00O0O o00o0o2 = this.f11286OooOo0o;
                    o00O000 o00o001 = this.f11271OooO0oo;
                    o00OOOO0 o00oooo7 = o0oooo3.f12863OooOO0;
                    o00OOOO0 o00oooo8 = new o00OOOO0(rendererCapabilitiesArr, o00oooo7 == null ? 1000000000000L : (o00oooo7.f39226OooOOOO + o00oooo7.f39217OooO0o.f39233OooO0o0) - o00oooooOooO0o0.f39229OooO0O0, o00oooo6, o00o000oOooO0o0, o00o0o2, o00oooooOooO0o0, o00o001);
                    o00OOOO0 o00oooo9 = o0oooo3.f12863OooOO0;
                    if (o00oooo9 == null) {
                        o0oooo3.f12862OooO0oo = o00oooo8;
                        o0oooo3.f12854OooO = o00oooo8;
                    } else if (o00oooo8 != o00oooo9.f39223OooOO0o) {
                        o00oooo9.OooO0O0();
                        o00oooo9.f39223OooOO0o = o00oooo8;
                        o00oooo9.OooO0OO();
                    }
                    o0oooo3.f12865OooOO0o = null;
                    o0oooo3.f12863OooOO0 = o00oooo8;
                    z7 = true;
                    o0oooo3.f12864OooOO0O++;
                    o0oooo3.OooOO0O();
                    o00oooo8.f39213OooO00o.OooOO0(this, o00oooooOooO0o0.f39229OooO0O0);
                    if (this.f11285OooOo0O.f12862OooO0oo == o00oooo8) {
                        Oooo000(o00oooooOooO0o0.f39229OooO0O0);
                    }
                    OooOO0o(false);
                } else {
                    z7 = true;
                }
            } else {
                z7 = true;
            }
            if (this.f11297Oooo00O) {
                this.f11297Oooo00O = OooOOo0();
                OooooOO();
            } else {
                OooOo00();
            }
            o0OoOo0 o0oooo4 = this.f11285OooOo0O;
            o00OOOO0 o00oooo10 = o0oooo4.f12854OooO;
            if (o00oooo10 != null) {
                o00OOOO0 o00oooo11 = o00oooo10.f39223OooOO0o;
                Renderer[] rendererArr2 = this.f11267OooO0Oo;
                if (o00oooo11 != null && !this.f11293OooOooo) {
                    if (!o00oooo10.f39216OooO0Oo) {
                        z10 = false;
                        break;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= rendererArr2.length) {
                            z10 = z7;
                            break;
                        }
                        Renderer renderer = rendererArr2[i3];
                        SampleStream sampleStream = o00oooo10.f39215OooO0OO[i3];
                        if (renderer.OooOo0() == sampleStream) {
                            if (sampleStream != null && !renderer.OooO0oO()) {
                                o00OOOO0 o00oooo12 = o00oooo10.f39223OooOO0o;
                                if (!((o00oooo10.f39217OooO0o.f39232OooO0o && o00oooo12.f39216OooO0Oo && ((renderer instanceof o000O0Oo) || (renderer instanceof com.google.android.exoplayer2.metadata.OooO00o) || renderer.OooOo0O() >= o00oooo12.OooO0o0())) ? z7 : false)) {
                                }
                            }
                            i3++;
                        }
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        o00OOOO0 o00oooo13 = o00oooo10.f39223OooOO0o;
                        if (o00oooo13.f39216OooO0Oo || this.f11304Oooo0oo >= o00oooo13.OooO0o0()) {
                            o00O000 o00o002 = o00oooo10.f39224OooOOO;
                            o00OOOO0 o00oooo14 = o0oooo4.f12854OooO;
                            o00O000o.OooO0Oo((o00oooo14 == null || o00oooo14.f39223OooOO0o == null) ? false : z7);
                            o0oooo4.f12854OooO = o0oooo4.f12854OooO.f39223OooOO0o;
                            o0oooo4.OooOO0O();
                            o00OOOO0 o00oooo15 = o0oooo4.f12854OooO;
                            o00O000 o00o003 = o00oooo15.f39224OooOOO;
                            oo0o0Oo oo0o0oo = this.f11289OooOoOO.f39262OooO00o;
                            Oooooo0(oo0o0oo, o00oooo15.f39217OooO0o.f39228OooO00o, oo0o0oo, o00oooo10.f39217OooO0o.f39228OooO00o, -9223372036854775807L, false);
                            if (!o00oooo15.f39216OooO0Oo || o00oooo15.f39213OooO00o.OooO() == -9223372036854775807L) {
                                for (int i4 = 0; i4 < rendererArr2.length; i4++) {
                                    boolean zOooO0O0 = o00o002.OooO0O0(i4);
                                    boolean zOooO0O1 = o00o003.OooO0O0(i4);
                                    if (zOooO0O0 && !rendererArr2[i4].OooOOO0()) {
                                        boolean z11 = ((com.google.android.exoplayer2.OooO0o) this.f11268OooO0o[i4]).f11044OooO0o0 == -2;
                                        o0O00O0o o0o00o0o = o00o002.f40403OooO0O0[i4];
                                        o0O00O0o o0o00o0o2 = o00o003.f40403OooO0O0[i4];
                                        if (!zOooO0O1 || !o0o00o0o2.equals(o0o00o0o) || z11) {
                                            Oooo0oo(rendererArr2[i4], o00oooo15.OooO0o0());
                                        }
                                    }
                                }
                            } else {
                                long jOooO0o0 = o00oooo15.OooO0o0();
                                for (Renderer renderer2 : rendererArr2) {
                                    if (renderer2.OooOo0() != null) {
                                        Oooo0oo(renderer2, jOooO0o0);
                                    }
                                }
                            }
                        }
                    }
                } else if (o00oooo10.f39217OooO0o.f39227OooO || this.f11293OooOooo) {
                    for (int i5 = 0; i5 < rendererArr2.length; i5++) {
                        Renderer renderer3 = rendererArr2[i5];
                        SampleStream sampleStream2 = o00oooo10.f39215OooO0OO[i5];
                        if (sampleStream2 != null && renderer3.OooOo0() == sampleStream2 && renderer3.OooO0oO()) {
                            long j3 = o00oooo10.f39217OooO0o.f39233OooO0o0;
                            Oooo0oo(renderer3, (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? -9223372036854775807L : j3 + o00oooo10.f39226OooOOOO);
                        }
                    }
                }
            }
            o0OoOo0 o0oooo5 = this.f11285OooOo0O;
            o00OOOO0 o00oooo16 = o0oooo5.f12854OooO;
            if (o00oooo16 == null || o0oooo5.f12862OooO0oo == o00oooo16 || o00oooo16.f39219OooO0oO) {
                z8 = true;
            } else {
                o00O000 o00o004 = o00oooo16.f39224OooOOO;
                boolean z12 = false;
                int i6 = 0;
                while (true) {
                    rendererArr = this.f11267OooO0Oo;
                    if (i6 >= rendererArr.length) {
                        break;
                    }
                    Renderer renderer4 = rendererArr[i6];
                    if (OooOOo(renderer4)) {
                        SampleStream sampleStreamOooOo0 = renderer4.OooOo0();
                        SampleStream[] sampleStreamArr = o00oooo16.f39215OooO0OO;
                        boolean z13 = sampleStreamOooOo0 != sampleStreamArr[i6];
                        if (!o00o004.OooO0O0(i6) || z13) {
                            if (!renderer4.OooOOO0()) {
                                com.google.android.exoplayer2.trackselection.OooO0o oooO0o = o00o004.f40404OooO0OO[i6];
                                int length = oooO0o != null ? oooO0o.length() : 0;
                                OooOo[] oooOoArr = new OooOo[length];
                                for (int i7 = 0; i7 < length; i7++) {
                                    oooOoArr[i7] = oooO0o.OooO0O0(i7);
                                }
                                renderer4.OooOOOO(oooOoArr, sampleStreamArr[i6], o00oooo16.OooO0o0(), o00oooo16.f39226OooOOOO);
                            } else if (renderer4.OooO0Oo()) {
                                OooO0Oo(renderer4);
                            } else {
                                z12 = true;
                            }
                        }
                    }
                    i6++;
                }
                z8 = true;
                if (!z12) {
                    OooO0o(new boolean[rendererArr.length]);
                }
            }
            boolean z14 = false;
            while (true) {
                boolean zOoooOoO = OoooOoO();
                o0OoOo0 o0oooo6 = this.f11285OooOo0O;
                if (!((zOoooOoO && !this.f11293OooOooo && (o00oooo1 = o0oooo6.f12862OooO0oo) != null && (o00oooo2 = o00oooo1.f39223OooOO0o) != null && this.f11304Oooo0oo >= o00oooo2.OooO0o0() && o00oooo2.f39219OooO0oO) ? z8 : false)) {
                    break;
                }
                if (z14) {
                    OooOo0();
                }
                o00OOOO0 o00oooo0OooO00o = o0oooo6.OooO00o();
                o00oooo0OooO00o.getClass();
                if (this.f11289OooOoOO.f39263OooO0O0.f39859OooO00o.equals(o00oooo0OooO00o.f39217OooO0o.f39228OooO00o.f39859OooO00o)) {
                    com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = this.f11289OooOoOO.f39263OooO0O0;
                    if (oooO0O0.f39860OooO0O0 == -1) {
                        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O1 = o00oooo0OooO00o.f39217OooO0o.f39228OooO00o;
                        if (oooO0O1.f39860OooO0O0 != -1 || oooO0O0.f39863OooO0o0 == oooO0O1.f39863OooO0o0) {
                            z9 = false;
                        } else {
                            z9 = z8;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                o00OOOOo o00ooooo2 = o00oooo0OooO00o.f39217OooO0o;
                com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O2 = o00ooooo2.f39228OooO00o;
                long j4 = o00ooooo2.f39229OooO0O0;
                this.f11289OooOoOO = OooOOOo(oooO0O2, j4, o00ooooo2.f39230OooO0OO, j4, !z9, 0);
                OooOooo();
                OooooOo();
                z14 = z8;
                z8 = z14;
            }
            z = z8;
        }
        int i8 = this.f11289OooOoOO.f39267OooO0o0;
        if (i8 == z || i8 == 4) {
            return;
        }
        o00OOOO0 o00oooo17 = this.f11285OooOo0O.f12862OooO0oo;
        if (o00oooo17 == null) {
            this.f11273OooOO0O.OooO(jOooO00o + 10);
            return;
        }
        o0O000.OooO00o("doSomeWork");
        OooooOo();
        if (o00oooo17.f39216OooO0Oo) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            o00oooo17.f39213OooO00o.OooOo00(this.f11289OooOoOO.f39277OooOOo - this.f11278OooOOOo, this.f11280OooOOo0);
            z2 = z;
            z3 = z2;
            int i9 = 0;
            while (true) {
                Renderer[] rendererArr3 = this.f11267OooO0Oo;
                if (i9 >= rendererArr3.length) {
                    break;
                }
                Renderer renderer5 = rendererArr3[i9];
                if (OooOOo(renderer5)) {
                    renderer5.OooOo00(this.f11304Oooo0oo, jElapsedRealtime);
                    z3 = (z3 && renderer5.OooO0Oo()) ? z : false;
                    boolean z15 = o00oooo17.f39215OooO0OO[i9] != renderer5.OooOo0() ? z : false;
                    boolean z16 = (z15 || ((z15 || !renderer5.OooO0oO()) ? false : z) || renderer5.OooO0O0() || renderer5.OooO0Oo()) ? z : false;
                    z2 = (z2 && z16) ? z : false;
                    if (!z16) {
                        renderer5.OooOO0o();
                    }
                }
                i9++;
            }
        } else {
            o00oooo17.f39213OooO00o.OooOOOO();
            z2 = z;
            z3 = z2;
        }
        long j5 = o00oooo17.f39217OooO0o.f39233OooO0o0;
        boolean z17 = (z3 && o00oooo17.f39216OooO0Oo && (j5 == -9223372036854775807L || j5 <= this.f11289OooOoOO.f39277OooOOo)) ? z : false;
        if (z17 && this.f11293OooOooo) {
            z4 = false;
            this.f11293OooOooo = false;
            OoooO(this.f11289OooOoOO.f39274OooOOO0, 5, false, false);
        } else {
            z4 = false;
        }
        if (z17 && o00oooo17.f39217OooO0o.f39227OooO) {
            OoooOo0(4);
            OooooO0();
        } else {
            o0O000o0 o0o000o2 = this.f11289OooOoOO;
            if (o0o000o2.f39267OooO0o0 == 2) {
                if (this.f11301Oooo0o == 0) {
                    zOooOOoo = OooOOoo();
                    z2 = z2;
                } else {
                    if (z2) {
                        if (o0o000o2.f39268OooO0oO) {
                            o0OoOo0 o0oooo7 = this.f11285OooOo0O;
                            o00OOOO0 o00oooo18 = o0oooo7.f12862OooO0oo;
                            long j6 = OoooOoo(o0o000o2.f39262OooO00o, o00oooo18.f39217OooO0o.f39228OooO00o) ? ((com.google.android.exoplayer2.OooOO0) this.f11282OooOo).f11055OooO : -9223372036854775807L;
                            o00OOOO0 o00oooo19 = o0oooo7.f12863OooOO0;
                            boolean z18 = (((!o00oooo19.f39216OooO0Oo || (o00oooo19.f39218OooO0o0 && (o00oooo19.f39213OooO00o.OooOOoo() > Long.MIN_VALUE ? 1 : (o00oooo19.f39213OooO00o.OooOOoo() == Long.MIN_VALUE ? 0 : -1)) != 0)) ? z4 : z) && o00oooo19.f39217OooO0o.f39227OooO) ? z : z4;
                            boolean z19 = (!o00oooo19.f39217OooO0o.f39228OooO00o.OooO00o() || o00oooo19.f39216OooO0Oo) ? z4 : z;
                            if (z18 || z19) {
                                z2 = z2;
                            } else {
                                o0o0Oo o0o0oo = this.f11266OooO;
                                o0O000o0 o0o000o3 = this.f11289OooOoOO;
                                oo0o0Oo oo0o0oo2 = o0o000o3.f39262OooO00o;
                                com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O3 = o00oooo18.f39217OooO0o.f39228OooO00o;
                                long j7 = o0o000o3.f39276OooOOOo;
                                o00OOOO0 o00oooo20 = this.f11285OooOo0O.f12863OooOO0;
                                if (o0o0oo.OooO0Oo(o00oooo20 == null ? 0L : Math.max(0L, j7 - (this.f11304Oooo0oo - o00oooo20.f39226OooOOOO)), this.f11279OooOOo.OooO00o().f12827OooO0Oo, this.f11296Oooo000, j6)) {
                                }
                            }
                        } else {
                            z2 = z2;
                        }
                        zOooOOoo = z;
                    } else {
                        z2 = z2;
                    }
                    zOooOOoo = false;
                }
                i = 3;
                if (zOooOOoo) {
                    OoooOo0(3);
                    this.f11305OoooO0 = null;
                    if (OoooOoO()) {
                        Ooooo00();
                    }
                }
            } else {
                z2 = z2;
                i = 3;
            }
            if (this.f11289OooOoOO.f39267OooO0o0 == i && (this.f11301Oooo0o != 0 ? !z2 : !OooOOoo())) {
                this.f11296Oooo000 = OoooOoO();
                OoooOo0(2);
                if (this.f11296Oooo000) {
                    for (o00OOOO0 o00oooo21 = this.f11285OooOo0O.f12862OooO0oo; o00oooo21 != null; o00oooo21 = o00oooo21.f39223OooOO0o) {
                        for (com.google.android.exoplayer2.trackselection.OooO0o oooO0o2 : o00oooo21.f39224OooOOO.f40404OooO0OO) {
                            if (oooO0o2 != null) {
                                oooO0o2.OooOOo();
                            }
                        }
                    }
                    com.google.android.exoplayer2.OooOO0 oooOO1 = (com.google.android.exoplayer2.OooOO0) this.f11282OooOo;
                    long j8 = oooOO1.f11055OooO;
                    if (j8 != -9223372036854775807L) {
                        long j9 = j8 + oooOO1.f11057OooO0O0;
                        oooOO1.f11055OooO = j9;
                        long j10 = oooOO1.f11063OooO0oo;
                        if (j10 != -9223372036854775807L && j9 > j10) {
                            oooOO1.f11055OooO = j10;
                        }
                        oooOO1.f11068OooOOO0 = -9223372036854775807L;
                    }
                }
                OooooO0();
            }
        }
        if (this.f11289OooOoOO.f39267OooO0o0 == 2) {
            int i10 = 0;
            while (true) {
                Renderer[] rendererArr4 = this.f11267OooO0Oo;
                if (i10 >= rendererArr4.length) {
                    break;
                }
                if (OooOOo(rendererArr4[i10]) && this.f11267OooO0Oo[i10].OooOo0() == o00oooo17.f39215OooO0OO[i10]) {
                    this.f11267OooO0Oo[i10].OooOO0o();
                }
                i10++;
            }
            o0O000o0 o0o000o4 = this.f11289OooOoOO;
            if (o0o000o4.f39268OooO0oO || o0o000o4.f39278OooOOo0 >= 500000 || !OooOOo0()) {
                z5 = false;
            } else {
                z5 = z;
            }
        } else {
            z5 = false;
        }
        if (!z5) {
            this.f11307OoooO0O = -9223372036854775807L;
        } else if (this.f11307OoooO0O == -9223372036854775807L) {
            this.f11307OoooO0O = this.f11284OooOo00.elapsedRealtime();
        } else if (this.f11284OooOo00.elapsedRealtime() - this.f11307OoooO0O >= 4000) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        boolean z20 = (OoooOoO() && this.f11289OooOoOO.f39267OooO0o0 == 3) ? z : false;
        if (!this.f11302Oooo0o0 || !this.f11300Oooo0OO || !z20) {
            z = false;
        }
        o0O000o0 o0o000o5 = this.f11289OooOoOO;
        if (o0o000o5.f39275OooOOOO != z) {
            this.f11289OooOoOO = new o0O000o0(o0o000o5.f39262OooO00o, o0o000o5.f39263OooO0O0, o0o000o5.f39264OooO0OO, o0o000o5.f39265OooO0Oo, o0o000o5.f39267OooO0o0, o0o000o5.f39266OooO0o, o0o000o5.f39268OooO0oO, o0o000o5.f39269OooO0oo, o0o000o5.f39261OooO, o0o000o5.f39270OooOO0, o0o000o5.f39271OooOO0O, o0o000o5.f39272OooOO0o, o0o000o5.f39274OooOOO0, o0o000o5.f39273OooOOO, o0o000o5.f39276OooOOOo, o0o000o5.f39278OooOOo0, o0o000o5.f39277OooOOo, o0o000o5.f39279OooOOoo, z);
        }
        this.f11300Oooo0OO = false;
        if (!z && (i2 = this.f11289OooOoOO.f39267OooO0o0) != 4) {
            if (z20 || i2 == 2) {
                this.f11273OooOO0O.OooO(jOooO00o + 10);
            } else if (i2 == 3 && this.f11301Oooo0o != 0) {
                this.f11273OooOO0O.OooO(jOooO00o + 1000);
            }
        }
        o0O000.OooO0O0();
    }

    public final long OooO0oO(oo0o0Oo oo0o0oo, Object obj, long j) {
        oo0o0Oo.OooO0O0 oooO0O0 = this.f11277OooOOOO;
        int i = oo0o0oo.OooO0oo(obj, oooO0O0).f12906OooO0o;
        oo0o0Oo.OooO0OO oooO0OO = this.f11275OooOOO;
        oo0o0oo.OooOOO(i, oooO0OO);
        if (oooO0OO.f12927OooO != -9223372036854775807L && oooO0OO.OooO00o() && oooO0OO.f12935OooOO0o) {
            return o0O00.Oooo0O0(o0O00.OooOOoo(oooO0OO.f12933OooOO0) - oooO0OO.f12927OooO) - (j + oooO0O0.f12909OooO0oo);
        }
        return -9223372036854775807L;
    }

    public final long OooO0oo() {
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12854OooO;
        if (o00oooo1 == null) {
            return 0L;
        }
        long jMax = o00oooo1.f39226OooOOOO;
        if (!o00oooo1.f39216OooO0Oo) {
            return jMax;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.f11267OooO0Oo;
            if (i >= rendererArr.length) {
                return jMax;
            }
            if (OooOOo(rendererArr[i]) && rendererArr[i].OooOo0() == o00oooo1.f39215OooO0OO[i]) {
                long jOooOo0O = rendererArr[i].OooOo0O();
                if (jOooOo0O == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jOooOo0O, jMax);
            }
            i++;
        }
    }

    public final void OooOO0(com.google.android.exoplayer2.source.OooOOO oooOOO) {
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12863OooOO0;
        if (o00oooo1 != null && o00oooo1.f39213OooO00o == oooOOO) {
            long j = this.f11304Oooo0oo;
            if (o00oooo1 != null) {
                o00O000o.OooO0Oo(o00oooo1.f39223OooOO0o == null);
                if (o00oooo1.f39216OooO0Oo) {
                    o00oooo1.f39213OooO00o.OooOo0(j - o00oooo1.f39226OooOOOO);
                }
            }
            OooOo00();
        }
    }

    public final void OooOO0O(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
        if (o00oooo1 != null) {
            exoPlaybackException = exoPlaybackException.OooO00o(o00oooo1.f39217OooO0o.f39228OooO00o);
        }
        Log.OooO0Oo("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        Ooooo0o(false, false);
        this.f11289OooOoOO = this.f11289OooOoOO.OooO0o0(exoPlaybackException);
    }

    public final void OooOO0o(boolean z) {
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12863OooOO0;
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o00oooo1 == null ? this.f11289OooOoOO.f39263OooO0O0 : o00oooo1.f39217OooO0o.f39228OooO00o;
        boolean z2 = !this.f11289OooOoOO.f39271OooOO0O.equals(oooO0O0);
        if (z2) {
            this.f11289OooOoOO = this.f11289OooOoOO.OooO0O0(oooO0O0);
        }
        o0O000o0 o0o000o1 = this.f11289OooOoOO;
        o0o000o1.f39276OooOOOo = o00oooo1 == null ? o0o000o1.f39277OooOOo : o00oooo1.OooO0Oo();
        o0O000o0 o0o000o2 = this.f11289OooOoOO;
        long j = o0o000o2.f39276OooOOOo;
        o00OOOO0 o00oooo2 = this.f11285OooOo0O.f12863OooOO0;
        o0o000o2.f39278OooOOo0 = o00oooo2 != null ? Math.max(0L, j - (this.f11304Oooo0oo - o00oooo2.f39226OooOOOO)) : 0L;
        if ((z2 || z) && o00oooo1 != null && o00oooo1.f39216OooO0Oo) {
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O1 = o00oooo1.f39217OooO0o.f39228OooO00o;
            o00O000 o00o001 = o00oooo1.f39224OooOOO;
            oo0o0Oo oo0o0oo = this.f11289OooOoOO.f39262OooO00o;
            this.f11266OooO.OooO0oO(this.f11267OooO0Oo, o00o001.f40404OooO0OO);
        }
    }

    public final void OooOOO(com.google.android.exoplayer2.source.OooOOO oooOOO) throws ExoPlaybackException {
        o0OoOo0 o0oooo0 = this.f11285OooOo0O;
        o00OOOO0 o00oooo1 = o0oooo0.f12863OooOO0;
        if (o00oooo1 != null && o00oooo1.f39213OooO00o == oooOOO) {
            float f = this.f11279OooOOo.OooO00o().f12827OooO0Oo;
            oo0o0Oo oo0o0oo = this.f11289OooOoOO.f39262OooO00o;
            o00oooo1.f39216OooO0Oo = true;
            o00oooo1.f39225OooOOO0 = o00oooo1.f39213OooO00o.OooOOo();
            o00O000 o00o000OooO0oO = o00oooo1.OooO0oO(f, oo0o0oo);
            o00OOOOo o00ooooo2 = o00oooo1.f39217OooO0o;
            long jMax = o00ooooo2.f39229OooO0O0;
            long j = o00ooooo2.f39233OooO0o0;
            if (j != -9223372036854775807L && jMax >= j) {
                jMax = Math.max(0L, j - 1);
            }
            long jOooO00o = o00oooo1.OooO00o(o00o000OooO0oO, jMax, false, new boolean[o00oooo1.f39212OooO.length]);
            long j2 = o00oooo1.f39226OooOOOO;
            o00OOOOo o00ooooo3 = o00oooo1.f39217OooO0o;
            o00oooo1.f39226OooOOOO = (o00ooooo3.f39229OooO0O0 - jOooO00o) + j2;
            o00oooo1.f39217OooO0o = o00ooooo3.OooO0O0(jOooO00o);
            o00O000 o00o001 = o00oooo1.f39224OooOOO;
            oo0o0Oo oo0o0oo2 = this.f11289OooOoOO.f39262OooO00o;
            com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr = o00o001.f40404OooO0OO;
            o0o0Oo o0o0oo = this.f11266OooO;
            Renderer[] rendererArr = this.f11267OooO0Oo;
            o0o0oo.OooO0oO(rendererArr, oooO0oArr);
            if (o00oooo1 == o0oooo0.f12862OooO0oo) {
                Oooo000(o00oooo1.f39217OooO0o.f39229OooO0O0);
                OooO0o(new boolean[rendererArr.length]);
                o0O000o0 o0o000o1 = this.f11289OooOoOO;
                com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o0o000o1.f39263OooO0O0;
                long j3 = o00oooo1.f39217OooO0o.f39229OooO0O0;
                this.f11289OooOoOO = OooOOOo(oooO0O0, j3, o0o000o1.f39264OooO0OO, j3, false, 5);
            }
            OooOo00();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v51 ??, still in use, count: 1, list:
          (r0v51 ?? I:??[OBJECT, ARRAY]) from 0x0034: MOVE (r7v26 ?? I:??[OBJECT, ARRAY]) = (r0v51 ?? I:??[OBJECT, ARRAY]) (LINE:53)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void OooOOO0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v51 ??, still in use, count: 1, list:
          (r0v51 ?? I:??[OBJECT, ARRAY]) from 0x0034: MOVE (r7v26 ?? I:??[OBJECT, ARRAY]) = (r0v51 ?? I:??[OBJECT, ARRAY]) (LINE:53)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public final void OooOOOO(o00Ooo o00ooo2, float f, boolean z, boolean z2) throws ExoPlaybackException {
        int i;
        if (z) {
            if (z2) {
                this.f11291OooOoo0.OooO00o(1);
            }
            this.f11289OooOoOO = this.f11289OooOoOO.OooO0o(o00ooo2);
        }
        float f2 = o00ooo2.f12827OooO0Oo;
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
        while (true) {
            i = 0;
            if (o00oooo1 == null) {
                break;
            }
            com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr = o00oooo1.f39224OooOOO.f40404OooO0OO;
            int length = oooO0oArr.length;
            while (i < length) {
                com.google.android.exoplayer2.trackselection.OooO0o oooO0o = oooO0oArr[i];
                if (oooO0o != null) {
                    oooO0o.OooO0o0(f2);
                }
                i++;
            }
            o00oooo1 = o00oooo1.f39223OooOO0o;
        }
        Renderer[] rendererArr = this.f11267OooO0Oo;
        int length2 = rendererArr.length;
        while (i < length2) {
            Renderer renderer = rendererArr[i];
            if (renderer != null) {
                renderer.OooOOo(f, o00ooo2.f12827OooO0Oo);
            }
            i++;
        }
    }

    @CheckResult
    public final o0O000o0 OooOOOo(com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, long j, long j2, long j3, boolean z, int i) {
        o000O0 o000o0;
        o00O000 o00o001;
        List<Metadata> list;
        com.google.common.collect.o0O00 o0o00OooO0oo;
        this.f11306OoooO00 = (!this.f11306OoooO00 && j == this.f11289OooOoOO.f39277OooOOo && oooO0O0.equals(this.f11289OooOoOO.f39263OooO0O0)) ? false : true;
        OooOooo();
        o0O000o0 o0o000o1 = this.f11289OooOoOO;
        o000O0 o000o1 = o0o000o1.f39269OooO0oo;
        o00O000 o00o002 = o0o000o1.f39261OooO;
        List<Metadata> list2 = o0o000o1.f39270OooOO0;
        if (this.f11286OooOo0o.f12809OooOO0O) {
            o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
            o000O0 o000o2 = o00oooo1 == null ? o000O0.f39864OooO0oO : o00oooo1.f39225OooOOO0;
            o00O000 o00o003 = o00oooo1 == null ? this.f11271OooO0oo : o00oooo1.f39224OooOOO;
            com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr = o00o003.f40404OooO0OO;
            ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
            boolean z2 = false;
            for (com.google.android.exoplayer2.trackselection.OooO0o oooO0o : oooO0oArr) {
                if (oooO0o != null) {
                    Metadata metadata = oooO0o.OooO0O0(0).f11210OooOOO0;
                    if (metadata == null) {
                        oooO00o.OooO0OO(new Metadata(new Metadata.Entry[0]));
                    } else {
                        oooO00o.OooO0OO(metadata);
                        z2 = true;
                    }
                }
            }
            if (z2) {
                o0o00OooO0oo = oooO00o.OooO0oo();
            } else {
                ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f19157OooO0o0;
                o0o00OooO0oo = com.google.common.collect.o0O00.f19536OooO0oo;
            }
            if (o00oooo1 != null) {
                o00OOOOo o00ooooo2 = o00oooo1.f39217OooO0o;
                if (o00ooooo2.f39230OooO0OO != j2) {
                    o00oooo1.f39217OooO0o = o00ooooo2.OooO00o(j2);
                }
            }
            list = o0o00OooO0oo;
            o000o0 = o000o2;
            o00o001 = o00o003;
        } else if (oooO0O0.equals(o0o000o1.f39263OooO0O0)) {
            o000o0 = o000o1;
            o00o001 = o00o002;
            list = list2;
        } else {
            o000o0 = o000O0.f39864OooO0oO;
            o00o001 = this.f11271OooO0oo;
            list = com.google.common.collect.o0O00.f19536OooO0oo;
        }
        if (z) {
            OooO0o oooO0o2 = this.f11291OooOoo0;
            if (!oooO0o2.f11315OooO0Oo || oooO0o2.f11317OooO0o0 == 5) {
                oooO0o2.f11312OooO00o = true;
                oooO0o2.f11315OooO0Oo = true;
                oooO0o2.f11317OooO0o0 = i;
            } else {
                o00O000o.OooO00o(i == 5);
            }
        }
        o0O000o0 o0o000o2 = this.f11289OooOoOO;
        long j4 = o0o000o2.f39276OooOOOo;
        o00OOOO0 o00oooo2 = this.f11285OooOo0O.f12863OooOO0;
        return o0o000o2.OooO0OO(oooO0O0, j, j2, j3, o00oooo2 == null ? 0L : Math.max(0L, j4 - (this.f11304Oooo0oo - o00oooo2.f39226OooOOOO)), o000o0, o00o001, list);
    }

    public final boolean OooOOo0() {
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12863OooOO0;
        if (o00oooo1 == null) {
            return false;
        }
        return (!o00oooo1.f39216OooO0Oo ? 0L : o00oooo1.f39213OooO00o.OooO0o0()) != Long.MIN_VALUE;
    }

    public final boolean OooOOoo() {
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
        long j = o00oooo1.f39217OooO0o.f39233OooO0o0;
        return o00oooo1.f39216OooO0Oo && (j == -9223372036854775807L || this.f11289OooOoOO.f39277OooOOo < j || !OoooOoO());
    }

    public final void OooOo() {
        this.f11291OooOoo0.OooO00o(1);
        int i = 0;
        OooOooO(false, false, false, true);
        this.f11266OooO.OooO00o();
        OoooOo0(this.f11289OooOoOO.f39262OooO00o.OooOOo0() ? 4 : 2);
        o00O00O o00o00oOooO0o0 = this.f11272OooOO0.OooO0o0();
        o00O0O o00o0o2 = this.f11286OooOo0o;
        o00O000o.OooO0Oo(!o00o0o2.f12809OooOO0O);
        o00o0o2.f12810OooOO0o = o00o00oOooO0o0;
        while (true) {
            ArrayList arrayList = o00o0o2.f12801OooO0O0;
            if (i >= arrayList.size()) {
                o00o0o2.f12809OooOO0O = true;
                this.f11273OooOO0O.OooOO0O(2);
                return;
            } else {
                o00O0O.OooO0OO oooO0OO = (o00O0O.OooO0OO) arrayList.get(i);
                o00o0o2.OooO0o0(oooO0OO);
                o00o0o2.f12806OooO0oO.add(oooO0OO);
                i++;
            }
        }
    }

    public final void OooOo0() {
        OooO0o oooO0o = this.f11291OooOoo0;
        o0O000o0 o0o000o1 = this.f11289OooOoOO;
        int i = 0;
        boolean z = oooO0o.f11312OooO00o | (oooO0o.f11313OooO0O0 != o0o000o1);
        oooO0o.f11312OooO00o = z;
        oooO0o.f11313OooO0O0 = o0o000o1;
        if (z) {
            OooOOO oooOOO = (OooOOO) ((o00O0O00) this.f11283OooOo0).f39193OooO0Oo;
            oooOOO.getClass();
            oooOOO.f11077OooO.OooO0oo(new p203o00o0o0o.o00O00OO(i, oooOOO, oooO0o));
            this.f11291OooOoo0 = new OooO0o(this.f11289OooOoOO);
        }
    }

    public final void OooOo00() {
        boolean zOooO0oo;
        if (OooOOo0()) {
            o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12863OooOO0;
            long jOooO0o0 = !o00oooo1.f39216OooO0Oo ? 0L : o00oooo1.f39213OooO00o.OooO0o0();
            o00OOOO0 o00oooo2 = this.f11285OooOo0O.f12863OooOO0;
            long jMax = o00oooo2 == null ? 0L : Math.max(0L, jOooO0o0 - (this.f11304Oooo0oo - o00oooo2.f39226OooOOOO));
            if (o00oooo1 != this.f11285OooOo0O.f12862OooO0oo) {
                long j = o00oooo1.f39217OooO0o.f39229OooO0O0;
            }
            zOooO0oo = this.f11266OooO.OooO0oo(jMax, this.f11279OooOOo.OooO00o().f12827OooO0Oo);
            if (!zOooO0oo && jMax < 500000 && (this.f11278OooOOOo > 0 || this.f11280OooOOo0)) {
                this.f11285OooOo0O.f12862OooO0oo.f39213OooO00o.OooOo00(this.f11289OooOoOO.f39277OooOOo, false);
                zOooO0oo = this.f11266OooO.OooO0oo(jMax, this.f11279OooOOo.OooO00o().f12827OooO0Oo);
            }
        } else {
            zOooO0oo = false;
        }
        this.f11297Oooo00O = zOooO0oo;
        if (zOooO0oo) {
            o00OOOO0 o00oooo3 = this.f11285OooOo0O.f12863OooOO0;
            long j2 = this.f11304Oooo0oo;
            o00O000o.OooO0Oo(o00oooo3.f39223OooOO0o == null);
            o00oooo3.f39213OooO00o.OooOOo0(j2 - o00oooo3.f39226OooOOOO);
        }
        OooooOO();
    }

    public final void OooOo0O() throws ExoPlaybackException {
        OooOOO0(this.f11286OooOo0o.OooO0O0(), true);
    }

    public final void OooOo0o(OooO0O0 oooO0O0) throws ExoPlaybackException {
        this.f11291OooOoo0.OooO00o(1);
        oooO0O0.getClass();
        o00O0O o00o0o2 = this.f11286OooOo0o;
        o00o0o2.getClass();
        o00O000o.OooO00o(o00o0o2.f12801OooO0O0.size() >= 0);
        o00o0o2.f12808OooOO0 = null;
        OooOOO0(o00o0o2.OooO0O0(), false);
    }

    public final void OooOoO() {
        OooOooO(true, false, true, false);
        OooOoOO();
        this.f11266OooO.OooO();
        OoooOo0(1);
        HandlerThread handlerThread = this.f11274OooOO0o;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f11290OooOoo = true;
            notifyAll();
        }
    }

    public final synchronized boolean OooOoO0() {
        if (!this.f11290OooOoo && this.f11276OooOOO0.getThread().isAlive()) {
            this.f11273OooOO0O.OooOO0O(7);
            Oooooo(new o00OO(this), this.f11288OooOoO0);
            return this.f11290OooOoo;
        }
        return true;
    }

    public final void OooOoOO() {
        for (int i = 0; i < this.f11267OooO0Oo.length; i++) {
            com.google.android.exoplayer2.OooO0o oooO0o = (com.google.android.exoplayer2.OooO0o) this.f11268OooO0o[i];
            synchronized (oooO0o.f11042OooO0Oo) {
                oooO0o.f11054OooOOo0 = null;
            }
            this.f11267OooO0Oo[i].release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[EDGE_INSN: B:20:0x0042->B:21:0x0044 BREAK  A[LOOP:1: B:13:0x0033->B:18:0x003d]] */
    public final void OooOoo() throws ExoPlaybackException {
        boolean z;
        float f = this.f11279OooOOo.OooO00o().f12827OooO0Oo;
        o0OoOo0 o0oooo0 = this.f11285OooOo0O;
        o00OOOO0 o00oooo1 = o0oooo0.f12862OooO0oo;
        o00OOOO0 o00oooo2 = o0oooo0.f12854OooO;
        boolean z2 = true;
        for (o00OOOO0 o00oooo3 = o00oooo1; o00oooo3 != null && o00oooo3.f39216OooO0Oo; o00oooo3 = o00oooo3.f39223OooOO0o) {
            o00O000 o00o000OooO0oO = o00oooo3.OooO0oO(f, this.f11289OooOoOO.f39262OooO00o);
            o00O000 o00o001 = o00oooo3.f39224OooOOO;
            if (o00o001 == null) {
                z = false;
                break;
            }
            int length = o00o001.f40404OooO0OO.length;
            com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr = o00o000OooO0oO.f40404OooO0OO;
            if (length != oooO0oArr.length) {
                z = false;
                break;
            }
            int i = 0;
            while (true) {
                if (i >= oooO0oArr.length) {
                    z = true;
                    break;
                } else {
                    if (!o00o000OooO0oO.OooO00o(o00o001, i)) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                if (z2) {
                    o0OoOo0 o0oooo1 = this.f11285OooOo0O;
                    o00OOOO0 o00oooo4 = o0oooo1.f12862OooO0oo;
                    boolean zOooOO0o = o0oooo1.OooOO0o(o00oooo4);
                    boolean[] zArr = new boolean[this.f11267OooO0Oo.length];
                    long jOooO00o = o00oooo4.OooO00o(o00o000OooO0oO, this.f11289OooOoOO.f39277OooOOo, zOooOO0o, zArr);
                    o0O000o0 o0o000o1 = this.f11289OooOoOO;
                    boolean z3 = (o0o000o1.f39267OooO0o0 == 4 || jOooO00o == o0o000o1.f39277OooOOo) ? false : true;
                    o0O000o0 o0o000o2 = this.f11289OooOoOO;
                    this.f11289OooOoOO = OooOOOo(o0o000o2.f39263OooO0O0, jOooO00o, o0o000o2.f39264OooO0OO, o0o000o2.f39265OooO0Oo, z3, 5);
                    if (z3) {
                        Oooo000(jOooO00o);
                    }
                    boolean[] zArr2 = new boolean[this.f11267OooO0Oo.length];
                    int i2 = 0;
                    while (true) {
                        Renderer[] rendererArr = this.f11267OooO0Oo;
                        if (i2 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i2];
                        boolean zOooOOo = OooOOo(renderer);
                        zArr2[i2] = zOooOOo;
                        SampleStream sampleStream = o00oooo4.f39215OooO0OO[i2];
                        if (zOooOOo) {
                            if (sampleStream != renderer.OooOo0()) {
                                OooO0Oo(renderer);
                            } else if (zArr[i2]) {
                                renderer.OooOo0o(this.f11304Oooo0oo);
                            }
                        }
                        i2++;
                    }
                    OooO0o(zArr2);
                } else {
                    this.f11285OooOo0O.OooOO0o(o00oooo3);
                    if (o00oooo3.f39216OooO0Oo) {
                        o00oooo3.OooO00o(o00o000OooO0oO, Math.max(o00oooo3.f39217OooO0o.f39229OooO0O0, this.f11304Oooo0oo - o00oooo3.f39226OooOOOO), false, new boolean[o00oooo3.f39212OooO.length]);
                    }
                }
                OooOO0o(true);
                if (this.f11289OooOoOO.f39267OooO0o0 != 4) {
                    OooOo00();
                    OooooOo();
                    this.f11273OooOO0O.OooOO0O(2);
                    return;
                }
                return;
            }
            if (o00oooo3 == o00oooo2) {
                z2 = false;
            }
        }
    }

    public final void OooOoo0(int i, int i2, com.google.android.exoplayer2.source.o00Ooo o00ooo2) throws ExoPlaybackException {
        this.f11291OooOoo0.OooO00o(1);
        o00O0O o00o0o2 = this.f11286OooOo0o;
        o00o0o2.getClass();
        o00O000o.OooO00o(i >= 0 && i <= i2 && i2 <= o00o0o2.f12801OooO0O0.size());
        o00o0o2.f12808OooOO0 = o00ooo2;
        o00o0o2.OooO0oO(i, i2);
        OooOOO0(o00o0o2.OooO0O0(), false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[PHI: r4 r5 r8
      0x00c4: PHI (r4v4 com.google.android.exoplayer2.source.OooOOOO$OooO0O0) = 
      (r4v3 com.google.android.exoplayer2.source.OooOOOO$OooO0O0)
      (r4v12 com.google.android.exoplayer2.source.OooOOOO$OooO0O0)
     binds: [B:39:0x009c, B:41:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r5v2 long) = (r5v1 long), (r5v8 long) binds: [B:39:0x009c, B:41:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r8v2 long) = (r8v1 long), (r8v8 long) binds: [B:39:0x009c, B:41:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOooO(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        oo0o0Oo o0o01;
        List list;
        this.f11273OooOO0O.OooOO0o(2);
        this.f11305OoooO0 = null;
        this.f11296Oooo000 = false;
        com.google.android.exoplayer2.OooOO0O oooOO0O = this.f11279OooOOo;
        oooOO0O.f11070OooO = false;
        o0oOOo o0oooo = oooOO0O.f11071OooO0Oo;
        if (o0oooo.f40628OooO0o0) {
            o0oooo.OooO0O0(o0oooo.OooOOo0());
            o0oooo.f40628OooO0o0 = false;
        }
        this.f11304Oooo0oo = 1000000000000L;
        for (Renderer renderer : this.f11267OooO0Oo) {
            try {
                OooO0Oo(renderer);
            } catch (ExoPlaybackException | RuntimeException e) {
                Log.OooO0Oo("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            for (Renderer renderer2 : this.f11267OooO0Oo) {
                if (this.f11269OooO0o0.remove(renderer2)) {
                    try {
                        renderer2.reset();
                    } catch (RuntimeException e2) {
                        Log.OooO0Oo("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.f11301Oooo0o = 0;
        o0O000o0 o0o000o1 = this.f11289OooOoOO;
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o0o000o1.f39263OooO0O0;
        long jLongValue = o0o000o1.f39277OooOOo;
        if (this.f11289OooOoOO.f39263OooO0O0.OooO00o()) {
            j = this.f11289OooOoOO.f39264OooO0OO;
        } else {
            o0O000o0 o0o000o2 = this.f11289OooOoOO;
            oo0o0Oo.OooO0O0 oooO0O1 = this.f11277OooOOOO;
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O2 = o0o000o2.f39263OooO0O0;
            oo0o0Oo oo0o0oo = o0o000o2.f39262OooO00o;
            if (oo0o0oo.OooOOo0() || oo0o0oo.OooO0oo(oooO0O2.f39859OooO00o, oooO0O1).f12904OooO) {
                j = this.f11289OooOoOO.f39264OooO0OO;
            } else {
                j = this.f11289OooOoOO.f39277OooOOo;
            }
        }
        if (z2) {
            this.f11303Oooo0oO = null;
            Pair<com.google.android.exoplayer2.source.OooOOOO.OooO0O0, Long> pairOooO = OooO(this.f11289OooOoOO.f39262OooO00o);
            oooO0O0 = (com.google.android.exoplayer2.source.OooOOOO.OooO0O0) pairOooO.first;
            jLongValue = ((Long) pairOooO.second).longValue();
            j = -9223372036854775807L;
            z5 = oooO0O0.equals(this.f11289OooOoOO.f39263OooO0O0) ? false : true;
        }
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O3 = oooO0O0;
        long j2 = jLongValue;
        long j3 = j;
        this.f11285OooOo0O.OooO0O0();
        this.f11297Oooo00O = false;
        oo0o0Oo oo0o0oo2 = this.f11289OooOoOO.f39262OooO00o;
        if (z3 && (oo0o0oo2 instanceof p203o00o0o0o.o0O00)) {
            p203o00o0o0o.o0O00 o0o02 = (p203o00o0o0o.o0O00) oo0o0oo2;
            com.google.android.exoplayer2.source.o00Ooo o00ooo2 = this.f11286OooOo0o.f12808OooOO0;
            oo0o0Oo[] oo0o0ooArr = o0o02.f39244OooOOOo;
            oo0o0Oo[] oo0o0ooArr2 = new oo0o0Oo[oo0o0ooArr.length];
            for (int i = 0; i < oo0o0ooArr.length; i++) {
                oo0o0ooArr2[i] = new o00oO0o(oo0o0ooArr[i]);
            }
            o0o01 = new p203o00o0o0o.o0O00(oo0o0ooArr2, o0o02.f39246OooOOo0, o00ooo2);
        } else {
            o0o01 = oo0o0oo2;
        }
        o0O000o0 o0o000o3 = this.f11289OooOoOO;
        int i2 = o0o000o3.f39267OooO0o0;
        ExoPlaybackException exoPlaybackException = z4 ? null : o0o000o3.f39266OooO0o;
        o000O0 o000o0 = z5 ? o000O0.f39864OooO0oO : o0o000o3.f39269OooO0oo;
        o00O000 o00o001 = z5 ? this.f11271OooO0oo : o0o000o3.f39261OooO;
        if (z5) {
            ImmutableList.OooO0O0 oooO0O4 = ImmutableList.f19157OooO0o0;
            list = com.google.common.collect.o0O00.f19536OooO0oo;
        } else {
            list = o0o000o3.f39270OooOO0;
        }
        this.f11289OooOoOO = new o0O000o0(o0o01, oooO0O3, j3, j2, i2, exoPlaybackException, false, o000o0, o00o001, list, oooO0O3, o0o000o3.f39272OooOO0o, o0o000o3.f39274OooOOO0, o0o000o3.f39273OooOOO, j2, 0L, j2, 0L, false);
        if (z3) {
            o00O0O o00o0o2 = this.f11286OooOo0o;
            HashMap<o00O0O.OooO0OO, o00O0O.OooO0O0> map = o00o0o2.f12804OooO0o;
            for (o00O0O.OooO0O0 oooO0O5 : map.values()) {
                try {
                    oooO0O5.f12813OooO00o.OooO00o(oooO0O5.f12814OooO0O0);
                } catch (RuntimeException e3) {
                    Log.OooO0Oo("MediaSourceList", "Failed to release child source.", e3);
                }
                com.google.android.exoplayer2.source.OooOOOO oooOOOO = oooO0O5.f12813OooO00o;
                o00O0O.OooO00o oooO00o = oooO0O5.f12815OooO0OO;
                oooOOOO.OooO0OO(oooO00o);
                oooO0O5.f12813OooO00o.OooOO0O(oooO00o);
            }
            map.clear();
            o00o0o2.f12806OooO0oO.clear();
            o00o0o2.f12809OooOO0O = false;
        }
    }

    public final void OooOooo() {
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
        this.f11293OooOooo = o00oooo1 != null && o00oooo1.f39217OooO0o.f39235OooO0oo && this.f11292OooOooO;
    }

    public final void Oooo(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.f11299Oooo0O0 != z) {
            this.f11299Oooo0O0 = z;
            if (!z) {
                for (Renderer renderer : this.f11267OooO0Oo) {
                    if (!OooOOo(renderer) && this.f11269OooO0o0.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Oooo000(long j) throws ExoPlaybackException {
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
        long j2 = j + (o00oooo1 == null ? 1000000000000L : o00oooo1.f39226OooOOOO);
        this.f11304Oooo0oo = j2;
        this.f11279OooOOo.f11071OooO0Oo.OooO0O0(j2);
        for (Renderer renderer : this.f11267OooO0Oo) {
            if (OooOOo(renderer)) {
                renderer.OooOo0o(this.f11304Oooo0oo);
            }
        }
        for (o00OOOO0 o00oooo2 = r0.f12862OooO0oo; o00oooo2 != null; o00oooo2 = o00oooo2.f39223OooOO0o) {
            for (com.google.android.exoplayer2.trackselection.OooO0o oooO0o : o00oooo2.f39224OooOOO.f40404OooO0OO) {
                if (oooO0o != null) {
                    oooO0o.OooO0oo();
                }
            }
        }
    }

    public final void Oooo00O(oo0o0Oo oo0o0oo, oo0o0Oo oo0o0oo2) {
        if (oo0o0oo.OooOOo0() && oo0o0oo2.OooOOo0()) {
            return;
        }
        ArrayList<OooO0OO> arrayList = this.f11281OooOOoo;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void Oooo0O0(boolean z) throws ExoPlaybackException {
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = this.f11285OooOo0O.f12862OooO0oo.f39217OooO0o.f39228OooO00o;
        long jOooo0o0 = Oooo0o0(oooO0O0, this.f11289OooOoOO.f39277OooOOo, true, false);
        if (jOooo0o0 != this.f11289OooOoOO.f39277OooOOo) {
            o0O000o0 o0o000o1 = this.f11289OooOoOO;
            this.f11289OooOoOO = OooOOOo(oooO0O0, jOooo0o0, o0o000o1.f39264OooO0OO, o0o000o1.f39265OooO0Oo, z, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:22:0x009d, B:24:0x00a7, B:27:0x00ad, B:29:0x00b3, B:30:0x00b6, B:32:0x00bb, B:34:0x00c5, B:36:0x00cb, B:40:0x00d3, B:42:0x00dd, B:44:0x00ed, B:48:0x00f7, B:53:0x010b, B:57:0x0114, B:61:0x011f), top: B:75:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ad A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:22:0x009d, B:24:0x00a7, B:27:0x00ad, B:29:0x00b3, B:30:0x00b6, B:32:0x00bb, B:34:0x00c5, B:36:0x00cb, B:40:0x00d3, B:42:0x00dd, B:44:0x00ed, B:48:0x00f7, B:53:0x010b, B:57:0x0114, B:61:0x011f), top: B:75:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:22:0x009d, B:24:0x00a7, B:27:0x00ad, B:29:0x00b3, B:30:0x00b6, B:32:0x00bb, B:34:0x00c5, B:36:0x00cb, B:40:0x00d3, B:42:0x00dd, B:44:0x00ed, B:48:0x00f7, B:53:0x010b, B:57:0x0114, B:61:0x011f), top: B:75:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:22:0x009d, B:24:0x00a7, B:27:0x00ad, B:29:0x00b3, B:30:0x00b6, B:32:0x00bb, B:34:0x00c5, B:36:0x00cb, B:40:0x00d3, B:42:0x00dd, B:44:0x00ed, B:48:0x00f7, B:53:0x010b, B:57:0x0114, B:61:0x011f), top: B:75:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[Catch: all -> 0x0143, TryCatch #0 {all -> 0x0143, blocks: (B:22:0x009d, B:24:0x00a7, B:27:0x00ad, B:29:0x00b3, B:30:0x00b6, B:32:0x00bb, B:34:0x00c5, B:36:0x00cb, B:40:0x00d3, B:42:0x00dd, B:44:0x00ed, B:48:0x00f7, B:53:0x010b, B:57:0x0114, B:61:0x011f), top: B:75:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x012b  */
    public final void Oooo0OO(OooOO0O oooOO0O) throws Throwable {
        long jLongValue;
        boolean z;
        com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0;
        long j;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        o0OoOo0 o0oooo0;
        boolean z4;
        long jOooo0o0;
        long j4;
        o00OOOO0 o00oooo1;
        long jOooO0OO;
        o0O000o0 o0o000o1;
        int i;
        this.f11291OooOoo0.OooO00o(1);
        Pair<Object, Long> pairOooo00o = Oooo00o(this.f11289OooOoOO.f39262OooO00o, oooOO0O, true, this.f11298Oooo00o, this.f11295Oooo0, this.f11275OooOOO, this.f11277OooOOOO);
        long j5 = -9223372036854775807L;
        try {
            if (pairOooo00o != null) {
                Object obj = pairOooo00o.first;
                jLongValue = ((Long) pairOooo00o.second).longValue();
                long j6 = oooOO0O.f11327OooO0OO == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0OooOOO = this.f11285OooOo0O.OooOOO(this.f11289OooOoOO.f39262OooO00o, obj, jLongValue);
                if (oooO0O0OooOOO.OooO00o()) {
                    this.f11289OooOoOO.f39262OooO00o.OooO0oo(oooO0O0OooOOO.f39859OooO00o, this.f11277OooOOOO);
                    jLongValue = this.f11277OooOOOO.OooO0o(oooO0O0OooOOO.f39860OooO0O0) == oooO0O0OooOOO.f39861OooO0OO ? this.f11277OooOOOO.f12910OooOO0.f13134OooO0o : 0L;
                    j = j6;
                    oooO0O0 = oooO0O0OooOOO;
                    z2 = true;
                } else {
                    z = oooOO0O.f11327OooO0OO == -9223372036854775807L;
                    j5 = j6;
                    oooO0O0 = oooO0O0OooOOO;
                }
                if (this.f11289OooOoOO.f39262OooO00o.OooOOo0()) {
                    if (pairOooo00o == null) {
                        if (this.f11289OooOoOO.f39267OooO0o0 != 1) {
                            OoooOo0(4);
                        }
                        OooOooO(false, true, false, true);
                    } else {
                        if (oooO0O0.equals(this.f11289OooOoOO.f39263OooO0O0)) {
                            o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
                            if (o00oooo1 == null && o00oooo1.f39216OooO0Oo && jLongValue != 0) {
                                jOooO0OO = o00oooo1.f39213OooO00o.OooO0OO(jLongValue, this.f11287OooOoO);
                            } else {
                                jOooO0OO = jLongValue;
                            }
                            if (o0O00.OoooOO0(jOooO0OO) == o0O00.OoooOO0(this.f11289OooOoOO.f39277OooOOo) || !((i = (o0o000o1 = this.f11289OooOoOO).f39267OooO0o0) == 2 || i == 3)) {
                                j3 = jOooO0OO;
                            } else {
                                j4 = o0o000o1.f39277OooOOo;
                            }
                        } else {
                            j3 = jLongValue;
                        }
                        if (this.f11289OooOoOO.f39267OooO0o0 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o0oooo0 = this.f11285OooOo0O;
                        if (o0oooo0.f12862OooO0oo != o0oooo0.f12854OooO) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        jOooo0o0 = Oooo0o0(oooO0O0, j3, z4, z3);
                        z2 |= jLongValue != jOooo0o0;
                        try {
                            o0O000o0 o0o000o2 = this.f11289OooOoOO;
                            oo0o0Oo oo0o0oo = o0o000o2.f39262OooO00o;
                            Oooooo0(oo0o0oo, oooO0O0, oo0o0oo, o0o000o2.f39263OooO0O0, j, true);
                            j4 = jOooo0o0;
                        } catch (Throwable th) {
                            th = th;
                            j2 = jOooo0o0;
                            this.f11289OooOoOO = OooOOOo(oooO0O0, j2, j, j2, z2, 2);
                            throw th;
                        }
                    }
                    this.f11289OooOoOO = OooOOOo(oooO0O0, j4, j, j4, z2, 2);
                    return;
                }
                this.f11303Oooo0oO = oooOO0O;
                j4 = jLongValue;
                this.f11289OooOoOO = OooOOOo(oooO0O0, j4, j, j4, z2, 2);
                return;
            }
            Pair<com.google.android.exoplayer2.source.OooOOOO.OooO0O0, Long> pairOooO = OooO(this.f11289OooOoOO.f39262OooO00o);
            oooO0O0 = (com.google.android.exoplayer2.source.OooOOOO.OooO0O0) pairOooO.first;
            jLongValue = ((Long) pairOooO.second).longValue();
            z = !this.f11289OooOoOO.f39262OooO00o.OooOOo0();
            if (this.f11289OooOoOO.f39262OooO00o.OooOOo0()) {
                if (pairOooo00o == null) {
                    if (this.f11289OooOoOO.f39267OooO0o0 != 1) {
                        OoooOo0(4);
                    }
                    OooOooO(false, true, false, true);
                } else {
                    if (oooO0O0.equals(this.f11289OooOoOO.f39263OooO0O0)) {
                        o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
                        if (o00oooo1 == null) {
                            jOooO0OO = jLongValue;
                        } else {
                            jOooO0OO = jLongValue;
                        }
                        if (o0O00.OoooOO0(jOooO0OO) == o0O00.OoooOO0(this.f11289OooOoOO.f39277OooOOo)) {
                        }
                        j3 = jOooO0OO;
                    } else {
                        j3 = jLongValue;
                    }
                    if (this.f11289OooOoOO.f39267OooO0o0 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o0oooo0 = this.f11285OooOo0O;
                    if (o0oooo0.f12862OooO0oo != o0oooo0.f12854OooO) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jOooo0o0 = Oooo0o0(oooO0O0, j3, z4, z3);
                    z2 |= jLongValue != jOooo0o0;
                    o0O000o0 o0o000o3 = this.f11289OooOoOO;
                    oo0o0Oo oo0o0oo2 = o0o000o3.f39262OooO00o;
                    Oooooo0(oo0o0oo2, oooO0O0, oo0o0oo2, o0o000o3.f39263OooO0O0, j, true);
                    j4 = jOooo0o0;
                }
                this.f11289OooOoOO = OooOOOo(oooO0O0, j4, j, j4, z2, 2);
                return;
            }
            this.f11303Oooo0oO = oooOO0O;
            j4 = jLongValue;
            this.f11289OooOoOO = OooOOOo(oooO0O0, j4, j, j4, z2, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j2 = jLongValue;
        }
        j = j5;
        z2 = z;
    }

    public final void Oooo0o(oo000o oo000oVar) throws ExoPlaybackException {
        Looper looper = oo000oVar.f12891OooO0o;
        Looper looper2 = this.f11276OooOOO0;
        o00O0OOO o00o0ooo2 = this.f11273OooOO0O;
        if (looper != looper2) {
            o00o0ooo2.OooO0o0(15, oo000oVar).OooO00o();
            return;
        }
        synchronized (oo000oVar) {
        }
        try {
            oo000oVar.f12887OooO00o.OooOO0O(oo000oVar.f12890OooO0Oo, oo000oVar.f12892OooO0o0);
            oo000oVar.OooO0O0(true);
            int i = this.f11289OooOoOO.f39267OooO0o0;
            if (i == 3 || i == 2) {
                o00o0ooo2.OooOO0O(2);
            }
        } catch (Throwable th) {
            oo000oVar.OooO0O0(true);
            throw th;
        }
    }

    public final long Oooo0o0(com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, long j, boolean z, boolean z2) throws ExoPlaybackException {
        OooooO0();
        this.f11296Oooo000 = false;
        if (z2 || this.f11289OooOoOO.f39267OooO0o0 == 3) {
            OoooOo0(2);
        }
        o0OoOo0 o0oooo0 = this.f11285OooOo0O;
        o00OOOO0 o00oooo1 = o0oooo0.f12862OooO0oo;
        o00OOOO0 o00oooo2 = o00oooo1;
        while (o00oooo2 != null && !oooO0O0.equals(o00oooo2.f39217OooO0o.f39228OooO00o)) {
            o00oooo2 = o00oooo2.f39223OooOO0o;
        }
        if (z || o00oooo1 != o00oooo2 || (o00oooo2 != null && o00oooo2.f39226OooOOOO + j < 0)) {
            Renderer[] rendererArr = this.f11267OooO0Oo;
            for (Renderer renderer : rendererArr) {
                OooO0Oo(renderer);
            }
            if (o00oooo2 != null) {
                while (o0oooo0.f12862OooO0oo != o00oooo2) {
                    o0oooo0.OooO00o();
                }
                o0oooo0.OooOO0o(o00oooo2);
                o00oooo2.f39226OooOOOO = 1000000000000L;
                OooO0o(new boolean[rendererArr.length]);
            }
        }
        if (o00oooo2 != null) {
            o0oooo0.OooOO0o(o00oooo2);
            if (!o00oooo2.f39216OooO0Oo) {
                o00oooo2.f39217OooO0o = o00oooo2.f39217OooO0o.OooO0O0(j);
            } else if (o00oooo2.f39218OooO0o0) {
                com.google.android.exoplayer2.source.OooOOO oooOOO = o00oooo2.f39213OooO00o;
                j = oooOOO.OooO0oO(j);
                oooOOO.OooOo00(j - this.f11278OooOOOo, this.f11280OooOOo0);
            }
            Oooo000(j);
            OooOo00();
        } else {
            o0oooo0.OooO0O0();
            Oooo000(j);
        }
        OooOO0o(false);
        this.f11273OooOO0O.OooOO0O(2);
        return j;
    }

    public final void Oooo0oO(final oo000o oo000oVar) {
        Looper looper = oo000oVar.f12891OooO0o;
        if (looper.getThread().isAlive()) {
            this.f11284OooOo00.OooO0O0(looper, null).OooO0oo(new Runnable() { // from class: o00o0o0o.o00OOO00
                @Override // java.lang.Runnable
                public final void run() {
                    oo000o oo000oVar2 = oo000oVar;
                    this.f39208OooO0Oo.getClass();
                    try {
                        synchronized (oo000oVar2) {
                        }
                        try {
                            oo000oVar2.f12887OooO00o.OooOO0O(oo000oVar2.f12890OooO0Oo, oo000oVar2.f12892OooO0o0);
                        } finally {
                            oo000oVar2.OooO0O0(true);
                        }
                    } catch (ExoPlaybackException e) {
                        Log.OooO0Oo("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                        throw new RuntimeException(e);
                    }
                }
            });
        } else {
            Log.OooO0o("TAG", "Trying to send message on a dead thread.");
            oo000oVar.OooO0O0(false);
        }
    }

    public final void OoooO(int i, int i2, boolean z, boolean z2) throws ExoPlaybackException {
        this.f11291OooOoo0.OooO00o(z2 ? 1 : 0);
        OooO0o oooO0o = this.f11291OooOoo0;
        oooO0o.f11312OooO00o = true;
        oooO0o.f11316OooO0o = true;
        oooO0o.f11318OooO0oO = i2;
        this.f11289OooOoOO = this.f11289OooOoOO.OooO0Oo(i, z);
        this.f11296Oooo000 = false;
        for (o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12862OooO0oo; o00oooo1 != null; o00oooo1 = o00oooo1.f39223OooOO0o) {
            for (com.google.android.exoplayer2.trackselection.OooO0o oooO0o2 : o00oooo1.f39224OooOOO.f40404OooO0OO) {
                if (oooO0o2 != null) {
                    oooO0o2.OooOO0O(z);
                }
            }
        }
        if (!OoooOoO()) {
            OooooO0();
            OooooOo();
            return;
        }
        int i3 = this.f11289OooOoOO.f39267OooO0o0;
        o00O0OOO o00o0ooo2 = this.f11273OooOO0O;
        if (i3 == 3) {
            Ooooo00();
            o00o0ooo2.OooOO0O(2);
        } else if (i3 == 2) {
            o00o0ooo2.OooOO0O(2);
        }
    }

    public final void OoooO0(boolean z) {
        if (z == this.f11302Oooo0o0) {
            return;
        }
        this.f11302Oooo0o0 = z;
        if (z || !this.f11289OooOoOO.f39275OooOOOO) {
            return;
        }
        this.f11273OooOO0O.OooOO0O(2);
    }

    public final void OoooO00(OooO00o oooO00o) throws ExoPlaybackException {
        this.f11291OooOoo0.OooO00o(1);
        int i = oooO00o.f11310OooO0OO;
        com.google.android.exoplayer2.source.o00Ooo o00ooo2 = oooO00o.f11309OooO0O0;
        List<o00O0O.OooO0OO> list = oooO00o.f11308OooO00o;
        if (i != -1) {
            this.f11303Oooo0oO = new OooOO0O(new p203o00o0o0o.o0O00(list, o00ooo2), oooO00o.f11310OooO0OO, oooO00o.f11311OooO0Oo);
        }
        o00O0O o00o0o2 = this.f11286OooOo0o;
        ArrayList arrayList = o00o0o2.f12801OooO0O0;
        o00o0o2.OooO0oO(0, arrayList.size());
        OooOOO0(o00o0o2.OooO00o(arrayList.size(), list, o00ooo2), false);
    }

    public final void OoooO0O(boolean z) throws ExoPlaybackException {
        this.f11292OooOooO = z;
        OooOooo();
        if (this.f11293OooOooo) {
            o0OoOo0 o0oooo0 = this.f11285OooOo0O;
            if (o0oooo0.f12854OooO != o0oooo0.f12862OooO0oo) {
                Oooo0O0(true);
                OooOO0o(false);
            }
        }
    }

    public final void OoooOO0(o00Ooo o00ooo2) throws ExoPlaybackException {
        this.f11273OooOO0O.OooOO0o(16);
        com.google.android.exoplayer2.OooOO0O oooOO0O = this.f11279OooOOo;
        oooOO0O.OooO0o0(o00ooo2);
        o00Ooo o00oooOooO00o = oooOO0O.OooO00o();
        OooOOOO(o00oooOooO00o, o00oooOooO00o.f12827OooO0Oo, true, true);
    }

    public final void OoooOOO(boolean z) throws ExoPlaybackException {
        this.f11295Oooo0 = z;
        oo0o0Oo oo0o0oo = this.f11289OooOoOO.f39262OooO00o;
        o0OoOo0 o0oooo0 = this.f11285OooOo0O;
        o0oooo0.f12861OooO0oO = z;
        if (!o0oooo0.OooOOOO(oo0o0oo)) {
            Oooo0O0(true);
        }
        OooOO0o(false);
    }

    public final void OoooOOo(com.google.android.exoplayer2.source.o00Ooo o00ooo2) throws ExoPlaybackException {
        this.f11291OooOoo0.OooO00o(1);
        o00O0O o00o0o2 = this.f11286OooOo0o;
        int size = o00o0o2.f12801OooO0O0.size();
        if (o00ooo2.getLength() != size) {
            o00ooo2 = o00ooo2.OooO0o0().OooO0oO(size);
        }
        o00o0o2.f12808OooOO0 = o00ooo2;
        OooOOO0(o00o0o2.OooO0O0(), false);
    }

    public final void OoooOo0(int i) {
        o0O000o0 o0o000o1 = this.f11289OooOoOO;
        if (o0o000o1.f39267OooO0o0 != i) {
            if (i != 2) {
                this.f11307OoooO0O = -9223372036854775807L;
            }
            this.f11289OooOoOO = o0o000o1.OooO0oO(i);
        }
    }

    public final boolean OoooOoO() {
        o0O000o0 o0o000o1 = this.f11289OooOoOO;
        return o0o000o1.f39272OooOO0o && o0o000o1.f39274OooOOO0 == 0;
    }

    public final boolean OoooOoo(oo0o0Oo oo0o0oo, com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0) {
        if (oooO0O0.OooO00o() || oo0o0oo.OooOOo0()) {
            return false;
        }
        int i = oo0o0oo.OooO0oo(oooO0O0.f39859OooO00o, this.f11277OooOOOO).f12906OooO0o;
        oo0o0Oo.OooO0OO oooO0OO = this.f11275OooOOO;
        oo0o0oo.OooOOO(i, oooO0OO);
        return oooO0OO.OooO00o() && oooO0OO.f12935OooOO0o && oooO0OO.f12927OooO != -9223372036854775807L;
    }

    public final void Ooooo00() throws ExoPlaybackException {
        this.f11296Oooo000 = false;
        com.google.android.exoplayer2.OooOO0O oooOO0O = this.f11279OooOOo;
        oooOO0O.f11070OooO = true;
        o0oOOo o0oooo = oooOO0O.f11071OooO0Oo;
        if (!o0oooo.f40628OooO0o0) {
            o0oooo.f40629OooO0oO = o0oooo.f40626OooO0Oo.elapsedRealtime();
            o0oooo.f40628OooO0o0 = true;
        }
        for (Renderer renderer : this.f11267OooO0Oo) {
            if (OooOOo(renderer)) {
                renderer.start();
            }
        }
    }

    public final void Ooooo0o(boolean z, boolean z2) {
        OooOooO(z || !this.f11299Oooo0O0, false, true, false);
        this.f11291OooOoo0.OooO00o(z2 ? 1 : 0);
        this.f11266OooO.OooO0o();
        OoooOo0(1);
    }

    public final void OooooO0() throws ExoPlaybackException {
        com.google.android.exoplayer2.OooOO0O oooOO0O = this.f11279OooOOo;
        oooOO0O.f11070OooO = false;
        o0oOOo o0oooo = oooOO0O.f11071OooO0Oo;
        if (o0oooo.f40628OooO0o0) {
            o0oooo.OooO0O0(o0oooo.OooOOo0());
            o0oooo.f40628OooO0o0 = false;
        }
        for (Renderer renderer : this.f11267OooO0Oo) {
            if (OooOOo(renderer) && renderer.getState() == 2) {
                renderer.stop();
            }
        }
    }

    public final void OooooOO() {
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12863OooOO0;
        boolean z = this.f11297Oooo00O || (o00oooo1 != null && o00oooo1.f39213OooO00o.OooO0oo());
        o0O000o0 o0o000o1 = this.f11289OooOoOO;
        if (z != o0o000o1.f39268OooO0oO) {
            this.f11289OooOoOO = new o0O000o0(o0o000o1.f39262OooO00o, o0o000o1.f39263OooO0O0, o0o000o1.f39264OooO0OO, o0o000o1.f39265OooO0Oo, o0o000o1.f39267OooO0o0, o0o000o1.f39266OooO0o, z, o0o000o1.f39269OooO0oo, o0o000o1.f39261OooO, o0o000o1.f39270OooOO0, o0o000o1.f39271OooOO0O, o0o000o1.f39272OooOO0o, o0o000o1.f39274OooOOO0, o0o000o1.f39273OooOOO, o0o000o1.f39276OooOOOo, o0o000o1.f39278OooOOo0, o0o000o1.f39277OooOOo, o0o000o1.f39279OooOOoo, o0o000o1.f39275OooOOOO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    public final void OooooOo() throws ExoPlaybackException {
        o00Ooo o00oooOooO00o;
        OooOo00 oooOo00;
        OooOo00 oooOo01;
        OooOo00 oooOo02;
        OooO0OO oooO0OO;
        float f;
        o00OOOO0 o00oooo1 = this.f11285OooOo0O.f12862OooO0oo;
        if (o00oooo1 == null) {
            return;
        }
        long j = -9223372036854775807L;
        long jOooO = o00oooo1.f39216OooO0Oo ? o00oooo1.f39213OooO00o.OooO() : -9223372036854775807L;
        if (jOooO != -9223372036854775807L) {
            Oooo000(jOooO);
            if (jOooO != this.f11289OooOoOO.f39277OooOOo) {
                o0O000o0 o0o000o1 = this.f11289OooOoOO;
                this.f11289OooOoOO = OooOOOo(o0o000o1.f39263OooO0O0, jOooO, o0o000o1.f39264OooO0OO, jOooO, true, 5);
            }
            oooOo00 = this;
            j = -9223372036854775807L;
            oooOo01 = oooOo00;
        } else {
            com.google.android.exoplayer2.OooOO0O oooOO0O = this.f11279OooOOo;
            boolean z = o00oooo1 != this.f11285OooOo0O.f12854OooO;
            Renderer renderer = oooOO0O.f11072OooO0o;
            boolean z2 = renderer == null || renderer.OooO0Oo() || (!oooOO0O.f11072OooO0o.OooO0O0() && (z || oooOO0O.f11072OooO0o.OooO0oO()));
            o0oOOo o0oooo = oooOO0O.f11071OooO0Oo;
            if (z2) {
                oooOO0O.f11075OooO0oo = true;
                if (oooOO0O.f11070OooO && !o0oooo.f40628OooO0o0) {
                    o0oooo.f40629OooO0oO = o0oooo.f40626OooO0Oo.elapsedRealtime();
                    o0oooo.f40628OooO0o0 = true;
                }
            } else {
                o00OO00O o00oo00o = oooOO0O.f11074OooO0oO;
                o00oo00o.getClass();
                long jOooOOo0 = o00oo00o.OooOOo0();
                if (!oooOO0O.f11075OooO0oo) {
                    o0oooo.OooO0O0(jOooOOo0);
                    o00oooOooO00o = o00oo00o.OooO00o();
                    if (!o00oooOooO00o.equals(o0oooo.f40630OooO0oo)) {
                        o0oooo.OooO0o0(o00oooOooO00o);
                        ((OooOo00) oooOO0O.f11073OooO0o0).f11273OooOO0O.OooO0o0(16, o00oooOooO00o).OooO00o();
                    }
                } else if (jOooOOo0 >= o0oooo.OooOOo0()) {
                    oooOO0O.f11075OooO0oo = false;
                    if (oooOO0O.f11070OooO && !o0oooo.f40628OooO0o0) {
                        o0oooo.f40629OooO0oO = o0oooo.f40626OooO0Oo.elapsedRealtime();
                        o0oooo.f40628OooO0o0 = true;
                    }
                    o0oooo.OooO0O0(jOooOOo0);
                    o00oooOooO00o = o00oo00o.OooO00o();
                    if (!o00oooOooO00o.equals(o0oooo.f40630OooO0oo)) {
                        o0oooo.OooO0o0(o00oooOooO00o);
                        ((OooOo00) oooOO0O.f11073OooO0o0).f11273OooOO0O.OooO0o0(16, o00oooOooO00o).OooO00o();
                    }
                } else if (o0oooo.f40628OooO0o0) {
                    o0oooo.OooO0O0(o0oooo.OooOOo0());
                    o0oooo.f40628OooO0o0 = false;
                }
            }
            long jOooOOo1 = oooOO0O.OooOOo0();
            this.f11304Oooo0oo = jOooOOo1;
            long j2 = jOooOOo1 - o00oooo1.f39226OooOOOO;
            long j3 = this.f11289OooOoOO.f39277OooOOo;
            if (this.f11281OooOOoo.isEmpty() || this.f11289OooOoOO.f39263OooO0O0.OooO00o()) {
                oooOo00 = this;
                j = -9223372036854775807L;
                oooOo01 = oooOo00;
            } else {
                if (this.f11306OoooO00) {
                    j3--;
                    this.f11306OoooO00 = false;
                }
                o0O000o0 o0o000o2 = this.f11289OooOoOO;
                int iOooO0O0 = o0o000o2.f39262OooO00o.OooO0O0(o0o000o2.f39263OooO0O0.f39859OooO00o);
                int iMin = Math.min(this.f11294Oooo, this.f11281OooOOoo.size());
                if (iMin > 0) {
                    oooO0OO = this.f11281OooOOoo.get(iMin - 1);
                    oooOo02 = this;
                    oooOo00 = oooOo02;
                    oooOo01 = oooOo00;
                } else {
                    oooOo01 = this;
                    oooOo00 = this;
                    oooOo02 = this;
                    oooO0OO = null;
                }
                while (oooO0OO != null) {
                    oooO0OO.getClass();
                    if (iOooO0O0 >= 0) {
                        if (iOooO0O0 != 0) {
                            break;
                        }
                        oooO0OO.getClass();
                        if (0 <= j3) {
                            break;
                        }
                    }
                    iMin--;
                    if (iMin > 0) {
                        oooO0OO = oooOo02.f11281OooOOoo.get(iMin - 1);
                    } else {
                        j = j;
                        oooOo01 = oooOo01;
                        oooOo00 = oooOo00;
                        oooOo02 = oooOo02;
                        oooO0OO = null;
                    }
                }
                OooO0OO oooO0OO2 = iMin < oooOo02.f11281OooOOoo.size() ? oooOo02.f11281OooOOoo.get(iMin) : null;
                if (oooO0OO2 != null) {
                    oooO0OO2.getClass();
                }
                if (oooO0OO2 != null) {
                    oooO0OO2.getClass();
                }
                oooOo02.f11294Oooo = iMin;
            }
            o0O000o0 o0o000o3 = oooOo00.f11289OooOoOO;
            o0o000o3.f39277OooOOo = j2;
            o0o000o3.f39279OooOOoo = SystemClock.elapsedRealtime();
        }
        oooOo00.f11289OooOoOO.f39276OooOOOo = oooOo00.f11285OooOo0O.f12863OooOO0.OooO0Oo();
        o0O000o0 o0o000o4 = oooOo00.f11289OooOoOO;
        long j4 = oooOo01.f11289OooOoOO.f39276OooOOOo;
        o00OOOO0 o00oooo2 = oooOo01.f11285OooOo0O.f12863OooOO0;
        o0o000o4.f39278OooOOo0 = o00oooo2 == null ? 0L : Math.max(0L, j4 - (oooOo01.f11304Oooo0oo - o00oooo2.f39226OooOOOO));
        o0O000o0 o0o000o5 = oooOo00.f11289OooOoOO;
        if (o0o000o5.f39272OooOO0o && o0o000o5.f39267OooO0o0 == 3 && oooOo00.OoooOoo(o0o000o5.f39262OooO00o, o0o000o5.f39263OooO0O0)) {
            o0O000o0 o0o000o6 = oooOo00.f11289OooOoOO;
            if (o0o000o6.f39273OooOOO.f12827OooO0Oo == 1.0f) {
                Oooo0 oooo0 = oooOo00.f11282OooOo;
                long jOooO0oO = oooOo00.OooO0oO(o0o000o6.f39262OooO00o, o0o000o6.f39263OooO0O0.f39859OooO00o, o0o000o6.f39277OooOOo);
                long j5 = oooOo01.f11289OooOoOO.f39276OooOOOo;
                o00OOOO0 o00oooo3 = oooOo01.f11285OooOo0O.f12863OooOO0;
                long jMax = o00oooo3 != null ? Math.max(0L, j5 - (oooOo01.f11304Oooo0oo - o00oooo3.f39226OooOOOO)) : 0L;
                com.google.android.exoplayer2.OooOO0 oooOO1 = (com.google.android.exoplayer2.OooOO0) oooo0;
                if (oooOO1.f11059OooO0Oo == j) {
                    f = 1.0f;
                } else {
                    long j6 = jOooO0oO - jMax;
                    long j7 = oooOO1.f11067OooOOO;
                    if (j7 == j) {
                        oooOO1.f11067OooOOO = j6;
                        oooOO1.f11069OooOOOO = 0L;
                    } else {
                        float f2 = oooOO1.f11058OooO0OO;
                        float f3 = 1.0f - f2;
                        long jMax2 = Math.max(j6, (long) ((j6 * f3) + (j7 * f2)));
                        oooOO1.f11067OooOOO = jMax2;
                        oooOO1.f11069OooOOOO = (long) ((f3 * Math.abs(j6 - jMax2)) + (oooOO1.f11069OooOOOO * f2));
                    }
                    if (oooOO1.f11068OooOOO0 == j || SystemClock.elapsedRealtime() - oooOO1.f11068OooOOO0 >= 1000) {
                        oooOO1.f11068OooOOO0 = SystemClock.elapsedRealtime();
                        long j8 = (oooOO1.f11069OooOOOO * 3) + oooOO1.f11067OooOOO;
                        if (oooOO1.f11055OooO > j8) {
                            float fOooo0O0 = o0O00.Oooo0O0(1000L);
                            long[] jArr = {j8, oooOO1.f11060OooO0o, oooOO1.f11055OooO - (((long) ((oooOO1.f11066OooOO0o - 1.0f) * fOooo0O0)) + ((long) ((oooOO1.f11064OooOO0 - 1.0f) * fOooo0O0)))};
                            long j9 = j8;
                            for (int i = 1; i < 3; i++) {
                                long j10 = jArr[i];
                                if (j10 > j9) {
                                    j9 = j10;
                                }
                            }
                            oooOO1.f11055OooO = j9;
                        } else {
                            long jOooOO0 = o0O00.OooOO0(jOooO0oO - ((long) (Math.max(0.0f, oooOO1.f11066OooOO0o - 1.0f) / 1.0E-7f)), oooOO1.f11055OooO, j8);
                            oooOO1.f11055OooO = jOooOO0;
                            long j11 = oooOO1.f11063OooO0oo;
                            if (j11 != j && jOooOO0 > j11) {
                                oooOO1.f11055OooO = j11;
                            }
                        }
                        long j12 = jOooO0oO - oooOO1.f11055OooO;
                        if (Math.abs(j12) < oooOO1.f11056OooO00o) {
                            oooOO1.f11066OooOO0o = 1.0f;
                        } else {
                            oooOO1.f11066OooOO0o = o0O00.OooO0oo((1.0E-7f * j12) + 1.0f, oooOO1.f11065OooOO0O, oooOO1.f11064OooOO0);
                        }
                        f = oooOO1.f11066OooOO0o;
                    } else {
                        f = oooOO1.f11066OooOO0o;
                    }
                }
                if (oooOo00.f11279OooOOo.OooO00o().f12827OooO0Oo != f) {
                    o00Ooo o00ooo2 = new o00Ooo(f, oooOo00.f11289OooOoOO.f39273OooOOO.f12829OooO0o0);
                    oooOo00.f11273OooOO0O.OooOO0o(16);
                    oooOo00.f11279OooOOo.OooO0o0(o00ooo2);
                    oooOo00.OooOOOO(oooOo00.f11289OooOoOO.f39273OooOOO, oooOo00.f11279OooOOo.OooO00o().f12827OooO0Oo, false, false);
                }
            }
        }
    }

    public final synchronized void Oooooo(o00OO o00oo2, long j) {
        long jElapsedRealtime = this.f11284OooOo00.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) o00oo2.get()).booleanValue() && j > 0) {
            try {
                this.f11284OooOo00.OooO0OO();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.f11284OooOo00.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void Oooooo0(oo0o0Oo oo0o0oo, com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, oo0o0Oo oo0o0oo2, com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O1, long j, boolean z) throws ExoPlaybackException {
        if (!OoooOoo(oo0o0oo, oooO0O0)) {
            o00Ooo o00ooo2 = oooO0O0.OooO00o() ? o00Ooo.f12825OooO0oO : this.f11289OooOoOO.f39273OooOOO;
            com.google.android.exoplayer2.OooOO0O oooOO0O = this.f11279OooOOo;
            if (oooOO0O.OooO00o().equals(o00ooo2)) {
                return;
            }
            this.f11273OooOO0O.OooOO0o(16);
            oooOO0O.OooO0o0(o00ooo2);
            OooOOOO(this.f11289OooOoOO.f39273OooOOO, o00ooo2.f12827OooO0Oo, false, false);
            return;
        }
        Object obj = oooO0O0.f39859OooO00o;
        oo0o0Oo.OooO0O0 oooO0O2 = this.f11277OooOOOO;
        int i = oo0o0oo.OooO0oo(obj, oooO0O2).f12906OooO0o;
        oo0o0Oo.OooO0OO oooO0OO = this.f11275OooOOO;
        oo0o0oo.OooOOO(i, oooO0OO);
        o000oOoO.OooOO0 oooOO1 = oooO0OO.f12936OooOOO;
        com.google.android.exoplayer2.OooOO0 oooOO2 = (com.google.android.exoplayer2.OooOO0) this.f11282OooOo;
        oooOO2.getClass();
        oooOO2.f11059OooO0Oo = o0O00.Oooo0O0(oooOO1.f12740OooO0Oo);
        oooOO2.f11062OooO0oO = o0O00.Oooo0O0(oooOO1.f12742OooO0o0);
        oooOO2.f11063OooO0oo = o0O00.Oooo0O0(oooOO1.f12741OooO0o);
        float f = oooOO1.f12743OooO0oO;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        oooOO2.f11065OooOO0O = f;
        float f2 = oooOO1.f12744OooO0oo;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        oooOO2.f11064OooOO0 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            oooOO2.f11059OooO0Oo = -9223372036854775807L;
        }
        oooOO2.OooO00o();
        if (j != -9223372036854775807L) {
            oooOO2.f11061OooO0o0 = OooO0oO(oo0o0oo, obj, j);
            oooOO2.OooO00o();
            return;
        }
        if (!o0O00.OooO00o(!oo0o0oo2.OooOOo0() ? oo0o0oo2.OooOOO(oo0o0oo2.OooO0oo(oooO0O1.f39859OooO00o, oooO0O2).f12906OooO0o, oooO0OO).f12928OooO0Oo : null, oooO0OO.f12928OooO0Oo) || z) {
            oooOO2.f11061OooO0o0 = -9223372036854775807L;
            oooOO2.OooO00o();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        o00OOOO0 o00oooo1;
        o00OOOO0 o00oooo2;
        int i2 = 1000;
        try {
            switch (message.what) {
                case 0:
                    OooOo();
                    break;
                case 1:
                    OoooO(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    OooO0o0();
                    break;
                case 3:
                    Oooo0OO((OooOO0O) message.obj);
                    break;
                case 4:
                    OoooOO0((o00Ooo) message.obj);
                    break;
                case 5:
                    this.f11287OooOoO = (o0O00OO) message.obj;
                    break;
                case 6:
                    Ooooo0o(false, true);
                    break;
                case 7:
                    OooOoO();
                    return true;
                case 8:
                    OooOOO((com.google.android.exoplayer2.source.OooOOO) message.obj);
                    break;
                case 9:
                    OooOO0((com.google.android.exoplayer2.source.OooOOO) message.obj);
                    break;
                case 10:
                    OooOoo();
                    break;
                case 11:
                    o000oOoO(message.arg1);
                    break;
                case 12:
                    OoooOOO(message.arg1 != 0);
                    break;
                case 13:
                    Oooo(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    oo000o oo000oVar = (oo000o) message.obj;
                    oo000oVar.getClass();
                    Oooo0o(oo000oVar);
                    break;
                case 15:
                    Oooo0oO((oo000o) message.obj);
                    break;
                case 16:
                    o00Ooo o00ooo2 = (o00Ooo) message.obj;
                    OooOOOO(o00ooo2, o00ooo2.f12827OooO0Oo, true, false);
                    break;
                case 17:
                    OoooO00((OooO00o) message.obj);
                    break;
                case 18:
                    OooO0OO((OooO00o) message.obj, message.arg1);
                    break;
                case 19:
                    OooOo0o((OooO0O0) message.obj);
                    break;
                case 20:
                    OooOoo0(message.arg1, message.arg2, (com.google.android.exoplayer2.source.o00Ooo) message.obj);
                    break;
                case 21:
                    OoooOOo((com.google.android.exoplayer2.source.o00Ooo) message.obj);
                    break;
                case 22:
                    OooOo0O();
                    break;
                case 23:
                    OoooO0O(message.arg1 != 0);
                    break;
                case 24:
                    OoooO0(message.arg1 == 1);
                    break;
                case 25:
                    OooOoo();
                    Oooo0O0(true);
                    break;
                case 26:
                    OooOoo();
                    Oooo0O0(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e) {
            e = e;
            int i3 = e.f10921OooOO0O;
            o0OoOo0 o0oooo0 = this.f11285OooOo0O;
            if (i3 == 1 && (o00oooo2 = o0oooo0.f12854OooO) != null) {
                e = e.OooO00o(o00oooo2.f39217OooO0o.f39228OooO00o);
            }
            if (e.f10927OooOOo0 && this.f11305OoooO0 == null) {
                Log.OooO0oO("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f11305OoooO0 = e;
                o00O0OOO o00o0ooo2 = this.f11273OooOO0O;
                o00o0ooo2.OooO0Oo(o00o0ooo2.OooO0o0(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f11305OoooO0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f11305OoooO0;
                }
                Log.OooO0Oo("ExoPlayerImplInternal", "Playback error", e);
                if (e.f10921OooOO0O == 1 && o0oooo0.f12862OooO0oo != o0oooo0.f12854OooO) {
                    while (true) {
                        o00oooo1 = o0oooo0.f12862OooO0oo;
                        if (o00oooo1 == o0oooo0.f12854OooO) {
                            break;
                        }
                        o0oooo0.OooO00o();
                    }
                    o00oooo1.getClass();
                    o00OOOOo o00ooooo2 = o00oooo1.f39217OooO0o;
                    com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0 = o00ooooo2.f39228OooO00o;
                    long j = o00ooooo2.f39229OooO0O0;
                    this.f11289OooOoOO = OooOOOo(oooO0O0, j, o00ooooo2.f39230OooO0OO, j, true, 0);
                }
                Ooooo0o(true, false);
                this.f11289OooOoOO = this.f11289OooOoOO.OooO0o0(e);
            }
        } catch (ParserException e2) {
            boolean z = e2.f11333OooO0Oo;
            int i4 = e2.f11334OooO0o0;
            if (i4 == 1) {
                i = z ? ZegoConstants.RoomError.DatiCommitError : ZegoConstants.RoomError.DatiRepeatError;
            } else {
                if (i4 == 4) {
                    i = z ? ZegoConstants.RoomError.DatiTimeoutError : 3004;
                }
                OooOO0O(e2, i2);
            }
            i2 = i;
            OooOO0O(e2, i2);
        } catch (DrmSession.DrmSessionException e3) {
            OooOO0O(e3, e3.f11759OooO0Oo);
        } catch (BehindLiveWindowException e4) {
            OooOO0O(e4, 1002);
        } catch (DataSourceException e5) {
            OooOO0O(e5, e5.f14158OooO0Oo);
        } catch (IOException e6) {
            OooOO0O(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.OooO0Oo("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            Ooooo0o(true, false);
            this.f11289OooOoOO = this.f11289OooOoOO.OooO0o0(exoPlaybackException2);
        }
        OooOo0();
        return true;
    }

    public final void o000oOoO(int i) throws ExoPlaybackException {
        this.f11298Oooo00o = i;
        oo0o0Oo oo0o0oo = this.f11289OooOoOO.f39262OooO00o;
        o0OoOo0 o0oooo0 = this.f11285OooOo0O;
        o0oooo0.f12859OooO0o = i;
        if (!o0oooo0.OooOOOO(oo0o0oo)) {
            Oooo0O0(true);
        }
        OooOO0o(false);
    }
}
