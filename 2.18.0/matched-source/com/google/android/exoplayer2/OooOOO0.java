package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.OooOOO0;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p311o0O0o0oo.o00O;
import p311o0O0o0oo.o00O00O;
import p311o0O0o0oo.o00OO000;
import p311o0O0o0oo.oOO00O;
import p319o0O0oOo.o00;
import p319o0O0oOo.o00000O;
import p319o0O0oOo.o00000O0;
import p319o0O0oOo.o0000O0;
import p319o0O0oOo.o000O0;
import p319o0O0oOo.o000OO;
import p319o0O0oOo.o000OO00;
import p319o0O0oOo.o000OO0O;
import p320o0O0oOo0.o0000O;
import p320o0O0oOo0.o0000OO0;
import p468o0OooO0.o0000oo;
import p468o0OooO0.o000O00;
import p468o0OooO0.o000O0O0;
import p468o0OooO0.o000O0Oo;
import p468o0OooO0.o000OOo;
import p468o0OooO0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements Handler.Callback, o00O00O.OooO00o, OooOo00.OooO0o, com.google.android.exoplayer2.OooO.OooO00o, OooOo.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Renderer[] f13322Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final o000OOo f13323OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o0000O f13324OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final RendererCapabilities[] f13325OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final o0000OO0 f13326OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final p711oo0oOOo.OooO f13327OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final HandlerThread f13328OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final Looper f13329OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final o000oOoO.OooO0OO f13330OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final o000oOoO.OooO0O0 f13331OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final long f13332OoooOoo;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final com.google.android.exoplayer2.OooO f13334Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final ArrayList<OooO0OO> f13335OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final o00000O f13336OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final OooO f13337OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public final OooOo00 f13338Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final OooOOOO f13339Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public o000O0O0 f13340OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public o000Oo0 f13341Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final o000OO0O f13342o000oOoO;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f13344o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f13345o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f13346o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f13347o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public boolean f13348o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public int f13349o00ooo;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f13350o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public long f13351o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f13352o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public OooO0o f13353o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f13354o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f13355o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    @Nullable
    public OooOO0O f13356o0ooOoO;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f13359ooOO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public boolean f13357oo000o = false;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f13343o00O0O = false;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f13358oo0o0Oo = true;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final boolean f13333Ooooo00 = false;

    public interface OooO {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<OooOo00.OooO0OO> f13360OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00OO000 f13361OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13362OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f13363OooO0Oo;

        public OooO00o(List list, o00OO000 o00oo001, int i, long j, com.google.android.exoplayer2.OooOO0O oooOO0O) {
            this.f13360OooO00o = list;
            this.f13361OooO0O0 = o00oo001;
            this.f13362OooO0OO = i;
            this.f13363OooO0Oo = j;
        }
    }

    public static class OooO0O0 {
    }

    public static final class OooO0OO implements Comparable<OooO0OO> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final OooOo f13364Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public long f13365OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f13366OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @Nullable
        public Object f13367OoooO0O;

        public final void OooO00o(int i, long j, Object obj) {
            this.f13366OoooO00 = i;
            this.f13365OoooO0 = j;
            this.f13367OoooO0O = obj;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0017  */
        @Override // java.lang.Comparable
        public final int compareTo(OooO0OO oooO0OO) {
            OooO0OO oooO0OO2 = oooO0OO;
            Object obj = this.f13367OoooO0O;
            int i = 1;
            if ((obj == null) != (oooO0OO2.f13367OoooO0O == null)) {
                if (obj != null) {
                    i = -1;
                }
            } else {
                if (obj == null) {
                    return 0;
                }
                int i2 = this.f13366OoooO00 - oooO0OO2.f13366OoooO00;
                if (i2 != 0) {
                    return i2;
                }
                long j = this.f13365OoooO0;
                long j2 = oooO0OO2.f13365OoooO0;
                int i3 = o00.f36680OooO00o;
                if (j < j2) {
                    i = -1;
                } else if (j == j2) {
                    i = 0;
                }
            }
            return i;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f13368OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o000Oo0 f13369OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f13370OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f13371OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f13372OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f13373OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f13374OooO0oO;

        public OooO0o(o000Oo0 o000oo1) {
            this.f13369OooO0O0 = o000oo1;
        }

        public final void OooO00o(int i) {
            this.f13368OooO00o |= i > 0;
            this.f13370OooO0OO += i;
        }

        public final void OooO0O0(int i) {
            if (this.f13371OooO0Oo && this.f13373OooO0o0 != 4) {
                o00000O0.OooO00o(i == 4);
                return;
            }
            this.f13368OooO00o = true;
            this.f13371OooO0Oo = true;
            this.f13373OooO0o0 = i;
        }
    }

    public static final class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oOO00O.OooO00o f13375OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f13376OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f13377OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f13378OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f13379OooO0o0;

        public OooOO0(oOO00O.OooO00o oooO00o, long j, long j2, boolean z, boolean z2) {
            this.f13375OooO00o = oooO00o;
            this.f13376OooO0O0 = j;
            this.f13377OooO0OO = j2;
            this.f13378OooO0Oo = z;
            this.f13379OooO0o0 = z2;
        }
    }

    public static final class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000oOoO f13380OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13381OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f13382OooO0OO;

        public OooOO0O(o000oOoO o000oooo2, int i, long j) {
            this.f13380OooO00o = o000oooo2;
            this.f13381OooO0O0 = i;
            this.f13382OooO0OO = j;
        }
    }

    public OooOOO0(Renderer[] rendererArr, o0000O o0000o2, o0000OO0 o0000oo1, o000OOo o000ooo2, p711oo0oOOo.OooO oooO, int i, @Nullable p293o0O0Oo0.OooO0OO oooO0OO, o000O0O0 o000o0o1, Looper looper, o00000O o00000o, OooO oooO2) {
        this.f13337OooooOo = oooO2;
        this.f13322Oooo = rendererArr;
        this.f13324OoooO0 = o0000o2;
        this.f13326OoooO0O = o0000oo1;
        this.f13323OoooO = o000ooo2;
        this.f13327OoooOO0 = oooO;
        this.f13349o00ooo = i;
        this.f13340OoooooO = o000o0o1;
        this.f13336OooooOO = o00000o;
        this.f13332OoooOoo = o000ooo2.f40569OooO0oO;
        o000Oo0 o000oo0OooO0oo = o000Oo0.OooO0oo(o0000oo1);
        this.f13341Ooooooo = o000oo0OooO0oo;
        this.f13353o0OoOo0 = new OooO0o(o000oo0OooO0oo);
        this.f13325OoooO00 = new RendererCapabilities[rendererArr.length];
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].setIndex(i2);
            this.f13325OoooO00[i2] = rendererArr[i2].OooOO0o();
        }
        this.f13334Ooooo0o = new com.google.android.exoplayer2.OooO(this, o00000o);
        this.f13335OooooO0 = new ArrayList<>();
        this.f13330OoooOo0 = new o000oOoO.OooO0OO();
        this.f13331OoooOoO = new o000oOoO.OooO0O0();
        o0000o2.f36771OooO00o = oooO;
        this.f13350o0OO00O = true;
        Handler handler = new Handler(looper);
        this.f13339Oooooo0 = new OooOOOO(oooO0OO, handler);
        this.f13338Oooooo = new OooOo00(this, oooO0OO, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f13328OoooOOO = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f13329OoooOOo = looper2;
        this.f13342o000oOoO = o00000o.OooO0O0(looper2, this);
    }

    public static Format[] OooO(com.google.android.exoplayer2.trackselection.OooO0OO oooO0OO) {
        int length = oooO0OO != null ? oooO0OO.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = oooO0OO.OooO0Oo(i);
        }
        return formatArr;
    }

    public static boolean OooOo00(Renderer renderer) {
        return renderer.getState() != 0;
    }

    @Nullable
    public static Object Oooo0(o000oOoO.OooO0OO oooO0OO, o000oOoO.OooO0O0 oooO0O0, int i, boolean z, Object obj, o000oOoO o000oooo2, o000oOoO o000oooo3) {
        int iOooO0O0 = o000oooo2.OooO0O0(obj);
        int iOooO0oo = o000oooo2.OooO0oo();
        int iOooO0Oo = iOooO0O0;
        int iOooO0O1 = -1;
        for (int i2 = 0; i2 < iOooO0oo && iOooO0O1 == -1; i2++) {
            iOooO0Oo = o000oooo2.OooO0Oo(iOooO0Oo, oooO0O0, oooO0OO, i, z);
            if (iOooO0Oo == -1) {
                break;
            }
            iOooO0O1 = o000oooo3.OooO0O0(o000oooo2.OooOO0O(iOooO0Oo));
        }
        if (iOooO0O1 == -1) {
            return null;
        }
        return o000oooo3.OooOO0O(iOooO0O1);
    }

    public static boolean Oooo000(OooO0OO oooO0OO, o000oOoO o000oooo2, o000oOoO o000oooo3, int i, boolean z, o000oOoO.OooO0OO oooO0OO2, o000oOoO.OooO0O0 oooO0O0) {
        Object obj = oooO0OO.f13367OoooO0O;
        if (obj == null) {
            Objects.requireNonNull(oooO0OO.f13364Oooo);
            Objects.requireNonNull(oooO0OO.f13364Oooo);
            long jOooO00o = C.OooO00o(-9223372036854775807L);
            OooOo oooOo = oooO0OO.f13364Oooo;
            Pair<Object, Long> pairOooo00o = Oooo00o(o000oooo2, new OooOO0O(oooOo.f13399OooO0OO, oooOo.f13403OooO0oO, jOooO00o), false, i, z, oooO0OO2, oooO0O0);
            if (pairOooo00o == null) {
                return false;
            }
            oooO0OO.OooO00o(o000oooo2.OooO0O0(pairOooo00o.first), ((Long) pairOooo00o.second).longValue(), pairOooo00o.first);
            Objects.requireNonNull(oooO0OO.f13364Oooo);
            return true;
        }
        int iOooO0O0 = o000oooo2.OooO0O0(obj);
        if (iOooO0O0 == -1) {
            return false;
        }
        Objects.requireNonNull(oooO0OO.f13364Oooo);
        oooO0OO.f13366OoooO00 = iOooO0O0;
        o000oooo3.OooO0oO(oooO0OO.f13367OoooO0O, oooO0O0);
        if (o000oooo3.OooOO0o(oooO0O0.f14577OooO0OO, oooO0OO2).f14593OooOO0O) {
            Pair<Object, Long> pairOooO = o000oooo2.OooO(oooO0OO2, oooO0O0, o000oooo2.OooO0oO(oooO0OO.f13367OoooO0O, oooO0O0).f14577OooO0OO, oooO0OO.f13365OoooO0 + oooO0O0.f14580OooO0o0);
            oooO0OO.OooO00o(o000oooo2.OooO0O0(pairOooO.first), ((Long) pairOooO.second).longValue(), pairOooO.first);
        }
        return true;
    }

    @Nullable
    public static Pair<Object, Long> Oooo00o(o000oOoO o000oooo2, OooOO0O oooOO0O, boolean z, int i, boolean z2, o000oOoO.OooO0OO oooO0OO, o000oOoO.OooO0O0 oooO0O0) {
        Object objOooo0;
        o000oOoO o000oooo3 = oooOO0O.f13380OooO00o;
        if (o000oooo2.OooOOOO()) {
            return null;
        }
        o000oOoO o000oooo4 = o000oooo3.OooOOOO() ? o000oooo2 : o000oooo3;
        try {
            Pair<Object, Long> pairOooO = o000oooo4.OooO(oooO0OO, oooO0O0, oooOO0O.f13381OooO0O0, oooOO0O.f13382OooO0OO);
            if (o000oooo2.equals(o000oooo4)) {
                return pairOooO;
            }
            if (o000oooo2.OooO0O0(pairOooO.first) != -1) {
                o000oooo4.OooO0oO(pairOooO.first, oooO0O0);
                return o000oooo4.OooOO0o(oooO0O0.f14577OooO0OO, oooO0OO).f14593OooOO0O ? o000oooo2.OooO(oooO0OO, oooO0O0, o000oooo2.OooO0oO(pairOooO.first, oooO0O0).f14577OooO0OO, oooOO0O.f13382OooO0OO) : pairOooO;
            }
            if (z && (objOooo0 = Oooo0(oooO0OO, oooO0O0, i, z2, pairOooO.first, o000oooo4, o000oooo2)) != null) {
                return o000oooo2.OooO(oooO0OO, oooO0O0, o000oooo2.OooO0oO(objOooo0, oooO0O0).f14577OooO0OO, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static boolean Ooooo00(o000Oo0 o000oo1, o000oOoO.OooO0O0 oooO0O0, o000oOoO.OooO0OO oooO0OO) {
        oOO00O.OooO00o oooO00o = o000oo1.f40576OooO0O0;
        o000oOoO o000oooo2 = o000oo1.f40575OooO00o;
        return oooO00o.OooO0O0() || o000oooo2.OooOOOO() || o000oooo2.OooOO0o(o000oooo2.OooO0oO(oooO00o.f36414OooO00o, oooO0O0).f14577OooO0OO, oooO0OO).f14593OooOO0O;
    }

    @Override // o0O0o0oo.o00O00O.OooO00o
    public final void OooO00o(o00O00O o00o00o2) {
        this.f13342o000oOoO.OooO00o(8, o00o00o2).sendToTarget();
    }

    public final void OooO0O0(OooO00o oooO00o, int i) throws Throwable {
        this.f13353o0OoOo0.OooO00o(1);
        OooOo00 oooOo00 = this.f13338Oooooo;
        if (i == -1) {
            i = oooOo00.OooO0o0();
        }
        OooOOOO(oooOo00.OooO00o(i, oooO00o.f13360OooO00o, oooO00o.f13361OooO0O0));
    }

    public final void OooO0OO(OooOo oooOo) throws ExoPlaybackException {
        synchronized (oooOo) {
        }
        try {
            oooOo.f13397OooO00o.OooOOOo(oooOo.f13400OooO0Oo, oooOo.f13402OooO0o0);
        } finally {
            oooOo.OooO00o(true);
        }
    }

    public final void OooO0Oo(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() != 0) {
            com.google.android.exoplayer2.OooO oooO = this.f13334Ooooo0o;
            if (renderer == oooO.f13202OoooO0) {
                oooO.f13204OoooO0O = null;
                oooO.f13202OoooO0 = null;
                oooO.f13201OoooO = true;
            }
            if (renderer.getState() == 2) {
                renderer.stop();
            }
            renderer.OooO0o();
            this.f13355o0ooOOo--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:297:0x042c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0430  */
    /* JADX WARN: Code duplicated, block: B:306:0x0443  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    public final void OooO0o() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        boolean zOooOo0;
        boolean z3;
        int i;
        int i2;
        p468o0OooO0.o0000O o0000o2;
        p468o0OooO0.o0000O o0000o3;
        boolean z4;
        long j;
        long j2;
        p468o0OooO0.o0000O o0000o4;
        p468o0OooO0.o0000O o0000o5;
        long jOooO00o = this.f13336OooooOO.OooO00o();
        if (!this.f13341Ooooooo.f40575OooO00o.OooOOOO() && this.f13338Oooooo.f13414OooOO0) {
            this.f13339Oooooo0.OooOO0o(this.f13351o0OOO0o);
            OooOOOO oooOOOO = this.f13339Oooooo0;
            p468o0OooO0.o0000O o0000o6 = oooOOOO.f13392OooOO0;
            if (o0000o6 == null || (!o0000o6.f40513OooO0o.f40535OooO0oo && o0000o6.OooO0o() && oooOOOO.f13392OooOO0.f40513OooO0o.f40533OooO0o0 != -9223372036854775807L && oooOOOO.f13393OooOO0O < 100)) {
                OooOOOO oooOOOO2 = this.f13339Oooooo0;
                long j3 = this.f13351o0OOO0o;
                o000Oo0 o000oo1 = this.f13341Ooooooo;
                p468o0OooO0.o0000O o0000o7 = oooOOOO2.f13392OooOO0;
                p468o0OooO0.o0000OO0 o0000oo0OooO0Oo = o0000o7 == null ? oooOOOO2.OooO0Oo(o000oo1.f40575OooO00o, o000oo1.f40576OooO0O0, o000oo1.f40577OooO0OO, o000oo1.f40589OooOOOo) : oooOOOO2.OooO0OO(o000oo1.f40575OooO00o, o0000o7, j3);
                if (o0000oo0OooO0Oo != null) {
                    OooOOOO oooOOOO3 = this.f13339Oooooo0;
                    RendererCapabilities[] rendererCapabilitiesArr = this.f13325OoooO00;
                    o0000O o0000o8 = this.f13324OoooO0;
                    p711oo0oOOo.OooOOOO oooOOOO4 = this.f13323OoooO.f40563OooO00o;
                    OooOo00 oooOo00 = this.f13338Oooooo;
                    o0000OO0 o0000oo1 = this.f13326OoooO0O;
                    p468o0OooO0.o0000O o0000o9 = oooOOOO3.f13392OooOO0;
                    if (o0000o9 == null) {
                        if (o0000oo0OooO0Oo.f40528OooO00o.OooO0O0()) {
                            j = o0000oo0OooO0Oo.f40530OooO0OO;
                            if (j != -9223372036854775807L) {
                            }
                            o0000o4 = new p468o0OooO0.o0000O(rendererCapabilitiesArr, j2, o0000o8, oooOOOO4, oooOo00, o0000oo0OooO0Oo, o0000oo1);
                            o0000o5 = oooOOOO3.f13392OooOO0;
                            if (o0000o5 == null) {
                                oooOOOO3.f13391OooO0oo = o0000o4;
                                oooOOOO3.f13383OooO = o0000o4;
                            } else if (o0000o4 != o0000o5.f40519OooOO0o) {
                                o0000o5.OooO0O0();
                                o0000o5.f40519OooOO0o = o0000o4;
                                o0000o5.OooO0OO();
                            }
                            oooOOOO3.f13394OooOO0o = null;
                            oooOOOO3.f13392OooOO0 = o0000o4;
                            oooOOOO3.f13393OooOO0O++;
                            oooOOOO3.OooOO0O();
                            o0000o4.f40509OooO00o.OooO0OO(this, o0000oo0OooO0Oo.f40529OooO0O0);
                            if (this.f13339Oooooo0.f13391OooO0oo == o0000o4) {
                                OooOooo(o0000o4.OooO0o0());
                            }
                            OooOOO(false);
                        }
                        j2 = 0;
                        o0000o4 = new p468o0OooO0.o0000O(rendererCapabilitiesArr, j2, o0000o8, oooOOOO4, oooOo00, o0000oo0OooO0Oo, o0000oo1);
                        o0000o5 = oooOOOO3.f13392OooOO0;
                        if (o0000o5 == null) {
                            oooOOOO3.f13391OooO0oo = o0000o4;
                            oooOOOO3.f13383OooO = o0000o4;
                        } else if (o0000o4 != o0000o5.f40519OooOO0o) {
                            o0000o5.OooO0O0();
                            o0000o5.f40519OooOO0o = o0000o4;
                            o0000o5.OooO0OO();
                        }
                        oooOOOO3.f13394OooOO0o = null;
                        oooOOOO3.f13392OooOO0 = o0000o4;
                        oooOOOO3.f13393OooOO0O++;
                        oooOOOO3.OooOO0O();
                        o0000o4.f40509OooO00o.OooO0OO(this, o0000oo0OooO0Oo.f40529OooO0O0);
                        if (this.f13339Oooooo0.f13391OooO0oo == o0000o4) {
                            OooOooo(o0000o4.OooO0o0());
                        }
                        OooOOO(false);
                    } else {
                        j = (o0000o9.f40522OooOOOO + o0000o9.f40513OooO0o.f40533OooO0o0) - o0000oo0OooO0Oo.f40529OooO0O0;
                    }
                    j2 = j;
                    o0000o4 = new p468o0OooO0.o0000O(rendererCapabilitiesArr, j2, o0000o8, oooOOOO4, oooOo00, o0000oo0OooO0Oo, o0000oo1);
                    o0000o5 = oooOOOO3.f13392OooOO0;
                    if (o0000o5 == null) {
                        oooOOOO3.f13391OooO0oo = o0000o4;
                        oooOOOO3.f13383OooO = o0000o4;
                    } else if (o0000o4 != o0000o5.f40519OooOO0o) {
                        o0000o5.OooO0O0();
                        o0000o5.f40519OooOO0o = o0000o4;
                        o0000o5.OooO0OO();
                    }
                    oooOOOO3.f13394OooOO0o = null;
                    oooOOOO3.f13392OooOO0 = o0000o4;
                    oooOOOO3.f13393OooOO0O++;
                    oooOOOO3.OooOO0O();
                    o0000o4.f40509OooO00o.OooO0OO(this, o0000oo0OooO0Oo.f40529OooO0O0);
                    if (this.f13339Oooooo0.f13391OooO0oo == o0000o4) {
                        OooOooo(o0000o4.OooO0o0());
                    }
                    OooOOO(false);
                }
            }
            if (this.f13346o00o0O) {
                this.f13346o00o0O = OooOOoo();
                OooooOo();
            } else {
                OooOo0O();
            }
            p468o0OooO0.o0000O o0000o10 = this.f13339Oooooo0.f13383OooO;
            if (o0000o10 != null) {
                if (o0000o10.f40519OooOO0o != null && !this.f13344o00Oo0) {
                    if (!o0000o10.f40512OooO0Oo) {
                        z4 = false;
                        break;
                    }
                    int i3 = 0;
                    while (true) {
                        Renderer[] rendererArr = this.f13322Oooo;
                        if (i3 >= rendererArr.length) {
                            z4 = true;
                            break;
                        }
                        Renderer renderer = rendererArr[i3];
                        SampleStream sampleStream = o0000o10.f40511OooO0OO[i3];
                        if (renderer.OooOOo0() != sampleStream || (sampleStream != null && !renderer.OooO0oo())) {
                            z4 = false;
                            break;
                        }
                        i3++;
                    }
                    if (z4) {
                        p468o0OooO0.o0000O o0000o11 = o0000o10.f40519OooOO0o;
                        if (o0000o11.f40512OooO0Oo || this.f13351o0OOO0o >= o0000o11.OooO0o0()) {
                            o0000OO0 o0000oo2 = o0000o10.f40520OooOOO;
                            OooOOOO oooOOOO5 = this.f13339Oooooo0;
                            p468o0OooO0.o0000O o0000o12 = oooOOOO5.f13383OooO;
                            o00000O0.OooO0Oo((o0000o12 == null || o0000o12.f40519OooOO0o == null) ? false : true);
                            oooOOOO5.f13383OooO = oooOOOO5.f13383OooO.f40519OooOO0o;
                            oooOOOO5.OooOO0O();
                            p468o0OooO0.o0000O o0000o13 = oooOOOO5.f13383OooO;
                            o0000OO0 o0000oo3 = o0000o13.f40520OooOOO;
                            if (!o0000o13.f40512OooO0Oo || o0000o13.f40509OooO00o.OooOOO() == -9223372036854775807L) {
                                for (int i4 = 0; i4 < this.f13322Oooo.length; i4++) {
                                    boolean zOooO0O0 = o0000oo2.OooO0O0(i4);
                                    boolean zOooO0O1 = o0000oo3.OooO0O0(i4);
                                    if (zOooO0O0 && !this.f13322Oooo[i4].OooOo0O()) {
                                        boolean z5 = ((com.google.android.exoplayer2.OooO0o) this.f13325OoooO00[i4]).f13217Oooo == 6;
                                        o000O0Oo o000o0oo2 = o0000oo2.f36782OooO0O0[i4];
                                        o000O0Oo o000o0oo3 = o0000oo3.f36782OooO0O0[i4];
                                        if (!zOooO0O1 || !o000o0oo3.equals(o000o0oo2) || z5) {
                                            this.f13322Oooo[i4].OooOO0O();
                                        }
                                    }
                                }
                            } else {
                                for (Renderer renderer2 : this.f13322Oooo) {
                                    if (renderer2.OooOOo0() != null) {
                                        renderer2.OooOO0O();
                                    }
                                }
                            }
                        }
                    }
                } else if (o0000o10.f40513OooO0o.f40535OooO0oo || this.f13344o00Oo0) {
                    int i5 = 0;
                    while (true) {
                        Renderer[] rendererArr2 = this.f13322Oooo;
                        if (i5 >= rendererArr2.length) {
                            break;
                        }
                        Renderer renderer3 = rendererArr2[i5];
                        SampleStream sampleStream2 = o0000o10.f40511OooO0OO[i5];
                        if (sampleStream2 != null && renderer3.OooOOo0() == sampleStream2 && renderer3.OooO0oo()) {
                            renderer3.OooOO0O();
                        }
                        i5++;
                    }
                }
            }
            OooOOOO oooOOOO6 = this.f13339Oooooo0;
            p468o0OooO0.o0000O o0000o14 = oooOOOO6.f13383OooO;
            if (o0000o14 != null && oooOOOO6.f13391OooO0oo != o0000o14 && !o0000o14.f40515OooO0oO) {
                o0000OO0 o0000oo4 = o0000o14.f40520OooOOO;
                int i6 = 0;
                boolean z6 = false;
                while (true) {
                    Renderer[] rendererArr3 = this.f13322Oooo;
                    if (i6 >= rendererArr3.length) {
                        break;
                    }
                    Renderer renderer4 = rendererArr3[i6];
                    if (OooOo00(renderer4)) {
                        boolean z7 = renderer4.OooOOo0() != o0000o14.f40511OooO0OO[i6];
                        if (!o0000oo4.OooO0O0(i6) || z7) {
                            if (!renderer4.OooOo0O()) {
                                renderer4.OooOO0(OooO(o0000oo4.f36783OooO0OO.f36787OooO0O0[i6]), o0000o14.f40511OooO0OO[i6], o0000o14.OooO0o0(), o0000o14.f40522OooOOOO);
                            } else if (renderer4.OooO0Oo()) {
                                OooO0Oo(renderer4);
                            } else {
                                z6 = true;
                            }
                        }
                    }
                    i6++;
                }
                if (!z6) {
                    OooO0oO();
                }
            }
            boolean z8 = false;
            while (true) {
                if (!(OoooOoo() && !this.f13344o00Oo0 && (o0000o2 = this.f13339Oooooo0.f13391OooO0oo) != null && (o0000o3 = o0000o2.f40519OooOO0o) != null && this.f13351o0OOO0o >= o0000o3.OooO0o0() && o0000o3.f40515OooO0oO)) {
                    break;
                }
                if (z8) {
                    OooOo0o();
                }
                OooOOOO oooOOOO7 = this.f13339Oooooo0;
                p468o0OooO0.o0000O o0000o15 = oooOOOO7.f13391OooO0oo;
                p468o0OooO0.o0000OO0 o0000oo5 = oooOOOO7.OooO00o().f40513OooO0o;
                oOO00O.OooO00o oooO00o = o0000oo5.f40528OooO00o;
                long j4 = o0000oo5.f40529OooO0O0;
                long j5 = o0000oo5.f40530OooO0OO;
                z8 = true;
                this.f13341Ooooooo = OooOOo(oooO00o, j4, j5);
                this.f13353o0OoOo0.OooO0O0(o0000o15.f40513OooO0o.f40532OooO0o ? 0 : 3);
                OooOooO();
                Oooooo();
            }
        }
        int i7 = this.f13341Ooooooo.f40578OooO0Oo;
        if (i7 == 1 || i7 == 4) {
            this.f13342o000oOoO.OooO0O0();
            return;
        }
        p468o0OooO0.o0000O o0000o16 = this.f13339Oooooo0.f13391OooO0oo;
        if (o0000o16 == null) {
            Oooo0O0(jOooO00o, 10L);
            return;
        }
        o000OO00.OooO00o("doSomeWork");
        Oooooo();
        if (o0000o16.f40512OooO0Oo) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            o0000o16.f40509OooO00o.OooOOo(this.f13341Ooooooo.f40589OooOOOo - this.f13332OoooOoo, this.f13333Ooooo00);
            boolean z9 = true;
            z2 = true;
            int i8 = 0;
            while (true) {
                Renderer[] rendererArr4 = this.f13322Oooo;
                if (i8 >= rendererArr4.length) {
                    break;
                }
                Renderer renderer5 = rendererArr4[i8];
                if (OooOo00(renderer5)) {
                    renderer5.OooOOOO(this.f13351o0OOO0o, jElapsedRealtime);
                    z9 = z9 && renderer5.OooO0Oo();
                    boolean z10 = o0000o16.f40511OooO0OO[i8] != renderer5.OooOOo0();
                    boolean z11 = z10 || (!z10 && renderer5.OooO0oo()) || renderer5.OooO0O0() || renderer5.OooO0Oo();
                    z2 = z2 && z11;
                    if (!z11) {
                        renderer5.OooOOoo();
                    }
                }
                i8++;
            }
            z = z9;
        } else {
            o0000o16.f40509OooO00o.OooO0oo();
            z = true;
            z2 = true;
        }
        long j6 = o0000o16.f40513OooO0o.f40533OooO0o0;
        boolean z12 = z && o0000o16.f40512OooO0Oo && (j6 == -9223372036854775807L || j6 <= this.f13341Ooooooo.f40589OooOOOo);
        if (z12 && this.f13344o00Oo0) {
            this.f13344o00Oo0 = false;
            OoooOO0(false, this.f13341Ooooooo.f40584OooOO0O, false, 5);
        }
        if (z12 && o0000o16.f40513OooO0o.f40535OooO0oo) {
            OoooOoO(4);
            OooooOO();
        } else {
            o000Oo0 o000oo2 = this.f13341Ooooooo;
            if (o000oo2.f40578OooO0Oo == 2) {
                if (this.f13355o0ooOOo == 0) {
                    zOooOo0 = OooOo0();
                } else if (z2) {
                    if (o000oo2.f40579OooO0o) {
                        p468o0OooO0.o0000O o0000o17 = this.f13339Oooooo0.f13392OooOO0;
                        if (!(o0000o17.OooO0o() && o0000o17.f40513OooO0o.f40535OooO0oo)) {
                            o000OOo o000ooo2 = this.f13323OoooO;
                            long jOooOO0o = OooOO0o();
                            float f = this.f13334Ooooo0o.OooO0oO().f40550OooO00o;
                            boolean z13 = this.f13345o00Ooo;
                            Objects.requireNonNull(o000ooo2);
                            int i9 = o00.f36680OooO00o;
                            if (f != 1.0f) {
                                jOooOO0o = Math.round(jOooOO0o / ((double) f));
                            }
                            long j7 = z13 ? o000ooo2.f40568OooO0o0 : o000ooo2.f40566OooO0Oo;
                            if (j7 <= 0 || jOooOO0o >= j7) {
                                z3 = true;
                            } else {
                                p711oo0oOOo.OooOOOO oooOOOO8 = o000ooo2.f40563OooO00o;
                                synchronized (oooOOOO8) {
                                    i = oooOOOO8.f53407OooO0o0 * oooOOOO8.f53403OooO0O0;
                                }
                                if (i >= o000ooo2.f40570OooO0oo) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (!z3) {
                                zOooOo0 = false;
                            }
                        }
                    }
                    zOooOo0 = true;
                } else {
                    zOooOo0 = false;
                }
                if (zOooOo0) {
                    OoooOoO(3);
                    if (OoooOoo()) {
                        Ooooo0o();
                    }
                } else if (this.f13341Ooooooo.f40578OooO0Oo == 3) {
                    this.f13345o00Ooo = OoooOoo();
                    OoooOoO(2);
                    OooooOO();
                }
            } else if (this.f13341Ooooooo.f40578OooO0Oo == 3 && (this.f13355o0ooOOo != 0 ? !z2 : !OooOo0())) {
                this.f13345o00Ooo = OoooOoo();
                OoooOoO(2);
                OooooOO();
            }
        }
        if (this.f13341Ooooooo.f40578OooO0Oo == 2) {
            int i10 = 0;
            while (true) {
                Renderer[] rendererArr5 = this.f13322Oooo;
                if (i10 >= rendererArr5.length) {
                    break;
                }
                if (OooOo00(rendererArr5[i10]) && this.f13322Oooo[i10].OooOOo0() == o0000o16.f40511OooO0OO[i10]) {
                    this.f13322Oooo[i10].OooOOoo();
                }
                i10++;
            }
            if (this.f13358oo0o0Oo) {
                o000Oo0 o000oo3 = this.f13341Ooooooo;
                if (!o000oo3.f40579OooO0o && o000oo3.f40588OooOOOO < 500000 && OooOOoo()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
        }
        boolean z14 = this.f13354o0ooOO0;
        o000Oo0 o000oo4 = this.f13341Ooooooo;
        if (z14 != o000oo4.f40587OooOOO0) {
            this.f13341Ooooooo = o000oo4.OooO0OO(z14);
        }
        if ((OoooOoo() && this.f13341Ooooooo.f40578OooO0Oo == 3) || (i2 = this.f13341Ooooooo.f40578OooO0Oo) == 2) {
            if (!this.f13354o0ooOO0 || !this.f13347o00oO0O) {
                Oooo0O0(jOooO00o, 10L);
            }
        } else if (this.f13355o0ooOOo == 0 || i2 == 4) {
            this.f13342o000oOoO.OooO0O0();
        } else {
            Oooo0O0(jOooO00o, 1000L);
        }
        this.f13347o00oO0O = false;
        o000OO00.OooO0O0();
    }

    @Override // o0O0o0oo.o00O.OooO00o
    public final void OooO0o0(o00O o00o2) {
        this.f13342o000oOoO.OooO00o(9, (o00O00O) o00o2).sendToTarget();
    }

    public final void OooO0oO() throws ExoPlaybackException {
        OooO0oo(new boolean[this.f13322Oooo.length]);
    }

    public final void OooO0oo(boolean[] zArr) throws ExoPlaybackException {
        o000OO o000oo2;
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13383OooO;
        o0000OO0 o0000oo1 = o0000o2.f40520OooOOO;
        for (int i = 0; i < this.f13322Oooo.length; i++) {
            if (!o0000oo1.OooO0O0(i)) {
                this.f13322Oooo[i].OooO00o();
            }
        }
        for (int i2 = 0; i2 < this.f13322Oooo.length; i2++) {
            if (o0000oo1.OooO0O0(i2)) {
                boolean z = zArr[i2];
                Renderer renderer = this.f13322Oooo[i2];
                if (OooOo00(renderer)) {
                    continue;
                } else {
                    OooOOOO oooOOOO = this.f13339Oooooo0;
                    p468o0OooO0.o0000O o0000o3 = oooOOOO.f13383OooO;
                    boolean z2 = o0000o3 == oooOOOO.f13391OooO0oo;
                    o0000OO0 o0000oo2 = o0000o3.f40520OooOOO;
                    o000O0Oo o000o0oo2 = o0000oo2.f36782OooO0O0[i2];
                    Format[] formatArrOooO = OooO(o0000oo2.f36783OooO0OO.f36787OooO0O0[i2]);
                    boolean z3 = OoooOoo() && this.f13341Ooooooo.f40578OooO0Oo == 3;
                    boolean z4 = !z && z3;
                    this.f13355o0ooOOo++;
                    renderer.OooO(o000o0oo2, formatArrOooO, o0000o3.f40511OooO0OO[i2], this.f13351o0OOO0o, z4, z2, o0000o3.OooO0o0(), o0000o3.f40522OooOOOO);
                    renderer.OooOOOo(103, new com.google.android.exoplayer2.OooOO0O(this));
                    com.google.android.exoplayer2.OooO oooO = this.f13334Ooooo0o;
                    Objects.requireNonNull(oooO);
                    o000OO o000ooOooOo0o = renderer.OooOo0o();
                    if (o000ooOooOo0o != null && o000ooOooOo0o != (o000oo2 = oooO.f13204OoooO0O)) {
                        if (o000oo2 != null) {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        oooO.f13204OoooO0O = o000ooOooOo0o;
                        oooO.f13202OoooO0 = renderer;
                        o000ooOooOo0o.OooO0o0(oooO.f13200Oooo.f36740OoooO);
                    }
                    if (z3) {
                        renderer.start();
                    }
                }
            }
        }
        o0000o2.f40515OooO0oO = true;
    }

    public final long OooOO0() {
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13383OooO;
        if (o0000o2 == null) {
            return 0L;
        }
        long jMax = o0000o2.f40522OooOOOO;
        if (!o0000o2.f40512OooO0Oo) {
            return jMax;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.f13322Oooo;
            if (i >= rendererArr.length) {
                return jMax;
            }
            if (OooOo00(rendererArr[i]) && this.f13322Oooo[i].OooOOo0() == o0000o2.f40511OooO0OO[i]) {
                long jOooOo00 = this.f13322Oooo[i].OooOo00();
                if (jOooOo00 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jOooOo00, jMax);
            }
            i++;
        }
    }

    public final Pair<oOO00O.OooO00o, Long> OooOO0O(o000oOoO o000oooo2) {
        long j = 0;
        if (o000oooo2.OooOOOO()) {
            oOO00O.OooO00o oooO00o = o000Oo0.f40573OooOOo0;
            return Pair.create(o000Oo0.f40573OooOOo0, 0L);
        }
        Pair<Object, Long> pairOooO = o000oooo2.OooO(this.f13330OoooOo0, this.f13331OoooOoO, o000oooo2.OooO00o(this.f13357oo000o), -9223372036854775807L);
        oOO00O.OooO00o oooO00oOooOOO = this.f13339Oooooo0.OooOOO(o000oooo2, pairOooO.first, 0L);
        long jLongValue = ((Long) pairOooO.second).longValue();
        if (oooO00oOooOOO.OooO0O0()) {
            o000oooo2.OooO0oO(oooO00oOooOOO.f36414OooO00o, this.f13331OoooOoO);
            if (oooO00oOooOOO.f36416OooO0OO == this.f13331OoooOoO.OooO0o0(oooO00oOooOOO.f36415OooO0O0)) {
                this.f13331OoooOoO.OooO0Oo();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(oooO00oOooOOO, Long.valueOf(j));
    }

    public final long OooOO0o() {
        long j = this.f13341Ooooooo.f40586OooOOO;
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13392OooOO0;
        if (o0000o2 == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f13351o0OOO0o - o0000o2.f40522OooOOOO));
    }

    public final void OooOOO(boolean z) {
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13392OooOO0;
        oOO00O.OooO00o oooO00o = o0000o2 == null ? this.f13341Ooooooo.f40576OooO0O0 : o0000o2.f40513OooO0o.f40528OooO00o;
        boolean z2 = !this.f13341Ooooooo.f40574OooO.equals(oooO00o);
        if (z2) {
            this.f13341Ooooooo = this.f13341Ooooooo.OooO00o(oooO00o);
        }
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        o000oo1.f40586OooOOO = o0000o2 == null ? o000oo1.f40589OooOOOo : o0000o2.OooO0Oo();
        this.f13341Ooooooo.f40588OooOOOO = OooOO0o();
        if ((z2 || z) && o0000o2 != null && o0000o2.f40512OooO0Oo) {
            Oooooo0(o0000o2.f40520OooOOO);
        }
    }

    public final void OooOOO0(o00O00O o00o00o2) {
        OooOOOO oooOOOO = this.f13339Oooooo0;
        p468o0OooO0.o0000O o0000o2 = oooOOOO.f13392OooOO0;
        if (o0000o2 != null && o0000o2.f40509OooO00o == o00o00o2) {
            oooOOOO.OooOO0o(this.f13351o0OOO0o);
            OooOo0O();
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0247  */
    /* JADX WARN: Code duplicated, block: B:116:0x0269  */
    public final void OooOOOO(o000oOoO o000oooo2) throws Throwable {
        OooOOOO oooOOOO;
        oOO00O.OooO00o oooO00o;
        boolean z;
        int i;
        Object obj;
        int i2;
        int iOooO00o;
        int iOooO00o2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        long jLongValue;
        long j;
        long j2;
        OooOO0 oooOO1;
        long j3;
        int i4;
        int i5;
        boolean z5;
        int iOooO00o3;
        boolean z6;
        long jOooo0o;
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        OooOO0O oooOO0O = this.f13356o0ooOoO;
        OooOOOO oooOOOO2 = this.f13339Oooooo0;
        int i6 = this.f13349o00ooo;
        boolean z7 = this.f13357oo000o;
        o000oOoO.OooO0OO oooO0OO = this.f13330OoooOo0;
        o000oOoO.OooO0O0 oooO0O0 = this.f13331OoooOoO;
        if (o000oooo2.OooOOOO()) {
            oOO00O.OooO00o oooO00o2 = o000Oo0.f40573OooOOo0;
            oooOO1 = new OooOO0(o000Oo0.f40573OooOOo0, 0L, -9223372036854775807L, false, true);
            z = false;
        } else {
            oOO00O.OooO00o oooO00o3 = o000oo1.f40576OooO0O0;
            Object obj2 = oooO00o3.f36414OooO00o;
            boolean zOoooo00 = Ooooo00(o000oo1, oooO0O0, oooO0OO);
            long jLongValue2 = zOoooo00 ? o000oo1.f40577OooO0OO : o000oo1.f40589OooOOOo;
            if (oooOO0O != null) {
                Pair<Object, Long> pairOooo00o = Oooo00o(o000oooo2, oooOO0O, true, i6, z7, oooO0OO, oooO0O0);
                if (pairOooo00o == null) {
                    iOooO00o3 = o000oooo2.OooO00o(z7);
                    obj = obj2;
                    z5 = false;
                    z6 = true;
                } else {
                    if (oooOO0O.f13382OooO0OO == -9223372036854775807L) {
                        i5 = o000oooo2.OooO0oO(pairOooo00o.first, oooO0O0).f14577OooO0OO;
                        obj = obj2;
                    } else {
                        obj = pairOooo00o.first;
                        jLongValue2 = ((Long) pairOooo00o.second).longValue();
                        i5 = -1;
                    }
                    z5 = o000oo1.f40578OooO0Oo == 4;
                    iOooO00o3 = i5;
                    z6 = false;
                }
                oooO0OO = oooO0OO;
                z4 = z5;
                z3 = z6;
                oooOOOO = oooOOOO2;
                oooO00o = oooO00o3;
                z = false;
                i = -1;
                oooO0O0 = oooO0O0;
                i3 = iOooO00o3;
            } else {
                oooOOOO = oooOOOO2;
                if (o000oo1.f40575OooO00o.OooOOOO()) {
                    iOooO00o = o000oooo2.OooO00o(z7);
                } else if (o000oooo2.OooO0O0(obj2) == -1) {
                    Object objOooo0 = Oooo0(oooO0OO, oooO0O0, i6, z7, obj2, o000oo1.f40575OooO00o, o000oooo2);
                    if (objOooo0 == null) {
                        iOooO00o2 = o000oooo2.OooO00o(z7);
                        z2 = true;
                    } else {
                        iOooO00o2 = o000oooo2.OooO0oO(objOooo0, oooO0O0).f14577OooO0OO;
                        z2 = false;
                    }
                    obj = obj2;
                    oooO0OO = oooO0OO;
                    z3 = z2;
                    oooOOOO = oooOOOO;
                    oooO00o = oooO00o3;
                    z = false;
                    i = -1;
                    z4 = false;
                    oooO0O0 = oooO0O0;
                    i3 = iOooO00o2;
                } else {
                    if (!zOoooo00) {
                        oooO00o = oooO00o3;
                        z = false;
                        i = -1;
                        obj = obj2;
                    } else if (jLongValue2 == -9223372036854775807L) {
                        iOooO00o = o000oooo2.OooO0oO(obj2, oooO0O0).f14577OooO0OO;
                    } else {
                        oooO00o = oooO00o3;
                        o000oo1.f40575OooO00o.OooO0oO(oooO00o.f36414OooO00o, oooO0O0);
                        z = false;
                        i = -1;
                        Pair<Object, Long> pairOooO = o000oooo2.OooO(oooO0OO, oooO0O0, o000oooo2.OooO0oO(obj2, oooO0O0).f14577OooO0OO, jLongValue2 + oooO0O0.f14580OooO0o0);
                        obj = pairOooO.first;
                        jLongValue2 = ((Long) pairOooO.second).longValue();
                    }
                    i2 = -1;
                    i3 = i2;
                    z4 = false;
                    z3 = false;
                }
                obj = obj2;
                oooO0OO = oooO0OO;
                i2 = iOooO00o;
                oooOOOO = oooOOOO;
                oooO00o = oooO00o3;
                z = false;
                i = -1;
                oooO0O0 = oooO0O0;
                i3 = i2;
                z4 = false;
                z3 = false;
            }
            if (i3 != i) {
                Pair<Object, Long> pairOooO2 = o000oooo2.OooO(oooO0OO, oooO0O0, i3, -9223372036854775807L);
                obj = pairOooO2.first;
                jLongValue = ((Long) pairOooO2.second).longValue();
                j = -9223372036854775807L;
            } else {
                jLongValue = jLongValue2;
                j = jLongValue;
            }
            oOO00O.OooO00o oooO00oOooOOO = oooOOOO.OooOOO(o000oooo2, obj, jLongValue);
            if (oooO00o.f36414OooO00o.equals(obj) && !oooO00o.OooO0O0() && !oooO00oOooOOO.OooO0O0() && (oooO00oOooOOO.f36418OooO0o0 == i || ((i4 = oooO00o.f36418OooO0o0) != i && oooO00oOooOOO.f36415OooO0O0 >= i4))) {
                oooO00oOooOOO = oooO00o;
            }
            if (oooO00oOooOOO.OooO0O0()) {
                if (oooO00oOooOOO.equals(oooO00o)) {
                    j3 = o000oo1.f40589OooOOOo;
                } else {
                    o000oooo2.OooO0oO(oooO00oOooOOO.f36414OooO00o, oooO0O0);
                    if (oooO00oOooOOO.f36416OooO0OO == oooO0O0.OooO0o0(oooO00oOooOOO.f36415OooO0O0)) {
                        oooO0O0.OooO0Oo();
                    }
                    j3 = 0;
                }
                j2 = j3;
            } else {
                j2 = jLongValue;
            }
            oooOO1 = new OooOO0(oooO00oOooOOO, j2, j, z4, z3);
        }
        oOO00O.OooO00o oooO00o4 = oooOO1.f13375OooO00o;
        long j4 = oooOO1.f13377OooO0OO;
        boolean z8 = oooOO1.f13378OooO0Oo;
        long j5 = oooOO1.f13376OooO0O0;
        boolean z9 = (this.f13341Ooooooo.f40576OooO0O0.equals(oooO00o4) && j5 == this.f13341Ooooooo.f40589OooOOOo) ? false : true;
        boolean z10 = false;
        try {
            if (oooOO1.f13379OooO0o0) {
                if (this.f13341Ooooooo.f40578OooO0Oo != 1) {
                    OoooOoO(4);
                }
                OooOoo(z, z, z, true);
            }
            try {
                if (z9) {
                    if (!o000oooo2.OooOOOO()) {
                        for (p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo; o0000o2 != null; o0000o2 = o0000o2.f40519OooOO0o) {
                            if (o0000o2.f40513OooO0o.f40528OooO00o.equals(oooO00o4)) {
                                o0000o2.f40513OooO0o = this.f13339Oooooo0.OooO0oO(o000oooo2, o0000o2.f40513OooO0o);
                            }
                        }
                        jOooo0o = Oooo0o(oooO00o4, j5, z8);
                    }
                    if (z9 || j4 != this.f13341Ooooooo.f40577OooO0OO) {
                        this.f13341Ooooooo = OooOOo(oooO00o4, jOooo0o, j4);
                    }
                    OooOooO();
                    Oooo00O(o000oooo2, this.f13341Ooooooo.f40575OooO00o);
                    this.f13341Ooooooo = this.f13341Ooooooo.OooO0oO(o000oooo2);
                    if (!o000oooo2.OooOOOO()) {
                        this.f13356o0ooOoO = null;
                    }
                    OooOOO(z);
                }
                if (!this.f13339Oooooo0.OooOOo0(o000oooo2, this.f13351o0OOO0o, OooOO0())) {
                    Oooo0OO(z);
                }
                jOooo0o = j5;
                if (z9) {
                    this.f13341Ooooooo = OooOOo(oooO00o4, jOooo0o, j4);
                } else {
                    this.f13341Ooooooo = OooOOo(oooO00o4, jOooo0o, j4);
                }
                OooOooO();
                Oooo00O(o000oooo2, this.f13341Ooooooo.f40575OooO00o);
                this.f13341Ooooooo = this.f13341Ooooooo.OooO0oO(o000oooo2);
                if (!o000oooo2.OooOOOO()) {
                    this.f13356o0ooOoO = null;
                }
                OooOOO(z);
            } catch (Throwable th) {
                th = th;
                z10 = false;
                if (z9 || j4 != this.f13341Ooooooo.f40577OooO0OO) {
                    this.f13341Ooooooo = OooOOo(oooO00o4, j5, j4);
                }
                OooOooO();
                Oooo00O(o000oooo2, this.f13341Ooooooo.f40575OooO00o);
                this.f13341Ooooooo = this.f13341Ooooooo.OooO0oO(o000oooo2);
                if (!o000oooo2.OooOOOO()) {
                    this.f13356o0ooOoO = z10;
                }
                OooOOO(z);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void OooOOOo(o00O00O o00o00o2) throws ExoPlaybackException {
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13392OooOO0;
        if (o0000o2 != null && o0000o2.f40509OooO00o == o00o00o2) {
            float f = this.f13334Ooooo0o.OooO0oO().f40550OooO00o;
            o000oOoO o000oooo2 = this.f13341Ooooooo.f40575OooO00o;
            o0000o2.f40512OooO0Oo = true;
            o0000o2.f40521OooOOO0 = o0000o2.f40509OooO00o.OooOOOO();
            o0000OO0 o0000oo0OooO = o0000o2.OooO(f, o000oooo2);
            p468o0OooO0.o0000OO0 o0000oo1 = o0000o2.f40513OooO0o;
            long jMax = o0000oo1.f40529OooO0O0;
            long j = o0000oo1.f40533OooO0o0;
            if (j != -9223372036854775807L && jMax >= j) {
                jMax = Math.max(0L, j - 1);
            }
            long jOooO00o = o0000o2.OooO00o(o0000oo0OooO, jMax, false, new boolean[o0000o2.f40508OooO.length]);
            long j2 = o0000o2.f40522OooOOOO;
            p468o0OooO0.o0000OO0 o0000oo2 = o0000o2.f40513OooO0o;
            o0000o2.f40522OooOOOO = (o0000oo2.f40529OooO0O0 - jOooO00o) + j2;
            o0000o2.f40513OooO0o = o0000oo2.OooO00o(jOooO00o);
            Oooooo0(o0000o2.f40520OooOOO);
            if (o0000o2 == this.f13339Oooooo0.f13391OooO0oo) {
                OooOooo(o0000o2.f40513OooO0o.f40529OooO0O0);
                OooO0oO();
                o000Oo0 o000oo1 = this.f13341Ooooooo;
                this.f13341Ooooooo = OooOOo(o000oo1.f40576OooO0O0, o0000o2.f40513OooO0o.f40529OooO0O0, o000oo1.f40577OooO0OO);
            }
            OooOo0O();
        }
    }

    @CheckResult
    public final o000Oo0 OooOOo(oOO00O.OooO00o oooO00o, long j, long j2) {
        TrackGroupArray trackGroupArray;
        o0000OO0 o0000oo1;
        this.f13350o0OO00O = (!this.f13350o0OO00O && j == this.f13341Ooooooo.f40589OooOOOo && oooO00o.equals(this.f13341Ooooooo.f40576OooO0O0)) ? false : true;
        OooOooO();
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        TrackGroupArray trackGroupArray2 = o000oo1.f40581OooO0oO;
        o0000OO0 o0000oo2 = o000oo1.f40582OooO0oo;
        if (this.f13338Oooooo.f13414OooOO0) {
            p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo;
            TrackGroupArray trackGroupArray3 = o0000o2 == null ? TrackGroupArray.f14622OoooO0O : o0000o2.f40521OooOOO0;
            o0000oo1 = o0000o2 == null ? this.f13326OoooO0O : o0000o2.f40520OooOOO;
            trackGroupArray = trackGroupArray3;
        } else if (oooO00o.equals(o000oo1.f40576OooO0O0)) {
            trackGroupArray = trackGroupArray2;
            o0000oo1 = o0000oo2;
        } else {
            trackGroupArray = TrackGroupArray.f14622OoooO0O;
            o0000oo1 = this.f13326OoooO0O;
        }
        return this.f13341Ooooooo.OooO0O0(oooO00o, j, j2, OooOO0o(), trackGroupArray, o0000oo1);
    }

    public final void OooOOo0(o000O00 o000o01, boolean z) throws ExoPlaybackException {
        int i;
        this.f13353o0OoOo0.OooO00o(z ? 1 : 0);
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        this.f13341Ooooooo = new o000Oo0(o000oo1.f40575OooO00o, o000oo1.f40576OooO0O0, o000oo1.f40577OooO0OO, o000oo1.f40578OooO0Oo, o000oo1.f40580OooO0o0, o000oo1.f40579OooO0o, o000oo1.f40581OooO0oO, o000oo1.f40582OooO0oo, o000oo1.f40574OooO, o000oo1.f40583OooOO0, o000oo1.f40584OooOO0O, o000o01, o000oo1.f40586OooOOO, o000oo1.f40588OooOOOO, o000oo1.f40589OooOOOo, o000oo1.f40587OooOOO0);
        float f = o000o01.f40550OooO00o;
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo;
        while (true) {
            i = 0;
            if (o0000o2 == null) {
                break;
            }
            com.google.android.exoplayer2.trackselection.OooO0OO[] oooO0OOArrOooO00o = o0000o2.f40520OooOOO.f36783OooO0OO.OooO00o();
            int length = oooO0OOArrOooO00o.length;
            while (i < length) {
                com.google.android.exoplayer2.trackselection.OooO0OO oooO0OO = oooO0OOArrOooO00o[i];
                if (oooO0OO != null) {
                    oooO0OO.OooO0OO();
                }
                i++;
            }
            o0000o2 = o0000o2.f40519OooOO0o;
        }
        Renderer[] rendererArr = this.f13322Oooo;
        int length2 = rendererArr.length;
        while (i < length2) {
            Renderer renderer = rendererArr[i];
            if (renderer != null) {
                renderer.OooOOo(o000o01.f40550OooO00o);
            }
            i++;
        }
    }

    public final boolean OooOOoo() {
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13392OooOO0;
        if (o0000o2 == null) {
            return false;
        }
        return (!o0000o2.f40512OooO0Oo ? 0L : o0000o2.f40509OooO00o.OooO0o()) != Long.MIN_VALUE;
    }

    public final void OooOo(OooO0O0 oooO0O0) throws Throwable {
        this.f13353o0OoOo0.OooO00o(1);
        OooOo00 oooOo00 = this.f13338Oooooo;
        Objects.requireNonNull(oooO0O0);
        Objects.requireNonNull(oooOo00);
        o00000O0.OooO00o(oooOo00.OooO0o0() >= 0);
        oooOo00.f13405OooO = null;
        OooOOOO(oooOo00.OooO0OO());
    }

    public final boolean OooOo0() {
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo;
        long j = o0000o2.f40513OooO0o.f40533OooO0o0;
        return o0000o2.f40512OooO0Oo && (j == -9223372036854775807L || this.f13341Ooooooo.f40589OooOOOo < j || !OoooOoo());
    }

    public final void OooOo0O() {
        int i;
        boolean z = false;
        if (OooOOoo()) {
            p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13392OooOO0;
            long jOooO0o = !o0000o2.f40512OooO0Oo ? 0L : o0000o2.f40509OooO00o.OooO0o();
            p468o0OooO0.o0000O o0000o3 = this.f13339Oooooo0.f13392OooOO0;
            long jMax = o0000o3 != null ? Math.max(0L, jOooO0o - (this.f13351o0OOO0o - o0000o3.f40522OooOOOO)) : 0L;
            if (o0000o2 != this.f13339Oooooo0.f13391OooO0oo) {
                long j = o0000o2.f40513OooO0o.f40529OooO0O0;
            }
            o000OOo o000ooo2 = this.f13323OoooO;
            float f = this.f13334Ooooo0o.OooO0oO().f40550OooO00o;
            p711oo0oOOo.OooOOOO oooOOOO = o000ooo2.f40563OooO00o;
            synchronized (oooOOOO) {
                i = oooOOOO.f53407OooO0o0 * oooOOOO.f53403OooO0O0;
            }
            boolean z2 = i >= o000ooo2.f40570OooO0oo;
            long jMin = o000ooo2.f40564OooO0O0;
            if (f > 1.0f) {
                jMin = Math.min(o00.OooOOo0(jMin, f), o000ooo2.f40565OooO0OO);
            }
            if (jMax < Math.max(jMin, 500000L)) {
                z = z2 ? false : true;
                o000ooo2.f40562OooO = z;
                if (!z && jMax < 500000) {
                    Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                }
            } else if (jMax >= o000ooo2.f40565OooO0OO || z2) {
                o000ooo2.f40562OooO = false;
            }
            z = o000ooo2.f40562OooO;
        }
        this.f13346o00o0O = z;
        if (z) {
            p468o0OooO0.o0000O o0000o4 = this.f13339Oooooo0.f13392OooOO0;
            long j2 = this.f13351o0OOO0o;
            o00000O0.OooO0Oo(o0000o4.OooO0oO());
            o0000o4.f40509OooO00o.OooOO0(j2 - o0000o4.f40522OooOOOO);
        }
        OooooOo();
    }

    public final void OooOo0o() {
        final OooO0o oooO0o = this.f13353o0OoOo0;
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        boolean z = oooO0o.f13368OooO00o | (oooO0o.f13369OooO0O0 != o000oo1);
        oooO0o.f13368OooO00o = z;
        oooO0o.f13369OooO0O0 = o000oo1;
        if (z) {
            final com.google.android.exoplayer2.OooOO0 oooOO1 = (com.google.android.exoplayer2.OooOO0) ((o0O0O0o0.OooO0OO) this.f13337OooooOo).f35446OoooO00;
            oooOO1.f13233OooO0o0.post(new Runnable() { // from class: o0OooO0.o000000
                /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
                /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
                @Override // java.lang.Runnable
                public final void run() {
                    OooOO0 oooOO2 = oooOO1;
                    OooOOO0.OooO0o oooO0o2 = oooO0o;
                    int i = oooOO2.f13243OooOOo - oooO0o2.f13370OooO0OO;
                    oooOO2.f13243OooOOo = i;
                    if (oooO0o2.f13371OooO0Oo) {
                        oooOO2.f13245OooOOoo = true;
                        oooOO2.f13248OooOo00 = oooO0o2.f13373OooO0o0;
                    }
                    if (oooO0o2.f13372OooO0o) {
                        oooOO2.f13247OooOo0 = oooO0o2.f13374OooO0oO;
                    }
                    if (i == 0) {
                        o000oOoO o000oooo2 = oooO0o2.f13369OooO0O0.f40575OooO00o;
                        if (!oooOO2.f13250OooOo0o.f40575OooO00o.OooOOOO() && o000oooo2.OooOOOO()) {
                            oooOO2.f13246OooOo = -1;
                            oooOO2.f13251OooOoO0 = 0L;
                        }
                        if (!o000oooo2.OooOOOO()) {
                            List listAsList = Arrays.asList(((o000O0) o000oooo2).f40542OooO);
                            o00000O0.OooO0Oo(listAsList.size() == oooOO2.f13238OooOO0o.size());
                            for (int i2 = 0; i2 < listAsList.size(); i2++) {
                                ((OooOO0.OooO00o) oooOO2.f13238OooOO0o.get(i2)).f13253OooO0O0 = (o000oOoO) listAsList.get(i2);
                            }
                        }
                        boolean z2 = oooOO2.f13245OooOOoo;
                        oooOO2.f13245OooOOoo = false;
                        oooOO2.OooOOo(oooO0o2.f13369OooO0O0, z2, oooOO2.f13248OooOo00, 1, oooOO2.f13247OooOo0);
                    }
                }
            });
            this.f13353o0OoOo0 = new OooO0o(this.f13341Ooooooo);
        }
    }

    public final void OooOoO() {
        OooOoo(true, false, true, false);
        this.f13323OoooO.OooO0O0(true);
        OoooOoO(1);
        this.f13328OoooOOO.quit();
        synchronized (this) {
            this.f13359ooOO = true;
            notifyAll();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashSet, java.util.Set<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final void OooOoO0() {
        this.f13353o0OoOo0.OooO00o(1);
        OooOoo(false, false, false, true);
        this.f13323OoooO.OooO0O0(false);
        OoooOoO(this.f13341Ooooooo.f40575OooO00o.OooOOOO() ? 4 : 2);
        OooOo00 oooOo00 = this.f13338Oooooo;
        p711oo0oOOo.o000oOoO o000ooooOooO0o0 = this.f13327OoooOO0.OooO0o0();
        o00000O0.OooO0Oo(!oooOo00.f13414OooOO0);
        oooOo00.f13415OooOO0O = o000ooooOooO0o0;
        for (int i = 0; i < oooOo00.f13406OooO00o.size(); i++) {
            OooOo00.OooO0OO oooO0OO = (OooOo00.OooO0OO) oooOo00.f13406OooO00o.get(i);
            oooOo00.OooO0oO(oooO0OO);
            oooOo00.f13413OooO0oo.add(oooO0OO);
        }
        oooOo00.f13414OooOO0 = true;
        this.f13342o000oOoO.OooO0OO(2);
    }

    public final void OooOoOO(int i, int i2, o00OO000 o00oo001) throws Throwable {
        this.f13353o0OoOo0.OooO00o(1);
        OooOo00 oooOo00 = this.f13338Oooooo;
        Objects.requireNonNull(oooOo00);
        o00000O0.OooO00o(i >= 0 && i <= i2 && i2 <= oooOo00.OooO0o0());
        oooOo00.f13405OooO = o00oo001;
        oooOo00.OooO(i, i2);
        OooOOOO(oooOo00.OooO0OO());
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.HashSet, java.util.Set<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final void OooOoo(boolean z, boolean z2, boolean z3, boolean z4) {
        oOO00O.OooO00o oooO00o;
        long j;
        long j2;
        boolean z5;
        this.f13342o000oOoO.OooO0O0();
        this.f13345o00Ooo = false;
        com.google.android.exoplayer2.OooO oooO = this.f13334Ooooo0o;
        oooO.f13205OoooOO0 = false;
        o000O0 o000o0 = oooO.f13200Oooo;
        if (o000o0.f36742OoooO00) {
            o000o0.OooO00o(o000o0.OooOOO0());
            o000o0.f36742OoooO00 = false;
        }
        this.f13351o0OOO0o = 0L;
        for (Renderer renderer : this.f13322Oooo) {
            try {
                OooO0Oo(renderer);
            } catch (ExoPlaybackException | RuntimeException e) {
                o0000O0.OooO0O0("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            for (Renderer renderer2 : this.f13322Oooo) {
                try {
                    renderer2.OooO00o();
                } catch (RuntimeException e2) {
                    o0000O0.OooO0O0("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.f13355o0ooOOo = 0;
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        oOO00O.OooO00o oooO00o2 = o000oo1.f40576OooO0O0;
        long j3 = o000oo1.f40589OooOOOo;
        long j4 = Ooooo00(this.f13341Ooooooo, this.f13331OoooOoO, this.f13330OoooOo0) ? this.f13341Ooooooo.f40577OooO0OO : this.f13341Ooooooo.f40589OooOOOo;
        if (z2) {
            this.f13356o0ooOoO = null;
            Pair<oOO00O.OooO00o, Long> pairOooOO0O = OooOO0O(this.f13341Ooooooo.f40575OooO00o);
            oOO00O.OooO00o oooO00o3 = (oOO00O.OooO00o) pairOooOO0O.first;
            long jLongValue = ((Long) pairOooOO0O.second).longValue();
            j2 = -9223372036854775807L;
            if (oooO00o3.equals(this.f13341Ooooooo.f40576OooO0O0)) {
                oooO00o2 = oooO00o3;
                j3 = jLongValue;
                j4 = -9223372036854775807L;
                oooO00o = oooO00o2;
                j = j3;
                j2 = j4;
                z5 = false;
            } else {
                z5 = true;
                oooO00o = oooO00o3;
                j = jLongValue;
            }
        } else {
            oooO00o = oooO00o2;
            j = j3;
            j2 = j4;
            z5 = false;
        }
        this.f13339Oooooo0.OooO0O0();
        this.f13346o00o0O = false;
        o000Oo0 o000oo2 = this.f13341Ooooooo;
        this.f13341Ooooooo = new o000Oo0(o000oo2.f40575OooO00o, oooO00o, j2, o000oo2.f40578OooO0Oo, z4 ? null : o000oo2.f40580OooO0o0, false, z5 ? TrackGroupArray.f14622OoooO0O : o000oo2.f40581OooO0oO, z5 ? this.f13326OoooO0O : o000oo2.f40582OooO0oo, oooO00o, o000oo2.f40583OooOO0, o000oo2.f40584OooOO0O, o000oo2.f40585OooOO0o, j, 0L, j, this.f13354o0ooOO0);
        if (z3) {
            OooOo00 oooOo00 = this.f13338Oooooo;
            for (OooOo00.OooO0O0 oooO0O0 : oooOo00.f13412OooO0oO.values()) {
                try {
                    oooO0O0.f13420OooO00o.OooO0O0(oooO0O0.f13421OooO0O0);
                } catch (RuntimeException e3) {
                    o0000O0.OooO0O0("MediaSourceList", "Failed to release child source.", e3);
                }
                oooO0O0.f13420OooO00o.OooO0OO(oooO0O0.f13422OooO0OO);
            }
            oooOo00.f13412OooO0oO.clear();
            oooOo00.f13413OooO0oo.clear();
            oooOo00.f13414OooOO0 = false;
        }
    }

    public final void OooOoo0() throws ExoPlaybackException {
        boolean z;
        int i;
        float f = this.f13334Ooooo0o.OooO0oO().f40550OooO00o;
        OooOOOO oooOOOO = this.f13339Oooooo0;
        p468o0OooO0.o0000O o0000o2 = oooOOOO.f13391OooO0oo;
        p468o0OooO0.o0000O o0000o3 = oooOOOO.f13383OooO;
        boolean z2 = true;
        for (p468o0OooO0.o0000O o0000o4 = o0000o2; o0000o4 != null && o0000o4.f40512OooO0Oo; o0000o4 = o0000o4.f40519OooOO0o) {
            o0000OO0 o0000oo0OooO = o0000o4.OooO(f, this.f13341Ooooooo.f40575OooO00o);
            o0000OO0 o0000oo1 = o0000o4.f40520OooOOO;
            int i2 = 0;
            if (o0000oo1 == null || o0000oo1.f36783OooO0OO.f36786OooO00o != o0000oo0OooO.f36783OooO0OO.f36786OooO00o) {
                z = false;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= o0000oo0OooO.f36783OooO0OO.f36786OooO00o) {
                    z = true;
                    break;
                } else {
                    if (!o0000oo0OooO.OooO00o(o0000oo1, i3)) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                if (z2) {
                    OooOOOO oooOOOO2 = this.f13339Oooooo0;
                    p468o0OooO0.o0000O o0000o5 = oooOOOO2.f13391OooO0oo;
                    boolean zOooOOO0 = oooOOOO2.OooOOO0(o0000o5);
                    boolean[] zArr = new boolean[this.f13322Oooo.length];
                    long jOooO00o = o0000o5.OooO00o(o0000oo0OooO, this.f13341Ooooooo.f40589OooOOOo, zOooOOO0, zArr);
                    o000Oo0 o000oo1 = this.f13341Ooooooo;
                    i = 4;
                    o000Oo0 o000oo0OooOOo = OooOOo(o000oo1.f40576OooO0O0, jOooO00o, o000oo1.f40577OooO0OO);
                    this.f13341Ooooooo = o000oo0OooOOo;
                    if (o000oo0OooOOo.f40578OooO0Oo != 4 && jOooO00o != o000oo0OooOOo.f40589OooOOOo) {
                        this.f13353o0OoOo0.OooO0O0(4);
                        OooOooo(jOooO00o);
                    }
                    boolean[] zArr2 = new boolean[this.f13322Oooo.length];
                    while (true) {
                        Renderer[] rendererArr = this.f13322Oooo;
                        if (i2 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i2];
                        zArr2[i2] = OooOo00(renderer);
                        SampleStream sampleStream = o0000o5.f40511OooO0OO[i2];
                        if (zArr2[i2]) {
                            if (sampleStream != renderer.OooOOo0()) {
                                OooO0Oo(renderer);
                            } else if (zArr[i2]) {
                                renderer.OooOo0(this.f13351o0OOO0o);
                            }
                        }
                        i2++;
                    }
                    OooO0oo(zArr2);
                } else {
                    i = 4;
                    this.f13339Oooooo0.OooOOO0(o0000o4);
                    if (o0000o4.f40512OooO0Oo) {
                        o0000o4.OooO00o(o0000oo0OooO, Math.max(o0000o4.f40513OooO0o.f40529OooO0O0, this.f13351o0OOO0o - o0000o4.f40522OooOOOO), false, new boolean[o0000o4.f40508OooO.length]);
                    }
                }
                OooOOO(true);
                if (this.f13341Ooooooo.f40578OooO0Oo != i) {
                    OooOo0O();
                    Oooooo();
                    this.f13342o000oOoO.OooO0OO(2);
                    return;
                }
                return;
            }
            if (o0000o4 == o0000o3) {
                z2 = false;
            }
        }
    }

    public final void OooOooO() {
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo;
        this.f13344o00Oo0 = o0000o2 != null && o0000o2.f40513OooO0o.f40534OooO0oO && this.f13343o00O0O;
    }

    public final void OooOooo(long j) throws ExoPlaybackException {
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo;
        if (o0000o2 != null) {
            j += o0000o2.f40522OooOOOO;
        }
        this.f13351o0OOO0o = j;
        this.f13334Ooooo0o.f13200Oooo.OooO00o(j);
        for (Renderer renderer : this.f13322Oooo) {
            if (OooOo00(renderer)) {
                renderer.OooOo0(this.f13351o0OOO0o);
            }
        }
        for (p468o0OooO0.o0000O o0000o3 = this.f13339Oooooo0.f13391OooO0oo; o0000o3 != null; o0000o3 = o0000o3.f40519OooOO0o) {
            for (com.google.android.exoplayer2.trackselection.OooO0OO oooO0OO : o0000o3.f40520OooOOO.f36783OooO0OO.OooO00o()) {
                if (oooO0OO != null) {
                    oooO0OO.OooO();
                }
            }
        }
    }

    public final void Oooo(OooOo oooOo) {
        Handler handler = oooOo.f13401OooO0o;
        int i = 0;
        if (handler.getLooper().getThread().isAlive()) {
            handler.post(new o0000oo(this, oooOo, i));
        } else {
            Log.w("TAG", "Trying to send message on a dead thread.");
            oooOo.OooO00o(false);
        }
    }

    public final void Oooo00O(o000oOoO o000oooo2, o000oOoO o000oooo3) {
        if (o000oooo2.OooOOOO() && o000oooo3.OooOOOO()) {
            return;
        }
        for (int size = this.f13335OooooO0.size() - 1; size >= 0; size--) {
            if (!Oooo000(this.f13335OooooO0.get(size), o000oooo2, o000oooo3, this.f13349o00ooo, this.f13357oo000o, this.f13330OoooOo0, this.f13331OoooOoO)) {
                this.f13335OooooO0.get(size).f13364Oooo.OooO00o(false);
                this.f13335OooooO0.remove(size);
            }
        }
        Collections.sort(this.f13335OooooO0);
    }

    public final void Oooo0O0(long j, long j2) {
        this.f13342o000oOoO.OooO0O0();
        this.f13342o000oOoO.f36767OooO00o.sendEmptyMessageAtTime(2, j + j2);
    }

    public final void Oooo0OO(boolean z) throws ExoPlaybackException {
        oOO00O.OooO00o oooO00o = this.f13339Oooooo0.f13391OooO0oo.f40513OooO0o.f40528OooO00o;
        long jOooo0oO = Oooo0oO(oooO00o, this.f13341Ooooooo.f40589OooOOOo, true, false);
        if (jOooo0oO != this.f13341Ooooooo.f40589OooOOOo) {
            this.f13341Ooooooo = OooOOo(oooO00o, jOooo0oO, this.f13341Ooooooo.f40577OooO0OO);
            if (z) {
                this.f13353o0OoOo0.OooO0O0(4);
            }
        }
    }

    public final long Oooo0o(oOO00O.OooO00o oooO00o, long j, boolean z) throws ExoPlaybackException {
        OooOOOO oooOOOO = this.f13339Oooooo0;
        return Oooo0oO(oooO00o, j, oooOOOO.f13391OooO0oo != oooOOOO.f13383OooO, z);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public final void Oooo0o0(OooOO0O oooOO0O) throws ExoPlaybackException {
        long jLongValue;
        long j;
        oOO00O.OooO00o oooO00oOooOOO;
        boolean z;
        long jOooO0O0;
        long j2;
        o000Oo0 o000oo1;
        int i;
        this.f13353o0OoOo0.OooO00o(1);
        Pair<Object, Long> pairOooo00o = Oooo00o(this.f13341Ooooooo.f40575OooO00o, oooOO0O, true, this.f13349o00ooo, this.f13357oo000o, this.f13330OoooOo0, this.f13331OoooOoO);
        if (pairOooo00o == null) {
            Pair<oOO00O.OooO00o, Long> pairOooOO0O = OooOO0O(this.f13341Ooooooo.f40575OooO00o);
            oOO00O.OooO00o oooO00o = (oOO00O.OooO00o) pairOooOO0O.first;
            long jLongValue2 = ((Long) pairOooOO0O.second).longValue();
            z = !this.f13341Ooooooo.f40575OooO00o.OooOOOO();
            oooO00oOooOOO = oooO00o;
            jLongValue = jLongValue2;
            j = -9223372036854775807L;
        } else {
            Object obj = pairOooo00o.first;
            jLongValue = ((Long) pairOooo00o.second).longValue();
            j = oooOO0O.f13382OooO0OO == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            oooO00oOooOOO = this.f13339Oooooo0.OooOOO(this.f13341Ooooooo.f40575OooO00o, obj, jLongValue);
            if (oooO00oOooOOO.OooO0O0()) {
                this.f13341Ooooooo.f40575OooO00o.OooO0oO(oooO00oOooOOO.f36414OooO00o, this.f13331OoooOoO);
                if (this.f13331OoooOoO.OooO0o0(oooO00oOooOOO.f36415OooO0O0) == oooO00oOooOOO.f36416OooO0OO) {
                    this.f13331OoooOoO.OooO0Oo();
                }
                jLongValue = 0;
            } else if (oooOO0O.f13382OooO0OO != -9223372036854775807L) {
                z = false;
            }
            z = true;
        }
        try {
            if (!this.f13341Ooooooo.f40575OooO00o.OooOOOO()) {
                if (pairOooo00o == null) {
                    if (this.f13341Ooooooo.f40578OooO0Oo != 1) {
                        OoooOoO(4);
                    }
                    OooOoo(false, true, false, true);
                } else {
                    if (oooO00oOooOOO.equals(this.f13341Ooooooo.f40576OooO0O0)) {
                        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo;
                        jOooO0O0 = (o0000o2 == null || !o0000o2.f40512OooO0Oo || jLongValue == 0) ? jLongValue : o0000o2.f40509OooO00o.OooO0O0(jLongValue, this.f13340OoooooO);
                        if (C.OooO0O0(jOooO0O0) == C.OooO0O0(this.f13341Ooooooo.f40589OooOOOo) && ((i = (o000oo1 = this.f13341Ooooooo).f40578OooO0Oo) == 2 || i == 3)) {
                            this.f13341Ooooooo = OooOOo(oooO00oOooOOO, o000oo1.f40589OooOOOo, j);
                            if (z) {
                                this.f13353o0OoOo0.OooO0O0(2);
                                return;
                            }
                            return;
                        }
                    } else {
                        jOooO0O0 = jLongValue;
                    }
                    long jOooo0o = Oooo0o(oooO00oOooOOO, jOooO0O0, this.f13341Ooooooo.f40578OooO0Oo == 4);
                    z |= jLongValue != jOooo0o;
                    j2 = jOooo0o;
                }
                this.f13341Ooooooo = OooOOo(oooO00oOooOOO, j2, j);
                if (z) {
                    this.f13353o0OoOo0.OooO0O0(2);
                }
            }
            this.f13356o0ooOoO = oooOO0O;
            j2 = jLongValue;
            this.f13341Ooooooo = OooOOo(oooO00oOooOOO, j2, j);
            if (z) {
                this.f13353o0OoOo0.OooO0O0(2);
            }
        } catch (Throwable th) {
            this.f13341Ooooooo = OooOOo(oooO00oOooOOO, jLongValue, j);
            if (z) {
                this.f13353o0OoOo0.OooO0O0(2);
            }
            throw th;
        }
    }

    public final long Oooo0oO(oOO00O.OooO00o oooO00o, long j, boolean z, boolean z2) throws ExoPlaybackException {
        OooOOOO oooOOOO;
        OooooOO();
        this.f13345o00Ooo = false;
        if (z2 || this.f13341Ooooooo.f40578OooO0Oo == 3) {
            OoooOoO(2);
        }
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo;
        p468o0OooO0.o0000O o0000o3 = o0000o2;
        while (o0000o3 != null && !oooO00o.equals(o0000o3.f40513OooO0o.f40528OooO00o)) {
            o0000o3 = o0000o3.f40519OooOO0o;
        }
        if (z || o0000o2 != o0000o3 || (o0000o3 != null && o0000o3.f40522OooOOOO + j < 0)) {
            for (Renderer renderer : this.f13322Oooo) {
                OooO0Oo(renderer);
            }
            if (o0000o3 != null) {
                while (true) {
                    oooOOOO = this.f13339Oooooo0;
                    if (oooOOOO.f13391OooO0oo == o0000o3) {
                        break;
                    }
                    oooOOOO.OooO00o();
                }
                oooOOOO.OooOOO0(o0000o3);
                o0000o3.f40522OooOOOO = 0L;
                OooO0oO();
            }
        }
        if (o0000o3 != null) {
            this.f13339Oooooo0.OooOOO0(o0000o3);
            if (o0000o3.f40512OooO0Oo) {
                long j2 = o0000o3.f40513OooO0o.f40533OooO0o0;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0L, j2 - 1);
                }
                if (o0000o3.f40514OooO0o0) {
                    long jOooO = o0000o3.f40509OooO00o.OooO(j);
                    o0000o3.f40509OooO00o.OooOOo(jOooO - this.f13332OoooOoo, this.f13333Ooooo00);
                    j = jOooO;
                }
            } else {
                o0000o3.f40513OooO0o = o0000o3.f40513OooO0o.OooO00o(j);
            }
            OooOooo(j);
            OooOo0O();
        } else {
            this.f13339Oooooo0.OooO0O0();
            OooOooo(j);
        }
        OooOOO(false);
        this.f13342o000oOoO.OooO0OO(2);
        return j;
    }

    public final void Oooo0oo(OooOo oooOo) throws ExoPlaybackException {
        if (oooOo.f13401OooO0o.getLooper() != this.f13329OoooOOo) {
            this.f13342o000oOoO.OooO00o(15, oooOo).sendToTarget();
            return;
        }
        OooO0OO(oooOo);
        int i = this.f13341Ooooooo.f40578OooO0Oo;
        if (i == 3 || i == 2) {
            this.f13342o000oOoO.OooO0OO(2);
        }
    }

    public final void OoooO(boolean z) throws ExoPlaybackException {
        this.f13343o00O0O = z;
        OooOooO();
        if (this.f13344o00Oo0) {
            OooOOOO oooOOOO = this.f13339Oooooo0;
            if (oooOOOO.f13383OooO != oooOOOO.f13391OooO0oo) {
                Oooo0OO(true);
                OooOOO(false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final void OoooO0(OooO00o oooO00o) throws Throwable {
        this.f13353o0OoOo0.OooO00o(1);
        if (oooO00o.f13362OooO0OO != -1) {
            this.f13356o0ooOoO = new OooOO0O(new p468o0OooO0.o000O0(oooO00o.f13360OooO00o, oooO00o.f13361OooO0O0), oooO00o.f13362OooO0OO, oooO00o.f13363OooO0Oo);
        }
        OooOo00 oooOo00 = this.f13338Oooooo;
        List<OooOo00.OooO0OO> list = oooO00o.f13360OooO00o;
        o00OO000 o00oo001 = oooO00o.f13361OooO0O0;
        oooOo00.OooO(0, oooOo00.f13406OooO00o.size());
        OooOOOO(oooOo00.OooO00o(oooOo00.f13406OooO00o.size(), list, o00oo001));
    }

    public final void OoooO00(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.f13348o00oO0o != z) {
            this.f13348o00oO0o = z;
            if (!z) {
                for (Renderer renderer : this.f13322Oooo) {
                    if (!OooOo00(renderer)) {
                        renderer.OooO00o();
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

    public final void OoooO0O(boolean z) {
        if (z == this.f13354o0ooOO0) {
            return;
        }
        this.f13354o0ooOO0 = z;
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        int i = o000oo1.f40578OooO0Oo;
        if (z || i == 4 || i == 1) {
            this.f13341Ooooooo = o000oo1.OooO0OO(z);
        } else {
            this.f13342o000oOoO.OooO0OO(2);
        }
    }

    public final void OoooOO0(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.f13353o0OoOo0.OooO00o(z2 ? 1 : 0);
        OooO0o oooO0o = this.f13353o0OoOo0;
        oooO0o.f13368OooO00o = true;
        oooO0o.f13372OooO0o = true;
        oooO0o.f13374OooO0oO = i2;
        this.f13341Ooooooo = this.f13341Ooooooo.OooO0Oo(z, i);
        this.f13345o00Ooo = false;
        if (!OoooOoo()) {
            OooooOO();
            Oooooo();
            return;
        }
        int i3 = this.f13341Ooooooo.f40578OooO0Oo;
        if (i3 == 3) {
            Ooooo0o();
            this.f13342o000oOoO.OooO0OO(2);
        } else if (i3 == 2) {
            this.f13342o000oOoO.OooO0OO(2);
        }
    }

    public final void OoooOOO(int i) throws ExoPlaybackException {
        this.f13349o00ooo = i;
        OooOOOO oooOOOO = this.f13339Oooooo0;
        o000oOoO o000oooo2 = this.f13341Ooooooo.f40575OooO00o;
        oooOOOO.f13388OooO0o = i;
        if (!oooOOOO.OooOOOo(o000oooo2)) {
            Oooo0OO(true);
        }
        OooOOO(false);
    }

    public final void OoooOOo(boolean z) throws ExoPlaybackException {
        this.f13357oo000o = z;
        OooOOOO oooOOOO = this.f13339Oooooo0;
        o000oOoO o000oooo2 = this.f13341Ooooooo.f40575OooO00o;
        oooOOOO.f13390OooO0oO = z;
        if (!oooOOOO.OooOOOo(o000oooo2)) {
            Oooo0OO(true);
        }
        OooOOO(false);
    }

    public final void OoooOo0(o00OO000 o00oo001) throws Throwable {
        this.f13353o0OoOo0.OooO00o(1);
        OooOo00 oooOo00 = this.f13338Oooooo;
        int iOooO0o0 = oooOo00.OooO0o0();
        if (o00oo001.OooO00o() != iOooO0o0) {
            o00oo001 = o00oo001.OooO0oo().OooO0o(iOooO0o0);
        }
        oooOo00.f13405OooO = o00oo001;
        OooOOOO(oooOo00.OooO0OO());
    }

    public final void OoooOoO(int i) {
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        if (o000oo1.f40578OooO0Oo != i) {
            this.f13341Ooooooo = o000oo1.OooO0o(i);
        }
    }

    public final boolean OoooOoo() {
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        return o000oo1.f40583OooOO0 && o000oo1.f40584OooOO0O == 0;
    }

    public final void Ooooo0o() throws ExoPlaybackException {
        this.f13345o00Ooo = false;
        com.google.android.exoplayer2.OooO oooO = this.f13334Ooooo0o;
        oooO.f13205OoooOO0 = true;
        oooO.f13200Oooo.OooO0O0();
        for (Renderer renderer : this.f13322Oooo) {
            if (OooOo00(renderer)) {
                renderer.start();
            }
        }
    }

    public final void OooooO0(boolean z, boolean z2) {
        OooOoo(z || !this.f13348o00oO0o, false, true, false);
        this.f13353o0OoOo0.OooO00o(z2 ? 1 : 0);
        this.f13323OoooO.OooO0O0(true);
        OoooOoO(1);
    }

    public final void OooooOO() throws ExoPlaybackException {
        com.google.android.exoplayer2.OooO oooO = this.f13334Ooooo0o;
        oooO.f13205OoooOO0 = false;
        o000O0 o000o0 = oooO.f13200Oooo;
        if (o000o0.f36742OoooO00) {
            o000o0.OooO00o(o000o0.OooOOO0());
            o000o0.f36742OoooO00 = false;
        }
        for (Renderer renderer : this.f13322Oooo) {
            if (OooOo00(renderer) && renderer.getState() == 2) {
                renderer.stop();
            }
        }
    }

    public final void OooooOo() {
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13392OooOO0;
        boolean z = this.f13346o00o0O || (o0000o2 != null && o0000o2.f40509OooO00o.OooOO0o());
        o000Oo0 o000oo1 = this.f13341Ooooooo;
        if (z != o000oo1.f40579OooO0o) {
            this.f13341Ooooooo = new o000Oo0(o000oo1.f40575OooO00o, o000oo1.f40576OooO0O0, o000oo1.f40577OooO0OO, o000oo1.f40578OooO0Oo, o000oo1.f40580OooO0o0, z, o000oo1.f40581OooO0oO, o000oo1.f40582OooO0oo, o000oo1.f40574OooO, o000oo1.f40583OooOO0, o000oo1.f40584OooOO0O, o000oo1.f40585OooOO0o, o000oo1.f40586OooOOO, o000oo1.f40588OooOOOO, o000oo1.f40589OooOOOo, o000oo1.f40587OooOOO0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x015c, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooooo() throws ExoPlaybackException {
        o000O00 o000o00OooO0oO;
        long j;
        OooOOO0 oooOOO0;
        OooO0OO oooO0OO;
        p468o0OooO0.o0000O o0000o2 = this.f13339Oooooo0.f13391OooO0oo;
        if (o0000o2 == null) {
            return;
        }
        long jOooOOO = o0000o2.f40512OooO0Oo ? o0000o2.f40509OooO00o.OooOOO() : -9223372036854775807L;
        if (jOooOOO != -9223372036854775807L) {
            OooOooo(jOooOOO);
            if (jOooOOO != this.f13341Ooooooo.f40589OooOOOo) {
                o000Oo0 o000oo1 = this.f13341Ooooooo;
                this.f13341Ooooooo = OooOOo(o000oo1.f40576OooO0O0, jOooOOO, o000oo1.f40577OooO0OO);
                this.f13353o0OoOo0.OooO0O0(4);
            }
        } else {
            com.google.android.exoplayer2.OooO oooO = this.f13334Ooooo0o;
            boolean z = o0000o2 != this.f13339Oooooo0.f13383OooO;
            Renderer renderer = oooO.f13202OoooO0;
            if (renderer == null || renderer.OooO0Oo() || (!oooO.f13202OoooO0.OooO0O0() && (z || oooO.f13202OoooO0.OooO0oo()))) {
                oooO.f13201OoooO = true;
                if (oooO.f13205OoooOO0) {
                    oooO.f13200Oooo.OooO0O0();
                }
            } else {
                o000OO o000oo2 = oooO.f13204OoooO0O;
                Objects.requireNonNull(o000oo2);
                long jOooOOO0 = o000oo2.OooOOO0();
                if (!oooO.f13201OoooO) {
                    oooO.f13200Oooo.OooO00o(jOooOOO0);
                    o000o00OooO0oO = o000oo2.OooO0oO();
                    if (!o000o00OooO0oO.equals(oooO.f13200Oooo.f36740OoooO)) {
                        oooO.f13200Oooo.OooO0o0(o000o00OooO0oO);
                        ((OooOOO0) oooO.f13203OoooO00).f13342o000oOoO.f36767OooO00o.obtainMessage(16, 0, 0, o000o00OooO0oO).sendToTarget();
                    }
                } else if (jOooOOO0 < oooO.f13200Oooo.OooOOO0()) {
                    o000O0 o000o0 = oooO.f13200Oooo;
                    if (o000o0.f36742OoooO00) {
                        o000o0.OooO00o(o000o0.OooOOO0());
                        o000o0.f36742OoooO00 = false;
                    }
                } else {
                    oooO.f13201OoooO = false;
                    if (oooO.f13205OoooOO0) {
                        oooO.f13200Oooo.OooO0O0();
                    }
                    oooO.f13200Oooo.OooO00o(jOooOOO0);
                    o000o00OooO0oO = o000oo2.OooO0oO();
                    if (!o000o00OooO0oO.equals(oooO.f13200Oooo.f36740OoooO)) {
                        oooO.f13200Oooo.OooO0o0(o000o00OooO0oO);
                        ((OooOOO0) oooO.f13203OoooO00).f13342o000oOoO.f36767OooO00o.obtainMessage(16, 0, 0, o000o00OooO0oO).sendToTarget();
                    }
                }
            }
            long jOooOOO1 = oooO.OooOOO0();
            this.f13351o0OOO0o = jOooOOO1;
            long j2 = jOooOOO1 - o0000o2.f40522OooOOOO;
            long j3 = this.f13341Ooooooo.f40589OooOOOo;
            if (!this.f13335OooooO0.isEmpty() && !this.f13341Ooooooo.f40576OooO0O0.OooO0O0()) {
                if (this.f13350o0OO00O) {
                    j3--;
                    this.f13350o0OO00O = false;
                }
                o000Oo0 o000oo3 = this.f13341Ooooooo;
                int iOooO0O0 = o000oo3.f40575OooO00o.OooO0O0(o000oo3.f40576OooO0O0.f36414OooO00o);
                int iMin = Math.min(this.f13352o0Oo0oo, this.f13335OooooO0.size());
                if (iMin > 0) {
                    oooO0OO = this.f13335OooooO0.get(iMin - 1);
                    oooOOO0 = this;
                    j = j2;
                } else {
                    j = j2;
                    oooOOO0 = this;
                    oooO0OO = null;
                }
                while (oooO0OO != null) {
                    int i = oooO0OO.f13366OoooO00;
                    if (i <= iOooO0O0 && (i != iOooO0O0 || oooO0OO.f13365OoooO0 <= j3)) {
                        break;
                    }
                    iMin--;
                    if (iMin > 0) {
                        oooO0OO = oooOOO0.f13335OooooO0.get(iMin - 1);
                    } else {
                        j = j;
                        oooOOO0 = oooOOO0;
                        oooO0OO = null;
                    }
                }
                if (iMin < oooOOO0.f13335OooooO0.size()) {
                    OooO0OO oooO0OO2 = oooOOO0.f13335OooooO0.get(iMin);
                    while (oooO0OO2 != null && oooO0OO2.f13367OoooO0O != null) {
                        int i2 = oooO0OO2.f13366OoooO00;
                        if (i2 >= iOooO0O0 && (i2 != iOooO0O0 || oooO0OO2.f13365OoooO0 > j3)) {
                            break;
                        }
                        iMin++;
                        oooO0OO2 = iMin < oooOOO0.f13335OooooO0.size() ? oooOOO0.f13335OooooO0.get(iMin) : null;
                    }
                    while (oooO0OO2 != null && oooO0OO2.f13367OoooO0O != null && oooO0OO2.f13366OoooO00 == iOooO0O0) {
                        long j4 = oooO0OO2.f13365OoooO0;
                        if (j4 <= j3 || j4 > j) {
                            break;
                        }
                        try {
                            oooOOO0.Oooo0oo(oooO0OO2.f13364Oooo);
                            Objects.requireNonNull(oooO0OO2.f13364Oooo);
                            oooOOO0.f13335OooooO0.remove(iMin);
                            oooO0OO2 = iMin < oooOOO0.f13335OooooO0.size() ? oooOOO0.f13335OooooO0.get(iMin) : null;
                        } catch (Throwable th) {
                            Objects.requireNonNull(oooO0OO2.f13364Oooo);
                            oooOOO0.f13335OooooO0.remove(iMin);
                            throw th;
                        }
                    }
                    oooOOO0.f13352o0Oo0oo = iMin;
                }
            }
            this.f13341Ooooooo.f40589OooOOOo = j2;
        }
        this.f13341Ooooooo.f40586OooOOO = this.f13339Oooooo0.f13392OooOO0.OooO0Oo();
        this.f13341Ooooooo.f40588OooOOOO = OooOO0o();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Oooooo0(o0000OO0 o0000oo1) {
        o000OOo o000ooo2 = this.f13323OoooO;
        Renderer[] rendererArr = this.f13322Oooo;
        p320o0O0oOo0.o000OO o000oo2 = o0000oo1.f36783OooO0OO;
        int iMax = o000ooo2.f40567OooO0o;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < rendererArr.length) {
                    if (o000oo2.f36787OooO0O0[i] != null) {
                        switch (rendererArr[i].OooOo()) {
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 6:
                                i3 = 0;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        o000ooo2.f40570OooO0oo = iMax;
        p711oo0oOOo.OooOOOO oooOOOO = o000ooo2.f40563OooO00o;
        synchronized (oooOOOO) {
            boolean z = iMax < oooOOOO.f53405OooO0Oo;
            oooOOOO.f53405OooO0Oo = iMax;
            if (z) {
                oooOOOO.OooO0O0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        ExoPlaybackException exoPlaybackException;
        p468o0OooO0.o0000O o0000o2;
        try {
            switch (message.what) {
                case 0:
                    OooOoO0();
                    break;
                case 1:
                    OoooOO0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    OooO0o();
                    break;
                case 3:
                    Oooo0o0((OooOO0O) message.obj);
                    break;
                case 4:
                    o000oOoO((o000O00) message.obj);
                    break;
                case 5:
                    this.f13340OoooooO = (o000O0O0) message.obj;
                    break;
                case 6:
                    OooooO0(false, true);
                    break;
                case 7:
                    OooOoO();
                    return true;
                case 8:
                    OooOOOo((o00O00O) message.obj);
                    break;
                case 9:
                    OooOOO0((o00O00O) message.obj);
                    break;
                case 10:
                    OooOoo0();
                    break;
                case 11:
                    OoooOOO(message.arg1);
                    break;
                case 12:
                    OoooOOo(message.arg1 != 0);
                    break;
                case 13:
                    OoooO00(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    OooOo oooOo = (OooOo) message.obj;
                    Objects.requireNonNull(oooOo);
                    Oooo0oo(oooOo);
                    break;
                case 15:
                    Oooo((OooOo) message.obj);
                    break;
                case 16:
                    OooOOo0((o000O00) message.obj, message.arg1 != 0);
                    break;
                case 17:
                    OoooO0((OooO00o) message.obj);
                    break;
                case 18:
                    OooO0O0((OooO00o) message.obj, message.arg1);
                    break;
                case 19:
                    OooOo((OooO0O0) message.obj);
                    break;
                case 20:
                    OooOoOO(message.arg1, message.arg2, (o00OO000) message.obj);
                    break;
                case 21:
                    OoooOo0((o00OO000) message.obj);
                    break;
                case 22:
                    OooOOOO(this.f13338Oooooo.OooO0OO());
                    break;
                case 23:
                    OoooO(message.arg1 != 0);
                    break;
                case 24:
                    OoooO0O(message.arg1 == 1);
                    break;
                default:
                    return false;
            }
            OooOo0o();
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.f13129Oooo == 1 && (o0000o2 = this.f13339Oooooo0.f13383OooO) != null) {
                e = e.OooO00o(o0000o2.f40513OooO0o.f40528OooO00o);
            }
            o0000O0.OooO0O0("ExoPlayerImplInternal", "Playback error", e);
            OooooO0(true, false);
            this.f13341Ooooooo = this.f13341Ooooooo.OooO0o0(e);
            OooOo0o();
        } catch (IOException e2) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(0, e2);
            p468o0OooO0.o0000O o0000o3 = this.f13339Oooooo0.f13391OooO0oo;
            if (o0000o3 != null) {
                exoPlaybackException2 = exoPlaybackException2.OooO00o(o0000o3.f40513OooO0o.f40528OooO00o);
            }
            o0000O0.OooO0O0("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            OooooO0(false, false);
            this.f13341Ooooooo = this.f13341Ooooooo.OooO0o0(exoPlaybackException2);
            OooOo0o();
        } catch (OutOfMemoryError e3) {
            e = e3;
            if (e instanceof OutOfMemoryError) {
                exoPlaybackException = new ExoPlaybackException(4, (OutOfMemoryError) e);
            } else {
                exoPlaybackException = new ExoPlaybackException(2, (RuntimeException) e);
            }
            o0000O0.OooO0O0("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
            OooooO0(true, false);
            this.f13341Ooooooo = this.f13341Ooooooo.OooO0o0(exoPlaybackException);
            OooOo0o();
        } catch (RuntimeException e4) {
            e = e4;
            if (e instanceof OutOfMemoryError) {
                exoPlaybackException = new ExoPlaybackException(4, (OutOfMemoryError) e);
            } else {
                exoPlaybackException = new ExoPlaybackException(2, (RuntimeException) e);
            }
            o0000O0.OooO0O0("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
            OooooO0(true, false);
            this.f13341Ooooooo = this.f13341Ooooooo.OooO0o0(exoPlaybackException);
            OooOo0o();
        }
        return true;
    }

    public final void o000oOoO(o000O00 o000o01) {
        this.f13334Ooooo0o.OooO0o0(o000o01);
        this.f13342o000oOoO.f36767OooO00o.obtainMessage(16, 1, 0, this.f13334Ooooo0o.OooO0oO()).sendToTarget();
    }
}
