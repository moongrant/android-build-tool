package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.Oooo0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.OooOOOO;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.o00Ooo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o000O.oo0o0Oo;
import o000O0.o0oOO;
import o000O00O.Oooo000;
import o000O00O.o0000;
import o000O00O.o000OOo0;
import o000O00O.o00O00;
import o000O00O.o00O000;
import o000O00O.o00O000o;
import o000O00O.o00O00O;
import o000O00O.o00O0OO;
import o000O00O.o00O0OOO;
import o000O00O.o00OO000;
import o000O00O.o00OO0O0;
import o000O00O.o00OO0OO;
import o000O00O.o00oOoo;
import o000O00O.o0O0ooO;
import o000O00O.oo0oOO0;
import p074o000OO0o.o0Oo0oo;
import p074o000OO0o.oo000o;
import p080o000OoO.o00;
import p080o000OoO.o000000;
import p080o000OoO.o000O00;
import p080o000OoO.o000O00O;
import p080o000OoO.o000OO0O;
import p080o000OoO.o00Oo0;
import p080o000OoO.o0ooOOo;
import p425o0OoO0o.o00000;
import p425o0OoO0o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Handler.Callback, androidx.media3.exoplayer.source.OooOOO.OooO00o, o00000.OooO00o, OooOOO0.OooO0o, androidx.media3.exoplayer.OooO0OO.OooO00o, OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00oOoo f7236OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Renderer[] f7237OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final RendererCapabilities[] f7238OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Set<Renderer> f7239OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000 f7240OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000O0 f7241OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final oo000o f7242OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o000000 f7243OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final HandlerThread f7244OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Oooo0.OooO0o f7245OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Looper f7246OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Oooo0.OooO0O0 f7247OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final long f7248OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final androidx.media3.exoplayer.OooO0OO f7249OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f7250OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final ArrayList<OooO0OO> f7251OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final o0O0ooO f7252OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooO f7253OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o0ooOOo f7254OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o00O00O f7255OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOO0 f7256OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o00OO0O0 f7257OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long f7258OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00O0OO f7259OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f7260OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO0o f7261OooOoo0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f7263OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f7264Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f7265Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f7266Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f7267Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f7268Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f7269Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f7270Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f7271Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f7272Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public C0144OooOO0O f7273Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f7274Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public ExoPlaybackException f7275OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f7276OoooO00;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f7262OooOooO = false;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f7277OoooO0O = -9223372036854775807L;

    public interface OooO {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<OooOOO0.OooO0OO> f7278OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00Ooo f7279OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f7280OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f7281OooO0Oo;

        public OooO00o(ArrayList arrayList, o00Ooo o00ooo2, int i, long j) {
            this.f7278OooO00o = arrayList;
            this.f7279OooO0O0 = o00ooo2;
            this.f7280OooO0OO = i;
            this.f7281OooO0Oo = j;
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
        public boolean f7282OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00O0OO f7283OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7284OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f7285OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f7286OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7287OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f7288OooO0oO;

        public OooO0o(o00O0OO o00o0oo2) {
            this.f7283OooO0O0 = o00o0oo2;
        }

        public final void OooO00o(int i) {
            this.f7282OooO00o |= i > 0;
            this.f7284OooO0OO += i;
        }
    }

    public static final class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOOO.OooO0O0 f7289OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f7290OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f7291OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f7292OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f7293OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f7294OooO0o0;

        public OooOO0(OooOOOO.OooO0O0 oooO0O0, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f7289OooO00o = oooO0O0;
            this.f7290OooO0O0 = j;
            this.f7291OooO0OO = j2;
            this.f7292OooO0Oo = z;
            this.f7294OooO0o0 = z2;
            this.f7293OooO0o = z3;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.OooOO0O$OooOO0O, reason: collision with other inner class name */
    public static final class C0144OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Oooo0 f7295OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7296OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f7297OooO0OO;

        public C0144OooOO0O(Oooo0 oooo0, int i, long j) {
            this.f7295OooO00o = oooo0;
            this.f7296OooO0O0 = i;
            this.f7297OooO0OO = j;
        }
    }

    public OooOO0O(Renderer[] rendererArr, o00000 o00000Var, o00000O0 o00000o1, o00oOoo o00oooo2, oo000o oo000oVar, int i, boolean z, o000O0.OooO00o oooO00o, o00OO0O0 o00oo0o1, Oooo000 oooo000, long j, Looper looper, o000O00 o000o01, o000O00O.o000000 o000000Var, o0oOO o0ooo2) {
        this.f7253OooOo0 = o000000Var;
        this.f7237OooO0Oo = rendererArr;
        this.f7240OooO0oO = o00000Var;
        this.f7241OooO0oo = o00000o1;
        this.f7236OooO = o00oooo2;
        this.f7242OooOO0 = oo000oVar;
        this.f7268Oooo00o = i;
        this.f7265Oooo0 = z;
        this.f7257OooOoO = o00oo0o1;
        this.f7252OooOo = oooo000;
        this.f7258OooOoO0 = j;
        this.f7254OooOo00 = o000o01;
        this.f7248OooOOOo = o00oooo2.OooO0OO();
        this.f7250OooOOo0 = o00oooo2.OooO0O0();
        o00O0OO o00o0ooOooO = o00O0OO.OooO(o00000o1);
        this.f7259OooOoOO = o00o0ooOooO;
        this.f7261OooOoo0 = new OooO0o(o00o0ooOooO);
        this.f7238OooO0o = new RendererCapabilities[rendererArr.length];
        RendererCapabilities.OooO00o oooO00oOooO0O0 = o00000Var.OooO0O0();
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].OooO0oO(i2, o0ooo2);
            this.f7238OooO0o[i2] = rendererArr[i2].OooOOOo();
            if (oooO00oOooO0O0 != null) {
                androidx.media3.exoplayer.OooO0O0 oooO0O0 = (androidx.media3.exoplayer.OooO0O0) this.f7238OooO0o[i2];
                synchronized (oooO0O0.f7196OooO0Oo) {
                    oooO0O0.f7208OooOOo0 = oooO00oOooO0O0;
                }
            }
        }
        this.f7249OooOOo = new androidx.media3.exoplayer.OooO0OO(this, o000o01);
        this.f7251OooOOoo = new ArrayList<>();
        this.f7239OooO0o0 = Collections.newSetFromMap(new IdentityHashMap());
        this.f7245OooOOO = new Oooo0.OooO0o();
        this.f7247OooOOOO = new Oooo0.OooO0O0();
        o00000Var.f46752OooO00o = this;
        o00000Var.f46753OooO0O0 = oo000oVar;
        this.f7276OoooO00 = true;
        o000O00O o000o00oOooO0O0 = o000o01.OooO0O0(looper, null);
        this.f7255OooOo0O = new o00O00O(oooO00o, o000o00oOooO0O0);
        this.f7256OooOo0o = new OooOOO0(this, oooO00o, o000o00oOooO0O0, o0ooo2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f7244OooOO0o = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f7246OooOOO0 = looper2;
        this.f7243OooOO0O = o000o01.OooO0O0(looper2, this);
    }

    public static boolean OooOOo(Renderer renderer) {
        return renderer.getState() != 0;
    }

    @Nullable
    public static Object Oooo0(Oooo0.OooO0o oooO0o, Oooo0.OooO0O0 oooO0O0, int i, boolean z, Object obj, Oooo0 oooo0, Oooo0 oooo1) {
        int iOooO0o0 = oooo0.OooO0o0(obj);
        int iOooOO0o = oooo0.OooOO0o();
        int iOooO0oO = iOooO0o0;
        int iOooO0o1 = -1;
        for (int i2 = 0; i2 < iOooOO0o && iOooO0o1 == -1; i2++) {
            iOooO0oO = oooo0.OooO0oO(iOooO0oO, oooO0O0, oooO0o, i, z);
            if (iOooO0oO == -1) {
                break;
            }
            iOooO0o1 = oooo1.OooO0o0(oooo0.OooOOOo(iOooO0oO));
        }
        if (iOooO0o1 == -1) {
            return null;
        }
        return oooo1.OooOOOo(iOooO0o1);
    }

    @Nullable
    public static Pair<Object, Long> Oooo00o(Oooo0 oooo0, C0144OooOO0O c0144OooOO0O, boolean z, int i, boolean z2, Oooo0.OooO0o oooO0o, Oooo0.OooO0O0 oooO0O0) {
        Object objOooo0;
        Oooo0 oooo1 = c0144OooOO0O.f7295OooO00o;
        if (oooo0.OooOo00()) {
            return null;
        }
        Oooo0 oooo2 = oooo1.OooOo00() ? oooo0 : oooo1;
        try {
            Pair<Object, Long> pairOooOOO0 = oooo2.OooOOO0(oooO0o, oooO0O0, c0144OooOO0O.f7296OooO0O0, c0144OooOO0O.f7297OooO0OO);
            if (oooo0.equals(oooo2)) {
                return pairOooOOO0;
            }
            if (oooo0.OooO0o0(pairOooOOO0.first) != -1) {
                return (oooo2.OooOO0O(pairOooOOO0.first, oooO0O0).f6640OooO && oooo2.OooOOo0(oooO0O0.f6642OooO0o, oooO0o).f6681OooOOo == oooo2.OooO0o0(pairOooOOO0.first)) ? oooo0.OooOOO0(oooO0o, oooO0O0, oooo0.OooOO0O(pairOooOOO0.first, oooO0O0).f6642OooO0o, c0144OooOO0O.f7297OooO0OO) : pairOooOOO0;
            }
            if (z && (objOooo0 = Oooo0(oooO0o, oooO0O0, i, z2, pairOooOOO0.first, oooo2, oooo0)) != null) {
                return oooo0.OooOOO0(oooO0o, oooO0O0, oooo0.OooOO0O(objOooo0, oooO0O0).f6642OooO0o, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static void Oooo0oo(Renderer renderer, long j) {
        renderer.OooO();
        if (renderer instanceof o000OO00.OooO0o) {
            o000OO00.OooO0o oooO0o = (o000OO00.OooO0o) renderer;
            o00Oo0.OooO0Oo(oooO0o.f7206OooOOOO);
            oooO0o.f34402Oooo000 = j;
        }
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0.OooO00o
    public final void OooO(androidx.media3.exoplayer.source.o00Oo0 o00oo1) {
        this.f7243OooOO0O.OooO0o0(9, (androidx.media3.exoplayer.source.OooOOO) o00oo1).OooO00o();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO.OooO00o
    public final void OooO00o(androidx.media3.exoplayer.source.OooOOO oooOOO) {
        this.f7243OooOO0O.OooO0o0(8, oooOOO).OooO00o();
    }

    public final void OooO0O0(OooO00o oooO00o, int i) throws ExoPlaybackException {
        this.f7261OooOoo0.OooO00o(1);
        OooOOO0 oooOOO0 = this.f7256OooOo0o;
        if (i == -1) {
            i = oooOOO0.f7309OooO0O0.size();
        }
        OooOOO0(oooOOO0.OooO00o(i, oooO00o.f7278OooO00o, oooO00o.f7279OooO0O0), false);
    }

    public final void OooO0OO(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() != 0) {
            androidx.media3.exoplayer.OooO0OO oooO0OO = this.f7249OooOOo;
            if (renderer == oooO0OO.f7211OooO0o) {
                oooO0OO.f7213OooO0oO = null;
                oooO0OO.f7211OooO0o = null;
                oooO0OO.f7214OooO0oo = true;
            }
            if (renderer.getState() == 2) {
                renderer.stop();
            }
            renderer.OooO0o();
            this.f7271Oooo0o--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:231:0x0372  */
    /* JADX WARN: Code duplicated, block: B:312:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:400:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    public final void OooO0Oo() throws ExoPlaybackException, IOException {
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
        o00O000o o00o000o2;
        o00O000o o00o000o3;
        Renderer[] rendererArr;
        boolean z10;
        long jOooO00o = this.f7254OooOo00.OooO00o();
        this.f7243OooOO0O.OooOO0o(2);
        if (this.f7259OooOoOO.f34105OooO00o.OooOo00() || !this.f7256OooOo0o.f7317OooOO0O) {
            z = true;
        } else {
            o00O00O o00o00o2 = this.f7255OooOo0O;
            long j = this.f7274Oooo0oo;
            o00O000o o00o000o4 = o00o00o2.f34080OooOO0;
            if (o00o000o4 != null) {
                o00Oo0.OooO0Oo(o00o000o4.f34067OooOO0o == null);
                if (o00o000o4.f34060OooO0Oo) {
                    o00o000o4.f34057OooO00o.OooOOo(j - o00o000o4.f34070OooOOOO);
                }
            }
            o00O00O o00o00o3 = this.f7255OooOo0O;
            o00O000o o00o000o5 = o00o00o3.f34080OooOO0;
            if (o00o000o5 == null) {
                z6 = true;
            } else {
                if (!o00o000o5.f34061OooO0o.f34045OooO) {
                    if ((o00o000o5.f34060OooO0Oo && (!o00o000o5.f34062OooO0o0 || o00o000o5.f34057OooO00o.OooOOOo() == Long.MIN_VALUE)) && o00o00o3.f34080OooOO0.f34061OooO0o.f34051OooO0o0 != -9223372036854775807L && o00o00o3.f34081OooOO0O < 100) {
                        z6 = true;
                    }
                }
                z6 = false;
            }
            if (z6) {
                o00O00O o00o00o4 = this.f7255OooOo0O;
                long j2 = this.f7274Oooo0oo;
                o00O0OO o00o0oo2 = this.f7259OooOoOO;
                o00O000o o00o000o6 = o00o00o4.f34080OooOO0;
                o00O00 o00o00OooO0o0 = o00o000o6 == null ? o00o00o4.OooO0o0(o00o0oo2.f34105OooO00o, o00o0oo2.f34106OooO0O0, o00o0oo2.f34107OooO0OO, o00o0oo2.f34120OooOOo) : o00o00o4.OooO0Oo(o00o0oo2.f34105OooO00o, o00o000o6, j2);
                if (o00o00OooO0o0 != null) {
                    o00O00O o00o00o5 = this.f7255OooOo0O;
                    RendererCapabilities[] rendererCapabilitiesArr = this.f7238OooO0o;
                    o00000 o00000Var = this.f7240OooO0oO;
                    p074o000OO0o.o0ooOOo o0oooooOooO0o0 = this.f7236OooO.OooO0o0();
                    OooOOO0 oooOOO0 = this.f7256OooOo0o;
                    o00000O0 o00000o1 = this.f7241OooO0oo;
                    o00O000o o00o000o7 = o00o00o5.f34080OooOO0;
                    o00O000o o00o000o8 = new o00O000o(rendererCapabilitiesArr, o00o000o7 == null ? 1000000000000L : (o00o000o7.f34070OooOOOO + o00o000o7.f34061OooO0o.f34051OooO0o0) - o00o00OooO0o0.f34047OooO0O0, o00000Var, o0oooooOooO0o0, oooOOO0, o00o00OooO0o0, o00000o1);
                    o00O000o o00o000o9 = o00o00o5.f34080OooOO0;
                    if (o00o000o9 == null) {
                        o00o00o5.f34079OooO0oo = o00o000o8;
                        o00o00o5.f34071OooO = o00o000o8;
                    } else if (o00o000o8 != o00o000o9.f34067OooOO0o) {
                        o00o000o9.OooO0O0();
                        o00o000o9.f34067OooOO0o = o00o000o8;
                        o00o000o9.OooO0OO();
                    }
                    o00o00o5.f34082OooOO0o = null;
                    o00o00o5.f34080OooOO0 = o00o000o8;
                    z7 = true;
                    o00o00o5.f34081OooOO0O++;
                    o00o00o5.OooOO0O();
                    o00o000o8.f34057OooO00o.OooOO0o(this, o00o00OooO0o0.f34047OooO0O0);
                    if (this.f7255OooOo0O.f34079OooO0oo == o00o000o8) {
                        Oooo000(o00o00OooO0o0.f34047OooO0O0);
                    }
                    OooOO0o(false);
                } else {
                    z7 = true;
                }
            } else {
                z7 = true;
            }
            if (this.f7267Oooo00O) {
                this.f7267Oooo00O = OooOOo0();
                OooooOO();
            } else {
                OooOo00();
            }
            o00O00O o00o00o6 = this.f7255OooOo0O;
            o00O000o o00o000o10 = o00o00o6.f34071OooO;
            if (o00o000o10 != null) {
                o00O000o o00o000o11 = o00o000o10.f34067OooOO0o;
                Renderer[] rendererArr2 = this.f7237OooO0Oo;
                if (o00o000o11 != null && !this.f7263OooOooo) {
                    if (!o00o000o10.f34060OooO0Oo) {
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
                        SampleStream sampleStream = o00o000o10.f34059OooO0OO[i3];
                        if (renderer.OooOo0() == sampleStream) {
                            if (sampleStream != null && !renderer.OooO0oo()) {
                                o00O000o o00o000o12 = o00o000o10.f34067OooOO0o;
                                if (!((o00o000o10.f34061OooO0o.f34050OooO0o && o00o000o12.f34060OooO0Oo && ((renderer instanceof o000OO00.OooO0o) || (renderer instanceof p071o000O0o0.oo000o) || renderer.OooOo0O() >= o00o000o12.OooO0o0())) ? z7 : false)) {
                                }
                            }
                            i3++;
                        }
                        z10 = false;
                        break;
                    }
                    if (z10) {
                        o00O000o o00o000o13 = o00o000o10.f34067OooOO0o;
                        if (o00o000o13.f34060OooO0Oo || this.f7274Oooo0oo >= o00o000o13.OooO0o0()) {
                            o00000O0 o00000o2 = o00o000o10.f34068OooOOO;
                            o00O000o o00o000o14 = o00o00o6.f34071OooO;
                            o00Oo0.OooO0Oo((o00o000o14 == null || o00o000o14.f34067OooOO0o == null) ? false : z7);
                            o00o00o6.f34071OooO = o00o00o6.f34071OooO.f34067OooOO0o;
                            o00o00o6.OooOO0O();
                            o00O000o o00o000o15 = o00o00o6.f34071OooO;
                            o00000O0 o00000o3 = o00o000o15.f34068OooOOO;
                            Oooo0 oooo0 = this.f7259OooOoOO.f34105OooO00o;
                            Oooooo0(oooo0, o00o000o15.f34061OooO0o.f34046OooO00o, oooo0, o00o000o10.f34061OooO0o.f34046OooO00o, -9223372036854775807L, false);
                            if (!o00o000o15.f34060OooO0Oo || o00o000o15.f34057OooO00o.OooO0o() == -9223372036854775807L) {
                                for (int i4 = 0; i4 < rendererArr2.length; i4++) {
                                    boolean zOooO0O0 = o00000o2.OooO0O0(i4);
                                    boolean zOooO0O1 = o00000o3.OooO0O0(i4);
                                    if (zOooO0O0 && !rendererArr2[i4].OooOOO()) {
                                        boolean z11 = ((androidx.media3.exoplayer.OooO0O0) this.f7238OooO0o[i4]).f7198OooO0o0 == -2;
                                        o00OO000 o00oo001 = o00000o2.f46755OooO0O0[i4];
                                        o00OO000 o00oo002 = o00000o3.f46755OooO0O0[i4];
                                        if (!zOooO0O1 || !o00oo002.equals(o00oo001) || z11) {
                                            Oooo0oo(rendererArr2[i4], o00o000o15.OooO0o0());
                                        }
                                    }
                                }
                            } else {
                                long jOooO0o0 = o00o000o15.OooO0o0();
                                for (Renderer renderer2 : rendererArr2) {
                                    if (renderer2.OooOo0() != null) {
                                        Oooo0oo(renderer2, jOooO0o0);
                                    }
                                }
                            }
                        }
                    }
                } else if (o00o000o10.f34061OooO0o.f34045OooO || this.f7263OooOooo) {
                    for (int i5 = 0; i5 < rendererArr2.length; i5++) {
                        Renderer renderer3 = rendererArr2[i5];
                        SampleStream sampleStream2 = o00o000o10.f34059OooO0OO[i5];
                        if (sampleStream2 != null && renderer3.OooOo0() == sampleStream2 && renderer3.OooO0oo()) {
                            long j3 = o00o000o10.f34061OooO0o.f34051OooO0o0;
                            Oooo0oo(renderer3, (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? -9223372036854775807L : j3 + o00o000o10.f34070OooOOOO);
                        }
                    }
                }
            }
            o00O00O o00o00o7 = this.f7255OooOo0O;
            o00O000o o00o000o16 = o00o00o7.f34071OooO;
            if (o00o000o16 == null || o00o00o7.f34079OooO0oo == o00o000o16 || o00o000o16.f34063OooO0oO) {
                z8 = true;
            } else {
                o00000O0 o00000o4 = o00o000o16.f34068OooOOO;
                boolean z12 = false;
                int i6 = 0;
                while (true) {
                    rendererArr = this.f7237OooO0Oo;
                    if (i6 >= rendererArr.length) {
                        break;
                    }
                    Renderer renderer4 = rendererArr[i6];
                    if (OooOOo(renderer4)) {
                        SampleStream sampleStreamOooOo0 = renderer4.OooOo0();
                        SampleStream[] sampleStreamArr = o00o000o16.f34059OooO0OO;
                        boolean z13 = sampleStreamOooOo0 != sampleStreamArr[i6];
                        if (!o00000o4.OooO0O0(i6) || z13) {
                            if (!renderer4.OooOOO()) {
                                androidx.media3.exoplayer.trackselection.OooO0o oooO0o = o00000o4.f46756OooO0OO[i6];
                                int length = oooO0o != null ? oooO0o.length() : 0;
                                androidx.media3.common.OooOO0[] oooOO0Arr = new androidx.media3.common.OooOO0[length];
                                for (int i7 = 0; i7 < length; i7++) {
                                    oooOO0Arr[i7] = oooO0o.OooO0O0(i7);
                                }
                                renderer4.OooOO0(oooOO0Arr, sampleStreamArr[i6], o00o000o16.OooO0o0(), o00o000o16.f34070OooOOOO);
                            } else if (renderer4.OooO0o0()) {
                                OooO0OO(renderer4);
                            } else {
                                z12 = true;
                            }
                        }
                    }
                    i6++;
                }
                z8 = true;
                if (!z12) {
                    OooO0o0(new boolean[rendererArr.length]);
                }
            }
            boolean z14 = false;
            while (true) {
                boolean zOoooOoO = OoooOoO();
                o00O00O o00o00o8 = this.f7255OooOo0O;
                if (!((zOoooOoO && !this.f7263OooOooo && (o00o000o2 = o00o00o8.f34079OooO0oo) != null && (o00o000o3 = o00o000o2.f34067OooOO0o) != null && this.f7274Oooo0oo >= o00o000o3.OooO0o0() && o00o000o3.f34063OooO0oO) ? z8 : false)) {
                    break;
                }
                if (z14) {
                    OooOo0();
                }
                o00O000o o00o000oOooO00o = o00o00o8.OooO00o();
                o00o000oOooO00o.getClass();
                if (this.f7259OooOoOO.f34106OooO0O0.f33816OooO00o.equals(o00o000oOooO00o.f34061OooO0o.f34046OooO00o.f33816OooO00o)) {
                    OooOOOO.OooO0O0 oooO0O0 = this.f7259OooOoOO.f34106OooO0O0;
                    if (oooO0O0.f33817OooO0O0 == -1) {
                        OooOOOO.OooO0O0 oooO0O1 = o00o000oOooO00o.f34061OooO0o.f34046OooO00o;
                        if (oooO0O1.f33817OooO0O0 != -1 || oooO0O0.f33820OooO0o0 == oooO0O1.f33820OooO0o0) {
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
                o00O00 o00o01 = o00o000oOooO00o.f34061OooO0o;
                OooOOOO.OooO0O0 oooO0O2 = o00o01.f34046OooO00o;
                long j4 = o00o01.f34047OooO0O0;
                this.f7259OooOoOO = OooOOOo(oooO0O2, j4, o00o01.f34048OooO0OO, j4, !z9, 0);
                OooOooo();
                OooooOo();
                z14 = z8;
                z8 = z14;
            }
            z = z8;
        }
        int i8 = this.f7259OooOoOO.f34110OooO0o0;
        if (i8 == z || i8 == 4) {
            return;
        }
        o00O000o o00o000o17 = this.f7255OooOo0O.f34079OooO0oo;
        if (o00o000o17 == null) {
            this.f7243OooOO0O.OooOO0(jOooO00o + 10);
            return;
        }
        o000OO0O.OooO00o("doSomeWork");
        OooooOo();
        if (o00o000o17.f34060OooO0Oo) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            o00o000o17.f34057OooO00o.OooOOo0(this.f7259OooOoOO.f34120OooOOo - this.f7248OooOOOo, this.f7250OooOOo0);
            z2 = z;
            z3 = z2;
            int i9 = 0;
            while (true) {
                Renderer[] rendererArr3 = this.f7237OooO0Oo;
                if (i9 >= rendererArr3.length) {
                    break;
                }
                Renderer renderer5 = rendererArr3[i9];
                if (OooOOo(renderer5)) {
                    renderer5.OooOo00(this.f7274Oooo0oo, jElapsedRealtime);
                    z3 = (z3 && renderer5.OooO0o0()) ? z : false;
                    boolean z15 = o00o000o17.f34059OooO0OO[i9] != renderer5.OooOo0() ? z : false;
                    boolean z16 = (z15 || ((z15 || !renderer5.OooO0oo()) ? false : z) || renderer5.OooO0Oo() || renderer5.OooO0o0()) ? z : false;
                    z2 = (z2 && z16) ? z : false;
                    if (!z16) {
                        renderer5.OooOOO0();
                    }
                }
                i9++;
            }
        } else {
            o00o000o17.f34057OooO00o.OooO0oO();
            z2 = z;
            z3 = z2;
        }
        long j5 = o00o000o17.f34061OooO0o.f34051OooO0o0;
        boolean z17 = (z3 && o00o000o17.f34060OooO0Oo && (j5 == -9223372036854775807L || j5 <= this.f7259OooOoOO.f34120OooOOo)) ? z : false;
        if (z17 && this.f7263OooOooo) {
            z4 = false;
            this.f7263OooOooo = false;
            OoooO(this.f7259OooOoOO.f34117OooOOO0, 5, false, false);
        } else {
            z4 = false;
        }
        if (z17 && o00o000o17.f34061OooO0o.f34045OooO) {
            OoooOo0(4);
            OooooO0();
        } else {
            o00O0OO o00o0oo3 = this.f7259OooOoOO;
            if (o00o0oo3.f34110OooO0o0 == 2) {
                if (this.f7271Oooo0o == 0) {
                    zOooOOoo = OooOOoo();
                    z2 = z2;
                } else {
                    if (z2) {
                        if (o00o0oo3.f34111OooO0oO) {
                            o00O00O o00o00o9 = this.f7255OooOo0O;
                            o00O000o o00o000o18 = o00o00o9.f34079OooO0oo;
                            long j6 = OoooOoo(o00o0oo3.f34105OooO00o, o00o000o18.f34061OooO0o.f34046OooO00o) ? ((Oooo000) this.f7252OooOo).f33984OooO : -9223372036854775807L;
                            o00O000o o00o000o19 = o00o00o9.f34080OooOO0;
                            boolean z18 = (((!o00o000o19.f34060OooO0Oo || (o00o000o19.f34062OooO0o0 && (o00o000o19.f34057OooO00o.OooOOOo() > Long.MIN_VALUE ? 1 : (o00o000o19.f34057OooO00o.OooOOOo() == Long.MIN_VALUE ? 0 : -1)) != 0)) ? z4 : z) && o00o000o19.f34061OooO0o.f34045OooO) ? z : z4;
                            boolean z19 = (!o00o000o19.f34061OooO0o.f34046OooO00o.OooO00o() || o00o000o19.f34060OooO0Oo) ? z4 : z;
                            if (z18 || z19) {
                                z2 = z2;
                            } else {
                                o00oOoo o00oooo2 = this.f7236OooO;
                                o00O0OO o00o0oo4 = this.f7259OooOoOO;
                                Oooo0 oooo1 = o00o0oo4.f34105OooO00o;
                                OooOOOO.OooO0O0 oooO0O3 = o00o000o18.f34061OooO0o.f34046OooO00o;
                                long j7 = o00o0oo4.f34119OooOOOo;
                                o00O000o o00o000o20 = this.f7255OooOo0O.f34080OooOO0;
                                if (o00oooo2.OooO0Oo(o00o000o20 == null ? 0L : Math.max(0L, j7 - (this.f7274Oooo0oo - o00o000o20.f34070OooOOOO)), this.f7249OooOOo.OooO0O0().f6619OooO0Oo, this.f7266Oooo000, j6)) {
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
                    this.f7275OoooO0 = null;
                    if (OoooOoO()) {
                        Ooooo00();
                    }
                }
            } else {
                z2 = z2;
                i = 3;
            }
            if (this.f7259OooOoOO.f34110OooO0o0 == i && (this.f7271Oooo0o != 0 ? !z2 : !OooOOoo())) {
                this.f7266Oooo000 = OoooOoO();
                OoooOo0(2);
                if (this.f7266Oooo000) {
                    for (o00O000o o00o000o21 = this.f7255OooOo0O.f34079OooO0oo; o00o000o21 != null; o00o000o21 = o00o000o21.f34067OooOO0o) {
                        for (androidx.media3.exoplayer.trackselection.OooO0o oooO0o2 : o00o000o21.f34068OooOOO.f46756OooO0OO) {
                            if (oooO0o2 != null) {
                                oooO0o2.OooOO0o();
                            }
                        }
                    }
                    Oooo000 oooo000 = (Oooo000) this.f7252OooOo;
                    long j8 = oooo000.f33984OooO;
                    if (j8 != -9223372036854775807L) {
                        long j9 = j8 + oooo000.f33986OooO0O0;
                        oooo000.f33984OooO = j9;
                        long j10 = oooo000.f33992OooO0oo;
                        if (j10 != -9223372036854775807L && j9 > j10) {
                            oooo000.f33984OooO = j10;
                        }
                        oooo000.f33997OooOOO0 = -9223372036854775807L;
                    }
                }
                OooooO0();
            }
        }
        if (this.f7259OooOoOO.f34110OooO0o0 == 2) {
            int i10 = 0;
            while (true) {
                Renderer[] rendererArr4 = this.f7237OooO0Oo;
                if (i10 >= rendererArr4.length) {
                    break;
                }
                if (OooOOo(rendererArr4[i10]) && this.f7237OooO0Oo[i10].OooOo0() == o00o000o17.f34059OooO0OO[i10]) {
                    this.f7237OooO0Oo[i10].OooOOO0();
                }
                i10++;
            }
            o00O0OO o00o0oo5 = this.f7259OooOoOO;
            if (o00o0oo5.f34111OooO0oO || o00o0oo5.f34121OooOOo0 >= 500000 || !OooOOo0()) {
                z5 = false;
            } else {
                z5 = z;
            }
        } else {
            z5 = false;
        }
        if (!z5) {
            this.f7277OoooO0O = -9223372036854775807L;
        } else if (this.f7277OoooO0O == -9223372036854775807L) {
            this.f7277OoooO0O = this.f7254OooOo00.elapsedRealtime();
        } else if (this.f7254OooOo00.elapsedRealtime() - this.f7277OoooO0O >= 4000) {
            throw new IllegalStateException("Playback stuck buffering and not loading");
        }
        boolean z20 = (OoooOoO() && this.f7259OooOoOO.f34110OooO0o0 == 3) ? z : false;
        if (!this.f7272Oooo0o0 || !this.f7270Oooo0OO || !z20) {
            z = false;
        }
        o00O0OO o00o0oo6 = this.f7259OooOoOO;
        if (o00o0oo6.f34118OooOOOO != z) {
            this.f7259OooOoOO = new o00O0OO(o00o0oo6.f34105OooO00o, o00o0oo6.f34106OooO0O0, o00o0oo6.f34107OooO0OO, o00o0oo6.f34108OooO0Oo, o00o0oo6.f34110OooO0o0, o00o0oo6.f34109OooO0o, o00o0oo6.f34111OooO0oO, o00o0oo6.f34112OooO0oo, o00o0oo6.f34104OooO, o00o0oo6.f34113OooOO0, o00o0oo6.f34114OooOO0O, o00o0oo6.f34115OooOO0o, o00o0oo6.f34117OooOOO0, o00o0oo6.f34116OooOOO, o00o0oo6.f34119OooOOOo, o00o0oo6.f34121OooOOo0, o00o0oo6.f34120OooOOo, o00o0oo6.f34122OooOOoo, z);
        }
        this.f7270Oooo0OO = false;
        if (!z && (i2 = this.f7259OooOoOO.f34110OooO0o0) != 4) {
            if (z20 || i2 == 2) {
                this.f7243OooOO0O.OooOO0(jOooO00o + 10);
            } else if (i2 == 3 && this.f7271Oooo0o != 0) {
                this.f7243OooOO0O.OooOO0(jOooO00o + 1000);
            }
        }
        o000OO0O.OooO0O0();
    }

    public final long OooO0o(Oooo0 oooo0, Object obj, long j) {
        Oooo0.OooO0O0 oooO0O0 = this.f7247OooOOOO;
        int i = oooo0.OooOO0O(obj, oooO0O0).f6642OooO0o;
        Oooo0.OooO0o oooO0o = this.f7245OooOOO;
        oooo0.OooOOo0(i, oooO0o);
        if (oooO0o.f6668OooO == -9223372036854775807L || !oooO0o.OooO0Oo() || !oooO0o.f6676OooOO0o) {
            return -9223372036854775807L;
        }
        long j2 = oooO0o.f6674OooOO0;
        return o00.Oooo0OO((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - oooO0o.f6668OooO) - (j + oooO0O0.f6645OooO0oo);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    public final void OooO0o0(boolean[] zArr) throws ExoPlaybackException {
        Renderer[] rendererArr;
        Set<Renderer> set;
        Renderer[] rendererArr2;
        o00O000 o00o001;
        o00O00O o00o00o2 = this.f7255OooOo0O;
        o00O000o o00o000o2 = o00o00o2.f34071OooO;
        o00000O0 o00000o1 = o00o000o2.f34068OooOOO;
        int i = 0;
        while (true) {
            rendererArr = this.f7237OooO0Oo;
            int length = rendererArr.length;
            set = this.f7239OooO0o0;
            if (i >= length) {
                break;
            }
            if (!o00000o1.OooO0O0(i) && set.remove(rendererArr[i])) {
                rendererArr[i].reset();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < rendererArr.length) {
            if (o00000o1.OooO0O0(i2)) {
                boolean z = zArr[i2];
                Renderer renderer = rendererArr[i2];
                if (OooOOo(renderer)) {
                    rendererArr2 = rendererArr;
                } else {
                    o00O000o o00o000o3 = o00o00o2.f34071OooO;
                    boolean z2 = o00o000o3 == o00o00o2.f34079OooO0oo;
                    o00000O0 o00000o2 = o00o000o3.f34068OooOOO;
                    o00OO000 o00oo001 = o00000o2.f46755OooO0O0[i2];
                    androidx.media3.exoplayer.trackselection.OooO0o oooO0o = o00000o2.f46756OooO0OO[i2];
                    int length2 = oooO0o != null ? oooO0o.length() : 0;
                    androidx.media3.common.OooOO0[] oooOO0Arr = new androidx.media3.common.OooOO0[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        oooOO0Arr[i3] = oooO0o.OooO0O0(i3);
                    }
                    boolean z3 = OoooOoO() && this.f7259OooOoOO.f34110OooO0o0 == 3;
                    boolean z4 = !z && z3;
                    this.f7271Oooo0o++;
                    set.add(renderer);
                    rendererArr2 = rendererArr;
                    renderer.OooOO0O(o00oo001, oooOO0Arr, o00o000o3.f34059OooO0OO[i2], this.f7274Oooo0oo, z4, z2, o00o000o3.OooO0o0(), o00o000o3.f34070OooOOOO);
                    renderer.OooOO0o(11, new androidx.media3.exoplayer.OooOO0(this));
                    androidx.media3.exoplayer.OooO0OO oooO0OO = this.f7249OooOOo;
                    oooO0OO.getClass();
                    o00O000 o00o000OooOo = renderer.OooOo();
                    if (o00o000OooOo != null && o00o000OooOo != (o00o001 = oooO0OO.f7213OooO0oO)) {
                        if (o00o001 != null) {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        oooO0OO.f7213OooO0oO = o00o000OooOo;
                        oooO0OO.f7211OooO0o = renderer;
                        o00o000OooOo.OooO00o(oooO0OO.f7210OooO0Oo.f34136OooO0oo);
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
        o00o000o2.f34063OooO0oO = true;
    }

    public final long OooO0oO() {
        o00O000o o00o000o2 = this.f7255OooOo0O.f34071OooO;
        if (o00o000o2 == null) {
            return 0L;
        }
        long jMax = o00o000o2.f34070OooOOOO;
        if (!o00o000o2.f34060OooO0Oo) {
            return jMax;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.f7237OooO0Oo;
            if (i >= rendererArr.length) {
                return jMax;
            }
            if (OooOOo(rendererArr[i]) && rendererArr[i].OooOo0() == o00o000o2.f34059OooO0OO[i]) {
                long jOooOo0O = rendererArr[i].OooOo0O();
                if (jOooOo0O == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jOooOo0O, jMax);
            }
            i++;
        }
    }

    public final Pair<OooOOOO.OooO0O0, Long> OooO0oo(Oooo0 oooo0) {
        if (oooo0.OooOo00()) {
            return Pair.create(o00O0OO.f34103OooOo00, 0L);
        }
        Pair<Object, Long> pairOooOOO0 = oooo0.OooOOO0(this.f7245OooOOO, this.f7247OooOOOO, oooo0.OooO0Oo(this.f7265Oooo0), -9223372036854775807L);
        OooOOOO.OooO0O0 oooO0O0OooOOO = this.f7255OooOo0O.OooOOO(oooo0, pairOooOOO0.first, 0L);
        long jLongValue = ((Long) pairOooOOO0.second).longValue();
        if (oooO0O0OooOOO.OooO00o()) {
            Object obj = oooO0O0OooOOO.f33816OooO00o;
            Oooo0.OooO0O0 oooO0O0 = this.f7247OooOOOO;
            oooo0.OooOO0O(obj, oooO0O0);
            jLongValue = oooO0O0OooOOO.f33818OooO0OO == oooO0O0.OooO(oooO0O0OooOOO.f33817OooO0O0) ? oooO0O0.f6646OooOO0.f6185OooO0o : 0L;
        }
        return Pair.create(oooO0O0OooOOO, Long.valueOf(jLongValue));
    }

    public final void OooOO0(androidx.media3.exoplayer.source.OooOOO oooOOO) {
        o00O000o o00o000o2 = this.f7255OooOo0O.f34080OooOO0;
        if (o00o000o2 != null && o00o000o2.f34057OooO00o == oooOOO) {
            long j = this.f7274Oooo0oo;
            if (o00o000o2 != null) {
                o00Oo0.OooO0Oo(o00o000o2.f34067OooOO0o == null);
                if (o00o000o2.f34060OooO0Oo) {
                    o00o000o2.f34057OooO00o.OooOOo(j - o00o000o2.f34070OooOOOO);
                }
            }
            OooOo00();
        }
    }

    public final void OooOO0O(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        o00O000o o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
        if (o00o000o2 != null) {
            exoPlaybackException = exoPlaybackException.OooO0OO(o00o000o2.f34061OooO0o.f34046OooO00o);
        }
        Log.OooO0Oo("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        Ooooo0o(false, false);
        this.f7259OooOoOO = this.f7259OooOoOO.OooO0o0(exoPlaybackException);
    }

    public final void OooOO0o(boolean z) {
        o00O000o o00o000o2 = this.f7255OooOo0O.f34080OooOO0;
        OooOOOO.OooO0O0 oooO0O0 = o00o000o2 == null ? this.f7259OooOoOO.f34106OooO0O0 : o00o000o2.f34061OooO0o.f34046OooO00o;
        boolean z2 = !this.f7259OooOoOO.f34114OooOO0O.equals(oooO0O0);
        if (z2) {
            this.f7259OooOoOO = this.f7259OooOoOO.OooO0O0(oooO0O0);
        }
        o00O0OO o00o0oo2 = this.f7259OooOoOO;
        o00o0oo2.f34119OooOOOo = o00o000o2 == null ? o00o0oo2.f34120OooOOo : o00o000o2.OooO0Oo();
        o00O0OO o00o0oo3 = this.f7259OooOoOO;
        long j = o00o0oo3.f34119OooOOOo;
        o00O000o o00o000o3 = this.f7255OooOo0O.f34080OooOO0;
        o00o0oo3.f34121OooOOo0 = o00o000o3 != null ? Math.max(0L, j - (this.f7274Oooo0oo - o00o000o3.f34070OooOOOO)) : 0L;
        if ((z2 || z) && o00o000o2 != null && o00o000o2.f34060OooO0Oo) {
            OooOOOO.OooO0O0 oooO0O1 = o00o000o2.f34061OooO0o.f34046OooO00o;
            o00000O0 o00000o1 = o00o000o2.f34068OooOOO;
            Oooo0 oooo0 = this.f7259OooOoOO.f34105OooO00o;
            this.f7236OooO.OooO0oO(this.f7237OooO0Oo, o00000o1.f46756OooO0OO);
        }
    }

    public final void OooOOO(androidx.media3.exoplayer.source.OooOOO oooOOO) throws ExoPlaybackException {
        o00O00O o00o00o2 = this.f7255OooOo0O;
        o00O000o o00o000o2 = o00o00o2.f34080OooOO0;
        if (o00o000o2 != null && o00o000o2.f34057OooO00o == oooOOO) {
            float f = this.f7249OooOOo.OooO0O0().f6619OooO0Oo;
            Oooo0 oooo0 = this.f7259OooOoOO.f34105OooO00o;
            o00o000o2.f34060OooO0Oo = true;
            o00o000o2.f34069OooOOO0 = o00o000o2.f34057OooO00o.OooOOO0();
            o00000O0 o00000o0OooO0oO = o00o000o2.OooO0oO(f, oooo0);
            o00O00 o00o01 = o00o000o2.f34061OooO0o;
            long jMax = o00o01.f34047OooO0O0;
            long j = o00o01.f34051OooO0o0;
            if (j != -9223372036854775807L && jMax >= j) {
                jMax = Math.max(0L, j - 1);
            }
            long jOooO00o = o00o000o2.OooO00o(o00000o0OooO0oO, jMax, false, new boolean[o00o000o2.f34056OooO.length]);
            long j2 = o00o000o2.f34070OooOOOO;
            o00O00 o00o02 = o00o000o2.f34061OooO0o;
            o00o000o2.f34070OooOOOO = (o00o02.f34047OooO0O0 - jOooO00o) + j2;
            o00o000o2.f34061OooO0o = o00o02.OooO0O0(jOooO00o);
            o00000O0 o00000o1 = o00o000o2.f34068OooOOO;
            Oooo0 oooo1 = this.f7259OooOoOO.f34105OooO00o;
            androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr = o00000o1.f46756OooO0OO;
            o00oOoo o00oooo2 = this.f7236OooO;
            Renderer[] rendererArr = this.f7237OooO0Oo;
            o00oooo2.OooO0oO(rendererArr, oooO0oArr);
            if (o00o000o2 == o00o00o2.f34079OooO0oo) {
                Oooo000(o00o000o2.f34061OooO0o.f34047OooO0O0);
                OooO0o0(new boolean[rendererArr.length]);
                o00O0OO o00o0oo2 = this.f7259OooOoOO;
                OooOOOO.OooO0O0 oooO0O0 = o00o0oo2.f34106OooO0O0;
                long j3 = o00o000o2.f34061OooO0o.f34047OooO0O0;
                this.f7259OooOoOO = OooOOOo(oooO0O0, j3, o00o0oo2.f34107OooO0OO, j3, false, 5);
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
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public final void OooOOOO(androidx.media3.common.OooOOOO oooOOOO, float f, boolean z, boolean z2) throws ExoPlaybackException {
        int i;
        if (z) {
            if (z2) {
                this.f7261OooOoo0.OooO00o(1);
            }
            this.f7259OooOoOO = this.f7259OooOoOO.OooO0o(oooOOOO);
        }
        float f2 = oooOOOO.f6619OooO0Oo;
        o00O000o o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
        while (true) {
            i = 0;
            if (o00o000o2 == null) {
                break;
            }
            androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr = o00o000o2.f34068OooOOO.f46756OooO0OO;
            int length = oooO0oArr.length;
            while (i < length) {
                androidx.media3.exoplayer.trackselection.OooO0o oooO0o = oooO0oArr[i];
                if (oooO0o != null) {
                    oooO0o.OooO0Oo(f2);
                }
                i++;
            }
            o00o000o2 = o00o000o2.f34067OooOO0o;
        }
        Renderer[] rendererArr = this.f7237OooO0Oo;
        int length2 = rendererArr.length;
        while (i < length2) {
            Renderer renderer = rendererArr[i];
            if (renderer != null) {
                renderer.OooOOo(f, oooOOOO.f6619OooO0Oo);
            }
            i++;
        }
    }

    @CheckResult
    public final o00O0OO OooOOOo(OooOOOO.OooO0O0 oooO0O0, long j, long j2, long j3, boolean z, int i) {
        oo0o0Oo oo0o0oo;
        o00000O0 o00000o1;
        List<Metadata> list;
        o0O00 o0o00OooO0oo;
        this.f7276OoooO00 = (!this.f7276OoooO00 && j == this.f7259OooOoOO.f34120OooOOo && oooO0O0.equals(this.f7259OooOoOO.f34106OooO0O0)) ? false : true;
        OooOooo();
        o00O0OO o00o0oo2 = this.f7259OooOoOO;
        oo0o0Oo oo0o0oo2 = o00o0oo2.f34112OooO0oo;
        o00000O0 o00000o2 = o00o0oo2.f34104OooO;
        List<Metadata> list2 = o00o0oo2.f34113OooOO0;
        if (this.f7256OooOo0o.f7317OooOO0O) {
            o00O000o o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
            oo0o0Oo oo0o0oo3 = o00o000o2 == null ? oo0o0Oo.f33891OooO0oO : o00o000o2.f34069OooOOO0;
            o00000O0 o00000o3 = o00o000o2 == null ? this.f7241OooO0oo : o00o000o2.f34068OooOOO;
            androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr = o00000o3.f46756OooO0OO;
            ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
            boolean z2 = false;
            for (androidx.media3.exoplayer.trackselection.OooO0o oooO0o : oooO0oArr) {
                if (oooO0o != null) {
                    Metadata metadata = oooO0o.OooO0O0(0).f6411OooOOO0;
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
                ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f18681OooO0o0;
                o0o00OooO0oo = o0O00.f19060OooO0oo;
            }
            if (o00o000o2 != null) {
                o00O00 o00o01 = o00o000o2.f34061OooO0o;
                if (o00o01.f34048OooO0OO != j2) {
                    o00o000o2.f34061OooO0o = o00o01.OooO00o(j2);
                }
            }
            list = o0o00OooO0oo;
            oo0o0oo = oo0o0oo3;
            o00000o1 = o00000o3;
        } else if (oooO0O0.equals(o00o0oo2.f34106OooO0O0)) {
            oo0o0oo = oo0o0oo2;
            o00000o1 = o00000o2;
            list = list2;
        } else {
            oo0o0oo = oo0o0Oo.f33891OooO0oO;
            o00000o1 = this.f7241OooO0oo;
            list = o0O00.f19060OooO0oo;
        }
        if (z) {
            OooO0o oooO0o2 = this.f7261OooOoo0;
            if (!oooO0o2.f7285OooO0Oo || oooO0o2.f7287OooO0o0 == 5) {
                oooO0o2.f7282OooO00o = true;
                oooO0o2.f7285OooO0Oo = true;
                oooO0o2.f7287OooO0o0 = i;
            } else {
                o00Oo0.OooO00o(i == 5);
            }
        }
        o00O0OO o00o0oo3 = this.f7259OooOoOO;
        long j4 = o00o0oo3.f34119OooOOOo;
        o00O000o o00o000o3 = this.f7255OooOo0O.f34080OooOO0;
        return o00o0oo3.OooO0OO(oooO0O0, j, j2, j3, o00o000o3 == null ? 0L : Math.max(0L, j4 - (this.f7274Oooo0oo - o00o000o3.f34070OooOOOO)), oo0o0oo, o00000o1, list);
    }

    public final boolean OooOOo0() {
        o00O000o o00o000o2 = this.f7255OooOo0O.f34080OooOO0;
        if (o00o000o2 == null) {
            return false;
        }
        return (!o00o000o2.f34060OooO0Oo ? 0L : o00o000o2.f34057OooO00o.OooO0O0()) != Long.MIN_VALUE;
    }

    public final boolean OooOOoo() {
        o00O000o o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
        long j = o00o000o2.f34061OooO0o.f34051OooO0o0;
        return o00o000o2.f34060OooO0Oo && (j == -9223372036854775807L || this.f7259OooOoOO.f34120OooOOo < j || !OoooOoO());
    }

    public final void OooOo() {
        this.f7261OooOoo0.OooO00o(1);
        int i = 0;
        OooOooO(false, false, false, true);
        this.f7236OooO.OooO00o();
        OoooOo0(this.f7259OooOoOO.f34105OooO00o.OooOo00() ? 4 : 2);
        o0Oo0oo o0oo0ooOooO0OO = this.f7242OooOO0.OooO0OO();
        OooOOO0 oooOOO0 = this.f7256OooOo0o;
        o00Oo0.OooO0Oo(!oooOOO0.f7317OooOO0O);
        oooOOO0.f7318OooOO0o = o0oo0ooOooO0OO;
        while (true) {
            ArrayList arrayList = oooOOO0.f7309OooO0O0;
            if (i >= arrayList.size()) {
                oooOOO0.f7317OooOO0O = true;
                this.f7243OooOO0O.OooOO0O(2);
                return;
            } else {
                OooOOO0.OooO0OO oooO0OO = (OooOOO0.OooO0OO) arrayList.get(i);
                oooOOO0.OooO0o0(oooO0OO);
                oooOOO0.f7314OooO0oO.add(oooO0OO);
                i++;
            }
        }
    }

    public final void OooOo0() {
        OooO0o oooO0o = this.f7261OooOoo0;
        o00O0OO o00o0oo2 = this.f7259OooOoOO;
        boolean z = oooO0o.f7282OooO00o | (oooO0o.f7283OooO0O0 != o00o0oo2);
        oooO0o.f7282OooO00o = z;
        oooO0o.f7283OooO0O0 = o00o0oo2;
        if (z) {
            androidx.media3.exoplayer.OooO oooO = (androidx.media3.exoplayer.OooO) ((o000O00O.o000000) this.f7253OooOo0).f34006OooO0Oo;
            oooO.getClass();
            oooO.f7122OooO.OooO(new o0000(oooO, oooO0o));
            this.f7261OooOoo0 = new OooO0o(this.f7259OooOoOO);
        }
    }

    public final void OooOo00() {
        boolean zOooO0oo;
        if (OooOOo0()) {
            o00O000o o00o000o2 = this.f7255OooOo0O.f34080OooOO0;
            long jOooO0O0 = !o00o000o2.f34060OooO0Oo ? 0L : o00o000o2.f34057OooO00o.OooO0O0();
            o00O000o o00o000o3 = this.f7255OooOo0O.f34080OooOO0;
            long jMax = o00o000o3 == null ? 0L : Math.max(0L, jOooO0O0 - (this.f7274Oooo0oo - o00o000o3.f34070OooOOOO));
            if (o00o000o2 != this.f7255OooOo0O.f34079OooO0oo) {
                long j = o00o000o2.f34061OooO0o.f34047OooO0O0;
            }
            zOooO0oo = this.f7236OooO.OooO0oo(jMax, this.f7249OooOOo.OooO0O0().f6619OooO0Oo);
            if (!zOooO0oo && jMax < 500000 && (this.f7248OooOOOo > 0 || this.f7250OooOOo0)) {
                this.f7255OooOo0O.f34079OooO0oo.f34057OooO00o.OooOOo0(this.f7259OooOoOO.f34120OooOOo, false);
                zOooO0oo = this.f7236OooO.OooO0oo(jMax, this.f7249OooOOo.OooO0O0().f6619OooO0Oo);
            }
        } else {
            zOooO0oo = false;
        }
        this.f7267Oooo00O = zOooO0oo;
        if (zOooO0oo) {
            o00O000o o00o000o4 = this.f7255OooOo0O.f34080OooOO0;
            long j2 = this.f7274Oooo0oo;
            o00Oo0.OooO0Oo(o00o000o4.f34067OooOO0o == null);
            o00o000o4.f34057OooO00o.OooO0oo(j2 - o00o000o4.f34070OooOOOO);
        }
        OooooOO();
    }

    public final void OooOo0O() throws ExoPlaybackException {
        OooOOO0(this.f7256OooOo0o.OooO0O0(), true);
    }

    public final void OooOo0o(OooO0O0 oooO0O0) throws ExoPlaybackException {
        this.f7261OooOoo0.OooO00o(1);
        oooO0O0.getClass();
        OooOOO0 oooOOO0 = this.f7256OooOo0o;
        oooOOO0.getClass();
        o00Oo0.OooO00o(oooOOO0.f7309OooO0O0.size() >= 0);
        oooOOO0.f7316OooOO0 = null;
        OooOOO0(oooOOO0.OooO0O0(), false);
    }

    public final void OooOoO() {
        OooOooO(true, false, true, false);
        OooOoOO();
        this.f7236OooO.OooO();
        OoooOo0(1);
        HandlerThread handlerThread = this.f7244OooOO0o;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        synchronized (this) {
            this.f7260OooOoo = true;
            notifyAll();
        }
    }

    public final synchronized boolean OooOoO0() {
        if (!this.f7260OooOoo && this.f7246OooOOO0.getThread().isAlive()) {
            this.f7243OooOO0O.OooOO0O(7);
            Oooooo(new o000OOo0(this), this.f7258OooOoO0);
            return this.f7260OooOoo;
        }
        return true;
    }

    public final void OooOoOO() {
        for (int i = 0; i < this.f7237OooO0Oo.length; i++) {
            androidx.media3.exoplayer.OooO0O0 oooO0O0 = (androidx.media3.exoplayer.OooO0O0) this.f7238OooO0o[i];
            synchronized (oooO0O0.f7196OooO0Oo) {
                oooO0O0.f7208OooOOo0 = null;
            }
            this.f7237OooO0Oo[i].release();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[EDGE_INSN: B:20:0x0042->B:21:0x0044 BREAK  A[LOOP:1: B:13:0x0033->B:18:0x003d]] */
    public final void OooOoo() throws ExoPlaybackException {
        boolean z;
        float f = this.f7249OooOOo.OooO0O0().f6619OooO0Oo;
        o00O00O o00o00o2 = this.f7255OooOo0O;
        o00O000o o00o000o2 = o00o00o2.f34079OooO0oo;
        o00O000o o00o000o3 = o00o00o2.f34071OooO;
        boolean z2 = true;
        for (o00O000o o00o000o4 = o00o000o2; o00o000o4 != null && o00o000o4.f34060OooO0Oo; o00o000o4 = o00o000o4.f34067OooOO0o) {
            o00000O0 o00000o0OooO0oO = o00o000o4.OooO0oO(f, this.f7259OooOoOO.f34105OooO00o);
            o00000O0 o00000o1 = o00o000o4.f34068OooOOO;
            if (o00000o1 == null) {
                z = false;
                break;
            }
            int length = o00000o1.f46756OooO0OO.length;
            androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr = o00000o0OooO0oO.f46756OooO0OO;
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
                    if (!o00000o0OooO0oO.OooO00o(o00000o1, i)) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                if (z2) {
                    o00O00O o00o00o3 = this.f7255OooOo0O;
                    o00O000o o00o000o5 = o00o00o3.f34079OooO0oo;
                    boolean zOooOO0o = o00o00o3.OooOO0o(o00o000o5);
                    boolean[] zArr = new boolean[this.f7237OooO0Oo.length];
                    long jOooO00o = o00o000o5.OooO00o(o00000o0OooO0oO, this.f7259OooOoOO.f34120OooOOo, zOooOO0o, zArr);
                    o00O0OO o00o0oo2 = this.f7259OooOoOO;
                    boolean z3 = (o00o0oo2.f34110OooO0o0 == 4 || jOooO00o == o00o0oo2.f34120OooOOo) ? false : true;
                    o00O0OO o00o0oo3 = this.f7259OooOoOO;
                    this.f7259OooOoOO = OooOOOo(o00o0oo3.f34106OooO0O0, jOooO00o, o00o0oo3.f34107OooO0OO, o00o0oo3.f34108OooO0Oo, z3, 5);
                    if (z3) {
                        Oooo000(jOooO00o);
                    }
                    boolean[] zArr2 = new boolean[this.f7237OooO0Oo.length];
                    int i2 = 0;
                    while (true) {
                        Renderer[] rendererArr = this.f7237OooO0Oo;
                        if (i2 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i2];
                        boolean zOooOOo = OooOOo(renderer);
                        zArr2[i2] = zOooOOo;
                        SampleStream sampleStream = o00o000o5.f34059OooO0OO[i2];
                        if (zOooOOo) {
                            if (sampleStream != renderer.OooOo0()) {
                                OooO0OO(renderer);
                            } else if (zArr[i2]) {
                                renderer.OooOo0o(this.f7274Oooo0oo);
                            }
                        }
                        i2++;
                    }
                    OooO0o0(zArr2);
                } else {
                    this.f7255OooOo0O.OooOO0o(o00o000o4);
                    if (o00o000o4.f34060OooO0Oo) {
                        o00o000o4.OooO00o(o00000o0OooO0oO, Math.max(o00o000o4.f34061OooO0o.f34047OooO0O0, this.f7274Oooo0oo - o00o000o4.f34070OooOOOO), false, new boolean[o00o000o4.f34056OooO.length]);
                    }
                }
                OooOO0o(true);
                if (this.f7259OooOoOO.f34110OooO0o0 != 4) {
                    OooOo00();
                    OooooOo();
                    this.f7243OooOO0O.OooOO0O(2);
                    return;
                }
                return;
            }
            if (o00o000o4 == o00o000o3) {
                z2 = false;
            }
        }
    }

    public final void OooOoo0(int i, int i2, o00Ooo o00ooo2) throws ExoPlaybackException {
        this.f7261OooOoo0.OooO00o(1);
        OooOOO0 oooOOO0 = this.f7256OooOo0o;
        oooOOO0.getClass();
        o00Oo0.OooO00o(i >= 0 && i <= i2 && i2 <= oooOOO0.f7309OooO0O0.size());
        oooOOO0.f7316OooOO0 = o00ooo2;
        oooOOO0.OooO0oO(i, i2);
        OooOOO0(oooOOO0.OooO0O0(), false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[PHI: r4 r5 r8
      0x00c4: PHI (r4v4 androidx.media3.exoplayer.source.OooOOOO$OooO0O0) = (r4v3 androidx.media3.exoplayer.source.OooOOOO$OooO0O0), (r4v11 androidx.media3.exoplayer.source.OooOOOO$OooO0O0) binds: [B:39:0x009c, B:41:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r5v2 long) = (r5v1 long), (r5v13 long) binds: [B:39:0x009c, B:41:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r8v2 long) = (r8v1 long), (r8v5 long) binds: [B:39:0x009c, B:41:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooOooO(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        boolean z5;
        Oooo0 oo0ooo0;
        List list;
        this.f7243OooOO0O.OooOO0o(2);
        this.f7275OoooO0 = null;
        this.f7266Oooo000 = false;
        androidx.media3.exoplayer.OooO0OO oooO0OO = this.f7249OooOOo;
        oooO0OO.f7209OooO = false;
        o00OO0OO o00oo0oo = oooO0OO.f7210OooO0Oo;
        if (o00oo0oo.f34134OooO0o0) {
            o00oo0oo.OooO0OO(o00oo0oo.OooOOo0());
            o00oo0oo.f34134OooO0o0 = false;
        }
        this.f7274Oooo0oo = 1000000000000L;
        for (Renderer renderer : this.f7237OooO0Oo) {
            try {
                OooO0OO(renderer);
            } catch (ExoPlaybackException | RuntimeException e) {
                Log.OooO0Oo("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            for (Renderer renderer2 : this.f7237OooO0Oo) {
                if (this.f7239OooO0o0.remove(renderer2)) {
                    try {
                        renderer2.reset();
                    } catch (RuntimeException e2) {
                        Log.OooO0Oo("ExoPlayerImplInternal", "Reset failed.", e2);
                    }
                }
            }
        }
        this.f7271Oooo0o = 0;
        o00O0OO o00o0oo2 = this.f7259OooOoOO;
        OooOOOO.OooO0O0 oooO0O0 = o00o0oo2.f34106OooO0O0;
        long jLongValue = o00o0oo2.f34120OooOOo;
        if (this.f7259OooOoOO.f34106OooO0O0.OooO00o()) {
            j = this.f7259OooOoOO.f34107OooO0OO;
        } else {
            o00O0OO o00o0oo3 = this.f7259OooOoOO;
            Oooo0.OooO0O0 oooO0O1 = this.f7247OooOOOO;
            OooOOOO.OooO0O0 oooO0O2 = o00o0oo3.f34106OooO0O0;
            Oooo0 oooo0 = o00o0oo3.f34105OooO00o;
            if (oooo0.OooOo00() || oooo0.OooOO0O(oooO0O2.f33816OooO00o, oooO0O1).f6640OooO) {
                j = this.f7259OooOoOO.f34107OooO0OO;
            } else {
                j = this.f7259OooOoOO.f34120OooOOo;
            }
        }
        if (z2) {
            this.f7273Oooo0oO = null;
            Pair<OooOOOO.OooO0O0, Long> pairOooO0oo = OooO0oo(this.f7259OooOoOO.f34105OooO00o);
            oooO0O0 = (OooOOOO.OooO0O0) pairOooO0oo.first;
            jLongValue = ((Long) pairOooO0oo.second).longValue();
            j = -9223372036854775807L;
            z5 = oooO0O0.equals(this.f7259OooOoOO.f34106OooO0O0) ? false : true;
        }
        long j2 = jLongValue;
        this.f7255OooOo0O.OooO0O0();
        this.f7267Oooo00O = false;
        Oooo0 oooo1 = this.f7259OooOoOO.f34105OooO00o;
        if (z3 && (oooo1 instanceof oo0oOO0)) {
            oo0oOO0 oo0ooo1 = (oo0oOO0) oooo1;
            o00Ooo o00ooo2 = this.f7256OooOo0o.f7316OooOO0;
            Oooo0[] oooo0Arr = oo0ooo1.f34162OooOOo0;
            Oooo0[] oooo0Arr2 = new Oooo0[oooo0Arr.length];
            for (int i = 0; i < oooo0Arr.length; i++) {
                oooo0Arr2[i] = new o00O0OOO(oooo0Arr[i]);
            }
            oo0ooo0 = new oo0oOO0(oooo0Arr2, oo0ooo1.f34161OooOOo, o00ooo2);
            if (oooO0O0.f33817OooO0O0 != -1) {
                oo0ooo0.OooOO0O(oooO0O0.f33816OooO00o, this.f7247OooOOOO);
                if (oo0ooo0.OooOOo0(this.f7247OooOOOO.f6642OooO0o, this.f7245OooOOO).OooO0Oo()) {
                    oooO0O0 = new OooOOOO.OooO0O0(oooO0O0.f33816OooO00o, oooO0O0.f33819OooO0Oo);
                }
            }
        } else {
            oo0ooo0 = oooo1;
        }
        OooOOOO.OooO0O0 oooO0O3 = oooO0O0;
        o00O0OO o00o0oo4 = this.f7259OooOoOO;
        int i2 = o00o0oo4.f34110OooO0o0;
        ExoPlaybackException exoPlaybackException = z4 ? null : o00o0oo4.f34109OooO0o;
        oo0o0Oo oo0o0oo = z5 ? oo0o0Oo.f33891OooO0oO : o00o0oo4.f34112OooO0oo;
        o00000O0 o00000o1 = z5 ? this.f7241OooO0oo : o00o0oo4.f34104OooO;
        if (z5) {
            ImmutableList.OooO0O0 oooO0O4 = ImmutableList.f18681OooO0o0;
            list = o0O00.f19060OooO0oo;
        } else {
            list = o00o0oo4.f34113OooOO0;
        }
        this.f7259OooOoOO = new o00O0OO(oo0ooo0, oooO0O3, j, j2, i2, exoPlaybackException, false, oo0o0oo, o00000o1, list, oooO0O3, o00o0oo4.f34115OooOO0o, o00o0oo4.f34117OooOOO0, o00o0oo4.f34116OooOOO, j2, 0L, j2, 0L, false);
        if (z3) {
            OooOOO0 oooOOO0 = this.f7256OooOo0o;
            HashMap<OooOOO0.OooO0OO, OooOOO0.OooO0O0> map = oooOOO0.f7312OooO0o;
            for (OooOOO0.OooO0O0 oooO0O5 : map.values()) {
                try {
                    oooO0O5.f7321OooO00o.OooOO0(oooO0O5.f7322OooO0O0);
                } catch (RuntimeException e3) {
                    Log.OooO0Oo("MediaSourceList", "Failed to release child source.", e3);
                }
                OooOOOO oooOOOO = oooO0O5.f7321OooO00o;
                OooOOO0.OooO00o oooO00o = oooO0O5.f7323OooO0OO;
                oooOOOO.OooO0O0(oooO00o);
                oooO0O5.f7321OooO00o.OooO0o(oooO00o);
            }
            map.clear();
            oooOOO0.f7314OooO0oO.clear();
            oooOOO0.f7317OooOO0O = false;
        }
    }

    public final void OooOooo() {
        o00O000o o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
        this.f7263OooOooo = o00o000o2 != null && o00o000o2.f34061OooO0o.f34053OooO0oo && this.f7262OooOooO;
    }

    public final void Oooo(boolean z, @Nullable AtomicBoolean atomicBoolean) {
        if (this.f7269Oooo0O0 != z) {
            this.f7269Oooo0O0 = z;
            if (!z) {
                for (Renderer renderer : this.f7237OooO0Oo) {
                    if (!OooOOo(renderer) && this.f7239OooO0o0.remove(renderer)) {
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
        o00O000o o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
        long j2 = j + (o00o000o2 == null ? 1000000000000L : o00o000o2.f34070OooOOOO);
        this.f7274Oooo0oo = j2;
        this.f7249OooOOo.f7210OooO0Oo.OooO0OO(j2);
        for (Renderer renderer : this.f7237OooO0Oo) {
            if (OooOOo(renderer)) {
                renderer.OooOo0o(this.f7274Oooo0oo);
            }
        }
        for (o00O000o o00o000o3 = r0.f34079OooO0oo; o00o000o3 != null; o00o000o3 = o00o000o3.f34067OooOO0o) {
            for (androidx.media3.exoplayer.trackselection.OooO0o oooO0o : o00o000o3.f34068OooOOO.f46756OooO0OO) {
                if (oooO0o != null) {
                    oooO0o.OooO0o0();
                }
            }
        }
    }

    public final void Oooo00O(Oooo0 oooo0, Oooo0 oooo1) {
        if (oooo0.OooOo00() && oooo1.OooOo00()) {
            return;
        }
        ArrayList<OooO0OO> arrayList = this.f7251OooOOoo;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void Oooo0O0(boolean z) throws ExoPlaybackException {
        OooOOOO.OooO0O0 oooO0O0 = this.f7255OooOo0O.f34079OooO0oo.f34061OooO0o.f34046OooO00o;
        long jOooo0o0 = Oooo0o0(oooO0O0, this.f7259OooOoOO.f34120OooOOo, true, false);
        if (jOooo0o0 != this.f7259OooOoOO.f34120OooOOo) {
            o00O0OO o00o0oo2 = this.f7259OooOoOO;
            this.f7259OooOoOO = OooOOOo(oooO0O0, jOooo0o0, o00o0oo2.f34107OooO0OO, o00o0oo2.f34108OooO0Oo, z, 5);
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
    public final void Oooo0OO(C0144OooOO0O c0144OooOO0O) throws Throwable {
        long jLongValue;
        boolean z;
        OooOOOO.OooO0O0 oooO0O0;
        long j;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        o00O00O o00o00o2;
        boolean z4;
        long jOooo0o0;
        long j4;
        o00O000o o00o000o2;
        long jOooOO0;
        o00O0OO o00o0oo2;
        int i;
        this.f7261OooOoo0.OooO00o(1);
        Pair<Object, Long> pairOooo00o = Oooo00o(this.f7259OooOoOO.f34105OooO00o, c0144OooOO0O, true, this.f7268Oooo00o, this.f7265Oooo0, this.f7245OooOOO, this.f7247OooOOOO);
        long j5 = -9223372036854775807L;
        try {
            if (pairOooo00o != null) {
                Object obj = pairOooo00o.first;
                jLongValue = ((Long) pairOooo00o.second).longValue();
                long j6 = c0144OooOO0O.f7297OooO0OO == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                OooOOOO.OooO0O0 oooO0O0OooOOO = this.f7255OooOo0O.OooOOO(this.f7259OooOoOO.f34105OooO00o, obj, jLongValue);
                if (oooO0O0OooOOO.OooO00o()) {
                    this.f7259OooOoOO.f34105OooO00o.OooOO0O(oooO0O0OooOOO.f33816OooO00o, this.f7247OooOOOO);
                    jLongValue = this.f7247OooOOOO.OooO(oooO0O0OooOOO.f33817OooO0O0) == oooO0O0OooOOO.f33818OooO0OO ? this.f7247OooOOOO.f6646OooOO0.f6185OooO0o : 0L;
                    j = j6;
                    oooO0O0 = oooO0O0OooOOO;
                    z2 = true;
                } else {
                    z = c0144OooOO0O.f7297OooO0OO == -9223372036854775807L;
                    j5 = j6;
                    oooO0O0 = oooO0O0OooOOO;
                }
                if (this.f7259OooOoOO.f34105OooO00o.OooOo00()) {
                    if (pairOooo00o == null) {
                        if (this.f7259OooOoOO.f34110OooO0o0 != 1) {
                            OoooOo0(4);
                        }
                        OooOooO(false, true, false, true);
                    } else {
                        if (oooO0O0.equals(this.f7259OooOoOO.f34106OooO0O0)) {
                            o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
                            if (o00o000o2 == null && o00o000o2.f34060OooO0Oo && jLongValue != 0) {
                                jOooOO0 = o00o000o2.f34057OooO00o.OooOO0(jLongValue, this.f7257OooOoO);
                            } else {
                                jOooOO0 = jLongValue;
                            }
                            if (o00.o000oOoO(jOooOO0) == o00.o000oOoO(this.f7259OooOoOO.f34120OooOOo) || !((i = (o00o0oo2 = this.f7259OooOoOO).f34110OooO0o0) == 2 || i == 3)) {
                                j3 = jOooOO0;
                            } else {
                                j4 = o00o0oo2.f34120OooOOo;
                            }
                        } else {
                            j3 = jLongValue;
                        }
                        if (this.f7259OooOoOO.f34110OooO0o0 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o00o00o2 = this.f7255OooOo0O;
                        if (o00o00o2.f34079OooO0oo != o00o00o2.f34071OooO) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        jOooo0o0 = Oooo0o0(oooO0O0, j3, z4, z3);
                        z2 |= jLongValue != jOooo0o0;
                        try {
                            o00O0OO o00o0oo3 = this.f7259OooOoOO;
                            Oooo0 oooo0 = o00o0oo3.f34105OooO00o;
                            Oooooo0(oooo0, oooO0O0, oooo0, o00o0oo3.f34106OooO0O0, j, true);
                            j4 = jOooo0o0;
                        } catch (Throwable th) {
                            th = th;
                            j2 = jOooo0o0;
                            this.f7259OooOoOO = OooOOOo(oooO0O0, j2, j, j2, z2, 2);
                            throw th;
                        }
                    }
                    this.f7259OooOoOO = OooOOOo(oooO0O0, j4, j, j4, z2, 2);
                    return;
                }
                this.f7273Oooo0oO = c0144OooOO0O;
                j4 = jLongValue;
                this.f7259OooOoOO = OooOOOo(oooO0O0, j4, j, j4, z2, 2);
                return;
            }
            Pair<OooOOOO.OooO0O0, Long> pairOooO0oo = OooO0oo(this.f7259OooOoOO.f34105OooO00o);
            oooO0O0 = (OooOOOO.OooO0O0) pairOooO0oo.first;
            jLongValue = ((Long) pairOooO0oo.second).longValue();
            z = !this.f7259OooOoOO.f34105OooO00o.OooOo00();
            if (this.f7259OooOoOO.f34105OooO00o.OooOo00()) {
                if (pairOooo00o == null) {
                    if (this.f7259OooOoOO.f34110OooO0o0 != 1) {
                        OoooOo0(4);
                    }
                    OooOooO(false, true, false, true);
                } else {
                    if (oooO0O0.equals(this.f7259OooOoOO.f34106OooO0O0)) {
                        o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
                        if (o00o000o2 == null) {
                            jOooOO0 = jLongValue;
                        } else {
                            jOooOO0 = jLongValue;
                        }
                        if (o00.o000oOoO(jOooOO0) == o00.o000oOoO(this.f7259OooOoOO.f34120OooOOo)) {
                        }
                        j3 = jOooOO0;
                    } else {
                        j3 = jLongValue;
                    }
                    if (this.f7259OooOoOO.f34110OooO0o0 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o00o00o2 = this.f7255OooOo0O;
                    if (o00o00o2.f34079OooO0oo != o00o00o2.f34071OooO) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jOooo0o0 = Oooo0o0(oooO0O0, j3, z4, z3);
                    z2 |= jLongValue != jOooo0o0;
                    o00O0OO o00o0oo4 = this.f7259OooOoOO;
                    Oooo0 oooo1 = o00o0oo4.f34105OooO00o;
                    Oooooo0(oooo1, oooO0O0, oooo1, o00o0oo4.f34106OooO0O0, j, true);
                    j4 = jOooo0o0;
                }
                this.f7259OooOoOO = OooOOOo(oooO0O0, j4, j, j4, z2, 2);
                return;
            }
            this.f7273Oooo0oO = c0144OooOO0O;
            j4 = jLongValue;
            this.f7259OooOoOO = OooOOOo(oooO0O0, j4, j, j4, z2, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j2 = jLongValue;
        }
        j = j5;
        z2 = z;
    }

    public final void Oooo0o(OooOOO oooOOO) throws ExoPlaybackException {
        Looper looper = oooOOO.f7303OooO0o;
        Looper looper2 = this.f7246OooOOO0;
        o000000 o000000Var = this.f7243OooOO0O;
        if (looper != looper2) {
            o000000Var.OooO0o0(15, oooOOO).OooO00o();
            return;
        }
        synchronized (oooOOO) {
        }
        try {
            oooOOO.f7299OooO00o.OooOO0o(oooOOO.f7302OooO0Oo, oooOOO.f7304OooO0o0);
            oooOOO.OooO0O0(true);
            int i = this.f7259OooOoOO.f34110OooO0o0;
            if (i == 3 || i == 2) {
                o000000Var.OooOO0O(2);
            }
        } catch (Throwable th) {
            oooOOO.OooO0O0(true);
            throw th;
        }
    }

    public final long Oooo0o0(OooOOOO.OooO0O0 oooO0O0, long j, boolean z, boolean z2) throws ExoPlaybackException {
        OooooO0();
        this.f7266Oooo000 = false;
        if (z2 || this.f7259OooOoOO.f34110OooO0o0 == 3) {
            OoooOo0(2);
        }
        o00O00O o00o00o2 = this.f7255OooOo0O;
        o00O000o o00o000o2 = o00o00o2.f34079OooO0oo;
        o00O000o o00o000o3 = o00o000o2;
        while (o00o000o3 != null && !oooO0O0.equals(o00o000o3.f34061OooO0o.f34046OooO00o)) {
            o00o000o3 = o00o000o3.f34067OooOO0o;
        }
        if (z || o00o000o2 != o00o000o3 || (o00o000o3 != null && o00o000o3.f34070OooOOOO + j < 0)) {
            Renderer[] rendererArr = this.f7237OooO0Oo;
            for (Renderer renderer : rendererArr) {
                OooO0OO(renderer);
            }
            if (o00o000o3 != null) {
                while (o00o00o2.f34079OooO0oo != o00o000o3) {
                    o00o00o2.OooO00o();
                }
                o00o00o2.OooOO0o(o00o000o3);
                o00o000o3.f34070OooOOOO = 1000000000000L;
                OooO0o0(new boolean[rendererArr.length]);
            }
        }
        if (o00o000o3 != null) {
            o00o00o2.OooOO0o(o00o000o3);
            if (!o00o000o3.f34060OooO0Oo) {
                o00o000o3.f34061OooO0o = o00o000o3.f34061OooO0o.OooO0O0(j);
            } else if (o00o000o3.f34062OooO0o0) {
                androidx.media3.exoplayer.source.OooOOO oooOOO = o00o000o3.f34057OooO00o;
                j = oooOOO.OooO0OO(j);
                oooOOO.OooOOo0(j - this.f7248OooOOOo, this.f7250OooOOo0);
            }
            Oooo000(j);
            OooOo00();
        } else {
            o00o00o2.OooO0O0();
            Oooo000(j);
        }
        OooOO0o(false);
        this.f7243OooOO0O.OooOO0O(2);
        return j;
    }

    public final void Oooo0oO(OooOOO oooOOO) {
        Looper looper = oooOOO.f7303OooO0o;
        int i = 0;
        if (looper.getThread().isAlive()) {
            this.f7254OooOo00.OooO0O0(looper, null).OooO(new o000O00O.o00(i, this, oooOOO));
        } else {
            Log.OooO0o("TAG", "Trying to send message on a dead thread.");
            oooOOO.OooO0O0(false);
        }
    }

    public final void OoooO(int i, int i2, boolean z, boolean z2) throws ExoPlaybackException {
        this.f7261OooOoo0.OooO00o(z2 ? 1 : 0);
        OooO0o oooO0o = this.f7261OooOoo0;
        oooO0o.f7282OooO00o = true;
        oooO0o.f7286OooO0o = true;
        oooO0o.f7288OooO0oO = i2;
        this.f7259OooOoOO = this.f7259OooOoOO.OooO0Oo(i, z);
        this.f7266Oooo000 = false;
        for (o00O000o o00o000o2 = this.f7255OooOo0O.f34079OooO0oo; o00o000o2 != null; o00o000o2 = o00o000o2.f34067OooOO0o) {
            for (androidx.media3.exoplayer.trackselection.OooO0o oooO0o2 : o00o000o2.f34068OooOOO.f46756OooO0OO) {
                if (oooO0o2 != null) {
                    oooO0o2.OooO(z);
                }
            }
        }
        if (!OoooOoO()) {
            OooooO0();
            OooooOo();
            return;
        }
        int i3 = this.f7259OooOoOO.f34110OooO0o0;
        o000000 o000000Var = this.f7243OooOO0O;
        if (i3 == 3) {
            Ooooo00();
            o000000Var.OooOO0O(2);
        } else if (i3 == 2) {
            o000000Var.OooOO0O(2);
        }
    }

    public final void OoooO0(boolean z) {
        if (z == this.f7272Oooo0o0) {
            return;
        }
        this.f7272Oooo0o0 = z;
        if (z || !this.f7259OooOoOO.f34118OooOOOO) {
            return;
        }
        this.f7243OooOO0O.OooOO0O(2);
    }

    public final void OoooO00(OooO00o oooO00o) throws ExoPlaybackException {
        this.f7261OooOoo0.OooO00o(1);
        int i = oooO00o.f7280OooO0OO;
        o00Ooo o00ooo2 = oooO00o.f7279OooO0O0;
        List<OooOOO0.OooO0OO> list = oooO00o.f7278OooO00o;
        if (i != -1) {
            this.f7273Oooo0oO = new C0144OooOO0O(new oo0oOO0(list, o00ooo2), oooO00o.f7280OooO0OO, oooO00o.f7281OooO0Oo);
        }
        OooOOO0 oooOOO0 = this.f7256OooOo0o;
        ArrayList arrayList = oooOOO0.f7309OooO0O0;
        oooOOO0.OooO0oO(0, arrayList.size());
        OooOOO0(oooOOO0.OooO00o(arrayList.size(), list, o00ooo2), false);
    }

    public final void OoooO0O(boolean z) throws ExoPlaybackException {
        this.f7262OooOooO = z;
        OooOooo();
        if (this.f7263OooOooo) {
            o00O00O o00o00o2 = this.f7255OooOo0O;
            if (o00o00o2.f34071OooO != o00o00o2.f34079OooO0oo) {
                Oooo0O0(true);
                OooOO0o(false);
            }
        }
    }

    public final void OoooOO0(androidx.media3.common.OooOOOO oooOOOO) throws ExoPlaybackException {
        this.f7243OooOO0O.OooOO0o(16);
        androidx.media3.exoplayer.OooO0OO oooO0OO = this.f7249OooOOo;
        oooO0OO.OooO00o(oooOOOO);
        androidx.media3.common.OooOOOO oooOOOOOooO0O0 = oooO0OO.OooO0O0();
        OooOOOO(oooOOOOOooO0O0, oooOOOOOooO0O0.f6619OooO0Oo, true, true);
    }

    public final void OoooOOO(boolean z) throws ExoPlaybackException {
        this.f7265Oooo0 = z;
        Oooo0 oooo0 = this.f7259OooOoOO.f34105OooO00o;
        o00O00O o00o00o2 = this.f7255OooOo0O;
        o00o00o2.f34078OooO0oO = z;
        if (!o00o00o2.OooOOOO(oooo0)) {
            Oooo0O0(true);
        }
        OooOO0o(false);
    }

    public final void OoooOOo(o00Ooo o00ooo2) throws ExoPlaybackException {
        this.f7261OooOoo0.OooO00o(1);
        OooOOO0 oooOOO0 = this.f7256OooOo0o;
        int size = oooOOO0.f7309OooO0O0.size();
        if (o00ooo2.getLength() != size) {
            o00ooo2 = o00ooo2.OooO0o0().OooO0oO(size);
        }
        oooOOO0.f7316OooOO0 = o00ooo2;
        OooOOO0(oooOOO0.OooO0O0(), false);
    }

    public final void OoooOo0(int i) {
        o00O0OO o00o0oo2 = this.f7259OooOoOO;
        if (o00o0oo2.f34110OooO0o0 != i) {
            if (i != 2) {
                this.f7277OoooO0O = -9223372036854775807L;
            }
            this.f7259OooOoOO = o00o0oo2.OooO0oO(i);
        }
    }

    public final boolean OoooOoO() {
        o00O0OO o00o0oo2 = this.f7259OooOoOO;
        return o00o0oo2.f34115OooOO0o && o00o0oo2.f34117OooOOO0 == 0;
    }

    public final boolean OoooOoo(Oooo0 oooo0, OooOOOO.OooO0O0 oooO0O0) {
        if (oooO0O0.OooO00o() || oooo0.OooOo00()) {
            return false;
        }
        int i = oooo0.OooOO0O(oooO0O0.f33816OooO00o, this.f7247OooOOOO).f6642OooO0o;
        Oooo0.OooO0o oooO0o = this.f7245OooOOO;
        oooo0.OooOOo0(i, oooO0o);
        return oooO0o.OooO0Oo() && oooO0o.f6676OooOO0o && oooO0o.f6668OooO != -9223372036854775807L;
    }

    public final void Ooooo00() throws ExoPlaybackException {
        this.f7266Oooo000 = false;
        androidx.media3.exoplayer.OooO0OO oooO0OO = this.f7249OooOOo;
        oooO0OO.f7209OooO = true;
        o00OO0OO o00oo0oo = oooO0OO.f7210OooO0Oo;
        if (!o00oo0oo.f34134OooO0o0) {
            o00oo0oo.f34135OooO0oO = o00oo0oo.f34132OooO0Oo.elapsedRealtime();
            o00oo0oo.f34134OooO0o0 = true;
        }
        for (Renderer renderer : this.f7237OooO0Oo) {
            if (OooOOo(renderer)) {
                renderer.start();
            }
        }
    }

    public final void Ooooo0o(boolean z, boolean z2) {
        OooOooO(z || !this.f7269Oooo0O0, false, true, false);
        this.f7261OooOoo0.OooO00o(z2 ? 1 : 0);
        this.f7236OooO.OooO0o();
        OoooOo0(1);
    }

    public final void OooooO0() throws ExoPlaybackException {
        androidx.media3.exoplayer.OooO0OO oooO0OO = this.f7249OooOOo;
        oooO0OO.f7209OooO = false;
        o00OO0OO o00oo0oo = oooO0OO.f7210OooO0Oo;
        if (o00oo0oo.f34134OooO0o0) {
            o00oo0oo.OooO0OO(o00oo0oo.OooOOo0());
            o00oo0oo.f34134OooO0o0 = false;
        }
        for (Renderer renderer : this.f7237OooO0Oo) {
            if (OooOOo(renderer) && renderer.getState() == 2) {
                renderer.stop();
            }
        }
    }

    public final void OooooOO() {
        o00O000o o00o000o2 = this.f7255OooOo0O.f34080OooOO0;
        boolean z = this.f7267Oooo00O || (o00o000o2 != null && o00o000o2.f34057OooO00o.OooO0o0());
        o00O0OO o00o0oo2 = this.f7259OooOoOO;
        if (z != o00o0oo2.f34111OooO0oO) {
            this.f7259OooOoOO = new o00O0OO(o00o0oo2.f34105OooO00o, o00o0oo2.f34106OooO0O0, o00o0oo2.f34107OooO0OO, o00o0oo2.f34108OooO0Oo, o00o0oo2.f34110OooO0o0, o00o0oo2.f34109OooO0o, z, o00o0oo2.f34112OooO0oo, o00o0oo2.f34104OooO, o00o0oo2.f34113OooOO0, o00o0oo2.f34114OooOO0O, o00o0oo2.f34115OooOO0o, o00o0oo2.f34117OooOOO0, o00o0oo2.f34116OooOOO, o00o0oo2.f34119OooOOOo, o00o0oo2.f34121OooOOo0, o00o0oo2.f34120OooOOo, o00o0oo2.f34122OooOOoo, o00o0oo2.f34118OooOOOO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    public final void OooooOo() throws ExoPlaybackException {
        androidx.media3.common.OooOOOO oooOOOOOooO0O0;
        OooOO0O oooOO0O;
        OooOO0O oooOO0O2;
        OooOO0O oooOO0O3;
        OooO0OO oooO0OO;
        float f;
        o00O000o o00o000o2 = this.f7255OooOo0O.f34079OooO0oo;
        if (o00o000o2 == null) {
            return;
        }
        long j = -9223372036854775807L;
        long jOooO0o = o00o000o2.f34060OooO0Oo ? o00o000o2.f34057OooO00o.OooO0o() : -9223372036854775807L;
        if (jOooO0o != -9223372036854775807L) {
            Oooo000(jOooO0o);
            if (jOooO0o != this.f7259OooOoOO.f34120OooOOo) {
                o00O0OO o00o0oo2 = this.f7259OooOoOO;
                this.f7259OooOoOO = OooOOOo(o00o0oo2.f34106OooO0O0, jOooO0o, o00o0oo2.f34107OooO0OO, jOooO0o, true, 5);
            }
            oooOO0O = this;
            j = -9223372036854775807L;
            oooOO0O2 = oooOO0O;
        } else {
            androidx.media3.exoplayer.OooO0OO oooO0OO2 = this.f7249OooOOo;
            boolean z = o00o000o2 != this.f7255OooOo0O.f34071OooO;
            Renderer renderer = oooO0OO2.f7211OooO0o;
            boolean z2 = renderer == null || renderer.OooO0o0() || (!oooO0OO2.f7211OooO0o.OooO0Oo() && (z || oooO0OO2.f7211OooO0o.OooO0oo()));
            o00OO0OO o00oo0oo = oooO0OO2.f7210OooO0Oo;
            if (z2) {
                oooO0OO2.f7214OooO0oo = true;
                if (oooO0OO2.f7209OooO && !o00oo0oo.f34134OooO0o0) {
                    o00oo0oo.f34135OooO0oO = o00oo0oo.f34132OooO0Oo.elapsedRealtime();
                    o00oo0oo.f34134OooO0o0 = true;
                }
            } else {
                o00O000 o00o001 = oooO0OO2.f7213OooO0oO;
                o00o001.getClass();
                long jOooOOo0 = o00o001.OooOOo0();
                if (!oooO0OO2.f7214OooO0oo) {
                    o00oo0oo.OooO0OO(jOooOOo0);
                    oooOOOOOooO0O0 = o00o001.OooO0O0();
                    if (!oooOOOOOooO0O0.equals(o00oo0oo.f34136OooO0oo)) {
                        o00oo0oo.OooO00o(oooOOOOOooO0O0);
                        ((OooOO0O) oooO0OO2.f7212OooO0o0).f7243OooOO0O.OooO0o0(16, oooOOOOOooO0O0).OooO00o();
                    }
                } else if (jOooOOo0 >= o00oo0oo.OooOOo0()) {
                    oooO0OO2.f7214OooO0oo = false;
                    if (oooO0OO2.f7209OooO && !o00oo0oo.f34134OooO0o0) {
                        o00oo0oo.f34135OooO0oO = o00oo0oo.f34132OooO0Oo.elapsedRealtime();
                        o00oo0oo.f34134OooO0o0 = true;
                    }
                    o00oo0oo.OooO0OO(jOooOOo0);
                    oooOOOOOooO0O0 = o00o001.OooO0O0();
                    if (!oooOOOOOooO0O0.equals(o00oo0oo.f34136OooO0oo)) {
                        o00oo0oo.OooO00o(oooOOOOOooO0O0);
                        ((OooOO0O) oooO0OO2.f7212OooO0o0).f7243OooOO0O.OooO0o0(16, oooOOOOOooO0O0).OooO00o();
                    }
                } else if (o00oo0oo.f34134OooO0o0) {
                    o00oo0oo.OooO0OO(o00oo0oo.OooOOo0());
                    o00oo0oo.f34134OooO0o0 = false;
                }
            }
            long jOooOOo1 = oooO0OO2.OooOOo0();
            this.f7274Oooo0oo = jOooOOo1;
            long j2 = jOooOOo1 - o00o000o2.f34070OooOOOO;
            long j3 = this.f7259OooOoOO.f34120OooOOo;
            if (this.f7251OooOOoo.isEmpty() || this.f7259OooOoOO.f34106OooO0O0.OooO00o()) {
                oooOO0O = this;
                j = -9223372036854775807L;
                oooOO0O2 = oooOO0O;
            } else {
                if (this.f7276OoooO00) {
                    j3--;
                    this.f7276OoooO00 = false;
                }
                o00O0OO o00o0oo3 = this.f7259OooOoOO;
                int iOooO0o0 = o00o0oo3.f34105OooO00o.OooO0o0(o00o0oo3.f34106OooO0O0.f33816OooO00o);
                int iMin = Math.min(this.f7264Oooo, this.f7251OooOOoo.size());
                if (iMin > 0) {
                    oooO0OO = this.f7251OooOOoo.get(iMin - 1);
                    oooOO0O3 = this;
                    oooOO0O = oooOO0O3;
                    oooOO0O2 = oooOO0O;
                } else {
                    oooOO0O2 = this;
                    oooOO0O = this;
                    oooOO0O3 = this;
                    oooO0OO = null;
                }
                while (oooO0OO != null) {
                    oooO0OO.getClass();
                    if (iOooO0o0 >= 0) {
                        if (iOooO0o0 != 0) {
                            break;
                        }
                        oooO0OO.getClass();
                        if (0 <= j3) {
                            break;
                        }
                    }
                    iMin--;
                    if (iMin > 0) {
                        oooO0OO = oooOO0O3.f7251OooOOoo.get(iMin - 1);
                    } else {
                        j = j;
                        oooOO0O2 = oooOO0O2;
                        oooOO0O = oooOO0O;
                        oooOO0O3 = oooOO0O3;
                        oooO0OO = null;
                    }
                }
                OooO0OO oooO0OO3 = iMin < oooOO0O3.f7251OooOOoo.size() ? oooOO0O3.f7251OooOOoo.get(iMin) : null;
                if (oooO0OO3 != null) {
                    oooO0OO3.getClass();
                }
                if (oooO0OO3 != null) {
                    oooO0OO3.getClass();
                }
                oooOO0O3.f7264Oooo = iMin;
            }
            o00O0OO o00o0oo4 = oooOO0O.f7259OooOoOO;
            o00o0oo4.f34120OooOOo = j2;
            o00o0oo4.f34122OooOOoo = SystemClock.elapsedRealtime();
        }
        oooOO0O.f7259OooOoOO.f34119OooOOOo = oooOO0O.f7255OooOo0O.f34080OooOO0.OooO0Oo();
        o00O0OO o00o0oo5 = oooOO0O.f7259OooOoOO;
        long j4 = oooOO0O2.f7259OooOoOO.f34119OooOOOo;
        o00O000o o00o000o3 = oooOO0O2.f7255OooOo0O.f34080OooOO0;
        o00o0oo5.f34121OooOOo0 = o00o000o3 == null ? 0L : Math.max(0L, j4 - (oooOO0O2.f7274Oooo0oo - o00o000o3.f34070OooOOOO));
        o00O0OO o00o0oo6 = oooOO0O.f7259OooOoOO;
        if (o00o0oo6.f34115OooOO0o && o00o0oo6.f34110OooO0o0 == 3 && oooOO0O.OoooOoo(o00o0oo6.f34105OooO00o, o00o0oo6.f34106OooO0O0)) {
            o00O0OO o00o0oo7 = oooOO0O.f7259OooOoOO;
            if (o00o0oo7.f34116OooOOO.f6619OooO0Oo == 1.0f) {
                o0O0ooO o0o0ooo = oooOO0O.f7252OooOo;
                long jOooO0o2 = oooOO0O.OooO0o(o00o0oo7.f34105OooO00o, o00o0oo7.f34106OooO0O0.f33816OooO00o, o00o0oo7.f34120OooOOo);
                long j5 = oooOO0O2.f7259OooOoOO.f34119OooOOOo;
                o00O000o o00o000o4 = oooOO0O2.f7255OooOo0O.f34080OooOO0;
                long jMax = o00o000o4 != null ? Math.max(0L, j5 - (oooOO0O2.f7274Oooo0oo - o00o000o4.f34070OooOOOO)) : 0L;
                Oooo000 oooo000 = (Oooo000) o0o0ooo;
                if (oooo000.f33988OooO0Oo == j) {
                    f = 1.0f;
                } else {
                    long j6 = jOooO0o2 - jMax;
                    long j7 = oooo000.f33996OooOOO;
                    if (j7 == j) {
                        oooo000.f33996OooOOO = j6;
                        oooo000.f33998OooOOOO = 0L;
                    } else {
                        float f2 = oooo000.f33987OooO0OO;
                        float f3 = 1.0f - f2;
                        long jMax2 = Math.max(j6, (long) ((j6 * f3) + (j7 * f2)));
                        oooo000.f33996OooOOO = jMax2;
                        oooo000.f33998OooOOOO = (long) ((f3 * Math.abs(j6 - jMax2)) + (oooo000.f33998OooOOOO * f2));
                    }
                    if (oooo000.f33997OooOOO0 == j || SystemClock.elapsedRealtime() - oooo000.f33997OooOOO0 >= 1000) {
                        oooo000.f33997OooOOO0 = SystemClock.elapsedRealtime();
                        long j8 = (oooo000.f33998OooOOOO * 3) + oooo000.f33996OooOOO;
                        if (oooo000.f33984OooO > j8) {
                            float fOooo0OO = o00.Oooo0OO(1000L);
                            long[] jArr = {j8, oooo000.f33989OooO0o, oooo000.f33984OooO - (((long) ((oooo000.f33995OooOO0o - 1.0f) * fOooo0OO)) + ((long) ((oooo000.f33993OooOO0 - 1.0f) * fOooo0OO)))};
                            long j9 = j8;
                            for (int i = 1; i < 3; i++) {
                                long j10 = jArr[i];
                                if (j10 > j9) {
                                    j9 = j10;
                                }
                            }
                            oooo000.f33984OooO = j9;
                        } else {
                            long jOooOO0 = o00.OooOO0(jOooO0o2 - ((long) (Math.max(0.0f, oooo000.f33995OooOO0o - 1.0f) / 1.0E-7f)), oooo000.f33984OooO, j8);
                            oooo000.f33984OooO = jOooOO0;
                            long j11 = oooo000.f33992OooO0oo;
                            if (j11 != j && jOooOO0 > j11) {
                                oooo000.f33984OooO = j11;
                            }
                        }
                        long j12 = jOooO0o2 - oooo000.f33984OooO;
                        if (Math.abs(j12) < oooo000.f33985OooO00o) {
                            oooo000.f33995OooOO0o = 1.0f;
                        } else {
                            oooo000.f33995OooOO0o = o00.OooO0oo((1.0E-7f * j12) + 1.0f, oooo000.f33994OooOO0O, oooo000.f33993OooOO0);
                        }
                        f = oooo000.f33995OooOO0o;
                    } else {
                        f = oooo000.f33995OooOO0o;
                    }
                }
                if (oooOO0O.f7249OooOOo.OooO0O0().f6619OooO0Oo != f) {
                    androidx.media3.common.OooOOOO oooOOOO = new androidx.media3.common.OooOOOO(f, oooOO0O.f7259OooOoOO.f34116OooOOO.f6621OooO0o0);
                    oooOO0O.f7243OooOO0O.OooOO0o(16);
                    oooOO0O.f7249OooOOo.OooO00o(oooOOOO);
                    oooOO0O.OooOOOO(oooOO0O.f7259OooOoOO.f34116OooOOO, oooOO0O.f7249OooOOo.OooO0O0().f6619OooO0Oo, false, false);
                }
            }
        }
    }

    public final synchronized void Oooooo(o000OOo0 o000ooo1, long j) {
        long jElapsedRealtime = this.f7254OooOo00.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) o000ooo1.get()).booleanValue() && j > 0) {
            try {
                this.f7254OooOo00.OooO0OO();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.f7254OooOo00.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void Oooooo0(Oooo0 oooo0, OooOOOO.OooO0O0 oooO0O0, Oooo0 oooo1, OooOOOO.OooO0O0 oooO0O1, long j, boolean z) throws ExoPlaybackException {
        if (!OoooOoo(oooo0, oooO0O0)) {
            androidx.media3.common.OooOOOO oooOOOO = oooO0O0.OooO00o() ? androidx.media3.common.OooOOOO.f6616OooO0oO : this.f7259OooOoOO.f34116OooOOO;
            androidx.media3.exoplayer.OooO0OO oooO0OO = this.f7249OooOOo;
            if (oooO0OO.OooO0O0().equals(oooOOOO)) {
                return;
            }
            this.f7243OooOO0O.OooOO0o(16);
            oooO0OO.OooO00o(oooOOOO);
            OooOOOO(this.f7259OooOoOO.f34116OooOOO, oooOOOO.f6619OooO0Oo, false, false);
            return;
        }
        Object obj = oooO0O0.f33816OooO00o;
        Oooo0.OooO0O0 oooO0O2 = this.f7247OooOOOO;
        int i = oooo0.OooOO0O(obj, oooO0O2).f6642OooO0o;
        Oooo0.OooO0o oooO0o = this.f7245OooOOO;
        oooo0.OooOOo0(i, oooO0o);
        androidx.media3.common.OooOOO0.OooOO0 oooOO1 = oooO0o.f6677OooOOO;
        Oooo000 oooo000 = (Oooo000) this.f7252OooOo;
        oooo000.getClass();
        oooo000.f33988OooO0Oo = o00.Oooo0OO(oooOO1.f6556OooO0Oo);
        oooo000.f33991OooO0oO = o00.Oooo0OO(oooOO1.f6558OooO0o0);
        oooo000.f33992OooO0oo = o00.Oooo0OO(oooOO1.f6557OooO0o);
        float f = oooOO1.f6559OooO0oO;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        oooo000.f33994OooOO0O = f;
        float f2 = oooOO1.f6560OooO0oo;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        oooo000.f33993OooOO0 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            oooo000.f33988OooO0Oo = -9223372036854775807L;
        }
        oooo000.OooO00o();
        if (j != -9223372036854775807L) {
            oooo000.f33990OooO0o0 = OooO0o(oooo0, obj, j);
            oooo000.OooO00o();
            return;
        }
        if (!o00.OooO00o(!oooo1.OooOo00() ? oooo1.OooOOo0(oooo1.OooOO0O(oooO0O1.f33816OooO00o, oooO0O2).f6642OooO0o, oooO0o).f6669OooO0Oo : null, oooO0o.f6669OooO0Oo) || z) {
            oooo000.f33990OooO0o0 = -9223372036854775807L;
            oooo000.OooO00o();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        o00O000o o00o000o2;
        o00O000o o00o000o3;
        int i;
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
                    OooO0Oo();
                    break;
                case 3:
                    Oooo0OO((C0144OooOO0O) message.obj);
                    break;
                case 4:
                    OoooOO0((androidx.media3.common.OooOOOO) message.obj);
                    break;
                case 5:
                    this.f7257OooOoO = (o00OO0O0) message.obj;
                    break;
                case 6:
                    Ooooo0o(false, true);
                    break;
                case 7:
                    OooOoO();
                    return true;
                case 8:
                    OooOOO((androidx.media3.exoplayer.source.OooOOO) message.obj);
                    break;
                case 9:
                    OooOO0((androidx.media3.exoplayer.source.OooOOO) message.obj);
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
                    OooOOO oooOOO = (OooOOO) message.obj;
                    oooOOO.getClass();
                    Oooo0o(oooOOO);
                    break;
                case 15:
                    Oooo0oO((OooOOO) message.obj);
                    break;
                case 16:
                    androidx.media3.common.OooOOOO oooOOOO = (androidx.media3.common.OooOOOO) message.obj;
                    OooOOOO(oooOOOO, oooOOOO.f6619OooO0Oo, true, false);
                    break;
                case 17:
                    OoooO00((OooO00o) message.obj);
                    break;
                case 18:
                    OooO0O0((OooO00o) message.obj, message.arg1);
                    break;
                case 19:
                    OooOo0o((OooO0O0) message.obj);
                    break;
                case 20:
                    OooOoo0(message.arg1, message.arg2, (o00Ooo) message.obj);
                    break;
                case 21:
                    OoooOOo((o00Ooo) message.obj);
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
        } catch (ParserException e) {
            boolean z = e.f6690OooO0Oo;
            int i3 = e.f6691OooO0o0;
            if (i3 == 1) {
                i = z ? ZegoConstants.RoomError.DatiCommitError : ZegoConstants.RoomError.DatiRepeatError;
            } else {
                if (i3 == 4) {
                    i = z ? ZegoConstants.RoomError.DatiTimeoutError : 3004;
                }
                OooOO0O(e, i2);
            }
            i2 = i;
            OooOO0O(e, i2);
        } catch (DataSourceException e2) {
            OooOO0O(e2, e2.f6967OooO0Oo);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i4 = e.f7114OooOO0o;
            o00O00O o00o00o2 = this.f7255OooOo0O;
            if (i4 == 1 && (o00o000o3 = o00o00o2.f34071OooO) != null) {
                e = e.OooO0OO(o00o000o3.f34061OooO0o.f34046OooO00o);
            }
            if (e.f7119OooOOo && this.f7275OoooO0 == null) {
                Log.OooO0oO("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f7275OoooO0 = e;
                o000000 o000000Var = this.f7243OooOO0O;
                o000000Var.OooO0Oo(o000000Var.OooO0o0(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f7275OoooO0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f7275OoooO0;
                }
                Log.OooO0Oo("ExoPlayerImplInternal", "Playback error", e);
                if (e.f7114OooOO0o == 1 && o00o00o2.f34079OooO0oo != o00o00o2.f34071OooO) {
                    while (true) {
                        o00o000o2 = o00o00o2.f34079OooO0oo;
                        if (o00o000o2 == o00o00o2.f34071OooO) {
                            break;
                        }
                        o00o00o2.OooO00o();
                    }
                    o00o000o2.getClass();
                    o00O00 o00o01 = o00o000o2.f34061OooO0o;
                    OooOOOO.OooO0O0 oooO0O0 = o00o01.f34046OooO00o;
                    long j = o00o01.f34047OooO0O0;
                    this.f7259OooOoOO = OooOOOo(oooO0O0, j, o00o01.f34048OooO0OO, j, true, 0);
                }
                Ooooo0o(true, false);
                this.f7259OooOoOO = this.f7259OooOoOO.OooO0o0(e);
            }
        } catch (DrmSession.DrmSessionException e4) {
            OooOO0O(e4, e4.f7629OooO0Oo);
        } catch (BehindLiveWindowException e5) {
            OooOO0O(e5, 1002);
        } catch (IOException e6) {
            OooOO0O(e6, 2000);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.OooO0Oo("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            Ooooo0o(true, false);
            this.f7259OooOoOO = this.f7259OooOoOO.OooO0o0(exoPlaybackException2);
        }
        OooOo0();
        return true;
    }

    public final void o000oOoO(int i) throws ExoPlaybackException {
        this.f7268Oooo00o = i;
        Oooo0 oooo0 = this.f7259OooOoOO.f34105OooO00o;
        o00O00O o00o00o2 = this.f7255OooOo0O;
        o00o00o2.f34076OooO0o = i;
        if (!o00o00o2.OooOOOO(oooo0)) {
            Oooo0O0(true);
        }
        OooOO0o(false);
    }
}
