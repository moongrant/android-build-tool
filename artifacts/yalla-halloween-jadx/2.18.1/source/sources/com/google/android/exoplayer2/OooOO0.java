package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import p310o0O0o0oo.o00O;
import p310o0O0o0oo.o00O00O;
import p310o0O0o0oo.o00O0O0;
import p318o0O0oOo.o00000O;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p319o0O0oOo0.o000;
import p319o0O0oOo0.o0000OO0;
import p466o0OooO0.o000O0;
import p466o0OooO0.o000O000;
import p466o0OooO0.o000O0O0;
import p466o0OooO0.o000O0Oo;
import p466o0OooO0.o000OOo;
import p466o0OooO0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CopyOnWriteArrayList<OooO0OO.OooO00o> f13211OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f13212OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Renderer[] f13213OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000OO0 f13214OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O0o0.OooO0OO f13215OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Handler f13216OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOO0 f13217OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Handler f13218OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000oOoO.OooO0O0 f13219OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayDeque<Runnable> f13220OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final List<OooO00o> f13221OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00O0O0 f13222OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f13223OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final p292o0O0Oo0.OooO0OO f13224OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Looper f13225OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f13226OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final p709oo0oOOo.OooO f13227OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f13228OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f13229OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f13230OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f13231OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00O f13232OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o000Oo0 f13233OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f13234OooOoO0;

    public static final class OooO00o implements o000O000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f13235OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o000oOoO f13236OooO0O0;

        public OooO00o(Object obj, o000oOoO o000oooo2) {
            this.f13235OooO00o = obj;
            this.f13236OooO0O0 = o000oooo2;
        }

        @Override // p466o0OooO0.o000O000
        public final Object OooO00o() {
            return this.f13235OooO00o;
        }

        @Override // p466o0OooO0.o000O000
        public final o000oOoO OooO0O0() {
            return this.f13236OooO0O0;
        }
    }

    public static final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final boolean f13237Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o000Oo0 f13238Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final CopyOnWriteArrayList<OooO0OO.OooO00o> f13239Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final o0000OO0 f13240Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final int f13241OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final int f13242OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f13243OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final boolean f13244OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        @Nullable
        public final OooOOO f13245OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final boolean f13246OoooOOO = false;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final boolean f13247OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public final boolean f13248OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public final boolean f13249OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public final boolean f13250OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public final boolean f13251Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public final boolean f13252Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public final boolean f13253OooooO0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public final boolean f13254OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public final boolean f13255OooooOo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public final boolean f13256Oooooo0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final int f13257o000oOoO;

        public OooO0O0(o000Oo0 o000oo1, o000Oo0 o000oo2, CopyOnWriteArrayList copyOnWriteArrayList, o0000OO0 o0000oo1, boolean z, int i, int i2, boolean z2, int i3, @Nullable OooOOO oooOOO, int i4) {
            this.f13238Oooo0o = o000oo1;
            this.f13239Oooo0oO = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.f13240Oooo0oo = o0000oo1;
            this.f13237Oooo = z;
            this.f13243OoooO00 = i;
            this.f13242OoooO0 = i2;
            this.f13244OoooO0O = z2;
            this.f13241OoooO = i3;
            this.f13245OoooOO0 = oooOOO;
            this.f13257o000oOoO = i4;
            this.f13247OoooOOo = o000oo2.f40559OooO0Oo != o000oo1.f40559OooO0Oo;
            ExoPlaybackException exoPlaybackException = o000oo2.f40561OooO0o0;
            ExoPlaybackException exoPlaybackException2 = o000oo1.f40561OooO0o0;
            this.f13248OoooOo0 = (exoPlaybackException == exoPlaybackException2 || exoPlaybackException2 == null) ? false : true;
            this.f13249OoooOoO = o000oo2.f40560OooO0o != o000oo1.f40560OooO0o;
            this.f13250OoooOoo = !o000oo2.f40556OooO00o.equals(o000oo1.f40556OooO00o);
            this.f13251Ooooo00 = o000oo2.f40563OooO0oo != o000oo1.f40563OooO0oo;
            this.f13252Ooooo0o = o000oo2.f40564OooOO0 != o000oo1.f40564OooOO0;
            this.f13253OooooO0 = o000oo2.f40565OooOO0O != o000oo1.f40565OooOO0O;
            this.f13254OooooOO = OooO00o(o000oo2) != OooO00o(o000oo1);
            this.f13255OooooOo = !o000oo2.f40566OooOO0o.equals(o000oo1.f40566OooOO0o);
            this.f13256Oooooo0 = o000oo2.f40568OooOOO0 != o000oo1.f40568OooOOO0;
        }

        public static boolean OooO00o(o000Oo0 o000oo1) {
            return o000oo1.f40559OooO0Oo == 3 && o000oo1.f40564OooOO0 && o000oo1.f40565OooOO0O == 0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f13250OoooOoo) {
                Iterator<OooO0OO.OooO00o> it = this.f13239Oooo0oO.iterator();
                while (it.hasNext()) {
                    it.next().f13199OooO00o.OooOOO(this.f13238Oooo0o.f40556OooO00o, this.f13242OoooO0);
                }
            }
            if (this.f13237Oooo) {
                Iterator<OooO0OO.OooO00o> it2 = this.f13239Oooo0oO.iterator();
                while (it2.hasNext()) {
                    it2.next().f13199OooO00o.OooO(this.f13243OoooO00);
                }
            }
            if (this.f13244OoooO0O) {
                Iterator<OooO0OO.OooO00o> it3 = this.f13239Oooo0oO.iterator();
                while (it3.hasNext()) {
                    it3.next().f13199OooO00o.OooOooO(this.f13245OoooOO0, this.f13241OoooO);
                }
            }
            if (this.f13248OoooOo0) {
                Iterator<OooO0OO.OooO00o> it4 = this.f13239Oooo0oO.iterator();
                while (it4.hasNext()) {
                    it4.next().f13199OooO00o.OooOO0o(this.f13238Oooo0o.f40561OooO0o0);
                }
            }
            if (this.f13251Ooooo00) {
                this.f13240Oooo0oo.OooO00o(this.f13238Oooo0o.f40563OooO0oo.f36754OooO0Oo);
                Iterator<OooO0OO.OooO00o> it5 = this.f13239Oooo0oO.iterator();
                while (it5.hasNext()) {
                    Player.OooO00o oooO00o = it5.next().f13199OooO00o;
                    o000Oo0 o000oo1 = this.f13238Oooo0o;
                    oooO00o.Oooo0o0(o000oo1.f40562OooO0oO, o000oo1.f40563OooO0oo.f36753OooO0OO);
                }
            }
            if (this.f13249OoooOoO) {
                Iterator<OooO0OO.OooO00o> it6 = this.f13239Oooo0oO.iterator();
                while (it6.hasNext()) {
                    it6.next().f13199OooO00o.OooOOO0(this.f13238Oooo0o.f40560OooO0o);
                }
            }
            if (this.f13247OoooOOo || this.f13252Ooooo0o) {
                Iterator<OooO0OO.OooO00o> it7 = this.f13239Oooo0oO.iterator();
                while (it7.hasNext()) {
                    Player.OooO00o oooO00o2 = it7.next().f13199OooO00o;
                    o000Oo0 o000oo2 = this.f13238Oooo0o;
                    oooO00o2.OooOoOO(o000oo2.f40564OooOO0, o000oo2.f40559OooO0Oo);
                }
            }
            if (this.f13247OoooOOo) {
                Iterator<OooO0OO.OooO00o> it8 = this.f13239Oooo0oO.iterator();
                while (it8.hasNext()) {
                    it8.next().f13199OooO00o.OooOOo0(this.f13238Oooo0o.f40559OooO0Oo);
                }
            }
            if (this.f13252Ooooo0o) {
                Iterator<OooO0OO.OooO00o> it9 = this.f13239Oooo0oO.iterator();
                while (it9.hasNext()) {
                    it9.next().f13199OooO00o.Oooo0OO(this.f13238Oooo0o.f40564OooOO0, this.f13257o000oOoO);
                }
            }
            if (this.f13253OooooO0) {
                Iterator<OooO0OO.OooO00o> it10 = this.f13239Oooo0oO.iterator();
                while (it10.hasNext()) {
                    it10.next().f13199OooO00o.OooO0oO(this.f13238Oooo0o.f40565OooOO0O);
                }
            }
            if (this.f13254OooooOO) {
                Iterator<OooO0OO.OooO00o> it11 = this.f13239Oooo0oO.iterator();
                while (it11.hasNext()) {
                    it11.next().f13199OooO00o.OoooO(OooO00o(this.f13238Oooo0o));
                }
            }
            if (this.f13255OooooOo) {
                Iterator<OooO0OO.OooO00o> it12 = this.f13239Oooo0oO.iterator();
                while (it12.hasNext()) {
                    it12.next().f13199OooO00o.OooOO0O(this.f13238Oooo0o.f40566OooOO0o);
                }
            }
            if (this.f13246OoooOOO) {
                Iterator<OooO0OO.OooO00o> it13 = this.f13239Oooo0oO.iterator();
                while (it13.hasNext()) {
                    it13.next().f13199OooO00o.OooO00o();
                }
            }
            if (this.f13256Oooooo0) {
                Iterator<OooO0OO.OooO00o> it14 = this.f13239Oooo0oO.iterator();
                while (it14.hasNext()) {
                    Player.OooO00o oooO00o3 = it14.next().f13199OooO00o;
                    boolean z = this.f13238Oooo0o.f40568OooOOO0;
                    oooO00o3.OooOOoo();
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public OooOO0(Renderer[] rendererArr, o0000OO0 o0000oo1, o00O0O0 o00o0o0, o000OOo o000ooo2, p709oo0oOOo.OooO oooO, @Nullable p292o0O0Oo0.OooO0OO oooO0OO, boolean z, o000O0O0 o000o0o1, o00000O o00000o, Looper looper) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = o000OOo0.f36745OooO0o0;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str, o0OO00O.OooO00o(hexString, 30)));
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [");
        sb.append("ExoPlayerLib/2.12.1");
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int i = 1;
        o00000O0.OooO0Oo(rendererArr.length > 0);
        this.f13213OooO0OO = rendererArr;
        Objects.requireNonNull(o0000oo1);
        this.f13214OooO0Oo = o0000oo1;
        this.f13222OooOOO = o00o0o0;
        this.f13227OooOOo0 = oooO;
        this.f13224OooOOOO = oooO0OO;
        this.f13223OooOOO0 = z;
        this.f13225OooOOOo = looper;
        this.f13211OooO = new CopyOnWriteArrayList<>();
        this.f13221OooOO0o = new ArrayList();
        this.f13232OooOo0O = new o00O.OooO00o(new Random());
        o000 o000Var = new o000(new o000O0Oo[rendererArr.length], new com.google.android.exoplayer2.trackselection.OooO0OO[rendererArr.length], null);
        this.f13212OooO0O0 = o000Var;
        this.f13219OooOO0 = new o000oOoO.OooO0O0();
        this.f13229OooOo = -1;
        this.f13216OooO0o0 = new Handler(looper);
        o0O0O0o0.OooO0OO oooO0OO2 = new o0O0O0o0.OooO0OO(this, i);
        this.f13215OooO0o = oooO0OO2;
        this.f13233OooOo0o = o000Oo0.OooO0oo(o000Var);
        this.f13220OooOO0O = new ArrayDeque<>();
        if (oooO0OO != null) {
            o00000O0.OooO0Oo(oooO0OO.f35711OoooO0 == null || oooO0OO.f35712OoooO00.f35714OooO0O0.isEmpty());
            oooO0OO.f35711OoooO0 = this;
            OooO(oooO0OO);
            oooO.OooO0O0(new Handler(looper), oooO0OO);
        }
        OooOOO0 oooOOO0 = new OooOOO0(rendererArr, o0000oo1, o000Var, o000ooo2, oooO, 0, oooO0OO, o000o0o1, looper, o00000o, oooO0OO2);
        this.f13217OooO0oO = oooOOO0;
        this.f13218OooO0oo = new Handler(oooOOO0.f13313OoooOO0);
    }

    public static void OooOO0o(CopyOnWriteArrayList<OooO0OO.OooO00o> copyOnWriteArrayList, OooO0OO.OooO0O0 oooO0O0) {
        Iterator<OooO0OO.OooO00o> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            oooO0O0.OooO0OO(it.next().f13199OooO00o);
        }
    }

    public final void OooO(Player.OooO00o oooO00o) {
        Objects.requireNonNull(oooO00o);
        this.f13211OooO.addIfAbsent(new OooO0OO.OooO00o(oooO00o));
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean OooO00o() {
        return this.f13233OooOo0o.f40557OooO0O0.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooO0O0() {
        return C.OooO0O0(this.f13233OooOo0o.f40569OooOOOO);
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooO0OO() {
        if (this.f13233OooOo0o.f40556OooO00o.OooOOOO()) {
            return 0;
        }
        o000Oo0 o000oo1 = this.f13233OooOo0o;
        return o000oo1.f40556OooO00o.OooO0O0(o000oo1.f40557OooO0O0.f36330OooO00o);
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooO0Oo() {
        if (OooO00o()) {
            return this.f13233OooOo0o.f40557OooO0O0.f36332OooO0OO;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long OooO0o() {
        if (!OooO00o()) {
            return getCurrentPosition();
        }
        o000Oo0 o000oo1 = this.f13233OooOo0o;
        o000oo1.f40556OooO00o.OooO0oO(o000oo1.f40557OooO0O0.f36330OooO00o, this.f13219OooOO0);
        o000Oo0 o000oo2 = this.f13233OooOo0o;
        return o000oo2.f40558OooO0OO == -9223372036854775807L ? o000oo2.f40556OooO00o.OooOO0o(OooO0o0(), this.f13198OooO00o).OooO00o() : C.OooO0O0(this.f13219OooOO0.f14562OooO0o0) + C.OooO0O0(this.f13233OooOo0o.f40558OooO0OO);
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooO0o0() {
        int iOooOO0 = OooOO0();
        if (iOooOO0 == -1) {
            return 0;
        }
        return iOooOO0;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int OooO0oO() {
        if (OooO00o()) {
            return this.f13233OooOo0o.f40557OooO0O0.f36331OooO0O0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final o000oOoO OooO0oo() {
        return this.f13233OooOo0o.f40556OooO00o;
    }

    public final int OooOO0() {
        if (this.f13233OooOo0o.f40556OooO00o.OooOOOO()) {
            return this.f13229OooOo;
        }
        o000Oo0 o000oo1 = this.f13233OooOo0o;
        return o000oo1.f40556OooO00o.OooO0oO(o000oo1.f40557OooO0O0.f36330OooO00o, this.f13219OooOO0).f14559OooO0OO;
    }

    @Nullable
    public final Pair<Object, Long> OooOO0O(o000oOoO o000oooo2, int i, long j) {
        if (o000oooo2.OooOOOO()) {
            this.f13229OooOo = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f13234OooOoO0 = j;
            return null;
        }
        if (i == -1 || i >= ((o000O0) o000oooo2).f40525OooO0o0) {
            i = o000oooo2.OooO00o(false);
            j = o000oooo2.OooOO0o(i, this.f13198OooO00o).OooO00o();
        }
        return o000oooo2.OooO(this.f13198OooO00o, this.f13219OooOO0, i, C.OooO00o(j));
    }

    public final void OooOOO(Runnable runnable) {
        boolean z = !this.f13220OooOO0O.isEmpty();
        this.f13220OooOO0O.addLast(runnable);
        if (z) {
            return;
        }
        while (!this.f13220OooOO0O.isEmpty()) {
            this.f13220OooOO0O.peekFirst().run();
            this.f13220OooOO0O.removeFirst();
        }
    }

    public final o000Oo0 OooOOO0(o000Oo0 o000oo1, o000oOoO o000oooo2, @Nullable Pair<Object, Long> pair) {
        o00000O0.OooO00o(o000oooo2.OooOOOO() || pair != null);
        o000oOoO o000oooo3 = o000oo1.f40556OooO00o;
        o000Oo0 o000oo0OooO0oO = o000oo1.OooO0oO(o000oooo2);
        if (o000oooo2.OooOOOO()) {
            o00O00O.OooO00o oooO00o = o000Oo0.f40554OooOOo0;
            o00O00O.OooO00o oooO00o2 = o000Oo0.f40554OooOOo0;
            o000Oo0 o000oo0OooO00o = o000oo0OooO0oO.OooO0O0(oooO00o2, C.OooO00o(this.f13234OooOoO0), C.OooO00o(this.f13234OooOoO0), 0L, TrackGroupArray.f14604Oooo, this.f13212OooO0O0).OooO00o(oooO00o2);
            o000oo0OooO00o.f40567OooOOO = o000oo0OooO00o.f40570OooOOOo;
            return o000oo0OooO00o;
        }
        Object obj = o000oo0OooO0oO.f40557OooO0O0.f36330OooO00o;
        int i = o000OOo0.f36740OooO00o;
        boolean z = !obj.equals(pair.first);
        o00O00O.OooO00o oooO00o3 = z ? new o00O00O.OooO00o(pair.first, -1, -1, -1L, -1) : o000oo0OooO0oO.f40557OooO0O0;
        long jLongValue = ((Long) pair.second).longValue();
        long jOooO00o = C.OooO00o(OooO0o());
        if (!o000oooo3.OooOOOO()) {
            jOooO00o -= o000oooo3.OooO0oO(obj, this.f13219OooOO0).f14562OooO0o0;
        }
        if (z || jLongValue < jOooO00o) {
            o00O00O.OooO00o oooO00o4 = oooO00o3;
            o00000O0.OooO0Oo(!oooO00o4.OooO0O0());
            o000Oo0 o000oo0OooO00o2 = o000oo0OooO0oO.OooO0O0(oooO00o4, jLongValue, jLongValue, 0L, z ? TrackGroupArray.f14604Oooo : o000oo0OooO0oO.f40562OooO0oO, z ? this.f13212OooO0O0 : o000oo0OooO0oO.f40563OooO0oo).OooO00o(oooO00o4);
            o000oo0OooO00o2.f40567OooOOO = jLongValue;
            return o000oo0OooO00o2;
        }
        if (jLongValue != jOooO00o) {
            o00O00O.OooO00o oooO00o5 = oooO00o3;
            o00000O0.OooO0Oo(!oooO00o5.OooO0O0());
            long jMax = Math.max(0L, o000oo0OooO0oO.f40569OooOOOO - (jLongValue - jOooO00o));
            long j = o000oo0OooO0oO.f40567OooOOO;
            if (o000oo0OooO0oO.f40555OooO.equals(o000oo0OooO0oO.f40557OooO0O0)) {
                j = jLongValue + jMax;
            }
            o000Oo0 o000oo0OooO0O0 = o000oo0OooO0oO.OooO0O0(oooO00o5, jLongValue, jLongValue, jMax, o000oo0OooO0oO.f40562OooO0oO, o000oo0OooO0oO.f40563OooO0oo);
            o000oo0OooO0O0.f40567OooOOO = j;
            return o000oo0OooO0O0;
        }
        int iOooO0O0 = o000oooo2.OooO0O0(o000oo0OooO0oO.f40555OooO.f36330OooO00o);
        if (iOooO0O0 != -1) {
            o000oOoO.OooO0O0 oooO0O0 = this.f13219OooOO0;
            o000oooo2.OooO0o(iOooO0O0, oooO0O0, false);
            int i2 = oooO0O0.f14559OooO0OO;
            Object obj2 = oooO00o3.f36330OooO00o;
            o000oOoO.OooO0O0 oooO0O1 = this.f13219OooOO0;
            o000oooo2.OooO0oO(obj2, oooO0O1);
            if (i2 == oooO0O1.f14559OooO0OO) {
                return o000oo0OooO0oO;
            }
        }
        o000oooo2.OooO0oO(oooO00o3.f36330OooO00o, this.f13219OooOO0);
        long jOooO00o2 = oooO00o3.OooO0O0() ? this.f13219OooOO0.OooO00o(oooO00o3.f36331OooO0O0, oooO00o3.f36332OooO0OO) : this.f13219OooOO0.f14560OooO0Oo;
        o000Oo0 o000oo0OooO00o3 = o000oo0OooO0oO.OooO0O0(oooO00o3, o000oo0OooO0oO.f40570OooOOOo, o000oo0OooO0oO.f40570OooOOOo, jOooO00o2 - o000oo0OooO0oO.f40570OooOOOo, o000oo0OooO0oO.f40562OooO0oO, o000oo0OooO0oO.f40563OooO0oo).OooO00o(oooO00o3);
        o000oo0OooO00o3.f40567OooOOO = jOooO00o2;
        return o000oo0OooO00o3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
    public final void OooOOOO(int i) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            this.f13221OooOO0o.remove(i2);
        }
        this.f13232OooOo0O = this.f13232OooOo0O.OooO0OO(i);
        this.f13221OooOO0o.isEmpty();
    }

    public final void OooOOOo(boolean z, int i, int i2) {
        o000Oo0 o000oo1 = this.f13233OooOo0o;
        if (o000oo1.f40564OooOO0 == z && o000oo1.f40565OooOO0O == i) {
            return;
        }
        this.f13226OooOOo++;
        o000Oo0 o000oo0OooO0Oo = o000oo1.OooO0Oo(z, i);
        this.f13217OooO0oO.f13312OoooO0O.f36728OooO00o.obtainMessage(1, z ? 1 : 0, i).sendToTarget();
        OooOOo(o000oo0OooO0Oo, false, 4, 0, i2);
    }

    public final void OooOOo(o000Oo0 o000oo1, boolean z, int i, int i2, int i3) {
        Pair pair;
        o000Oo0 o000oo2 = this.f13233OooOo0o;
        this.f13233OooOo0o = o000oo1;
        int i4 = 1;
        boolean z2 = !o000oo2.f40556OooO00o.equals(o000oo1.f40556OooO00o);
        o000oOoO o000oooo2 = o000oo2.f40556OooO00o;
        o000oOoO o000oooo3 = o000oo1.f40556OooO00o;
        if (o000oooo3.OooOOOO() && o000oooo2.OooOOOO()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o000oooo3.OooOOOO() != o000oooo2.OooOOOO()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            Object obj = o000oooo2.OooOO0o(o000oooo2.OooO0oO(o000oo2.f40557OooO0O0.f36330OooO00o, this.f13219OooOO0).f14559OooO0OO, this.f13198OooO00o).f14566OooO00o;
            Object obj2 = o000oooo3.OooOO0o(o000oooo3.OooO0oO(o000oo1.f40557OooO0O0.f36330OooO00o, this.f13219OooOO0).f14559OooO0OO, this.f13198OooO00o).f14566OooO00o;
            int i5 = this.f13198OooO00o.f14576OooOO0o;
            if (obj.equals(obj2)) {
                pair = (z && i == 0 && o000oooo3.OooO0O0(o000oo1.f40557OooO0O0.f36330OooO00o) == i5) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (!z || i != 0) {
                    if (z && i == 1) {
                        i4 = 2;
                    } else {
                        if (!z2) {
                            throw new IllegalStateException();
                        }
                        i4 = 3;
                    }
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        OooOOO oooOOO = null;
        if (zBooleanValue && !o000oo1.f40556OooO00o.OooOOOO()) {
            oooOOO = o000oo1.f40556OooO00o.OooOO0o(o000oo1.f40556OooO00o.OooO0oO(o000oo1.f40557OooO0O0.f36330OooO00o, this.f13219OooOO0).f14559OooO0OO, this.f13198OooO00o).f14568OooO0OO;
        }
        OooOOO(new OooO0O0(o000oo1, o000oo2, this.f13211OooO, this.f13214OooO0Oo, z, i, i2, zBooleanValue, iIntValue, oooOOO, i3));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOO0$OooO00o>] */
    public final void OooOOo0(boolean z) {
        o000Oo0 o000oo0OooO00o;
        int i;
        Pair<Object, Long> pairOooOO0O;
        Pair<Object, Long> pairOooOO0O2;
        if (z) {
            int size = this.f13221OooOO0o.size();
            o00000O0.OooO00o(size >= 0 && size <= this.f13221OooOO0o.size());
            int iOooO0o0 = OooO0o0();
            o000oOoO o000oooo2 = this.f13233OooOo0o.f40556OooO00o;
            int size2 = this.f13221OooOO0o.size();
            this.f13226OooOOo++;
            OooOOOO(size);
            o000O0 o000o0 = new o000O0(this.f13221OooOO0o, this.f13232OooOo0O);
            o000Oo0 o000oo1 = this.f13233OooOo0o;
            long jOooO0o = OooO0o();
            if (o000oooo2.OooOOOO() || o000o0.OooOOOO()) {
                i = iOooO0o0;
                boolean z2 = !o000oooo2.OooOOOO() && o000o0.OooOOOO();
                int iOooOO0 = z2 ? -1 : OooOO0();
                if (z2) {
                    jOooO0o = -9223372036854775807L;
                }
                pairOooOO0O = OooOO0O(o000o0, iOooOO0, jOooO0o);
            } else {
                i = iOooO0o0;
                pairOooOO0O = o000oooo2.OooO(this.f13198OooO00o, this.f13219OooOO0, OooO0o0(), C.OooO00o(jOooO0o));
                int i2 = o000OOo0.f36740OooO00o;
                Object obj = pairOooOO0O.first;
                if (o000o0.OooO0O0(obj) == -1) {
                    Object objOooo0 = OooOOO0.Oooo0(this.f13198OooO00o, this.f13219OooOO0, 0, false, obj, o000oooo2, o000o0);
                    if (objOooo0 != null) {
                        o000o0.OooO0oO(objOooo0, this.f13219OooOO0);
                        int i3 = this.f13219OooOO0.f14559OooO0OO;
                        pairOooOO0O2 = OooOO0O(o000o0, i3, o000o0.OooOO0o(i3, this.f13198OooO00o).OooO00o());
                    } else {
                        pairOooOO0O2 = OooOO0O(o000o0, -1, -9223372036854775807L);
                    }
                    pairOooOO0O = pairOooOO0O2;
                }
            }
            o000Oo0 o000oo0OooOOO0 = OooOOO0(o000oo1, o000o0, pairOooOO0O);
            int i4 = o000oo0OooOOO0.f40559OooO0Oo;
            if (i4 != 1 && i4 != 4 && size > 0 && size == size2 && i >= o000oo0OooOOO0.f40556OooO00o.OooOOO()) {
                o000oo0OooOOO0 = o000oo0OooOOO0.OooO0o(4);
            }
            this.f13217OooO0oO.f13312OoooO0O.f36728OooO00o.obtainMessage(20, 0, size, this.f13232OooOo0O).sendToTarget();
            o000oo0OooO00o = o000oo0OooOOO0.OooO0o0(null);
        } else {
            o000Oo0 o000oo2 = this.f13233OooOo0o;
            o000oo0OooO00o = o000oo2.OooO00o(o000oo2.f40557OooO0O0);
            o000oo0OooO00o.f40567OooOOO = o000oo0OooO00o.f40570OooOOOo;
            o000oo0OooO00o.f40569OooOOOO = 0L;
        }
        o000Oo0 o000oo0OooO0o = o000oo0OooO00o.OooO0o(1);
        this.f13226OooOOo++;
        this.f13217OooO0oO.f13312OoooO0O.f36728OooO00o.obtainMessage(6).sendToTarget();
        OooOOo(o000oo0OooO0o, false, 4, 0, 1);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        if (this.f13233OooOo0o.f40556OooO00o.OooOOOO()) {
            return this.f13234OooOoO0;
        }
        if (this.f13233OooOo0o.f40557OooO0O0.OooO0O0()) {
            return C.OooO0O0(this.f13233OooOo0o.f40570OooOOOo);
        }
        o000Oo0 o000oo1 = this.f13233OooOo0o;
        o00O00O.OooO00o oooO00o = o000oo1.f40557OooO0O0;
        long jOooO0O0 = C.OooO0O0(o000oo1.f40570OooOOOo);
        this.f13233OooOo0o.f40556OooO00o.OooO0oO(oooO00o.f36330OooO00o, this.f13219OooOO0);
        return C.OooO0O0(this.f13219OooOO0.f14562OooO0o0) + jOooO0O0;
    }
}
