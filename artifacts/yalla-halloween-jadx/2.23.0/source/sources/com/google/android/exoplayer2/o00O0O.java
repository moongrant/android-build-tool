package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo00;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOOOO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p200o00o0o.o00O0O;
import p200o00o0o.o0O0OOO0;
import p203o00o0o0o.o0O00;
import p203o00o0o0o.o0O00000;
import p203o00o0o0o.o0O00o0;
import p203o00o0o0o.o0oOO;
import p226o00oOo00.o0000;
import p226o00oOo00.o0000O00;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00O0OOO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O0OOO f12799OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0OOO0 f12800OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f12805OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p200o00o0o.o00O0O f12807OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f12809OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public o00O0OO0 f12810OooOO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public com.google.android.exoplayer2.source.o00Ooo f12808OooOO0 = new com.google.android.exoplayer2.source.o00Ooo.OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final IdentityHashMap<com.google.android.exoplayer2.source.OooOOO, OooO0OO> f12802OooO0OO = new IdentityHashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f12803OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f12801OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap<OooO0OO, OooO0O0> f12804OooO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashSet f12806OooO0oO = new HashSet();

    public final class OooO00o implements com.google.android.exoplayer2.source.OooOo00, com.google.android.exoplayer2.drm.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f12811OooO0Oo;

        public OooO00o(OooO0OO oooO0OO) {
            this.f12811OooO0Oo = oooO0OO;
        }

        @Nullable
        public final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> OooO00o(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0) {
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 OooO0O1;
            OooO0OO oooO0OO = this.f12811OooO0Oo;
            com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O1 = null;
            if (oooO0O0 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= oooO0OO.f12818OooO0OO.size()) {
                        OooO0O1 = null;
                        break;
                    }
                    if (((com.google.android.exoplayer2.source.OooOOOO.OooO0O0) oooO0OO.f12818OooO0OO.get(i2)).f39862OooO0Oo == oooO0O0.f39862OooO0Oo) {
                        Object obj = oooO0OO.f12817OooO0O0;
                        int i3 = com.google.android.exoplayer2.OooO00o.f11030OooOO0O;
                        OooO0O1 = oooO0O0.OooO0O0(Pair.create(obj, oooO0O0.f39859OooO00o));
                        break;
                    }
                    i2++;
                }
                if (OooO0O1 == null) {
                    return null;
                }
                oooO0O1 = OooO0O1;
            }
            return Pair.create(Integer.valueOf(i + oooO0OO.f12819OooO0Oo), oooO0O1);
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOO0(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, final o0000 o0000Var, final o0000O00 o0000o00, final IOException iOException, final boolean z) {
            final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new Runnable() { // from class: o00o0o0o.o0oOOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0000 o0000Var2 = o0000Var;
                        o0000O00 o0000o01 = o0000o00;
                        IOException iOException2 = iOException;
                        boolean z2 = z;
                        o00O0O o00o0o2 = com.google.android.exoplayer2.o00O0O.this.f12807OooO0oo;
                        Pair pair = pairOooO00o;
                        o00o0o2.OooOO0(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second, o0000Var2, o0000o01, iOException2, z2);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final /* synthetic */ void OooOO0O() {
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void OooOo00(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0) {
            final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new Runnable() { // from class: o00o0o0o.o0O000O
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O o00o0o2 = com.google.android.exoplayer2.o00O0O.this.f12807OooO0oo;
                        Pair pair = pairOooO00o;
                        o00o0o2.OooOo00(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOoO0(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, final o0000 o0000Var, final o0000O00 o0000o00) {
            final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new Runnable() { // from class: o00o0o0o.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O o00o0o2 = com.google.android.exoplayer2.o00O0O.this.f12807OooO0oo;
                        Pair pair = pairOooO00o;
                        o00o0o2.OooOoO0(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second, o0000Var, o0000o00);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOoOO(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, final o0000 o0000Var, final o0000O00 o0000o00) {
            final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new Runnable() { // from class: o00o0o0o.oo00oO
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O o00o0o2 = com.google.android.exoplayer2.o00O0O.this.f12807OooO0oo;
                        Pair pair = pairOooO00o;
                        o00o0o2.OooOoOO(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second, o0000Var, o0000o00);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void OooOoo(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, final Exception exc) {
            final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new Runnable() { // from class: o00o0o0o.o0O0000O
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O o00o0o2 = com.google.android.exoplayer2.o00O0O.this.f12807OooO0oo;
                        Pair pair = pairOooO00o;
                        o00o0o2.OooOoo(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOoo0(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, o0000O00 o0000o00) {
            Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new com.facebook.login.OooO00o(1, this, pairOooO00o, o0000o00));
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void OooOooo(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, final o0000 o0000Var, final o0000O00 o0000o00) {
            final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new Runnable() { // from class: o00o0o0o.o0O000
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O o00o0o2 = com.google.android.exoplayer2.o00O0O.this.f12807OooO0oo;
                        Pair pair = pairOooO00o;
                        o00o0o2.OooOooo(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second, o0000Var, o0000o00);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void Oooo0(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0) {
            Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new p002OooO0Oo.OooOOO0(1, this, pairOooO00o));
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void Oooo000(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0) {
            final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new Runnable() { // from class: o00o0o0o.o0OoOoOo
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O o00o0o2 = com.google.android.exoplayer2.o00O0O.this.f12807OooO0oo;
                        Pair pair = pairOooO00o;
                        o00o0o2.Oooo000(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.OooOo00
        public final void Oooo00O(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, final o0000O00 o0000o00) {
            final Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new Runnable() { // from class: o00o0o0o.o0O0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00O0O o00o0o2 = com.google.android.exoplayer2.o00O0O.this.f12807OooO0oo;
                        Pair pair = pairOooO00o;
                        o00o0o2.Oooo00O(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second, o0000o00);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void Oooo00o(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, int i2) {
            Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new o0O00000(i2, this, 0, pairOooO00o));
            }
        }

        @Override // com.google.android.exoplayer2.drm.OooO0O0
        public final void Oooo0O0(int i, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0) {
            Pair<Integer, com.google.android.exoplayer2.source.OooOOOO.OooO0O0> pairOooO00o = OooO00o(i, oooO0O0);
            if (pairOooO00o != null) {
                o00O0O.this.f12799OooO.OooO0oo(new p003OooO0o0.o0OOO0o(1, this, pairOooO00o));
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.OooOOOO f12813OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.OooOOOO.OooO0OO f12814OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f12815OooO0OO;

        public OooO0O0(com.google.android.exoplayer2.source.OooOOO0 oooOOO0, o0O00o0 o0o00o1, OooO00o oooO00o) {
            this.f12813OooO00o = oooOOO0;
            this.f12814OooO0O0 = o0o00o1;
            this.f12815OooO0OO = oooO00o;
        }
    }

    public static final class OooO0OO implements o0oOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.OooOOO0 f12816OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f12819OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f12820OooO0o0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f12818OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f12817OooO0O0 = new Object();

        public OooO0OO(com.google.android.exoplayer2.source.OooOOOO oooOOOO, boolean z) {
            this.f12816OooO00o = new com.google.android.exoplayer2.source.OooOOO0(oooOOOO, z);
        }

        @Override // p203o00o0o0o.o0oOO
        public final Object OooO00o() {
            return this.f12817OooO0O0;
        }

        @Override // p203o00o0o0o.o0oOO
        public final oo0o0Oo OooO0O0() {
            return this.f12816OooO00o.f13033OooOOOO;
        }
    }

    public interface OooO0o {
    }

    public o00O0O(OooO0o oooO0o, p200o00o0o.o00O0O o00o0o2, o00O0OOO o00o0ooo2, o0O0OOO0 o0o0ooo0) {
        this.f12800OooO00o = o0o0ooo0;
        this.f12805OooO0o0 = oooO0o;
        this.f12807OooO0oo = o00o0o2;
        this.f12799OooO = o00o0ooo2;
    }

    public final oo0o0Oo OooO00o(int i, List<OooO0OO> list, com.google.android.exoplayer2.source.o00Ooo o00ooo2) {
        if (!list.isEmpty()) {
            this.f12808OooOO0 = o00ooo2;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                OooO0OO oooO0OO = list.get(i2 - i);
                ArrayList arrayList = this.f12801OooO0O0;
                if (i2 > 0) {
                    OooO0OO oooO0OO2 = (OooO0OO) arrayList.get(i2 - 1);
                    oooO0OO.f12819OooO0Oo = oooO0OO2.f12816OooO00o.f13033OooOOOO.OooOOOo() + oooO0OO2.f12819OooO0Oo;
                    oooO0OO.f12820OooO0o0 = false;
                    oooO0OO.f12818OooO0OO.clear();
                } else {
                    oooO0OO.f12819OooO0Oo = 0;
                    oooO0OO.f12820OooO0o0 = false;
                    oooO0OO.f12818OooO0OO.clear();
                }
                int iOooOOOo = oooO0OO.f12816OooO00o.f13033OooOOOO.OooOOOo();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((OooO0OO) arrayList.get(i3)).f12819OooO0Oo += iOooOOOo;
                }
                arrayList.add(i2, oooO0OO);
                this.f12803OooO0Oo.put(oooO0OO.f12817OooO0O0, oooO0OO);
                if (this.f12809OooOO0O) {
                    OooO0o0(oooO0OO);
                    if (this.f12802OooO0OO.isEmpty()) {
                        this.f12806OooO0oO.add(oooO0OO);
                    } else {
                        OooO0O0 oooO0O0 = this.f12804OooO0o.get(oooO0OO);
                        if (oooO0O0 != null) {
                            oooO0O0.f12813OooO00o.OooO(oooO0O0.f12814OooO0O0);
                        }
                    }
                }
            }
        }
        return OooO0O0();
    }

    public final oo0o0Oo OooO0O0() {
        ArrayList arrayList = this.f12801OooO0O0;
        if (arrayList.isEmpty()) {
            return oo0o0Oo.f12895OooO0Oo;
        }
        int iOooOOOo = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            OooO0OO oooO0OO = (OooO0OO) arrayList.get(i);
            oooO0OO.f12819OooO0Oo = iOooOOOo;
            iOooOOOo += oooO0OO.f12816OooO00o.f13033OooOOOO.OooOOOo();
        }
        return new o0O00(arrayList, this.f12808OooOO0);
    }

    public final void OooO0OO() {
        Iterator it = this.f12806OooO0oO.iterator();
        while (it.hasNext()) {
            OooO0OO oooO0OO = (OooO0OO) it.next();
            if (oooO0OO.f12818OooO0OO.isEmpty()) {
                OooO0O0 oooO0O0 = this.f12804OooO0o.get(oooO0OO);
                if (oooO0O0 != null) {
                    oooO0O0.f12813OooO00o.OooO(oooO0O0.f12814OooO0O0);
                }
                it.remove();
            }
        }
    }

    public final void OooO0Oo(OooO0OO oooO0OO) {
        if (oooO0OO.f12820OooO0o0 && oooO0OO.f12818OooO0OO.isEmpty()) {
            OooO0O0 oooO0O0Remove = this.f12804OooO0o.remove(oooO0OO);
            oooO0O0Remove.getClass();
            com.google.android.exoplayer2.source.OooOOOO.OooO0OO oooO0OO2 = oooO0O0Remove.f12814OooO0O0;
            com.google.android.exoplayer2.source.OooOOOO oooOOOO = oooO0O0Remove.f12813OooO00o;
            oooOOOO.OooO00o(oooO0OO2);
            OooO00o oooO00o = oooO0O0Remove.f12815OooO0OO;
            oooOOOO.OooO0OO(oooO00o);
            oooOOOO.OooOO0O(oooO00o);
            this.f12806OooO0oO.remove(oooO0OO);
        }
    }

    public final void OooO0o(com.google.android.exoplayer2.source.OooOOO oooOOO) {
        IdentityHashMap<com.google.android.exoplayer2.source.OooOOO, OooO0OO> identityHashMap = this.f12802OooO0OO;
        OooO0OO oooO0OORemove = identityHashMap.remove(oooOOO);
        oooO0OORemove.getClass();
        oooO0OORemove.f12816OooO00o.OooO0o0(oooOOO);
        oooO0OORemove.f12818OooO0OO.remove(((com.google.android.exoplayer2.source.OooOO0O) oooOOO).f13024OooO0Oo);
        if (!identityHashMap.isEmpty()) {
            OooO0OO();
        }
        OooO0Oo(oooO0OORemove);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.source.OooOOOO$OooO0OO, o00o0o0o.o0O00o0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooO0o0(OooO0OO oooO0OO) {
        com.google.android.exoplayer2.source.OooOOO0 oooOOO0 = oooO0OO.f12816OooO00o;
        ?? r1 = new com.google.android.exoplayer2.source.OooOOOO.OooO0OO() { // from class: o00o0o0o.o0O00o0
            @Override // com.google.android.exoplayer2.source.OooOOOO.OooO0OO
            public final void OooO00o(OooOOOO oooOOOO, oo0o0Oo oo0o0oo) {
                ((OooOo00) this.f39285OooO00o.f12805OooO0o0).f11273OooOO0O.OooOO0O(22);
            }
        };
        OooO00o oooO00o = new OooO00o(oooO0OO);
        this.f12804OooO0o.put(oooO0OO, new OooO0O0(oooOOO0, r1, oooO00o));
        int i = p245o00oo0o.o0O00.f40595OooO00o;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        oooOOO0.OooO0O0(new Handler(looperMyLooper, null), oooO00o);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        oooOOO0.OooOO0(new Handler(looperMyLooper2, null), oooO00o);
        oooOOO0.OooO0o(r1, this.f12810OooOO0o, this.f12800OooO00o);
    }

    public final void OooO0oO(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f12801OooO0O0;
            OooO0OO oooO0OO = (OooO0OO) arrayList.remove(i3);
            this.f12803OooO0Oo.remove(oooO0OO.f12817OooO0O0);
            int i4 = -oooO0OO.f12816OooO00o.f13033OooOOOO.OooOOOo();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((OooO0OO) arrayList.get(i5)).f12819OooO0Oo += i4;
            }
            oooO0OO.f12820OooO0o0 = true;
            if (this.f12809OooOO0O) {
                OooO0Oo(oooO0OO);
            }
        }
    }
}
