package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.Oooo0;
import androidx.media3.exoplayer.source.OooOOOO;
import androidx.media3.exoplayer.source.OooOo00;
import androidx.media3.exoplayer.source.o00Ooo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import o000O.Oooo000;
import o000O0.o0oOO;
import o000O00O.o00O0;
import o000O00O.o00O00OO;
import o000O00O.o00O0OO0;
import o000O00O.oOO00O;
import o000O00O.oo0oOO0;
import o000O0O.OooOo;
import p028Oooo0oO.o000O00;
import p039OoooOoo.o0oOOo;
import p080o000OoO.o00;
import p080o000OoO.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000000 f7307OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oOO f7308OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f7313OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000O0.OooO00o f7315OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f7317OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooOo f7318OooOO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o00Ooo f7316OooOO0 = new o00Ooo.OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final IdentityHashMap<androidx.media3.exoplayer.source.OooOOO, OooO0OO> f7310OooO0OO = new IdentityHashMap<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f7311OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f7309OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap<OooO0OO, OooO0O0> f7312OooO0o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashSet f7314OooO0oO = new HashSet();

    public final class OooO00o implements OooOo00, androidx.media3.exoplayer.drm.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f7319OooO0Oo;

        public OooO00o(OooO0OO oooO0OO) {
            this.f7319OooO0Oo = oooO0OO;
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void OooOO0O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, Oooo000 oooo000) {
            Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new o00O0(0, this, pairOooOOoo, oooo000));
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final /* synthetic */ void OooOOO0() {
        }

        @Nullable
        public final Pair<Integer, OooOOOO.OooO0O0> OooOOoo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            OooOOOO.OooO0O0 OooO0O1;
            OooO0OO oooO0OO = this.f7319OooO0Oo;
            OooOOOO.OooO0O0 oooO0O1 = null;
            if (oooO0O0 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= oooO0OO.f7326OooO0OO.size()) {
                        OooO0O1 = null;
                        break;
                    }
                    if (((OooOOOO.OooO0O0) oooO0OO.f7326OooO0OO.get(i2)).f33819OooO0Oo == oooO0O0.f33819OooO0Oo) {
                        Object obj = oooO0OO.f7325OooO0O0;
                        int i3 = o000O00O.OooO00o.f33954OooOO0o;
                        OooO0O1 = oooO0O0.OooO0O0(Pair.create(obj, oooO0O0.f33816OooO00o));
                        break;
                    }
                    i2++;
                }
                if (OooO0O1 == null) {
                    return null;
                }
                oooO0O1 = OooO0O1;
            }
            return Pair.create(Integer.valueOf(i + oooO0OO.f7327OooO0Oo), oooO0O1);
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void OooOo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o000O.OooOo oooOo, final Oooo000 oooo000) {
            final Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new Runnable() { // from class: o000O00O.o00O00o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o000O0.OooO00o oooO00o = androidx.media3.exoplayer.OooOOO0.this.f7315OooO0oo;
                        Pair pair = pairOooOOoo;
                        oooO00o.OooOo(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second, oooOo, oooo000);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void OooOo0o(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new o0oOOo(1, this, pairOooOOoo));
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void OooOoO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final int i2) {
            final Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new Runnable() { // from class: o000O00O.o00O0O00
                    @Override // java.lang.Runnable
                    public final void run() {
                        o000O0.OooO00o oooO00o = androidx.media3.exoplayer.OooOOO0.this.f7315OooO0oo;
                        Pair pair = pairOooOOoo;
                        oooO00o.OooOoO(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second, i2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void OooOoOO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new o00O0OO0(0, this, pairOooOOoo));
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void OooOoo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, Exception exc) {
            Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new androidx.fragment.app.OooO0o(1, this, pairOooOOoo, exc));
            }
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void OooOooO(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o000O.OooOo oooOo, final Oooo000 oooo000) {
            final Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new Runnable() { // from class: o000O00O.o00O0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o000O0.OooO00o oooO00o = androidx.media3.exoplayer.OooOOO0.this.f7315OooO0oo;
                        Pair pair = pairOooOOoo;
                        oooO00o.OooOooO(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second, oooOo, oooo000);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void OooOooo(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o000O.OooOo oooOo, final Oooo000 oooo000, final IOException iOException, final boolean z) {
            final Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new Runnable() { // from class: o000O00O.o00O0O0O
                    @Override // java.lang.Runnable
                    public final void run() {
                        o000O.OooOo oooOo2 = oooOo;
                        o000O.Oooo000 oooo001 = oooo000;
                        IOException iOException2 = iOException;
                        boolean z2 = z;
                        o000O0.OooO00o oooO00o = androidx.media3.exoplayer.OooOOO0.this.f7315OooO0oo;
                        Pair pair = pairOooOOoo;
                        oooO00o.OooOooo(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second, oooOo2, oooo001, iOException2, z2);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.OooOo00
        public final void Oooo0(int i, @Nullable OooOOOO.OooO0O0 oooO0O0, final o000O.OooOo oooOo, final Oooo000 oooo000) {
            final Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new Runnable() { // from class: o000O00O.oo00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        o000O0.OooO00o oooO00o = androidx.media3.exoplayer.OooOOO0.this.f7315OooO0oo;
                        Pair pair = pairOooOOoo;
                        oooO00o.Oooo0(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second, oooOo, oooo000);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void Oooo000(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            final Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new Runnable() { // from class: o000O00O.oo0o0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.media3.exoplayer.OooOOO0.OooO00o oooO00o = (androidx.media3.exoplayer.OooOOO0.OooO00o) this;
                        Pair pair = (Pair) pairOooOOoo;
                        androidx.media3.exoplayer.OooOOO0.this.f7315OooO0oo.Oooo000(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.OooOOOO.OooO0O0) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.OooO0O0
        public final void Oooo00O(int i, @Nullable OooOOOO.OooO0O0 oooO0O0) {
            Pair<Integer, OooOOOO.OooO0O0> pairOooOOoo = OooOOoo(i, oooO0O0);
            if (pairOooOOoo != null) {
                OooOOO0.this.f7307OooO.OooO(new o000O00(1, this, pairOooOOoo));
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOOO f7321OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOOO.OooO0OO f7322OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f7323OooO0OO;

        public OooO0O0(androidx.media3.exoplayer.source.OooOOO0 oooOOO0, o00O00OO o00o00oo2, OooO00o oooO00o) {
            this.f7321OooO00o = oooOOO0;
            this.f7322OooO0O0 = o00o00oo2;
            this.f7323OooO0OO = oooO00o;
        }
    }

    public static final class OooO0OO implements oOO00O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.OooOOO0 f7324OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7327OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f7328OooO0o0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f7326OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f7325OooO0O0 = new Object();

        public OooO0OO(OooOOOO oooOOOO, boolean z) {
            this.f7324OooO00o = new androidx.media3.exoplayer.source.OooOOO0(oooOOOO, z);
        }

        @Override // o000O00O.oOO00O
        public final Object OooO00o() {
            return this.f7325OooO0O0;
        }

        @Override // o000O00O.oOO00O
        public final Oooo0 OooO0O0() {
            return this.f7324OooO00o.f7932OooOOOO;
        }
    }

    public interface OooO0o {
    }

    public OooOOO0(OooO0o oooO0o, o000O0.OooO00o oooO00o, o000000 o000000Var, o0oOO o0ooo2) {
        this.f7308OooO00o = o0ooo2;
        this.f7313OooO0o0 = oooO0o;
        this.f7315OooO0oo = oooO00o;
        this.f7307OooO = o000000Var;
    }

    public final Oooo0 OooO00o(int i, List<OooO0OO> list, o00Ooo o00ooo2) {
        if (!list.isEmpty()) {
            this.f7316OooOO0 = o00ooo2;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                OooO0OO oooO0OO = list.get(i2 - i);
                ArrayList arrayList = this.f7309OooO0O0;
                if (i2 > 0) {
                    OooO0OO oooO0OO2 = (OooO0OO) arrayList.get(i2 - 1);
                    oooO0OO.f7327OooO0Oo = oooO0OO2.f7324OooO00o.f7932OooOOOO.OooOOoo() + oooO0OO2.f7327OooO0Oo;
                    oooO0OO.f7328OooO0o0 = false;
                    oooO0OO.f7326OooO0OO.clear();
                } else {
                    oooO0OO.f7327OooO0Oo = 0;
                    oooO0OO.f7328OooO0o0 = false;
                    oooO0OO.f7326OooO0OO.clear();
                }
                int iOooOOoo = oooO0OO.f7324OooO00o.f7932OooOOOO.OooOOoo();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((OooO0OO) arrayList.get(i3)).f7327OooO0Oo += iOooOOoo;
                }
                arrayList.add(i2, oooO0OO);
                this.f7311OooO0Oo.put(oooO0OO.f7325OooO0O0, oooO0OO);
                if (this.f7317OooOO0O) {
                    OooO0o0(oooO0OO);
                    if (this.f7310OooO0OO.isEmpty()) {
                        this.f7314OooO0oO.add(oooO0OO);
                    } else {
                        OooO0O0 oooO0O0 = this.f7312OooO0o.get(oooO0OO);
                        if (oooO0O0 != null) {
                            oooO0O0.f7321OooO00o.OooOO0O(oooO0O0.f7322OooO0O0);
                        }
                    }
                }
            }
        }
        return OooO0O0();
    }

    public final Oooo0 OooO0O0() {
        ArrayList arrayList = this.f7309OooO0O0;
        if (arrayList.isEmpty()) {
            return Oooo0.f6629OooO0Oo;
        }
        int iOooOOoo = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            OooO0OO oooO0OO = (OooO0OO) arrayList.get(i);
            oooO0OO.f7327OooO0Oo = iOooOOoo;
            iOooOOoo += oooO0OO.f7324OooO00o.f7932OooOOOO.OooOOoo();
        }
        return new oo0oOO0(arrayList, this.f7316OooOO0);
    }

    public final void OooO0OO() {
        Iterator it = this.f7314OooO0oO.iterator();
        while (it.hasNext()) {
            OooO0OO oooO0OO = (OooO0OO) it.next();
            if (oooO0OO.f7326OooO0OO.isEmpty()) {
                OooO0O0 oooO0O0 = this.f7312OooO0o.get(oooO0OO);
                if (oooO0O0 != null) {
                    oooO0O0.f7321OooO00o.OooOO0O(oooO0O0.f7322OooO0O0);
                }
                it.remove();
            }
        }
    }

    public final void OooO0Oo(OooO0OO oooO0OO) {
        if (oooO0OO.f7328OooO0o0 && oooO0OO.f7326OooO0OO.isEmpty()) {
            OooO0O0 oooO0O0Remove = this.f7312OooO0o.remove(oooO0OO);
            oooO0O0Remove.getClass();
            OooOOOO.OooO0OO oooO0OO2 = oooO0O0Remove.f7322OooO0O0;
            OooOOOO oooOOOO = oooO0O0Remove.f7321OooO00o;
            oooOOOO.OooOO0(oooO0OO2);
            OooO00o oooO00o = oooO0O0Remove.f7323OooO0OO;
            oooOOOO.OooO0O0(oooO00o);
            oooOOOO.OooO0o(oooO00o);
            this.f7314OooO0oO.remove(oooO0OO);
        }
    }

    public final void OooO0o(androidx.media3.exoplayer.source.OooOOO oooOOO) {
        IdentityHashMap<androidx.media3.exoplayer.source.OooOOO, OooO0OO> identityHashMap = this.f7310OooO0OO;
        OooO0OO oooO0OORemove = identityHashMap.remove(oooOOO);
        oooO0OORemove.getClass();
        oooO0OORemove.f7324OooO00o.OooO0oO(oooOOO);
        oooO0OORemove.f7326OooO0OO.remove(((androidx.media3.exoplayer.source.OooOO0O) oooOOO).f7923OooO0Oo);
        if (!identityHashMap.isEmpty()) {
            OooO0OO();
        }
        OooO0Oo(oooO0OORemove);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.OooOOOO$OooO0OO, o000O00O.o00O00OO] */
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
        androidx.media3.exoplayer.source.OooOOO0 oooOOO0 = oooO0OO.f7324OooO00o;
        ?? r1 = new OooOOOO.OooO0OO() { // from class: o000O00O.o00O00OO
            @Override // androidx.media3.exoplayer.source.OooOOOO.OooO0OO
            public final void OooO00o(androidx.media3.exoplayer.source.OooOOOO oooOOOO, androidx.media3.common.Oooo0 oooo0) {
                ((androidx.media3.exoplayer.OooOO0O) this.f34084OooO00o.f7313OooO0o0).f7243OooOO0O.OooOO0O(22);
            }
        };
        OooO00o oooO00o = new OooO00o(oooO0OO);
        this.f7312OooO0o.put(oooO0OO, new OooO0O0(oooOOO0, r1, oooO00o));
        oooOOO0.OooO00o(o00.OooOOO0(null), oooO00o);
        oooOOO0.OooO0o0(o00.OooOOO0(null), oooO00o);
        oooOOO0.OooO0oo(r1, this.f7318OooOO0o, this.f7308OooO00o);
    }

    public final void OooO0oO(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f7309OooO0O0;
            OooO0OO oooO0OO = (OooO0OO) arrayList.remove(i3);
            this.f7311OooO0Oo.remove(oooO0OO.f7325OooO0O0);
            int i4 = -oooO0OO.f7324OooO00o.f7932OooOOOO.OooOOoo();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((OooO0OO) arrayList.get(i5)).f7327OooO0Oo += i4;
            }
            oooO0OO.f7328OooO0o0 = true;
            if (this.f7317OooOO0O) {
                OooO0Oo(oooO0OO);
            }
        }
    }
}
