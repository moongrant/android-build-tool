package com.google.android.exoplayer2;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOOO0;
import com.google.android.exoplayer2.o000oOoO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import p310o0O0o0oo.o00O;
import p310o0O0o0oo.o00O00;
import p310o0O0o0oo.o00O000;
import p310o0O0o0oo.o00O0000;
import p310o0O0o0oo.o00O000o;
import p310o0O0o0oo.o00O00O;
import p310o0O0o0oo.o00O0O00;
import p310o0O0o0oo.o00oOoo;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o000O0;
import p466o0OooO0.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f13392OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o f13393OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00O0O00.OooO00o f13394OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap<OooO0OO, OooO0O0> f13395OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Set<OooO0OO> f13396OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f13397OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public p709oo0oOOo.o000oOoO f13398OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00O f13388OooO = new o00O.OooO00o(new Random());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final IdentityHashMap<o00O00, OooO0OO> f13390OooO0O0 = new IdentityHashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Object, OooO0OO> f13391OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO0OO> f13389OooO00o = new ArrayList();

    public final class OooO00o implements o00O0O00, com.google.android.exoplayer2.drm.OooO00o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final OooO0OO f13400Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public o00O0O00.OooO00o f13401Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o f13402Oooo0oo;

        public OooO00o(OooO0OO oooO0OO) {
            this.f13401Oooo0oO = OooOo00.this.f13394OooO0o0;
            this.f13402Oooo0oo = OooOo00.this.f13393OooO0o;
            this.f13400Oooo0o = oooO0OO;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<o0O0o0oo.o00O00O$OooO00o>] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<o0O0o0oo.o00O00O$OooO00o>] */
        public final boolean OooO00o(int i, @Nullable o00O00O.OooO00o oooO00o) {
            o00O00O.OooO00o OooO00o2 = null;
            if (oooO00o != null) {
                OooO0OO oooO0OO = this.f13400Oooo0o;
                for (int i2 = 0; i2 < oooO0OO.f13408OooO0OO.size(); i2++) {
                    if (((o00O00O.OooO00o) oooO0OO.f13408OooO0OO.get(i2)).f36333OooO0Oo == oooO00o.f36333OooO0Oo) {
                        OooO00o2 = oooO00o.OooO00o(Pair.create(oooO0OO.f13407OooO0O0, oooO00o.f36330OooO00o));
                        break;
                    }
                }
                if (OooO00o2 == null) {
                    return false;
                }
            }
            int i3 = i + this.f13400Oooo0o.f13409OooO0Oo;
            o00O0O00.OooO00o oooO00o2 = this.f13401Oooo0oO;
            if (oooO00o2.f36343OooO00o != i3 || !o000OOo0.OooO00o(oooO00o2.f36344OooO0O0, OooO00o2)) {
                this.f13401Oooo0oO = OooOo00.this.f13394OooO0o0.OooO0oO(i3, OooO00o2);
            }
            com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o = this.f13402Oooo0oo;
            if (c0097OooO00o.f13720OooO00o == i3 && o000OOo0.OooO00o(c0097OooO00o.f13721OooO0O0, OooO00o2)) {
                return true;
            }
            this.f13402Oooo0oo = OooOo00.this.f13393OooO0o.OooO0oO(i3, OooO00o2);
            return true;
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void OooO0oo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
            if (OooO00o(i, oooO00o)) {
                this.f13401Oooo0oO.OooO0o(o00o0001, o00o000o2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void OooOOOo(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f13402Oooo0oo.OooO00o();
            }
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void OooOo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
            if (OooO00o(i, oooO00o)) {
                this.f13401Oooo0oO.OooO0Oo(o00o0001, o00o000o2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void OooOo0O(int i, @Nullable o00O00O.OooO00o oooO00o, Exception exc) {
            if (OooO00o(i, oooO00o)) {
                this.f13402Oooo0oo.OooO0o0(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void OooOoO(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f13402Oooo0oo.OooO0OO();
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void OooOoo(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f13402Oooo0oo.OooO0o();
            }
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void OooOooo(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2, IOException iOException, boolean z) {
            if (OooO00o(i, oooO00o)) {
                this.f13401Oooo0oO.OooO0o0(o00o0001, o00o000o2, iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void Oooo0(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f13402Oooo0oo.OooO0O0();
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO00o
        public final void Oooo00O(int i, @Nullable o00O00O.OooO00o oooO00o) {
            if (OooO00o(i, oooO00o)) {
                this.f13402Oooo0oo.OooO0Oo();
            }
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void Oooo0o(int i, @Nullable o00O00O.OooO00o oooO00o, o00O0000 o00o0001, o00O000o o00o000o2) {
            if (OooO00o(i, oooO00o)) {
                this.f13401Oooo0oO.OooO0OO(o00o0001, o00o000o2);
            }
        }

        @Override // p310o0O0o0oo.o00O0O00
        public final void OoooO0(int i, @Nullable o00O00O.OooO00o oooO00o, o00O000o o00o000o2) {
            if (OooO00o(i, oooO00o)) {
                this.f13401Oooo0oO.OooO0O0(o00o000o2);
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O00O f13403OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O00O.OooO0O0 f13404OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O0O00 f13405OooO0OO;

        public OooO0O0(o00O00O o00o00o2, o00O00O.OooO0O0 oooO0O0, o00O0O00 o00o0o01) {
            this.f13403OooO00o = o00o00o2;
            this.f13404OooO0O0 = oooO0O0;
            this.f13405OooO0OO = o00o0o01;
        }
    }

    public static final class OooO0OO implements o000O000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O000 f13406OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13409OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f13410OooO0o0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<o00O00O.OooO00o> f13408OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f13407OooO0O0 = new Object();

        public OooO0OO(o00O00O o00o00o2, boolean z) {
            this.f13406OooO00o = new o00O000(o00o00o2, z);
        }

        @Override // p466o0OooO0.o000O000
        public final Object OooO00o() {
            return this.f13407OooO0O0;
        }

        @Override // p466o0OooO0.o000O000
        public final o000oOoO OooO0O0() {
            return this.f13406OooO00o.f36310OooOOO;
        }
    }

    public interface OooO0o {
    }

    public OooOo00(OooO0o oooO0o, @Nullable p292o0O0Oo0.OooO0OO oooO0OO, Handler handler) {
        this.f13392OooO0Oo = oooO0o;
        o00O0O00.OooO00o oooO00o = new o00O0O00.OooO00o();
        this.f13394OooO0o0 = oooO00o;
        com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o = new com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o();
        this.f13393OooO0o = c0097OooO00o;
        this.f13395OooO0oO = new HashMap<>();
        this.f13396OooO0oo = new HashSet();
        if (oooO0OO != null) {
            oooO00o.f36345OooO0OO.add(new o00O0O00.OooO00o.C0369OooO00o(handler, oooO0OO));
            c0097OooO00o.f13722OooO0OO.add(new com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o.C0098OooO00o(handler, oooO0OO));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Object, com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final void OooO(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            OooO0OO oooO0OO = (OooO0OO) this.f13389OooO00o.remove(i3);
            this.f13391OooO0OO.remove(oooO0OO.f13407OooO0O0);
            OooO0O0(i3, -oooO0OO.f13406OooO00o.f36310OooOOO.OooOOO());
            oooO0OO.f13410OooO0o0 = true;
            if (this.f13397OooOO0) {
                OooO0o(oooO0OO);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o0O0o0oo.o00O00O$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.HashSet, java.util.Set<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList, java.util.List<o0O0o0oo.o00O00O$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.Object, com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final o000oOoO OooO00o(int i, List<OooO0OO> list, o00O o00o2) {
        if (!list.isEmpty()) {
            this.f13388OooO = o00o2;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                OooO0OO oooO0OO = list.get(i2 - i);
                if (i2 > 0) {
                    OooO0OO oooO0OO2 = (OooO0OO) this.f13389OooO00o.get(i2 - 1);
                    oooO0OO.f13409OooO0Oo = oooO0OO2.f13406OooO00o.f36310OooOOO.OooOOO() + oooO0OO2.f13409OooO0Oo;
                    oooO0OO.f13410OooO0o0 = false;
                    oooO0OO.f13408OooO0OO.clear();
                } else {
                    oooO0OO.f13409OooO0Oo = 0;
                    oooO0OO.f13410OooO0o0 = false;
                    oooO0OO.f13408OooO0OO.clear();
                }
                OooO0O0(i2, oooO0OO.f13406OooO00o.f36310OooOOO.OooOOO());
                this.f13389OooO00o.add(i2, oooO0OO);
                this.f13391OooO0OO.put(oooO0OO.f13407OooO0O0, oooO0OO);
                if (this.f13397OooOO0) {
                    OooO0oO(oooO0OO);
                    if (this.f13390OooO0O0.isEmpty()) {
                        this.f13396OooO0oo.add(oooO0OO);
                    } else {
                        OooO0O0 oooO0O0 = this.f13395OooO0oO.get(oooO0OO);
                        if (oooO0O0 != null) {
                            oooO0O0.f13403OooO00o.OooOO0o(oooO0O0.f13404OooO0O0);
                        }
                    }
                }
            }
        }
        return OooO0OO();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final void OooO0O0(int i, int i2) {
        while (i < this.f13389OooO00o.size()) {
            ((OooO0OO) this.f13389OooO00o.get(i)).f13409OooO0Oo += i2;
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final o000oOoO OooO0OO() {
        if (this.f13389OooO00o.isEmpty()) {
            return o000oOoO.f14556OooO00o;
        }
        int iOooOOO = 0;
        for (int i = 0; i < this.f13389OooO00o.size(); i++) {
            OooO0OO oooO0OO = (OooO0OO) this.f13389OooO00o.get(i);
            oooO0OO.f13409OooO0Oo = iOooOOO;
            iOooOOO += oooO0OO.f13406OooO00o.f36310OooOOO.OooOOO();
        }
        return new o000O0(this.f13389OooO00o, this.f13388OooO);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o0O0o0oo.o00O00O$OooO00o>] */
    public final void OooO0Oo() {
        Iterator it = this.f13396OooO0oo.iterator();
        while (it.hasNext()) {
            OooO0OO oooO0OO = (OooO0OO) it.next();
            if (oooO0OO.f13408OooO0OO.isEmpty()) {
                OooO0O0 oooO0O0 = this.f13395OooO0oO.get(oooO0OO);
                if (oooO0O0 != null) {
                    oooO0O0.f13403OooO00o.OooOO0o(oooO0O0.f13404OooO0O0);
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0O0o0oo.o00O00O$OooO00o>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashSet, java.util.Set<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final void OooO0o(OooO0OO oooO0OO) {
        if (oooO0OO.f13410OooO0o0 && oooO0OO.f13408OooO0OO.isEmpty()) {
            OooO0O0 oooO0O0Remove = this.f13395OooO0oO.remove(oooO0OO);
            Objects.requireNonNull(oooO0O0Remove);
            oooO0O0Remove.f13403OooO00o.OooO0O0(oooO0O0Remove.f13404OooO0O0);
            oooO0O0Remove.f13403OooO00o.OooO0OO(oooO0O0Remove.f13405OooO0OO);
            this.f13396OooO0oo.remove(oooO0OO);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public final int OooO0o0() {
        return this.f13389OooO00o.size();
    }

    public final void OooO0oO(OooO0OO oooO0OO) {
        o00O000 o00o001 = oooO0OO.f13406OooO00o;
        o00O00O.OooO0O0 oooO0O0 = new o00O00O.OooO0O0() { // from class: o0OooO0.o000O0o
            @Override // o0O0o0oo.o00O00O.OooO0O0
            public final void OooO00o(o00O00O o00o00o2, o000oOoO o000oooo2) {
                ((OooOOO0) this.f40539OooO00o.f13392OooO0Oo).f13312OoooO0O.OooO0OO(22);
            }
        };
        OooO00o oooO00o = new OooO00o(oooO0OO);
        this.f13395OooO0oO.put(oooO0OO, new OooO0O0(o00o001, oooO0O0, oooO00o));
        o00o001.OooOO0(o000OOo0.OooOO0(), oooO00o);
        o00o001.OooO0oO(o000OOo0.OooOO0(), oooO00o);
        o00o001.OooO0o0(oooO0O0, this.f13398OooOO0O);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o0O0o0oo.o00O00O$OooO00o>] */
    public final void OooO0oo(o00O00 o00o01) {
        OooO0OO oooO0OORemove = this.f13390OooO0O0.remove(o00o01);
        Objects.requireNonNull(oooO0OORemove);
        oooO0OORemove.f13406OooO00o.OooOOO0(o00o01);
        oooO0OORemove.f13408OooO0OO.remove(((o00oOoo) o00o01).f36467Oooo0oO);
        if (!this.f13390OooO0O0.isEmpty()) {
            OooO0Oo();
        }
        OooO0o(oooO0OORemove);
    }
}
